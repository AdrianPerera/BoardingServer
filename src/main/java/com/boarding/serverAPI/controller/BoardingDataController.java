package com.boarding.serverAPI.controller;

import com.boarding.serverAPI.models.Boardingdata;
import com.boarding.serverAPI.models.JsonPatch;
import com.boarding.serverAPI.repositories.BoardingDataRepository;
import com.boarding.serverAPI.repositories.BoardingOwnerRepository;
import oracle.jrockit.jfr.events.RequestableEventEnvironment;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.JsonPath;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/Boarding-Data")
public class BoardingDataController {

    @Autowired
    private BoardingOwnerRepository boardingOwnerRepository;

    @Autowired
    private BoardingDataRepository boardingDataRepository;


    public BoardingDataController(BoardingOwnerRepository boardingOwnerRepository, BoardingDataRepository boardingDataRepository) {
        this.boardingOwnerRepository = boardingOwnerRepository;
        this.boardingDataRepository = boardingDataRepository;
    }

    @GetMapping("/")
    public List<Boardingdata> getAllBoardingData(){
        List<Boardingdata> boardingDataList=boardingDataRepository.findAll();
        return boardingDataList;
    }

    @GetMapping("/{id}")
    public Boardingdata getBoardingData(@PathVariable("id")ObjectId id){
        Boardingdata boardingdata=boardingDataRepository.findBy_id(id);
        return boardingdata;
    }
    @PostMapping("/{id)")
    public Boardingdata postBoardingData(@Valid @RequestBody Boardingdata boardingdata){
        boardingdata.set_id(ObjectId.get());
        boardingDataRepository.save(boardingdata);

        Boardingdata backboardingdata=boardingDataRepository.findBy_id(boardingdata.get_id());
        return backboardingdata;
    }

//    @RequestMapping(value = "/",method = RequestMethod.PATCH)
//    public void JsonInsert(@RequestBody JsonPatch jsonPatch){
//        String operation=jsonPatch.getOp();
//        String path=jsonPatch.getPath();
//        Object value=jsonPatch.getValue();
//
//        if(operation==="replace"){
//            boardingDataRepository.findOne()
//        }
//    }



}
