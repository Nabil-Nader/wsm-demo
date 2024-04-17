package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.ListModel;

public interface ListRepository extends JpaRepository<ListModel, Long> {
}
