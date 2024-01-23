package com.example.ActionItemRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ActionItemEntity.ActionItemGeneralInfo;
@Repository
public interface ActionItemGeneralInfoRepo extends JpaRepository<ActionItemGeneralInfo, Long>{

}
