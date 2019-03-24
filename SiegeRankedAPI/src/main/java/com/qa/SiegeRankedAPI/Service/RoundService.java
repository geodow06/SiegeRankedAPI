package com.qa.SiegeRankedAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.SiegeRankedAPI.Entities.Round;
import com.qa.SiegeRankedAPI.Repository.RoundRepository;

@Service
public class RoundService {

	private RoundRepository repo;

	public RoundService(@Autowired RoundRepository repo) {
		this.repo = repo;
	}

	public RoundRepository getRoundRepository() {
		return repo;
	}

	public boolean createRound(Round round) {
		repo.save(round);
		return repo.existsById(round.getRoundId());
	}

	public Round getRound(Long roundId) {
		// TODO Auto-generated method stub
		return repo.findById(roundId).get();
	}

	public List<Round> getMatchRounds(Long matchId) {
		// TODO Auto-generated method stub
		return repo.findByMatchId(matchId);
	}

	public List<Round> getAllRounds() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}
