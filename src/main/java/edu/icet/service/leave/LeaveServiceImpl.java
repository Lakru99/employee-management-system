package edu.icet.service.leave;

import edu.icet.dto.Leave;
import edu.icet.entity.LeaveEntity;
import edu.icet.repository.LeaveRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LeaveServiceImpl implements LeaveService{
    private final LeaveRepository repository;
    private final ModelMapper mapper;
    @Override
    public List<Leave> getAll() {
        List<Leave> leaveList = new ArrayList<>();
        repository.findAll().forEach(entity ->{
            leaveList.add(mapper.map(entity, Leave.class));
        });
        return leaveList;
    }

    @Override
    public void addLeave(Leave leave) {
        repository.save(mapper.map(leave, LeaveEntity.class));
    }

    @Override
    public void deleteLeaveById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Leave searchLeaveById(Integer id) {
        return mapper.map(repository.findById(id), Leave.class);
    }

    @Override
    public void updateLeaveById(Leave leave) {
        repository.save(mapper.map(leave, LeaveEntity.class));
    }
}
