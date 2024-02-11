package com.example.Repository.rootcauseanaylsis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.rootcauseanaylsis.RootGroupAttach;

@Repository
public interface RootGroupAttachRepo extends JpaRepository<RootGroupAttach,Long> {
}
