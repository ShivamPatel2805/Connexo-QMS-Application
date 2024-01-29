package com.example.RiskAssessmentService;


import com.example.RCAEntity.RCAmain;
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

    public RiskEntityMain updateEntityMain(long id, RiskEntityMain riskEntityMain) {
        RiskEntityMain existingDeatiles = riskEntityMainRepo.findById(id).get();
        existingDeatiles.setRiskAssessmentEntities(riskEntityMain.getRiskAssessmentEntities());
        existingDeatiles.setRiskOpportunityEntities(riskEntityMain.getRiskOpportunityEntities());
        existingDeatiles.setRiskWorkGroupEntities(riskEntityMain.getRiskWorkGroupEntities());
        existingDeatiles.setRiskAnalysisEntities(riskEntityMain.getRiskAnalysisEntities());
        existingDeatiles.setRiskResidualEntities(riskEntityMain.getRiskResidualEntities());
        existingDeatiles.setRiskMitigationEntities(riskEntityMain.getRiskMitigationEntities());
        return riskEntityMainRepo.save(existingDeatiles);

    }
}

