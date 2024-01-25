package com.example.RCARepo;


import com.example.RCAEntity.RCAGroupAttach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RCAGroupAttachRepo extends JpaRepository<RCAGroupAttach, Long>{
}
