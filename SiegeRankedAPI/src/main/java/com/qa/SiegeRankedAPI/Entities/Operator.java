package com.qa.SiegeRankedAPI.Entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Table(name = "Operator")
public class Operator {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "Id")
//	private Long id;
	@Id
	@Column(name = "Name") 
	@OnDelete(action=OnDeleteAction.CASCADE)
	private String operatorName;

	@Column(name = "CTU")
	private String ctu;

//	@Column(name = "Kills")
//	private int kills;
//
//	@Column(name = "Deaths")
//	private int deaths;

//	@Column(name = "KD")
//	private int kd;
//
//	@Column(name = "Rounds")
//	private int rounds;

	public Operator() {

	}

	public Operator(String operatorName, String ctu) {
		super();
		this.operatorName = operatorName;
		this.ctu = ctu;
//		this.kills = kills; 
//		this.deaths = deaths;
	}

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getCTU() {
		return ctu;
	}

	public void setCTU(String ctu) {
		this.ctu = ctu;
	}

	@Override
	public String toString() {
		return "Operator [operatorName=" + operatorName + ", ctu=" + ctu + "]";
	}

//	public int getKills() {
//		return kills;
//	}
//
//	public void setKills(int kills) {
//		this.kills = kills;
//	}
//
//	public int getDeaths() {
//		return deaths;
//	}
//
//	public void setDeaths(int deaths) {
//		this.deaths = deaths;
//	}

//	public int getKd() {
//		return kd;
//	}
//
//	public void setKd(int kd) {
//		this.kd = kd;
//	}
//
//	public int getRounds() {
//		return rounds;
//	}
//
//	public void setRounds(int rounds) {
//		this.rounds = rounds;
//	}

//	@Override
//	public String toString() {
//		return String.format("Account[id=" + id + ", operatorName=" + operatorName + ", CTU=" + ctu + ", kills=" + kills
//				+ ", deaths=" + deaths + "]", id, operatorName, ctu, kills, deaths);
//	} 

}
