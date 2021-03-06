package com.hare.krsna;

class Client {
	private int id;

	public Client(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Client other = (Client) obj;
		if (this.id != other.id) {
			return false;
		}
		return true;
	}

}
public class EqualsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c1 = new Client(1);
		Client c2 = new Client(1);
		System.out.println(c1.equals(c2));

	}

}
