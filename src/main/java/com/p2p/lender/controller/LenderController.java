package com.p2p.lender.controller;

import com.p2p.lender.repository.LenderRepository;
import com.p2p.lender.model.LenderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class LenderController {
    @Autowired
    private LenderRepository lenderRepository;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<LenderModel> findAll(){
        return lenderRepository.findAll();
    }

    @PostMapping("create")
    @ResponseStatus(HttpStatus.OK)
    public LenderModel addLender(@RequestBody LenderModel lenderModel){
        return lenderRepository.save(lenderModel);
    }


    @GetMapping("lender/{id}")
    @ResponseStatus(HttpStatus.OK)
    public LenderModel findLenderById(@PathVariable("id") Integer id){
        return lenderRepository.findLenderById(id);
    }


    @PutMapping("update-lender/{id}")
    @ResponseStatus(HttpStatus.OK)
    public LenderModel updateLender(@RequestBody LenderModel lenderModel,
                                     @PathVariable("id") Integer id){
        lenderModel.setId(id);
        return lenderRepository.save(lenderModel);
    }

    @DeleteMapping("lender/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteLenderById(@PathVariable("id") Integer id){
        lenderRepository.deleteById(id);
        return "Successfully deleted id " + id;
    }


}
