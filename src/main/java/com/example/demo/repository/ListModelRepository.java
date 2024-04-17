package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.ListModel;

public interface ListModelRepository extends JpaRepository<ListModel, Long> {
}
