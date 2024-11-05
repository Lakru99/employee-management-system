package edu.icet.service.admin;

import edu.icet.dto.Admin;
import edu.icet.dto.Employee;

import java.util.List;

public interface AdminService  {
    List<Admin> getAll();
    Admin getAdminById(Integer id);
    void addAdmin(Admin admin);
}
