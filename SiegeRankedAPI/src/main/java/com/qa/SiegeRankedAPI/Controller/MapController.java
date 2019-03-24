package com.qa.SiegeRankedAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.SiegeRankedAPI.Entities.Map;
import com.qa.SiegeRankedAPI.Service.MapService;

@RestController
public class MapController {

	private MapService svc;

	@Autowired
	public MapController(MapService svc) {
		this.svc = svc;
	}

	public MapService getMapService() {
		return svc;
	}

	@PutMapping("/createMap")
	public Map createMap(@RequestBody Map map) {
		return svc.createMap(map);
	}

	@GetMapping("/getMap/{mapName}")
	public Map getMap(@PathVariable String mapName) {
		return svc.getMap(mapName);
	}

	@GetMapping("/getAllMaps")
	public List<Map> getAllMaps() {
		return svc.getAllMap();
	}

}
