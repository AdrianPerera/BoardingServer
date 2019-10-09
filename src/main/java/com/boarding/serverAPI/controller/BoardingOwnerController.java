package com.boarding.serverAPI.controller;


import com.boarding.serverAPI.Beans.BoardingOwnerBean;
import com.boarding.serverAPI.models.Boardingdata;
import com.boarding.serverAPI.models.Boardingowner;
import com.boarding.serverAPI.repositories.BoardingOwnerRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Boarding-Owner")
public class BoardingOwnerController {

  @Autowired
  private BoardingOwnerRepository boardingOwnerRepository;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<BoardingOwnerBean> getAllOwners() {
        List<Boardingowner> boardingownerList =boardingOwnerRepository.findAll();
        List<BoardingOwnerBean> boardingOwnerBeanList= new ArrayList<>();

        for (Boardingowner boardingowner: boardingownerList) {
            BoardingOwnerBean boardingOwnerBean=new BoardingOwnerBean().setToOwnerBean(boardingowner);
            boardingOwnerBeanList.add(boardingOwnerBean);
        }

        return boardingOwnerBeanList ;
    }

    @GetMapping("/{id}")
    public BoardingOwnerBean getOwner(@PathVariable("id") ObjectId id) {
        Boardingowner boardingowner= boardingOwnerRepository.findBy_id(id);
        BoardingOwnerBean boardingOwnerBean=new BoardingOwnerBean().setToOwnerBean(boardingowner) ;

        return boardingOwnerBean;
    }

    @PutMapping("/{id}")
    public BoardingOwnerBean modifyOwner(@PathVariable("id") ObjectId id, @Valid @RequestBody Boardingowner boardingOwner) {
        boardingOwner.set_id(id);
        boardingOwnerRepository.save(boardingOwner);
        BoardingOwnerBean boardingOwnerBeanReturn=new BoardingOwnerBean().setToOwnerBean(boardingOwnerRepository.findBy_id(id));
        return boardingOwnerBeanReturn;
    }

    @PostMapping("/")
    public BoardingOwnerBean createBoardingOwner(@Valid @RequestBody Boardingowner boardingOwner) {
        boardingOwner.set_id(ObjectId.get());
        boardingOwnerRepository.save(boardingOwner);
        BoardingOwnerBean boardingownerReturn= new BoardingOwnerBean().setToOwnerBean(boardingOwnerRepository.findBy_id(boardingOwner.get_id())) ;
        return boardingownerReturn;
    }

    @DeleteMapping("/{id}")
    public void deleteOwner(@PathVariable ObjectId id) {
        boardingOwnerRepository.delete(boardingOwnerRepository.findBy_id(id));
    }


}
