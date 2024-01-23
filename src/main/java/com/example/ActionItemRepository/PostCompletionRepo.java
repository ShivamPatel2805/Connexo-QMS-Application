package com.example.ActionItemRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ActionItemEntity.PostCompletion;
@Repository
public interface PostCompletionRepo extends JpaRepository<PostCompletion, Long>{

}
