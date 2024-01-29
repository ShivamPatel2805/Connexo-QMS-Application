package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DocumentEntity.ChemestryFileAttach;

public interface ChemestryFileAttachRepo extends JpaRepository<ChemestryFileAttach, Long> {

}
