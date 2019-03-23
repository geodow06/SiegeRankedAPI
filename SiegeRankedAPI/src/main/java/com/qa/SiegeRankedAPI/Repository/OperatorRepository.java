package com.qa.SiegeRankedAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.SiegeRankedAPI.Entities.Operator;

@Repository
public interface OperatorRepository extends JpaRepository<Operator, Long> {
	public Operator findByName(String name);

	public boolean existsByName(String name);

	public void deleteByName(String name);
}
