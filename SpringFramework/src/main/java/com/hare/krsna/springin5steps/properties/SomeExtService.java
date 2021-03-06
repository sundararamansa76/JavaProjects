package com.hare.krsna.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExtService {

	@Value("${external.service.url}")
	private String url;

	public String returnServiceURL() {
		return this.url;
	}

}
