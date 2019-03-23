package com.qa.SiegeRankedAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.SiegeRankedAPI.Entities.Operator;
import com.qa.SiegeRankedAPI.Service.OperatorService;

@RestController
public class OperatorController {

	private OperatorService svc;

	@Autowired
	public OperatorController(OperatorService svc) {
		this.svc = svc;
	}

	public OperatorService getOperatorService() {
		return svc;
	}
 
	@PutMapping("/createOperator")
	public boolean createOperator(@RequestBody Operator op) {
		return svc.createOperator(op);
	}

	@GetMapping("/getOperator/{name}")
	public Operator getOperator(@PathVariable String name) {
		return svc.getOperator(name);
	}

	@GetMapping("/getAllOperators")
	public List<Operator> getAllOperators() {
		return svc.getAllOperators();
	}

	@GetMapping("/updateKD/{name}")
	public String updateKD(@PathVariable String name) {
		return svc.updateKD(name);
	}

	@PostMapping("/addKill/{name}")
	public Operator addKill(@PathVariable String name) {
		return svc.addKill(name);
	}

	@PostMapping("/addDeath/{name}")
	public Operator addDeath(@PathVariable String name) {
		return svc.addDeath(name);
	}

	@PostMapping("/addRound/{name}")
	public Operator addRound(@PathVariable String name) {
		return svc.addRound(name);
	}

	@DeleteMapping("/deleteOperator/{name}")
	public boolean deleteOperator(@PathVariable String name) {
		return svc.deleteOperator(name);
	}

}
