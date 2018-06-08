package com.dheeraj.fantasyfootball.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dheeraj.fantasyfootball.model.Team;
import com.dheeraj.fantasyfootball.repository.TeamDAO;

@Service
public class FantasyFootballService {

	@Autowired
	public TeamDAO teamDAO;

	public List<Team> getAllTeams() {
		return this.teamDAO.getAllTeams();
	}

}
