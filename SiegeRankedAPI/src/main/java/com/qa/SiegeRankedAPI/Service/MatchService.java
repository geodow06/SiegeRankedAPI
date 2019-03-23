package com.qa.SiegeRankedAPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.SiegeRankedAPI.Repository.MatchRepository;

@Service
public class MatchService {

	private MatchRepository repo;

	public MatchService(@Autowired MatchRepository repo) {
		this.repo = repo;
	}

	public MatchRepository getMatchRepository() {
		return repo;
	}
}
