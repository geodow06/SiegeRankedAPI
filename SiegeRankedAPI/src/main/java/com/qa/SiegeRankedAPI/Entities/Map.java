package com.qa.SiegeRankedAPI.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Map {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long mapId;
	private String name;
	private int wins;
	private int losses;
	private int wl;

	public Map(Long mapId, String name, int wins, int losses, int wl) {
		super();
		this.mapId = mapId;
		this.name = name;
		this.wins = wins;
		this.losses = losses;
		this.wl = wl;
	}

	public Long getMapId() {
		return mapId;
	}

	public void setMapId(Long mapId) {
		this.mapId = mapId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Map [mapId=" + mapId + ", name=" + name + ", wins=" + wins + ", losses=" + losses + ", wl=" + wl + "]";
	}

}
