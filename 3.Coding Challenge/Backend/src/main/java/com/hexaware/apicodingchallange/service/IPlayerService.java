package com.hexaware.apicodingchallange.service;

import java.util.List;

import com.hexaware.apicodingchallange.dto.PlayerDTO;
import com.hexaware.apicodingchallange.entity.Player;

public interface IPlayerService {
	public Player addPlayer(PlayerDTO playerDTO);
	public List<Player>getAllPlayers();
	public Player getPlayerById(int playerId);
	public Player updatePlayer(PlayerDTO playerDTO);
	public void deletePlayerById(int playerId);

	public List<String> getAllPlayerNames();

}