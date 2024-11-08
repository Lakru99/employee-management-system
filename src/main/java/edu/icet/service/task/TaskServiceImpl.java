package edu.icet.service.task;

import edu.icet.dto.Task;
import edu.icet.entity.TaskEntity;
import edu.icet.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService{

    private final TaskRepository repository;
    private final ModelMapper mapper;
    @Override
    public List<Task> getAll() {
        List<Task> taskList = new ArrayList<>();
        repository.findAll().forEach(entity ->{
            taskList.add(mapper.map(entity, Task.class));
        });
        return taskList;
    }
    @Override
    public void addTask(Task task) {
        repository.save(mapper.map(task, TaskEntity.class));
    }
    @Override
    public void deleteTaskById(Integer id) {
        repository.deleteById(id);
    }
    @Override
    public Task searchTaskById(Integer id) {
        return mapper.map(repository.findById(id), Task.class);
    }
    @Override
    public void updateTaskById(Task task) {
        repository.save(mapper.map(task, TaskEntity.class));
    }
}
