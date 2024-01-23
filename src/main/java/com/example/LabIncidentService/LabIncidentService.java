package com.example.LabIncidentService;

import com.example.LabIncidentEntity.GeneralInformation;
import com.example.LabIncidentEntity.Labincident;
import com.example.LabIncidentRepository.GeneralInfoRepository;
import com.example.LabIncidentRepository.LabIncRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;
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

  /*  public GeneralInformation updateProduct(long id, GeneralInformation generalInformation) {
        // get the product from DB by id
        // update with new value getting from request
        GeneralInformation existingDetails = generalInfoRepository.findById(id).get(); // DB
        existingDetails.setRecordNumber(generalInformation.getRecordNumber());
        existingDetails.setDivisionCode(generalInformation.getDivisionCode());
        existingDetails.setInitiator(generalInformation.getInitiator());
        existingDetails.setAssignedTo(generalInformation.getAssignedTo());
        existingDetails.setDueDate(generalInformation.getDueDate());
        existingDetails.setInitiatorGroup(generalInformation.getInitiatorGroup());
        existingDetails.setShortDescription(generalInformation.getShortDescription());
        existingDetails.setIncidentCategory(generalInformation.getIncidentCategory());
        existingDetails.setInvocationType(generalInformation.getInvocationType());
        existingDetails.setInitialAttachments(generalInformation.getInitialAttachments());
        return generalInfoRepository.save(existingDetails);
    }*/


    public GeneralInformation updateProductByFields(Long id, Map<String, Object> fields) {
        Optional<GeneralInformation> existingDetails = generalInfoRepository.findById(id);

        if (existingDetails.isPresent()) {
            fields.forEach((key, value) -> {
                Field field = ReflectionUtils.findField(GeneralInformation.class, key);
                field.setAccessible(true);
                ReflectionUtils.setField(field, existingDetails.get(), value);
            });
            return generalInfoRepository.save(existingDetails.get());
        }
        return null;
    }

    public Labincident updateLabincident(Labincident labincident) {
        return labIncRepository.save(labincident);
    }

}
