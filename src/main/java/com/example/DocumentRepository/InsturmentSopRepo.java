package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.DocumentEntity.InstrumentSop;
@Repository
public interface InsturmentSopRepo extends JpaRepository<InstrumentSop,Long>{

}
