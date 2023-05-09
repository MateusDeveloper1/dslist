package com.mateussilva.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateussilva.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
