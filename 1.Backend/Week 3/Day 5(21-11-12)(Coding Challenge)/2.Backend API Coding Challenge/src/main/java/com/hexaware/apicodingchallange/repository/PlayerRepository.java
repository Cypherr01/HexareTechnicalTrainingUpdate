package com.hexaware.apicodingchallange.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.apicodingchallange.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
    @Query("select p.playerName from Player p")
    public List<String> findAllPlayernames();
}