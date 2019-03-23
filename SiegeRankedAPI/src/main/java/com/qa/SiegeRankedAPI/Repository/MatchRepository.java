package com.qa.SiegeRankedAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.SiegeRankedAPI.Entities.Match;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {

}
