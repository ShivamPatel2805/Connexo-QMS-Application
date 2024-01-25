package com.example.RiskAssessmentController;


import com.example.RiskAssessmentDtos.RiskAssessmentDtos;
import com.example.RiskAssessmentEntity.RiskEntityMain;
import com.example.RiskAssessmentRepository.RiskEntityMainRepository;
import com.example.RiskAssessmentService.RiskAssessmentMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/risk_assessment/api")
@CrossOrigin("http://localhost:5173")
public class RiskAssessmentController {

    @Autowired
    private RiskAssessmentMainService riskAssessmentMainService;

    @Autowired
    private RiskEntityMainRepository riskEntityMainRepo;

    @PostMapping("/create")
    public RiskEntityMain createExtension(@RequestBody RiskAssessmentDtos riskAssessmentDtos) {
        return riskEntityMainRepo.save(riskAssessmentDtos.getRiskEntityMain());
    }


    @GetMapping("/findAll")
    public List<RiskEntityMain> findAll() {
        return riskEntityMainRepo.findAll();
    }

    @GetMapping("/GetBy/{id}")
    public RiskEntityMain getRiskEntityGetByID(@PathVariable Long id) {
        return riskAssessmentMainService.getRiskEntityMain(id);
    }
}
