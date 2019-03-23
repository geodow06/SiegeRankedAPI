package com.qa.SiegeRankedAPI.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Match {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String map;
	private String win;
	private int kills;
	private int deaths;
	private int kd;
	private int roundsWon;
	private int roundsLost;

	public Match(Long id, String map, String win, int kills, int deaths, int kd, int roundsWon, int roundsLost) {
		super();
		this.id = id;
		this.map = map;
		this.win = win;
		this.kills = kills;
		this.deaths = deaths;
		this.kd = kd;
		this.roundsWon = roundsWon;
		this.roundsLost = roundsLost;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMap() {
		return map;
	}

	public void setMap(String map) {
		this.map = map;
	}

	public String getWin() {
		return win;
	}

	public void setWin(String win) {
		this.win = win;
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

	public int getRoundsWon() {
		return roundsWon;
	}

	public void setRoundsWon(int roundsWon) {
		this.roundsWon = roundsWon;
	}

	public int getRoundsLost() {
		return roundsLost;
	}

	public void setRoundsLost(int roundsLost) {
		this.roundsLost = roundsLost;
	}

	@Override
	public String toString() {
		return "Match [id=" + id + ", map=" + map + ", win=" + win + ", kills=" + kills + ", deaths=" + deaths + ", kd="
				+ kd + ", roundsWon=" + roundsWon + ", roundsLost=" + roundsLost + "]";
	}

}
