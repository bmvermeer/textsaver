package nl.brianvermeer.nl.demo.saver.textsaver.controller;


import nl.brianvermeer.nl.demo.saver.textsaver.domain.Item;
import nl.brianvermeer.nl.demo.saver.textsaver.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StoreController {

    @Autowired
    ItemRepo repo;

    @GetMapping("/store")
    public String store(@RequestParam String value) {
        repo.save(new Item(value));
        return value;
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/all")
    public List<Item> all() {
        return repo.findAll();
    }
}
