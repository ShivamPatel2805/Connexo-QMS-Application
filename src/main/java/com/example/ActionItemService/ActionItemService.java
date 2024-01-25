package com.example.ActionItemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ActionItemEntity.ActionItem;
import com.example.ActionItemRepository.ActionItemRepo;



@Service
public class ActionItemService {
	
	
	@Autowired
	private ActionItemRepo actionItemRepo;
	
	public ActionItem SaveActionItem(ActionItem actionitem) {
        return actionItemRepo.save(actionitem); // Use the inherited save method.
    }
    
    public List<ActionItem> getAllEntities() {
        return actionItemRepo.findAll();
    }

    public ActionItem getActionItemById(long id) {
        return actionItemRepo.findById(id).get();
    }
    

	public ActionItem updateActionItem(long id, ActionItem actionitem) {
		ActionItem existingDeatils = actionItemRepo.findById(id).get();
		existingDeatils.setActionItemGeneralInfo(actionitem.getActionItemGeneralInfo());
		existingDeatils.setPostCompletion(actionitem.getPostCompletion());
		existingDeatils.setActionApproval(actionitem.getActionApproval());
		return actionItemRepo.save(existingDeatils);
		
	}
	

}
