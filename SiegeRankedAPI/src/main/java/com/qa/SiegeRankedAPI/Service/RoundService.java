package com.qa.SiegeRankedAPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
