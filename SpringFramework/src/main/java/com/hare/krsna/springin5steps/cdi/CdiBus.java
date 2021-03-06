package com.hare.krsna.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiBus {

	@Inject
	private CdiBusDao cdiDao;

	/**
	 * @return the cdiDao
	 */
	public CdiBusDao getCdiDao() {
		return this.cdiDao;
	}

	/**
	 * @param cdiDao the cdiDao to set
	 */
	public void setCdiDao(CdiBusDao cdiDao) {
		System.out.println("IN CDI Business");
		this.cdiDao = cdiDao;
	}


}
