package com.qa.SiegeRankedAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.SiegeRankedAPI.Entities.Round;

@Repository
public interface RoundRepository extends JpaRepository<Round, Long> {

}
