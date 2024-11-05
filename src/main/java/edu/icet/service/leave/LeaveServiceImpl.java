package edu.icet.service.leave;

import edu.icet.dto.Leave;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LeaveServiceImpl implements LeaveService{
    @Override
    public List<Leave> getAll() {
        return null;
    }

    @Override
    public void addLeave(Leave leave) {

    }

    @Override
    public void deleteLeaveById(Integer id) {

    }

    @Override
    public Leave searchLeaveById(Integer id) {
        return null;
    }

    @Override
    public void updateLeaveById(Leave leave) {

    }
}
