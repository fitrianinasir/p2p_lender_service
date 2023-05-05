package com.p2p.lender.repository;

import com.p2p.lender.model.LenderModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LenderRepository extends JpaRepository<LenderModel, Integer> {
    List<LenderModel> findAll();
    LenderModel findLenderById(Integer aInteger);
}
