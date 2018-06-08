package com.dheeraj.fantasyfootball.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dheeraj.fantasyfootball.model.Team;
import com.dheeraj.fantasyfootball.service.FantasyFootballService;

@RestController
@RequestMapping("")
public class FantasyFootballRestController {

	@Autowired
	public FantasyFootballService fantasyFootballService;

	@GetMapping("/teams")
	public List<Team> teams() {
		return this.fantasyFootballService.getAllTeams();
	}
}
