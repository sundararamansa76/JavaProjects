package exphand;

public class ExpHandleH {
	private String str;

	/**
	 * @return the str
	 */
	public String getStr() {
		return this.str;
	}

	/**
	 * @param str the str to set
	 */
	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String clone() {
		return this.str;
	}
}
