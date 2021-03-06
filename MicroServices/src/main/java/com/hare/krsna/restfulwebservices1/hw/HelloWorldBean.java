package com.hare.krsna.restfulwebservices1.hw;

public class HelloWorldBean {
	private String message;

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return this.message;
	}

	public HelloWorldBean(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("HelloWorldBean [message=%s]", this.message);
	}

}
