package com.example.LabIncidentRepository;


import com.example.LabIncidentEntity.Labincident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabIncRepository extends JpaRepository<Labincident,Long> {

}
