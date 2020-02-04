package com.task_organizer.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@Getter
@Setter
public class Task {
    @Id
    private String id;
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
