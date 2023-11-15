/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.anshul.HockeyLeagueWebApp.repository;
import com.anshul.HockeyLeagueWebApp.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

/**
 * Repository interface for {@link Player} instances. Provides basic CRUD operations due to the extension of
 * {@link JpaRepository}. Includes custom repository methods for Player specific operations.
 * 
 * @author Anshul Alpesh Patel
 */
@Repository
public interface PlayerRepository extends JpaRepository <Player, Integer> {
    
    /**
     * Finds a list of players belonging to a given team.
     *
     * @param teamId the ID of the team.
     * @return a list of players belonging to the team with the given ID.
     */
    List<Player> findByTeamID(int teamId);

    /**
     * Finds all players with a specific role.
     *
     * @param role the role of the players to find.
     * @return a list of players with the specified role.
     */
    List<Player> findByPlayerRole(String role);
}
