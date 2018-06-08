package com.dheeraj.fantasyfootball.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dheeraj.fantasyfootball.model.Player;
import com.dheeraj.fantasyfootball.model.Team;
import com.dheeraj.fantasyfootball.repository.rowmappers.TeamRowMapper;

@Transactional
@Repository
public class TeamDAO {

	@Autowired
	private JdbcTemplate mysqlJdbcTemplate;

	@Autowired
	private TeamRowMapper teamRowMapper;

	private static String READ_ALL_TEAMS = "SELECT * FROM Team";

	public List<Team> getAllTeams() {
		return this.mysqlJdbcTemplate.query(READ_ALL_TEAMS, this.teamRowMapper);
	}

	public Team getTeam(int teamId) {
		return null;
	}

	public List<Player> getAllPlayers() {
		return null;
	}

	public Player getPlayer(int playerId) {
		return null;
	}
}
