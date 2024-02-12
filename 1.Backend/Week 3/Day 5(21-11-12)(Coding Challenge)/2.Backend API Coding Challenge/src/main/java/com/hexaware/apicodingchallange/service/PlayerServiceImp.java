package com.hexaware.apicodingchallange.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.apicodingchallange.dto.PlayerDTO;
import com.hexaware.apicodingchallange.entity.Player;
import com.hexaware.apicodingchallange.repository.PlayerRepository;

@Service
public class PlayerServiceImp implements IPlayerService {

	@Autowired
	PlayerRepository play;

	@Override
	public Player addPlayer(PlayerDTO playerDTO) {
		Player player = new Player();
		player.setPlayerId(playerDTO.getPlayerId());
		player.setPlayerName(playerDTO.getPlayerName());
		player.setJerseyNumber(playerDTO.getJerseyNumber());
		player.setRole(playerDTO.getRole());
		player.setTotalMatches(playerDTO.getTotalMatches());
		player.setTeamName(playerDTO.getTeamName());
		player.setCountryName(playerDTO.getCountryName());


		return play.save(player);
	}

	@Override
	public List<Player> getAllPlayers() {
		return play.findAll();
	}

	@Override
	public Player getPlayerById(int playerId) {
		Player player = play.findById(playerId).orElse(new Player());

		return new Player(player.getPlayerId(), player.getPlayerName(), player.getJerseyNumber(),player.getRole(),
				player.getTotalMatches(), player.getTeamName(),player.getCountryName());

	}

	@Override
	public Player updatePlayer(PlayerDTO playerDTO) {
		Player existingPlayer = play.findById(playerDTO.getPlayerId()).orElse(null);
//		player.setPlayerId(playerDTO.getPlayerId());
		if(existingPlayer != null) {
			existingPlayer.setPlayerName(playerDTO.getPlayerName());
			existingPlayer.setJerseyNumber(playerDTO.getJerseyNumber());
			existingPlayer.setRole(playerDTO.getRole());
			existingPlayer.setTotalMatches(playerDTO.getTotalMatches());
			existingPlayer.setTeamName(playerDTO.getTeamName());
			existingPlayer.setCountryName(playerDTO.getCountryName());
			return play.save(existingPlayer);
		}
		else {
			return null;
		}
	}

	@Override
	public void deletePlayerById(int playerId) {
		Player player = play.findById(playerId).orElse(null);
		play.delete(player);

	}

	@Override
	public List<String> getAllPlayerNames(){
		return play.findAllPlayernames();
	}

}
