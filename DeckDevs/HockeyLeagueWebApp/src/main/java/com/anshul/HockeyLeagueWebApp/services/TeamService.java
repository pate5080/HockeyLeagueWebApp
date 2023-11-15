/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.anshul.HockeyLeagueWebApp.services;
import com.anshul.HockeyLeagueWebApp.entity.Team;
import java.util.List;
import java.util.Optional;

/**
 * Interface for team-related operations that can be performed by the Hockey League Web Application.
 * Defines the standard operations to be performed on Team entities.
 * 
 * @author Anshul Alpesh Patel
 */
public interface TeamService {
    
    /**
     * Saves a given team entity to the database.
     * 
     * @param team The team entity to be saved.
     * @return The saved team entity.
     */
    Team saveTeam(Team team);
    
    /**
     * Retrieves a team by its ID.
     * 
     * @param id The ID of the team to retrieve.
     * @return An Optional containing the team if found, or an empty Optional if not.
     */
    Optional<Team> getTeamById(int id);
    
    /**
     * Retrieves all teams.
     * 
     * @return A list of all teams.
     */
    List<Team> getAllTeams();
    
    /**
     * Deletes a team by its ID.
     * 
     * @param id The ID of the team to delete.
     */
    void deleteTeam(int id);
}
