package com.example.Repository.rootcauseanaylsis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.rootcauseanaylsis.RootAdditionalAttach;

@Repository
public interface RootAdditionalAttachRepo extends JpaRepository<RootAdditionalAttach,Long> {
}
