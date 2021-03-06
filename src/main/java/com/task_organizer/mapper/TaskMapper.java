package com.task_organizer.mapper;

import com.task_organizer.domain.Task;
import com.task_organizer.domain.TaskDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TaskMapper {
    public Task mapToTask(final TaskDto taskDto){
        return new Task(taskDto.getName());
    }
    public List<TaskDto> mapToListTaskDto(final List<Task> taskList ){
        return taskList.stream()
                .map(task -> new TaskDto(task.getId(), task.getName()))
                .collect(Collectors.toList());
    }
}
