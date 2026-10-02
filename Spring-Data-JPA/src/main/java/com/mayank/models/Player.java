package com.mayank.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CRICKET_PLAYER")
public class Player {

	@Id
	private Integer ID;
	
	@Column(name = "PLAYER_NAME")
	private String PlayerName;
	
	@Column(name="PLAYER_AGE")
	private Integer playerAge;

	private String location;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}

	public Integer getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(Integer playerAge) {
		this.playerAge = playerAge;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Player [ID=" + ID + ", PlayerName=" + PlayerName + ", playerAge=" + playerAge + ", location=" + location
				+ "]";
	}
	
}
