package com.wsmsdemo.controller;

import com.wsmsdemo.model.Staff;
import com.wsmsdemo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @GetMapping
    public ResponseEntity<List<Staff>> listStaff() {
        List<Staff> staffList = staffService.findAll();
        return ResponseEntity.ok(staffList);
    }

    @PostMapping
    public ResponseEntity<Staff> createStaff(@RequestBody Staff staff) {
        Staff createdStaff = staffService.create(staff);
        return ResponseEntity.ok(createdStaff);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Staff> updateStaff(@PathVariable Long id, @RequestBody Staff staff) {
        Staff updatedStaff = staffService.update(id, staff);
        return ResponseEntity.ok(updatedStaff);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStaff(@PathVariable Long id) {
        staffService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Staff> partialUpdateStaff(@PathVariable Long id, @RequestBody Staff staff) {
        Staff updatedStaff = staffService.partialUpdate(id, staff);
        return ResponseEntity.ok(updatedStaff);
    }
}
