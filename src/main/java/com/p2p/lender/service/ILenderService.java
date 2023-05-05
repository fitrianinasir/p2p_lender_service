package com.p2p.lender.service;

import com.p2p.lender.model.LenderModel;

import java.util.List;

public interface ILenderService {
    List<LenderModel> allLender();

    Object getLender(Integer id);
    void insert(LenderModel lenderModel);
    void update(LenderModel lenderModel);
    void delete(LenderModel lenderModel);
}
