package edu.icet.service.task;

import edu.icet.dto.Leave;
import edu.icet.dto.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAll();
    void addTask(Task task);
    void deleteTaskById(Integer id);
    Task searchTaskById(Integer id);
    void updateTaskById(Task task);
}
