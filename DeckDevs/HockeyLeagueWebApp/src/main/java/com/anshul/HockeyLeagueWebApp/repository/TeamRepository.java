/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.anshul.HockeyLeagueWebApp.repository;
import com.anshul.HockeyLeagueWebApp.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;
/**
 * Repository interface for {@link Team} instances. Provides basic CRUD operations due to the extension of
 * {@link JpaRepository}. This interface can be used to define custom repository operations for Team.
 * 
 * @author Anshul Alpesh Patel
 */

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
    // Custom repository operations can be defined here, for example:

    /**
     * Finds a team by its name.
     *
     * @param teamName the name of the team.
     * @return the team with the specified name or null if no such team exists.
     */
    Optional<Team> findByTeamName(String teamName);
}
