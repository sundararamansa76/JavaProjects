package com.hare.rama.spring.basics.compscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hare.rama.spring.basics.compscan.ComponentJdbcConnection;

@Component
public class ComponentDAO {
	@Autowired
	ComponentJdbcConnection jdbccon;

	/**
	 * @return the jdbccon
	 */
	public ComponentJdbcConnection getJdbccon() {
		return this.jdbccon;
	}

	/**
	 * @param jdbccon the jdbccon to set
	 */
	public void setJdbccon(ComponentJdbcConnection jdbccon) {
		this.jdbccon = jdbccon;
	}

}
