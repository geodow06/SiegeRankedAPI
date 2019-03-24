package com.qa.SiegeRankedAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.SiegeRankedAPI.Entities.Map;
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

	public Map createMap(Map map) {
		repo.save(map);
		return map;
	}

	public Map getMap(String mapName) {
		return repo.findByMapName(mapName);
	}

	public List<Map> getAllMap() {
		return repo.findAll();

	}

}
