package com.example.ChangeControlRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ChangeControlEntity.Evalution;
@Repository
public interface EvalutionRepo extends JpaRepository<Evalution, Long>{

}
