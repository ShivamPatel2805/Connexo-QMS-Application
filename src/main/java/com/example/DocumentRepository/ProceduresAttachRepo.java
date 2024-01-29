package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DocumentEntity.ProceduresAttach;

public interface ProceduresAttachRepo extends JpaRepository<ProceduresAttach,Long> {

}
