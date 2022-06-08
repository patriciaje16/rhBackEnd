package com.example.housewives.housewives;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
public class HousewiveController {

    private List<Housewife> housewifeList = new ArrayList<>();

    @Autowired
    private HousewifeRepository housewifeRepository;

    @GetMapping("/housewives")
    public List<Housewife> getAllHousewives() {
        return housewifeRepository.findAll();
    }

    @PostMapping("/housewife")
    public String addPokemon(@RequestBody Housewife text) {
        this.housewifeRepository.save(text);
        System.out.println("Added " + text);
        return "Housewife saved okay";
    }

    @DeleteMapping("/housewife/{housewifeId}")
    @Transactional
    public String deleteHousewife(@PathVariable int housewifeId) {
        System.out.println("housewife = " + housewifeId);
        int deleted = this.housewifeRepository.deleteHousewifeByHousewifeId(housewifeId);
        if (deleted > 0) {
            return "Housewife removed okay";
        }
        return "Housewife Id doesn't exist";
    }




}
