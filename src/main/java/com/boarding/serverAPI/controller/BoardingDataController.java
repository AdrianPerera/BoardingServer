package com.boarding.serverAPI.controller;

import com.boarding.serverAPI.models.Boardingdata;
import com.boarding.serverAPI.repositories.BoardingDataRepository;
import com.boarding.serverAPI.repositories.BoardingOwnerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Boarding-Data")
public class BoardingDataController {

    private BoardingOwnerRepository boardingOwnerRepository;
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


}
