package com.example.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.capaEntity.AdditionalAttach;

@Repository
public interface AdditionalAttachRepo extends JpaRepository<AdditionalAttach,Long> {
}
