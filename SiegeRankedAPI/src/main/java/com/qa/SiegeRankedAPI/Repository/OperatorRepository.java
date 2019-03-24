package com.qa.SiegeRankedAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.SiegeRankedAPI.Entities.Operator;

@Repository
public interface OperatorRepository extends JpaRepository<Operator, Long> {
	public Operator findByOperatorName(String operatorName);

	public boolean existsByOperatorName(String operatorName);

	public void deleteByOperatorName(String operatorName);
}
