package edu.icet.controller.admin;

import edu.icet.dto.Admin;
import edu.icet.dto.Employee;
import edu.icet.service.admin.AdminService;
import edu.icet.service.employee.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin")
@RequiredArgsConstructor
@CrossOrigin
public class AdminController {
    final AdminService adminService;
    @GetMapping("/get-all")
    public List<Admin> getAll(){
        return adminService.getAll();
    }
    @PostMapping("/add-admin")
    public void addAdmin(@RequestBody Admin admin){
        adminService.addAdmin(admin);
    }
    @GetMapping("/get-admin")
    public Admin getAdmin(@PathVariable Integer id){
        return adminService.getAdminById(id);
    }

}
