package com.example.ActionItemController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ActionItemDtos.ActionItemRequest;
import com.example.ActionItemEntity.ActionItem;
import com.example.ActionItemRepository.ActionItemRepo;
import com.example.ActionItemService.ActionItemService;


@RestController
@RequestMapping("/actionitem/api")
public class ActionItemController {
	
	@Autowired
	private ActionItemRepo actionItemrepo;
	
	@Autowired
	private ActionItemService  actionitemservice;
	
	  @PostMapping("/create")
	    public ActionItem createExtention(@RequestBody ActionItemRequest actionItemRequest){
	        return actionItemrepo.save(actionItemRequest.getActionItem());
	    }
	    
    
    @GetMapping("/findAllDivision")
    public List<ActionItem> findAllDivision(){
        return actionItemrepo.findAll();
    }

    @GetMapping("/GetBy/{id}")
    public ActionItem getActionItemById(@PathVariable Long id) {
        return actionitemservice.getActionItemById(id);
    }

	

}
