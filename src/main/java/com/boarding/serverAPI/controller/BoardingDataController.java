package com.boarding.serverAPI.controller;

import com.boarding.serverAPI.Beans.BoardingDataBean;
import com.boarding.serverAPI.Beans.BoardingOwnerBean;
import com.boarding.serverAPI.models.Boardingdata;
import com.boarding.serverAPI.models.Boardingowner;
import com.boarding.serverAPI.repositories.BoardingDataRepository;
import com.boarding.serverAPI.repositories.BoardingOwnerRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<BoardingDataBean> getAllBoardingData() {
        List<Boardingdata> boardingDataList = boardingDataRepository.findAll();
        List<BoardingDataBean> boardingDataBeanList = new ArrayList<>();


        for (Boardingdata boardingdata : boardingDataList) {
            Boardingowner boardingowner = boardingOwnerRepository.findBy_id(boardingdata.getOwner_id());

            BoardingDataBean boardingDataBean = new BoardingDataBean().setToDataBean(boardingdata, boardingowner);
            boardingDataBeanList.add(boardingDataBean);
        }
        return boardingDataBeanList;
    }

    @GetMapping("/{id}")
    public BoardingDataBean getBoardingData(@PathVariable("id") ObjectId id) {
        Boardingdata boardingdata = boardingDataRepository.findBy_id(id);
        Boardingowner boardingowner = boardingOwnerRepository.findBy_id(boardingdata.getOwner_id());
        BoardingDataBean boardingDataBean = new BoardingDataBean().setToDataBean(boardingdata, boardingowner);
        return boardingDataBean;
    }

    @PostMapping("/")
    public BoardingDataBean postBoardingData(@Valid @RequestBody Boardingdata boardingdata) {
        try {
            boardingdata.set_id(ObjectId.get());
            boardingDataRepository.save(boardingdata);
            Boardingowner boardingowner = boardingOwnerRepository.findBy_id(boardingdata.getOwner_id());

            BoardingDataBean boardingDataBean = new BoardingDataBean().setToDataBean(boardingdata, boardingowner);
            return boardingDataBean;

        } catch (Exception e) {
            BoardingDataBean boardingDataBean = new BoardingDataBean();
            boardingDataBean.setName(e.getLocalizedMessage());
            boardingDataBean.setAddress(e.getMessage());
            return boardingDataBean;
        }

    }

    @PutMapping("/{id}")
    public BoardingDataBean modifyBoardingData(@PathVariable("id") ObjectId id, @Valid @RequestBody Boardingdata boardingdata) {
        boardingdata.set_id(id);
        boardingDataRepository.save(boardingdata);
        Boardingowner boardingowner=boardingOwnerRepository.findBy_id(boardingdata.getOwner_id());
        Boardingdata boardingdata1= boardingDataRepository.findBy_id(id);
        return new BoardingDataBean().setToDataBean(boardingdata1,boardingowner) ;
    }

    @DeleteMapping("/{id}")
    public String deleteBoardingData(@PathVariable("id") ObjectId id) {
        try {
            boardingDataRepository.delete(boardingDataRepository.findBy_id(id));
            return "success";
        } catch (Exception e) {

            return e.getMessage();
        }

    }


}
