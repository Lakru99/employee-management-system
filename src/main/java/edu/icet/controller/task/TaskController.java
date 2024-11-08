package edu.icet.controller.task;

import edu.icet.dto.Task;
import edu.icet.service.task.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("task")
@RequiredArgsConstructor
@CrossOrigin
public class TaskController {
    final TaskService taskService;
    @GetMapping("/get-all")
    public List<Task> getAll(){
        return taskService.getAll();
    }
    @PostMapping("/add-task")
    public void addTask(@RequestBody Task task){
        taskService.addTask(task);
    }
    @DeleteMapping("/delete-task/{id}")
    public void deleteTaskById(@PathVariable Integer id){
        taskService.deleteTaskById(id);
    }
    @GetMapping("/search-task/{id}")
    public Task searchLeaveById(@PathVariable Integer id){
        return taskService.searchTaskById(id);
    }
    @PutMapping("/update-task")
    public void updateTaskById(@RequestBody Task task){
        taskService.updateTaskById(task);
    }


}
