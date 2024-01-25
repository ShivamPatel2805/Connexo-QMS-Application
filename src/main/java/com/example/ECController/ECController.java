package com.example.ECController;

import com.example.ActionItemDtos.ActionItemRequest;
import com.example.ActionItemEntity.ActionItem;
import com.example.ActionItemRepository.ActionItemRepo;
import com.example.ActionItemService.ActionItemService;
import com.example.ECDtos.EcRequest;
import com.example.ECEntity.ECmain;
import com.example.ECRepo.ECmainRepo;
import com.example.ECService.ECService;
import com.example.RCAEntity.RCAmain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ecmain/api")
public class ECController {
	
	@Autowired
	private ECmainRepo eCmainRepo;
	
	@Autowired
	private ECService ecService;
	
	  @PostMapping("/create")
	    public ECmain createExtention(@RequestBody EcRequest ecRequest){
	        return eCmainRepo.save(ecRequest.getECmain());
	    }
	    
    
    @GetMapping("/findAllDivision")
    public List<ECmain> findAllDivision(){
        return eCmainRepo.findAll();
    }

    @GetMapping("/GetBy/{id}")
    public ECmain getEcMainById(@PathVariable Long id) {
        return ecService.getEcMainById(id);
    }

    @PutMapping("/update/{id}")
    public ECmain updateRCAmain(@PathVariable long id, @RequestBody ECmain eCmain) {
        return ecService.updateECmain(id, eCmain);

    }

	

}
