package com.example.AuditProgramController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AuditProgramDtos.AuditProgramRequest;
import com.example.AuditProgramEntity.AuditProgram;
import com.example.AuditProgramRepository.AuditProgramRepo;
import com.example.AuditProgramService.AuditProgramService;


@RestController
@CrossOrigin("http://Localhost:5173")
@RequestMapping("/auditprogram/api")
public class AuditProgramController {
	
	@Autowired
	private AuditProgramRepo auditprogramrepo;
	
	@Autowired
	private AuditProgramService  actionitemservice;
	
	@PostMapping("/create")
    public AuditProgram createAuditProgram(@RequestBody AuditProgramRequest auditProgramRequest){
        return auditprogramrepo.save(auditProgramRequest.getAuditProgram());
    }
    

          @GetMapping("/findAllDivision")
          public List<AuditProgram> findAllDivision(){
          return auditprogramrepo.findAll();
    }

          @GetMapping("/GetBy/{id}")
          public AuditProgram getActionItemById(@PathVariable Long id) {
           return actionitemservice.getAuditProgramById(id);
     
        }
}
