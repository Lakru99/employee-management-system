package edu.icet.controller.leave;

import edu.icet.dto.Employee;
import edu.icet.dto.Leave;
import edu.icet.service.leave.LeaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("leave")
@RequiredArgsConstructor
@CrossOrigin
public class LeaveController {
    final LeaveService leaveService;
    @GetMapping("/get-all")
    public List<Leave> getAll(){
        return leaveService.getAll();
    }
    @PostMapping("/add-leave")
    public void addLeave(@RequestBody Leave leave){

        leaveService.addLeave(leave);
    }
    @DeleteMapping("/delete-leave/{id}")
    public void deleteLeaveById(@PathVariable Integer id){
        leaveService.deleteLeaveById(id);
    }
    @GetMapping("/search-leave/{id}")
    public Leave searchLeaveById(@PathVariable Integer id){
        return leaveService.searchLeaveById(id);
    }
    @PutMapping("/update-leave")
    public void updateLeaveById(@RequestBody Leave leave){
        leaveService.updateLeaveById(leave);
    }

}
