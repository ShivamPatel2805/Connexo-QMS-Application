package com.example.ChangeControlRepository;

import com.example.ChangeControlEntity.ChangeControl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChangeControlRepo extends JpaRepository<ChangeControl,Long> {
}
