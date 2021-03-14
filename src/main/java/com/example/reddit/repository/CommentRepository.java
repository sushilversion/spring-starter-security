package com.example.reddit.repository;

import com.example.reddit.model.Comment;
import com.example.reddit.model.Vote;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
