package com.mateussilva.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateussilva.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
