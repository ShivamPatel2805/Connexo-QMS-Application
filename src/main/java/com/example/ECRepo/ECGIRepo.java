package com.example.ECRepo;

import com.example.ECEntity.ECGI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ECGIRepo extends JpaRepository<ECGI, Long>{

}
