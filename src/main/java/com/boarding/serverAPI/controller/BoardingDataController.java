package com.boarding.serverAPI.controller;

import com.boarding.serverAPI.models.BoardingData;
import com.boarding.serverAPI.models.BoardingOwner;
import com.boarding.serverAPI.repositories.BoardingDataRepository;
import com.boarding.serverAPI.repositories.BoardingOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/Boarding-Data")
public class BoardingDataController {

    private BoardingOwnerRepository boardingOwnerRepository;
    private BoardingDataRepository boardingDataRepository;


    public BoardingDataController(BoardingOwnerRepository boardingOwnerRepository, BoardingDataRepository boardingDataRepository) {
        this.boardingOwnerRepository = boardingOwnerRepository;
        this.boardingDataRepository = boardingDataRepository;
    }

    @GetMapping("/")
    public List<BoardingData> getAllBoardingData(){


        List<BoardingData> boardingDataList=boardingDataRepository.findAll();








        return boardingDataList;
    }


}
