package edu.icet.service.leave;

import edu.icet.dto.Leave;

import java.util.List;

public interface LeaveService {
    List<Leave> getAll();
    void addLeave(Leave leave);
    void deleteLeaveById(Integer id);
    Leave searchLeaveById(Integer id);
    void updateLeaveById(Leave leave);
}
