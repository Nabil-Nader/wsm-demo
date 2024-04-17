package com.wsmsdemo.repository;

import com.wsmsdemo.model.ListModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StaffRepository extends JpaRepository<ListModel, Long> {
    List<ListModel> findByStaffName(String staffName);
    List<ListModel> findByIsLock(Boolean isLock);
    List<ListModel> findByIsDelete(Boolean isDelete);
}
