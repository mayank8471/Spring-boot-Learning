package com.mayank.repository;

import org.springframework.data.repository.CrudRepository;

import com.mayank.models.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer> {

}
