package com.qa.SiegeRankedAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.SiegeRankedAPI.Entities.Map;

@Repository
public interface MapRepository extends JpaRepository<Map, Long> {
	public Map findByMapName(String name); 
}
