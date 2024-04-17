package com.example.demo.service;

import com.example.demo.model.ListModel;
import com.example.demo.repository.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListService {

    private final ListRepository listRepository;

    @Autowired
    public ListService(ListRepository listRepository) {
        this.listRepository = listRepository;
    }

    public List<ListModel> findAll() {
        return listRepository.findAll();
    }

    public Optional<ListModel> findById(Long id) {
        return listRepository.findById(id);
    }

    public ListModel create(ListModel listModel) {
        return listRepository.save(listModel);
    }

    public ListModel update(Long id, ListModel updatedListModel) {
        return listRepository.findById(id).map(listModel -> {
            listModel.setName(updatedListModel.getName());
            listModel.setDescription(updatedListModel.getDescription());
            listModel.setIsActive(updatedListModel.getIsActive());
            listModel.setCreatedAt(updatedListModel.getCreatedAt());
            listModel.setUpdatedAt(updatedListModel.getUpdatedAt());
            return listRepository.save(listModel);
        }).orElseGet(() -> {
            updatedListModel.setId(id);
            return listRepository.save(updatedListModel);
        });
    }

    public void delete(Long id) {
        listRepository.deleteById(id);
    }
}
