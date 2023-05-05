package com.p2p.lender.service;

import com.p2p.lender.repository.LenderRepository;
import com.p2p.lender.model.LenderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LenderService implements ILenderService{
    @Autowired
    LenderRepository lenderRepository;

    @Override
    public List<LenderModel> allLender(){
        return lenderRepository.findAll();
    }

    @Override
    public Object getLender(Integer id){
        return lenderRepository.findById(id);
    }
    @Override
    public void insert(LenderModel lenderModel){
        lenderRepository.save(lenderModel);
    }


    @Override
    public void update(LenderModel lenderModel){
        lenderRepository.save(lenderModel);
    }

    @Override
    public void delete(LenderModel lenderModel){
        lenderRepository.deleteById(lenderModel.getId());
    }

}
