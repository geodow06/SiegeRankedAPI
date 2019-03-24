package com.qa.SiegeRankedAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.SiegeRankedAPI.Entities.Match;
import com.qa.SiegeRankedAPI.Repository.MapRepository;
import com.qa.SiegeRankedAPI.Repository.MatchRepository;

@Service
public class MatchService {

	private MatchRepository repo;
	private MapRepository mapRepo;

	@Autowired
	public MatchService(MatchRepository repo, MapRepository mapRepo) {
		this.repo = repo;
		this.mapRepo = mapRepo;
	}

	public MatchRepository getMatchRepository() {
		return repo;
	}

	public MapRepository getMapRepository() {
		return mapRepo;
	}

	// Create
	public boolean createMatch(Match match) {
		repo.save(match);
		return repo.existsById(match.getMatchId());
	}

	// Read
	public Match getMatch(Long id) {
		return repo.findById(id).get();
	}

	public List<Match> getAllMatches() {
		return repo.findAll();
	}

	public List<Match> getAllMapMatches(String mapName) {
		return repo.findAllByMapName(mapName);
	}

	// Update
//	public Match updateMatch(Match match, Long matchId) { 
//		Match aMatch = repo.findById(matchId).get(); 
//		aMatch.setKills(match.getKills());
//		aMatch.setDeaths(match.getDeaths());
//		aMatch.setMap(match.getMap()); 
//		aMatch.setMapId(match.getMapId()); 
//		
//		repo.save(aMatch); 
//		return aMatch;
//	}

	// Delete
	public boolean deleteMatch(Long matchId) {
		repo.deleteById(matchId);
		return repo.existsById(matchId);
	}
}
