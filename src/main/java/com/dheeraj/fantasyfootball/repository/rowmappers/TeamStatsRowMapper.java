package com.dheeraj.fantasyfootball.repository.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dheeraj.fantasyfootball.model.TeamStats;
import com.dheeraj.fantasyfootball.model.builder.factory.TeamStatsBuilderFactory;

public class TeamStatsRowMapper implements RowMapper<TeamStats> {

	static String POSITION_COLUMN_NAME = "Position";

	static String PLAYED_COLUMN_NAME = "Played";

	static String WIN_COLUMN_NAME = "Win";

	static String LOSS_COLUMN_NAME = "Loss";

	static String DRAW_COLUMN_NAME = "Draw";

	static String POINTS_COLUMN_NAME = "Points";

	@Override
	public TeamStats mapRow(ResultSet rs, int rowNum) throws SQLException {
		return TeamStatsBuilderFactory.create().position(rs.getInt(POSITION_COLUMN_NAME))
				.played(rs.getInt(PLAYED_COLUMN_NAME)).win(rs.getInt(WIN_COLUMN_NAME)).loss(rs.getInt(LOSS_COLUMN_NAME))
				.draw(rs.getInt(DRAW_COLUMN_NAME)).points(rs.getInt(POINTS_COLUMN_NAME)).build();
	}
}
