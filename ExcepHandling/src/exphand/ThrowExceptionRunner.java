package exphand;

class Amount {
	private String currency;
	private int amt;

	public Amount(String currency, int amt) {
		super();
		this.currency = currency;
		this.amt = amt;
	}

	public void add(Amount other) throws CurrenciesNotMatchException
	{
		if (this.currency.equals(other.currency)) {
			this.amt += other.amt;
		} else {
			throw new CurrenciesNotMatchException("Currencies not match");
		}
	}

	@Override
	public String toString() {
		return this.amt + "  " + this.currency;
	}
}

class CurrenciesNotMatchException extends Exception
{
	public CurrenciesNotMatchException(String msg) {
		super(msg);
	}
}

public class ThrowExceptionRunner {

	public static void main(String[] args) throws CurrenciesNotMatchException {
		// TODO Auto-generated method stub

		Amount amt1 = new Amount("USD", 10);
		Amount amt2 = new Amount("INR", 25);

		amt1.add(amt2);
		System.out.println(amt1);

	}

}
