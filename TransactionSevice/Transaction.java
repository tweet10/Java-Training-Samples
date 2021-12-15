package com.java.TransactionSevice;

public class Transaction {
	protected Integer id;
	protected ProductType type;
	protected Double amount;
	protected String city;
	protected String currency;

	public Transaction() {
		super();
	}

	public Transaction(Integer id, ProductType type, double amount, String city, String currency) {
		this.id = id;
		this.type = type;
		this.amount = amount;
		this.city = city;
		this.currency = currency;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int compareTo(Transaction t1) {
		return (int) Math.signum(amount - t1.getAmount());
	}

	public String toString() {
		return getId() + "," + getType() + "," + getAmount();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		final int prime = 31;
		int result = 1;

		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Transaction other = (Transaction) obj;

		if (this.amount == null) {
			if (other.amount != null) {
				return false;
			}

		} else if (!amount.equals(other.amount)) {
			return false;
		}
		if (city == null) {
			if (other.city != null) {
				return false;
			}
		} else if (!city.equals(other.city)) {
			return false;
		}

		if (currency == null) {
			if (other.currency != null) {
				return false;
			}
		} else if (!currency.equals(other.currency)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
}

enum ProductType {
	FRUITS, GROCERIES, FUEL, ELECTRIC
}