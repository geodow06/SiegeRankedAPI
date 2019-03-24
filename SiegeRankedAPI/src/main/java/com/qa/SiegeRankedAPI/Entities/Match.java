package com.qa.SiegeRankedAPI.Entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Match {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long matchId;
	private boolean win;
	private int kills;
	private int deaths;
	private int kd;
	private int roundsWon;
	private int roundsLost;
	private String mapName;
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "matchId")
	@OnDelete(action = OnDeleteAction.CASCADE)
	@Column(name = "matchRounds")
	private List<Round> matchRounds;
    
	public Match() { 
		
	}
	
	public Match(String mapName, boolean win) {
		super();
		this.mapName = mapName;
		this.win = win;
//		this.kills = kills;
//		this.deaths = deaths;
//		this.kd = kd;
//		this.roundsWon = roundsWon;
//		this.roundsLost = roundsLost;
//		this.matchRounds = matchRounds;
	}

	public Long getMatchId() {
		return matchId;
	}

	public void setMatchId(Long matchId) {
		this.matchId = matchId;
	}

	public String getMapName() {
		return mapName;
	}

	public void setMapName(String mapName) {
		this.mapName = mapName;
	}

	public boolean getWin() {
		return win;
	}

	public void setWin(boolean win) {
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

	public List<Round> getMatchRounds() {
		return matchRounds;
	}

	public void setMatchRounds(List<Round> matchRounds) {
		this.matchRounds = matchRounds;
	}

	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", win=" + win + ", kills=" + kills + ", deaths=" + deaths + ", kd=" + kd
				+ ", roundsWon=" + roundsWon + ", roundsLost=" + roundsLost + ", mapName=" + mapName + ", matchRounds="
				+ matchRounds + "]";
	}

}
