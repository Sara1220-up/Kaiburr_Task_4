package com.kaiburr.taskmanager.service;

import com.kaiburr.taskmanager.model.Task;
import com.kaiburr.taskmanager.model.TaskExecution;
import com.kaiburr.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repo;

    public List<Task> getAll() { return repo.findAll(); }

    public Optional<Task> getById(String id) { return repo.findById(id); }

    public Task save(Task task) { return repo.save(task); }

    public void delete(String id) { repo.deleteById(id); }

    public List<Task> findByName(String name) {
        return repo.findByNameContainingIgnoreCase(name);
    }

    public Task executeTask(String id) throws Exception {
        Task task = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        if (task.getCommand().contains("rm") || task.getCommand().contains("sudo"))
            throw new RuntimeException("Unsafe command blocked!");

        TaskExecution exec = new TaskExecution();
        exec.setStartTime(new Date());

        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", task.getCommand());
        pb.redirectErrorStream(true);
        Process process = pb.start();

        String output = new BufferedReader(
                new InputStreamReader(process.getInputStream()))
                .lines().collect(Collectors.joining("\n"));

        process.waitFor();

        exec.setEndTime(new Date());
        exec.setOutput(output);

        task.getTaskExecutions().add(exec);
        return repo.save(task);
    }
}
