package com.dheeraj.fantasyfootball.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dheeraj.fantasyfootball.repository.TeamDAO;
import com.dheeraj.fantasyfootball.repository.rowmappers.TeamRowMapper;
import com.dheeraj.fantasyfootball.service.FantasyFootballService;

@Configuration
public class ServiceConfiguration {

	@Bean
	public FantasyFootballService fantasyFootballService() {
		return new FantasyFootballService();
	}

	@Bean
	public TeamDAO teamDAO() {
		return new TeamDAO();
	}

	@Bean
	public TeamRowMapper teamRowMapper() {
		return new TeamRowMapper();
	}
}
