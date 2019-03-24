package com.qa.SiegeRankedAPI.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.SiegeRankedAPI.Entities.Operator;
import com.qa.SiegeRankedAPI.Entities.Round;

@Repository
public interface RoundRepository extends JpaRepository<Round, Long> {
	public List<Operator> findAllByOperatorName(String operatorName);

	public List<Round> findByMatchId(Long matchId);
}
