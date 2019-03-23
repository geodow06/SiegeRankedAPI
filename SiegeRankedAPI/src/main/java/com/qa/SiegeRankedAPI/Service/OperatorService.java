package com.qa.SiegeRankedAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.SiegeRankedAPI.Entities.Operator;
import com.qa.SiegeRankedAPI.Repository.OperatorRepository;

@Service
public class OperatorService {

	private OperatorRepository repo;
	
	@Autowired
	public OperatorService(OperatorRepository repo) {
		this.repo = repo;
	}

	public OperatorRepository getOperatorRepository() {
		return repo;
	}

	@Override
	public String toString() {
		return "OperatorRepository [repo=" + repo + "]";
	}

	public boolean createOperator(Operator op) {
		op.setKills(0); 
		op.setDeaths(0); 
		op.setKd(0); 
		op.setRounds(0);
		repo.save(op);
		return repo.existsById(op.getId());
	}

	public Operator getOperator(String name) {
		return repo.findByName(name);
	}

	public List<Operator> getAllOperators() {
		return repo.findAll();
	}

	public String updateKD(String name) {
		Operator anOp = getOperator(name);
		anOp.setKd(anOp.getKills() / anOp.getDeaths());
		repo.save(anOp);
		return name + " K/D updated";
	}

	public Operator addKill(String name) {
		Operator anOp = getOperator(name);
		anOp.setKills(anOp.getKills() + 1); 
		repo.save(anOp);
		return anOp;
	}

	public Operator addDeath(String name) {
		Operator anOp = getOperator(name);
		anOp.setDeaths(anOp.getDeaths() + 1);
		repo.save(anOp);
		return anOp;
	}

	public Operator addRound(String name) {
		Operator anOp = getOperator(name);
		anOp.setRounds(anOp.getRounds() + 1);
		repo.save(anOp);
		return anOp;
	}

	public boolean deleteOperator(String name) {
		repo.deleteByName(name);
		return repo.existsByName(name);
	}

}
