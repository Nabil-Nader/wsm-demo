package com.wsmsdemo.service;

import com.wsmsdemo.model.Staff;
import com.wsmsdemo.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepository;

    public List<Staff> findAll() {
        return staffRepository.findAll();
    }

    public Staff create(Staff staff) {
        return staffRepository.save(staff);
    }

    public Staff update(Long id, Staff staff) {
        Optional<Staff> existingStaff = staffRepository.findById(id);
        if (existingStaff.isPresent()) {
            Staff updatedStaff = existingStaff.get();
            updatedStaff.setStaffName(staff.getStaffName());
            updatedStaff.setCheckCode(staff.getCheckCode());
            updatedStaff.setIsDelete(staff.getIsDelete());
            updatedStaff.setIsLock(staff.getIsLock());
            updatedStaff.setErrorCheckCodeCounter(staff.getErrorCheckCodeCounter());
            return staffRepository.save(updatedStaff);
        } else {
            throw new RuntimeException("Staff not found with id " + id);
        }
    }

    public void delete(Long id) {
        staffRepository.deleteById(id);
    }

    public Staff partialUpdate(Long id, Staff staff) {
        Optional<Staff> existingStaff = staffRepository.findById(id);
        if (existingStaff.isPresent()) {
            Staff updatedStaff = existingStaff.get();
            if (staff.getStaffName() != null) updatedStaff.setStaffName(staff.getStaffName());
            if (staff.getCheckCode() != null) updatedStaff.setCheckCode(staff.getCheckCode());
            if (staff.getIsDelete() != null) updatedStaff.setIsDelete(staff.getIsDelete());
            if (staff.getIsLock() != null) updatedStaff.setIsLock(staff.getIsLock());
            if (staff.getErrorCheckCodeCounter() != null) updatedStaff.setErrorCheckCodeCounter(staff.getErrorCheckCodeCounter());
            return staffRepository.save(updatedStaff);
        } else {
            throw new RuntimeException("Staff not found with id " + id);
        }
    }
}
