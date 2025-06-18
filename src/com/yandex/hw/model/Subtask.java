package com.yandex.hw.model;

import com.yandex.hw.service.TaskStatus;

public class Subtask extends Task {
    private Integer epicsId;

    public Subtask(String name, String description, TaskStatus taskStatus, Integer epicId) {
        super(name, description, taskStatus);
        this.epicsId = epicId;
    }

    public Subtask(int id, String name, String description, TaskStatus taskStatus, Integer epicId) {
        super(id, name, description, taskStatus);
        this.epicsId = epicId;
    }

    public int getEpicId() {
        return epicsId;
    }



    @Override
    public String toString() {
        return "Subtask{" +
                "subtaskId=" + getId() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", taskStatus=" + getTaskStatus() +
                ", epicId=" + epicsId +
                '}';
    }
}
