/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anshul.HockeyLeagueWebApp.entity;

import jakarta.persistence.*;
import java.util.Objects;

/**
 * Entity representation of a team for the HockeyLeagueWebApp.
 * Maps to the 'teams' table in the database.
 * This class contains the team's details such as the team name.
 * 
 * @author Anshul Alpesh Patel
 */

@Entity
@Table(name = "teams")
public class Team {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "teamName", length = 100, nullable = false)
    private String teamName;

    /**
     * Default constructor required for JPA entity classes.
     * It is used by JPA providers to instantiate entities via reflection.
     */
    public Team() {
        // JPA requires a no-argument constructor for entity classes.
    }

    /**
     * Constructs a new Team with the given name.
     *
     * @param teamName The name of the team.
     */
    public Team(String teamName) {
        this.teamName = teamName;
    }

    /**
     * Retrieves the ID of the team.
     * 
     * @return An integer representing the unique identifier for the team.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the team.
     * 
     * @param id An integer value that will be used as the new ID for the team.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retrieves the name of the team.
     * 
     * @return A string representing the name of the team.
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Sets the name of the team.
     * 
     * @param teamName A string containing the new name for the team.
     *                 It must not exceed 100 characters in length.
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * Determines whether another object is equal to this Team.
     * The comparison is based on the unique ID of the Team.
     *
     * @param o The object to compare this Team against.
     * @return true if the given object represents a Team with the same ID as this Team, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return id == team.id;
    }

    /**
     * Returns a hash code for this Team.
     * This implementation is consistent with equals, as it is based solely on the Team's ID.
     *
     * @return A hash code for this Team.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * Returns a string representation of the Team, including its ID and name.
     * This is useful for logging and debugging purposes.
     *
     * @return A string representation of this Team.
     */
    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
