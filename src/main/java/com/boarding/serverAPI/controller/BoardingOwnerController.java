package com.boarding.serverAPI.controller;


import com.boarding.serverAPI.models.Boardingowner;
import com.boarding.serverAPI.repositories.BoardingOwnerRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/Boarding-Owner")
public class BoardingOwnerController {

  @Autowired
  private BoardingOwnerRepository boardingOwnerRepository;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<Boardingowner> getAllOwners() {
        List<Boardingowner> boardingownerList =boardingOwnerRepository.findAll();

        return boardingownerList;
    }

    @GetMapping("/{id}")
    public Boardingowner getOwner(@PathVariable("id") ObjectId id) {
        return boardingOwnerRepository.findBy_id(id);
    }

    @PutMapping("/{id}")
    public Boardingowner modifyOwner(@PathVariable("id") ObjectId id, @Valid @RequestBody Boardingowner boardingOwner) {
        boardingOwner.set_id(id);
        boardingOwnerRepository.save(boardingOwner);
        return boardingOwner;
    }

    @PostMapping("/")
    public Boardingowner createBoardingOwner(@Valid @RequestBody Boardingowner boardingOwner) {
        boardingOwner.set_id(ObjectId.get());
        boardingOwnerRepository.save(boardingOwner);
        return boardingOwner;
    }

    @DeleteMapping("/{id}")
    public void deleteOwner(@PathVariable ObjectId id) {
        boardingOwnerRepository.delete(boardingOwnerRepository.findBy_id(id));
    }
}
