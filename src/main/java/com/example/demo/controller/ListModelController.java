package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.ListModelService;
import com.example.demo.entity.ListModel;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/listModels")
public class ListModelController {

    private final ListModelService listModelService;

    @Autowired
    public ListModelController(ListModelService listModelService) {
        this.listModelService = listModelService;
    }

    @GetMapping
    public List<ListModel> findAll() {
        return listModelService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ListModel> findById(@PathVariable Long id) {
        return listModelService.findById(id);
    }

    @PostMapping
    public ListModel create(@RequestBody ListModel listModel) {
        return listModelService.save(listModel);
    }

    @PutMapping("/{id}")
    public ListModel update(@PathVariable Long id, @RequestBody ListModel listModel) {
        listModel.setId(id);
        return listModelService.save(listModel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        listModelService.deleteById(id);
    }
}
