package com.example.ChangeControlRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ChangeControlEntity.ChangeClouserAttach;
@Repository
public interface ChangeClouserAttachRepo extends JpaRepository<ChangeClouserAttach, Long>{

}
