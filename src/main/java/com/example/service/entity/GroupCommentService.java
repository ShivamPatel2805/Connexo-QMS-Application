package com.example.service.entity;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.GroupCommentRepo;
import com.example.database.capaEntity.CapaClosure;
import com.example.database.capaEntity.CapaDetails;
import com.example.database.capaEntity.GroupComment;
import com.example.database.capaEntity.MaterialAndEquipmentInfo;

import java.util.Optional;

@Service
public class GroupCommentService {

    @Autowired
    private GroupCommentRepo groupCommentRepo;

    public GroupComment saveGroupComment(GroupComment data1){
        return groupCommentRepo.save(data1);
    }

    public GroupComment getGroupCommentById(long id){
        Optional<GroupComment> result2 = groupCommentRepo.findById(id);
        if(result2.isPresent()){
            return result2.get();
        }
        else {
            throw new RuntimeException("CapaClosure not found for id: " + id);
        }
    }

    public GroupComment updateGroupCommit(long id, GroupComment groupComment ){
        Optional<GroupComment> existDeatils = groupCommentRepo.findById(id);
        if(existDeatils.isPresent()){
            return groupCommentRepo.save(existDeatils.get());
        }else {
            throw new RuntimeException(" id not found for id: " +id);
        }
    }

}