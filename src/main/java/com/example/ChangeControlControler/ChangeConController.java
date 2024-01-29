package com.example.ChangeControlControler;

import com.example.ChangeControlDtos.ChangeControlRequest;
import com.example.ChangeControlEntity.ChangeControl;
import com.example.ChangeControlRepository.ChangeControlRepo;
import com.example.ChangeControlService.ChangeConService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://Localhost:5173")
@RequestMapping("/changeControl/api")
public class ChangeConController {

    @Autowired
    private ChangeControlRepo changeControlRepo;
    
    @Autowired
    private ChangeConService changeConService;
    
    @PostMapping("/create")
    public ChangeControl createChangeCon(@RequestBody ChangeControlRequest changeControlRequest){
        return changeControlRepo.save(changeControlRequest.getChangeControl());
    }
    
    @GetMapping("/findAllDivision")   
    public List<ChangeControl> findAllDivision(){
        return changeControlRepo.findAll();
    }

    @GetMapping("/GetBy/{id}")
    public ChangeControl getChangeControlById(@PathVariable Long id) {
        return changeConService.getChangeControlById(id);
    }
    @PutMapping("/update/{id}")
    public ChangeControl updateChangeControl(@PathVariable long id, @RequestBody ChangeControl changecontrol) {
    	return changeConService.updateChangeControl(id, changecontrol);
 	   
    }
}
