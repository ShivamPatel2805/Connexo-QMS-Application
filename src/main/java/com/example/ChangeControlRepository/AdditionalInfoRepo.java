package com.example.ChangeControlRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ChangeControlEntity.AdditionalInformation;
@Repository
public interface AdditionalInfoRepo extends JpaRepository<AdditionalInformation, Long>{

}
