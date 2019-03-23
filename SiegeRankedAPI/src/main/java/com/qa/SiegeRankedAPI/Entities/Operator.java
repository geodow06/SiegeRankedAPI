package com.qa.SiegeRankedAPI.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Operator {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String ctu;
	private int kills;
	private int deaths;
	private int kd;
	private int rounds;

	public Operator(Long id, String name, String ctu, int kills, int deaths, int kd, int rounds) {
		super();
		this.id = id;
		this.name = name;
		this.ctu = ctu;
		this.kills = kills;
		this.deaths = deaths;
		this.kd = kd;
		this.rounds = rounds;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCTU() {
		return ctu;
	}

	public void setCTU(String ctu) {
		this.ctu = ctu;
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public int getKd() {
		return kd;
	}

	public void setKd(int kd) {
		this.kd = kd;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	@Override
	public String toString() {
		return String.format("Account[id=" + id + ", name=" + name + ", CTU=" + ctu + ", kills=" + kills + ", deaths="
				+ deaths + ", kd=" + kd + ", rounds=" + rounds + "]", id, name, ctu, kills, deaths, kd, rounds);
	}
}
