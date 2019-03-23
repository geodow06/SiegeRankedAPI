package com.qa.SiegeRankedAPI.Entities;

import javax.persistence.Access;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Table(name = "Operator")
public class Operator {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long id;

	@Column(name = "Name")
	private String name;

	@Column(name = "CTU")
	private String ctu;

	@Column(name = "Kills")
	private int kills;

	@Column(name = "Deaths")
	private int deaths;

	@Column(name = "KD")
	private int kd;

	@Column(name = "Rounds")
	private int rounds;

	public Operator() {

	}

	public Operator(String name, String ctu) {
		super();
		this.name = name;
		this.ctu = ctu;
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
