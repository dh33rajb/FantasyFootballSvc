package com.dheeraj.fantasyfootball.repository.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dheeraj.fantasyfootball.model.Team;
import com.dheeraj.fantasyfootball.model.builder.factory.TeamBuilderFactory;

public class TeamRowMapper implements RowMapper<Team> {

	static final String TEAM_ID_COLUMN_NAME = "Teamid";

	static final String TEAM_NAME_COLUMN_NAME = "TeamName";

	static final String SHORT_NAME_COLUMN_NAME = "ShortName";

	static final String IMAGE_COLUMN_NAME = "Image";

	@Override
	public Team mapRow(ResultSet rs, int rowNum) throws SQLException {
		return TeamBuilderFactory.create().teamId(rs.getInt(TEAM_ID_COLUMN_NAME))
				.teamName(rs.getString(TEAM_NAME_COLUMN_NAME)).shortName(rs.getString(SHORT_NAME_COLUMN_NAME))
				.image(rs.getString(IMAGE_COLUMN_NAME)).build();
	}
}
