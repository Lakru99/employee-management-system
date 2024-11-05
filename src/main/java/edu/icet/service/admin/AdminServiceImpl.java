package edu.icet.service.admin;

import edu.icet.dto.Admin;
import edu.icet.dto.Employee;
import edu.icet.entity.AdminEntity;
import edu.icet.entity.EmployeeEntity;
import edu.icet.repository.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService{
    private final AdminRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<Admin> getAll() {
        List<Admin> adminList= new ArrayList<>();
        //here comes a emplyee entity and thats why we map it to emplyee class
        repository.findAll().forEach(entity ->{
            adminList.add(mapper.map(entity, Admin.class));
        });
        return adminList;
    }

    @Override
    public Admin getAdminById(Integer id) {
        return mapper.map(repository.findById(id), Admin.class);
    }

    @Override
    public void addAdmin(Admin admin) {
        repository.save(mapper.map(admin, AdminEntity.class));
    }

}
