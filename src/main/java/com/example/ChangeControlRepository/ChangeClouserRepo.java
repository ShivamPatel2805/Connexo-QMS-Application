package com.example.ChangeControlRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ChangeControlEntity.ChangeClouser;
@Repository
public interface ChangeClouserRepo extends JpaRepository<ChangeClouser, Long>{

}
