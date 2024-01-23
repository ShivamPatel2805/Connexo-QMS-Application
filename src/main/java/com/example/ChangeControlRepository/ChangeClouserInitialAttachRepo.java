package com.example.ChangeControlRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ChangeControlEntity.ChangeClouserInitialAttach;
@Repository
public interface ChangeClouserInitialAttachRepo extends JpaRepository<ChangeClouserInitialAttach, Long>{

}
