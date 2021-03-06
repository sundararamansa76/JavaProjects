package com.hare.krsna.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonalDAO {
	@Autowired
	JdbcConnection jdbccon;

	/**
	 * @return the jdbccon
	 */
	public JdbcConnection getJdbccon() {
		return this.jdbccon;
	}

	/**
	 * @param jdbccon the jdbccon to set
	 */
	public void setJdbccon(JdbcConnection jdbccon) {
		this.jdbccon = jdbccon;
	}

}
