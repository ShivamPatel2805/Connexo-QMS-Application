package com.example.Repository.rootcauseanaylsis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.entity.EntityMain;
import com.example.database.rootcauseanaylsis.RootCauseMainEnitiy;

import java.util.List;

@Repository
public interface RootCauseMainEnitiyRepo extends JpaRepository<RootCauseMainEnitiy,Long> {

    List<RootCauseMainEnitiy> findAllRootByUserId(Long userId);

    RootCauseMainEnitiy findRootEntityMainByIdAndUserId(Long id, Long userId);
}
