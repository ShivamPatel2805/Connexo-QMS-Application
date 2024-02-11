package com.example.Repository.rootcauseanaylsis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.rootcauseanaylsis.RootAdditional;

@Repository
public interface RootAdditionalRepo extends JpaRepository<RootAdditional,Long> {
}
