/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anshul.HockeyLeagueWebApp.entity;
import jakarta.persistence.*;
import java.util.Objects;

/**
 * Entity representation of a player for the HockeyLeagueWebApp.
 * Maps to the 'players' table in the database.
 * This class contains player details such as name, address, team association, role, and active status.
 * 
 * @author Anshul Alpesh Patel
 */

@Entity
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "playerName", length = 100, nullable = false)
    private String playerName;

    @Column(name = "playerAddress", length = 200)
    private String playerAddress;

    @Column(name = "teamID")
    private int teamID;

    @Column(name = "playerRole", length = 100)
    private String playerRole;

    @Column(name = "playerActiveStatus", length = 1)
    private String playerActiveStatus; // Stored as "T" or "F"

    /**
     * Default constructor for JPA.
     */
    public Player() {
        // JPA requires a default constructor
    }

    /**
     * Constructs a new Player with the specified details.
     *
     * @param playerName          the name of the player
     * @param playerAddress       the address of the player
     * @param teamID              the ID of the team to which the player belongs
     * @param playerRole          the role of the player within the team
     * @param playerActiveStatus  the active status of the player, stored as "T" (true) or "F" (false)
     */
    public Player(String playerName, String playerAddress, int teamID, String playerRole, String playerActiveStatus) {
        this.playerName = playerName;
        this.playerAddress = playerAddress;
        this.teamID = teamID;
        this.playerRole = playerRole;
        this.playerActiveStatus = playerActiveStatus;
    }

    // Getters and Setters with documentation:

    /**
     * Gets the ID of the player.
     *
     * @return the ID of the player
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the player.
     *
     * @param id the new ID of the player
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the name of the player.
     *
     * @return the name of the player
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * Sets the name of the player.
     *
     * @param playerName the new name of the player
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * Gets the address of the player.
     *
     * @return the address of the player
     */
    public String getPlayerAddress() {
        return playerAddress;
    }

    /**
     * Sets the address of the player.
     *
     * @param playerAddress the new address of the player
     */
    public void setPlayerAddress(String playerAddress) {
        this.playerAddress = playerAddress;
    }

    /**
     * Gets the team ID associated with the player.
     *
     * @return the team ID
     */
    public int getTeamID() {
        return teamID;
    }

    /**
     * Sets the team ID associated with the player.
     *
     * @param teamID the new team ID
     */
    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    /**
     * Gets the role of the player.
     *
     * @return the role of the player
     */
    public String getPlayerRole() {
        return playerRole;
    }

    /**
     * Sets the role of the player.
     *
     * @param playerRole the new role of the player
     */
    public void setPlayerRole(String playerRole) {
        this.playerRole = playerRole;
    }

    /**
     * Gets the active status of the player.
     *
     * @return the active status of the player, "T" for true or "F" for false
     */
    public String getPlayerActiveStatus() {
        return playerActiveStatus;
    }

    /**
     * Sets the active status of the player.
     *
     * @param playerActiveStatus the new active status of the player, "T" for true or "F" for false
     */
    public void setPlayerActiveStatus(String playerActiveStatus) {
        this.playerActiveStatus = playerActiveStatus;
    }
    
        /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param o the reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return id == player.id;
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * Returns a string representation of the object. In general, the
     * toString method returns a string that "textually represents" this object.
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", playerName='" + playerName + '\'' +
                ", playerAddress='" + playerAddress + '\'' +
                ", teamID=" + teamID +
                ", playerRole='" + playerRole + '\'' +
                ", playerActiveStatus='" + playerActiveStatus + '\'' +
                '}';
    }
    
    // If you have any business logic that is specific to the Player entity, 
    // you can add those methods here. For example:
    
    /**
     * Checks if the player is currently active.
     *
     * @return true if the player is active, false otherwise.
     */
    public boolean isActive() {
        return "T".equals(playerActiveStatus);
    }

    /**
     * Activates the player.
     */
    public void activate() {
        this.playerActiveStatus = "T";
    }

    /**
     * Deactivates the player.
     */
    public void deactivate() {
        this.playerActiveStatus = "F";
    }
}
