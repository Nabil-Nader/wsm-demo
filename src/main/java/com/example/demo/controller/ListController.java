package com.example.demo.controller;

import com.example.demo.model.ListModel;
import com.example.demo.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ListController {

    private final ListService listService;

    @Autowired
    public ListController(ListService listService) {
        this.listService = listService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<ListModel>> getAllLists() {
        return ResponseEntity.ok(listService.findAll());
    }

    @PostMapping("/list")
    public ResponseEntity<ListModel> createList(@RequestBody ListModel listModel) {
        return ResponseEntity.ok(listService.create(listModel));
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<ListModel> getListById(@PathVariable Long id) {
        return listService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/list/{id}")
    public ResponseEntity<ListModel> updateList(@PathVariable Long id, @RequestBody ListModel listModel) {
        return ResponseEntity.ok(listService.update(id, listModel));
    }

    @DeleteMapping("/list/{id}")
    public ResponseEntity<Void> deleteList(@PathVariable Long id) {
        listService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/list/search")
    public ResponseEntity<List<ListModel>> searchListsByName(@RequestParam String name) {
        // Implement search logic here
        // This is a placeholder for the actual implementation
        return ResponseEntity.ok().build();
    }

    // Additional mappings can be added here following the same pattern for other URL configurations.
}
