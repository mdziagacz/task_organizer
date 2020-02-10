package com.task_organizer.service;

import com.task_organizer.domain.Task;
import com.task_organizer.domain.TaskDto;
import com.task_organizer.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {
    private TaskRepository taskRepository;

    public DbService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void saveTask(final Task task){
        taskRepository.save(task);
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

}
