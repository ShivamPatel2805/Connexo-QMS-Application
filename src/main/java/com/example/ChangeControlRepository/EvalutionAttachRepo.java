package com.example.ChangeControlRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ChangeControlEntity.EvalutionAttachment;

@Repository
public interface EvalutionAttachRepo extends JpaRepository<EvalutionAttachment, Long>{

}
