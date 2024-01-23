package com.example.ChangeControlRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ChangeControlEntity.AdditionalInfoAttach;

@Repository
public interface AdditonalInfiAttachRepo extends JpaRepository<AdditionalInfoAttach,Long>{

}
