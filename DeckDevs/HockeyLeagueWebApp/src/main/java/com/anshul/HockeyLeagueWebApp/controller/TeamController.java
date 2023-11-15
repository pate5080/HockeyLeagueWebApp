/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anshul.HockeyLeagueWebApp.controller;
import com.anshul.HockeyLeagueWebApp.entity.Team;
import com.anshul.HockeyLeagueWebApp.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
/**
 * Controller for handling 'Team' related web requests.
 * Maps requests to the corresponding service operations.
 * 
 * @author Anshul Alpesh Patel
 */

@Controller
@RequestMapping("/teams")
public class TeamController {

    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    // Similar mappings for Team as for Player, adjusted for Team-specific logic

    // Add mappings here for 'new', 'add', 'list', 'edit', 'update', 'delete'
    // For example:
    
    @GetMapping
    public String listTeams(Model model) {
        model.addAttribute("teams", teamService.getAllTeams());
        return "teams";
    }
}
