package com.example.reddit.repository;

import com.example.reddit.model.Subreddit;
import com.example.reddit.model.Vote;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
}
