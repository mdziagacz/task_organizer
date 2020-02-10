package com.task_organizer.repository;

import com.task_organizer.domain.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends MongoRepository<Task, String> {
    Task findByName(String name);
    List<Task> findAll();
}
