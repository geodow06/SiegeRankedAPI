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
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "Map")
public class Map {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "mapId")
//	private Long mapId; 
	@Id
	private String mapName;
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "mapName")
	@OnDelete(action = OnDeleteAction.CASCADE)
	@Column(name = "mapMatches")
	private List<Match> mapMatches;
	private int wins;
	private int losses;
	private int wl;

	public Map() {

	}

	public Map(String mapName) {
		super();
		this.mapName = mapName;

	}

//	public Long getMapId() {
//		return mapId;
//	}
//
//	public void setMapId(Long mapId) {
//		this.mapId = mapId;
//	}

	public String getMapName() {
		return mapName;
	}

	public void setMapName(String mapName) {
		this.mapName = mapName;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getWl() {
		return wl;
	}

	public void setWl(int wl) {
		this.wl = wl;
	}

	public List<Match> getMapMatches() {
		return mapMatches;
	}

	public void setMapMatches(List<Match> mapMatches) {
		this.mapMatches = mapMatches;
	}

	@Override
	public String toString() {
		return "Map [mapName=" + mapName + ", mapMatches=" + mapMatches + ", wins=" + wins + ", losses=" + losses
				+ ", wl=" + wl + "]";
	}

}
