package com.example.RCARepo;


import com.example.RCAEntity.RCAGroupComments;
import com.example.RCAEntity.RCAmain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RCAGroupCommentsRepo extends JpaRepository<RCAGroupComments, Long>{
}
