
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
@CrossOrigin("http://Localhost:5173")
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
    @GetMapping("/getAll")
    public List<Labincident> findAllDivision(){
        return labIncRepository.findAll();
    }

    @GetMapping("/GetBy/{id}")
    public Labincident getProductById(@PathVariable Long id) {
        return labIncidentService.getProductById(id);
    }

    @PutMapping("/UpdateBy/{id}")
    public Labincident updateProduct(@PathVariable long id, @RequestBody Labincident labincident) {
        return labIncidentService.updateLabIncident(id, labincident);
    }
}
