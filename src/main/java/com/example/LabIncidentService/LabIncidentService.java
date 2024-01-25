package com.example.LabIncidentService;

import com.example.LabIncidentEntity.Labincident;
import com.example.LabIncidentRepository.GeneralInfoRepository;
import com.example.LabIncidentRepository.LabIncRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class LabIncidentService {
    @Autowired
    private GeneralInfoRepository generalInfoRepository;
@Autowired
private LabIncRepository labIncRepository;
    public Labincident SaveLabIncident(Labincident labincident) {
        return labIncRepository.save(labincident); // Use the inherited save method.
    }
    public List<Labincident> getAllEntities() {
        return labIncRepository.findAll();
    }

    public Labincident getProductById(long id) {
        return labIncRepository.findById(id).get();
    }

    public Labincident updateLabIncident(long id, Labincident labincident) {
        Labincident existingDetails = labIncRepository.findById(id).get();
        existingDetails.setGeneralInformation(labincident.getGeneralInformation());
        existingDetails.setIncidentDetails(labincident.getIncidentDetails());
        existingDetails.setInvestigationDetails(labincident.getInvestigationDetails());
        existingDetails.setCapa(labincident.getCapa());
        existingDetails.setQaReviews(labincident.getQaReviews());
        existingDetails.setQaHeadDesigneApprovel(labincident.getQaHeadDesigneApprovel());
        return labIncRepository.save(existingDetails);
    }

 
}
