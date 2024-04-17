package com.example.demo.service;

import com.example.demo.entity.ListModel;
import com.example.demo.repository.ListModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListModelService {

    private final ListModelRepository listModelRepository;

    @Autowired
    public ListModelService(ListModelRepository listModelRepository) {
        this.listModelRepository = listModelRepository;
    }

    public List<ListModel> findAll() {
        return listModelRepository.findAll();
    }

    public Optional<ListModel> findById(Long id) {
        return listModelRepository.findById(id);
    }

    public ListModel save(ListModel listModel) {
        return listModelRepository.save(listModel);
    }

    public void deleteById(Long id) {
        listModelRepository.deleteById(id);
    }
}
