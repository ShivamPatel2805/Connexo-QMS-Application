package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.IfOthersFileAttach;
@Repository
public interface EnviromentalFileAttachRepo extends JpaRepository<IfOthersFileAttach, Long>{

}
