package com.task_organizer;

import com.task_organizer.domain.Task;
import com.task_organizer.repository.TaskRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FirstTest {
    @Autowired
    private TaskRepository taskRepository;

    @Test
    public void testSaveTask(){
        Task taskToSave = new Task("test");
        taskRepository.save(taskToSave);

        Task foundTask = taskRepository.findByName("test");

        Assert.assertEquals(taskToSave.getId(), foundTask.getId());
    }
}
