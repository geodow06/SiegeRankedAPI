package com.qa.SiegeRankedAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.SiegeRankedAPI.Entities.Round;
import com.qa.SiegeRankedAPI.Service.RoundService;

@RestController
public class RoundController {

	private RoundService svc;

	@Autowired
	public RoundController(RoundService svc) {
		this.svc = svc;
	}

	public RoundService getRoundService() {
		return svc;
	}

	@PutMapping("/createRound")
	public boolean createRound(@RequestBody Round round) {
		return svc.createRound(round);
	}

	@GetMapping("/getRound/{roundId}")
	public Round getRound(@PathVariable Long roundId) {
		return svc.getRound(roundId);
	}

	@GetMapping("/getMatchRounds/{matchId}")
	public List<Round> getMatchRounds(@PathVariable Long matchId) {
		return svc.getMatchRounds(matchId);
	}

	@GetMapping("/getAllRounds")
	public List<Round> getAllRounds() {
		return svc.getAllRounds();
	}
}
