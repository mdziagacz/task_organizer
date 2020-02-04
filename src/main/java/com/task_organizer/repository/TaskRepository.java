package com.task_organizer.repository;

import com.task_organizer.domain.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
    Task findByName(String name);
}
