/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anshul.HockeyLeagueWebApp.services;
import com.anshul.HockeyLeagueWebApp.entity.Team;
import com.anshul.HockeyLeagueWebApp.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Implementation of the TeamService interface.
 * Handles business logic related to team operations.
 * 
 * @author Anshul Alpesh Patel
 */

@Service
@Transactional
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    @Autowired
    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public Team saveTeam(Team team) {
        // Additional business logic can be added here if needed
        return teamRepository.save(team);
    }

    @Override
    public Optional<Team> getTeamById(int id) {
        return teamRepository.findById(id);
    }

    @Override
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    @Override
    public void deleteTeam(int id) {
        teamRepository.deleteById(id);
    }

}
