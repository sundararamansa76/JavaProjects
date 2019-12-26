package com.hare.krsna.springin5steps.xml;

import org.springframework.stereotype.Component;

@Component
public class XmlPersonalDAO {
	/**
	 * @return the jdbccon
	 */

	XmlJdbcConn jdbccon;

	public XmlJdbcConn getJdbccon() {
		return this.jdbccon;
	}


	/**
	 * @param jdbccon the jdbccon to set
	 */
	public void setJdbccon(XmlJdbcConn jdbccon) {
		this.jdbccon = jdbccon;
	}




}
