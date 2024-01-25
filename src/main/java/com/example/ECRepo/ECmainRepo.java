package com.example.ECRepo;

import com.example.ECEntity.ECmain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ECmainRepo extends JpaRepository<ECmain, Long>{

}
