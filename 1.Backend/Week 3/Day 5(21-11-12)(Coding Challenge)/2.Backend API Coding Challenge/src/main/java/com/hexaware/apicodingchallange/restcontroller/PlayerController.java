package com.hexaware.apicodingchallange.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hexaware.apicodingchallange.dto.PlayerDTO;
import com.hexaware.apicodingchallange.entity.Player;
import com.hexaware.apicodingchallange.service.IPlayerService;

@RestController
@CrossOrigin
@RequestMapping("/api/player")
public class PlayerController {

	@Autowired
	IPlayerService playerService;

	@PostMapping("/add")
	public Player addPlayer(@RequestBody PlayerDTO playerDTO) {
		return playerService.addPlayer(playerDTO);
	}

	@GetMapping("/getall")
	public List<Player> getAllPlayers(){
		return playerService.getAllPlayers();
	}

	@GetMapping("/getById/{playerId}")
	public Player getById(@PathVariable int playerId) {
		return playerService.getPlayerById(playerId);
	}

	@PutMapping("/update")
	public Player updatePlayer(@RequestBody PlayerDTO playerDTO) {
		return playerService.updatePlayer(playerDTO);
	}

	@DeleteMapping("/delete/{playerId}")
	public void deletePlayer(@PathVariable int playerId) {
		playerService.deletePlayerById(playerId);
	}

	@GetMapping("/names")
	public List<String> getAllPlayerNames() {
		return playerService.getAllPlayerNames();
	}
}