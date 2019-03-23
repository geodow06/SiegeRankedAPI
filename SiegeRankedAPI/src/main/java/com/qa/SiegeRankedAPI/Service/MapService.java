package com.qa.SiegeRankedAPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.SiegeRankedAPI.Repository.MapRepository;

@Service
public class MapService {

	private MapRepository repo;

	@Autowired
	public MapService(MapRepository repo) {
		this.repo = repo;
	}

	public MapRepository getMapRepository() {
		return repo;
	}
}
