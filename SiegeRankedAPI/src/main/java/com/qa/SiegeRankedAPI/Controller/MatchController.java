package com.qa.SiegeRankedAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.SiegeRankedAPI.Entities.Match;
import com.qa.SiegeRankedAPI.Service.MatchService;

@RestController
public class MatchController {

	private MatchService svc;

	@Autowired
	public MatchController(MatchService svc) {
		this.svc = svc;
	}

	public MatchService getMatchService() {
		return svc;
	}

	@PutMapping("/createMatch")
	public boolean createMatch(@RequestBody Match match) {
		return svc.createMatch(match);
	}

	@GetMapping("/getMatch/{matchId}")
	public Match getMatch(@PathVariable Long matchId) {
		return svc.getMatch(matchId);
	}

	@GetMapping("/getAllMatches")
	public List<Match> getAllMatches() {
		return svc.getAllMatches();
	}

	@GetMapping("/getMapMatches/{mapName}")
	public List<Match> getMapMatches(String mapName) {
		return svc.getAllMapMatches(mapName);
	}
}
