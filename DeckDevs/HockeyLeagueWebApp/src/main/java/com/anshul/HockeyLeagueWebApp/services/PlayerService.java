/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.anshul.HockeyLeagueWebApp.services;
import com.anshul.HockeyLeagueWebApp.entity.Player;
import java.util.List;
import java.util.Optional;

/**
 * Interface for player-related operations that can be performed by the Hockey League Web Application.
 * Defines the standard operations to be performed on Player entities.
 * 
 * @author Anshul Alpesh Patel
 */
public interface PlayerService {
    
    /**
     * Saves a given player entity to the database.
     * 
     * @param player The player entity to be saved.
     * @return The saved player entity.
     */
    Player savePlayer(Player player);
    
    /**
     * Retrieves a player by its ID.
     * 
     * @param id The ID of the player to retrieve.
     * @return An Optional containing the player if found, or an empty Optional if not.
     */
    Optional<Player> getPlayerById(int id);
    
    /**
     * Retrieves all players.
     * 
     * @return A list of all players.
     */
    List<Player> getAllPlayers();
    
    /**
     * Deletes a player by its ID.
     * 
     * @param id The ID of the player to delete.
     */
    void deletePlayer(int id);
}
