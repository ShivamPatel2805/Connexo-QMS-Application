package com.example.Repository.rootcauseanaylsis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.rootcauseanaylsis.RootGenInfo;

@Repository
public interface RootGenInfoRepo extends JpaRepository<RootGenInfo,Long> {
}
