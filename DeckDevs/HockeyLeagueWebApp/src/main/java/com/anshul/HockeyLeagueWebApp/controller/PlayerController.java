/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anshul.HockeyLeagueWebApp.controller;
import com.anshul.HockeyLeagueWebApp.entity.Player;
import com.anshul.HockeyLeagueWebApp.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
/**
 * Controller for handling 'Player' related web requests.
 * Maps requests to the corresponding service operations.
 * 
 * @author Anshul Alpesh Patel
 */

@Controller
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    /**
     * Display a form to add a new player.
     * 
     * @param model The model to which the player attribute is added.
     * @return The name of the Thymeleaf template to display the form.
     */
    @GetMapping("/new")
    public String showNewPlayerForm(Model model) {
        model.addAttribute("player", new Player());
        return "add-player";
    }

    /**
     * Process the form for adding a new player.
     * 
     * @param player The player entity populated from the form data.
     * @return Redirect to the players list view.
     */
    @PostMapping
    public String addPlayer(@ModelAttribute Player player) {
        playerService.savePlayer(player);
        return "redirect:/players";
    }

    /**
     * List all players.
     * 
     * @param model The model to which the players list is added.
     * @return The name of the Thymeleaf template to display the players list.
     */
    @GetMapping
    public String listPlayers(Model model) {
        model.addAttribute("players", playerService.getAllPlayers());
        return "players";
    }

    /**
     * Show a form to edit an existing player's details.
     * 
     * @param id    The ID of the player to edit.
     * @param model The model to which the player attribute is added.
     * @return The name of the Thymeleaf template to display the form.
     */
    @GetMapping("/edit/{id}")
    public String showEditPlayerForm(@PathVariable Integer id, Model model) {
        Player player = playerService.getPlayerById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid player Id:" + id));
        model.addAttribute("player", player);
        return "edit-player";
    }

    /**
     * Process the form for updating a player.
     * 
     * @param player The player entity with updated details.
     * @param id     The ID of the player being updated.
     * @return Redirect to the players list view.
     */
    @PostMapping("/update/{id}")
    public String updatePlayer(@PathVariable Integer id, @ModelAttribute Player player) {
        player.setId(id); // Ensure the player has the correct ID
        playerService.savePlayer(player);
        return "redirect:/players";
    }

    /**
     * Delete a player.
     * 
     * @param id The ID of the player to delete.
     * @return Redirect to the players list view.
     */
    @GetMapping("/delete/{id}")
    public String deletePlayer(@PathVariable Integer id) {
        playerService.deletePlayer(id);
        return "redirect:/players";
    }
}
