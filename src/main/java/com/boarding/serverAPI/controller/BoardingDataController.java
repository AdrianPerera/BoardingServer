package com.boarding.serverAPI.controller;

import com.boarding.serverAPI.Beans.BoardingDataBean;
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
import java.util.ArrayList;
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
    public List<BoardingDataBean> getAllBoardingData(){
        List<Boardingdata> boardingdataList=boardingDataRepository.findAll();
        List<BoardingDataBean> boardingDataBeanList=new ArrayList<>();

        for(Boardingdata boardingdata:boardingdataList){
            BoardingDataBean boardingDataBean=new BoardingDataBean().setToBean(boardingdata);
            boardingDataBeanList.add(boardingDataBean);
        }


        return boardingDataBeanList;
    }

    @GetMapping("/{id}")
    public BoardingDataBean getBoardingData(@PathVariable("id")ObjectId id){
        Boardingdata boardingdata=boardingDataRepository.findBy_id(id);
        BoardingDataBean boardingDataBean=new BoardingDataBean().setToBean(boardingdata);
        return boardingDataBean;
    }
    @PostMapping("/{id)")
    public Boardingdata postBoardingData(@Valid @RequestBody Boardingdata boardingdata){
        boardingdata.set_id(ObjectId.get());
        boardingDataRepository.save(boardingdata);

        Boardingdata backboardingdata=boardingDataRepository.findBy_id(boardingdata.get_id());
        return backboardingdata;
    }

    @PutMapping("/{id}")
    public Boardingdata modifyBoardingData(@PathVariable("id") ObjectId id, @Valid @RequestBody Boardingdata boardingdata) {
        boardingdata.set_id(id);
        boardingDataRepository.save(boardingdata);

        return boardingdata;
    }


}
