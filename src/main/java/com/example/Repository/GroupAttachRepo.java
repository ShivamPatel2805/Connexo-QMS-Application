package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.capaEntity.GroupAttach;

@Repository
public interface GroupAttachRepo extends JpaRepository<GroupAttach,Long> {
}
