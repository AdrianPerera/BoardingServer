package com.boarding.serverAPI.controller;


import com.boarding.serverAPI.models.BoardingOwner;
import com.boarding.serverAPI.repositories.BoardingOwnerRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/Boarding-Owner")
public class BoardingOwnerController {

    private final BoardingOwnerRepository boardingOwnerRepository;

    @Autowired
    public BoardingOwnerController(BoardingOwnerRepository boardingOwnerRepository) {
        this.boardingOwnerRepository = boardingOwnerRepository;
    }

    @GetMapping("/")
    public List<BoardingOwner> getAllOwners() {

        return boardingOwnerRepository.findAll();
    }

    @GetMapping("/{id}")
    public BoardingOwner getOwner(@PathVariable("id") ObjectId id) {
        return boardingOwnerRepository.findBy_id(id);
    }

    @PutMapping("/{id}")
    public BoardingOwner modifyOwner(@PathVariable("id") ObjectId id, @Valid @RequestBody BoardingOwner boardingOwner) {
        boardingOwner.setOwner_id(id);
        boardingOwnerRepository.save(boardingOwner);
        return boardingOwner;
    }

    @PostMapping("/")
    public BoardingOwner createBoardingOwner(@Valid @RequestBody BoardingOwner boardingOwner) {
        boardingOwner.setOwner_id(ObjectId.get());
        boardingOwnerRepository.save(boardingOwner);
        return boardingOwner;
    }

    @DeleteMapping("/{id}")
    public void deleteOwner(@PathVariable ObjectId id) {
        boardingOwnerRepository.delete(boardingOwnerRepository.findBy_id(id));
    }
}
