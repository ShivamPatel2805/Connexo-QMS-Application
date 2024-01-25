package com.example.RiskAssessmentService;


import com.example.RiskAssessmentEntity.RiskEntityMain;
import com.example.RiskAssessmentRepository.RiskEntityMainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class
RiskAssessmentMainService {
    @Autowired
    private RiskEntityMainRepository riskEntityMainRepo;

    public RiskEntityMain SaveRiskEntityMainRepo(RiskEntityMain riskEntityMain) {
        return riskEntityMainRepo.save(riskEntityMain);
    }

    public List<RiskEntityMain> getAllEntities() {

        return riskEntityMainRepo.findAll();
    }

    public RiskEntityMain getRiskEntityMain(Long id) {

        return riskEntityMainRepo.findById(id).get();
    }
}

