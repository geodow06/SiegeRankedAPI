package com.qa.SiegeRankedAPI.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Round {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long roundId;
	private Operator operator;
	private int kills;
	private int deaths;
	private boolean win;

	public Round(Long roundId, Operator operator, int kills, int deaths, boolean win) {
		super();
		this.roundId = roundId;
		this.operator = operator;
		this.kills = kills;
		this.deaths = deaths;
		this.win = win;
	}

	public Long getRoundId() {
		return roundId;
	}

	public void setRoundId(Long roundId) {
		this.roundId = roundId;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
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

	public boolean isWin() {
		return win;
	}

	public void setWin(boolean win) {
		this.win = win;
	}

	@Override
	public String toString() {
		return "Round [roundId=" + roundId + ", operator=" + operator + ", kills=" + kills + ", deaths=" + deaths
				+ ", win=" + win + "]";
	}

}
