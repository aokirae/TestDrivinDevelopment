class Money implements Expression {
	protected int amount;
	protected String currency;

	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	String getCurrency() {
		return currency;
	}

	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	Expression plus(Money added) {
		return new Money(amount + added.amount, currency);
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return this.amount == money.amount && getCurrency().equals(money.getCurrency());
	}

	static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	static Money franc(int amount) {
		return new Money(amount, "CHF");
	}
}
