package com.hare.krsna.pkg2;


class DefaultClass {

}

public class NestedClassRnner {
	private int i;
	class InnerClass {
		public void setI() {
			NestedClassRnner.this.i = 5;
		}

		public int getI() {
			this.setI();
			return NestedClassRnner.this.i;
		}
	}


	static class StaticNestedClass {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultClass dc = new DefaultClass();
		NestedClassRnner ic = new NestedClassRnner();
		StaticNestedClass staticNestedClass = new StaticNestedClass();
		InnerClass ic2 = ic.new InnerClass();
		System.out.println(ic2.getI());
	}

}
