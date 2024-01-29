package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.IfOthersChangeAttach;


@Repository
public interface EnviromentalChangeAttachRepo extends JpaRepository<IfOthersChangeAttach, Long>{

}
