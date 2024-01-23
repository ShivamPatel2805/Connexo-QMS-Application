
package com.example.LabIncidentController;

import com.example.LabIncidentDtos.LabIncRequest;
import com.example.LabIncidentEntity.GeneralInformation;
import com.example.LabIncidentEntity.Labincident;
import com.example.LabIncidentRepository.LabIncRepository;
import com.example.LabIncidentService.LabIncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/LabIncident/api")
public class LabIncController {
    @Autowired
    private LabIncidentService labIncidentService;
    @Autowired
    private LabIncRepository labIncRepository;

    @Autowired(required = true)
    @Qualifier("generalInformation")
    private GeneralInformation generalInformation;

    @PostMapping("/create")
    public Labincident createDivision(@RequestBody LabIncRequest request){
        return labIncRepository.save(request.getLabincident());
    }
    @GetMapping("/findAllDivision")
    public List<Labincident> findAllDivision(){
        return labIncRepository.findAll();
    }

    @GetMapping("/GetBy/{id}")
    public Labincident getProductById(@PathVariable Long id) {
        return labIncidentService.getProductById(id);
    }

 /*   @PutMapping("/UpdateBy/{id}")
    public GeneralInformation updateProduct(@PathVariable long id, @RequestBody GeneralInformation generalInformation) {
        return labIncidentService.updateProduct(id, generalInformation);
    }*/

    @PutMapping("/{id}")
    public ResponseEntity<Labincident> updateLabincident(@PathVariable Long id, @RequestBody Labincident updatedLabincident) {
        // Perform validation, error handling, etc.
        Labincident result = labIncidentService.updateLabincident(updatedLabincident);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/UpdateField/{id}")
    public ResponseEntity<String> updateProductFields(@PathVariable Long id, @RequestBody Map<String, Object> fields){
        labIncidentService.updateProductByFields(id,fields);
        return  ResponseEntity.ok("update Successfull");
    }
}
