package com.backend.db.repository;

import com.backend.db.entity.CommentGood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentGoodRepository extends JpaRepository<CommentGood,String> {
}
