package p1;

import java.util.*;

public class Account {
	private int accontNumber;
	private String accountName;
	private int balance;
	private String branchName;
	private String state;
	private String country;
	private List<Stock> stocks;
	private List<Policy> policy;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accontNumber, String accountName, int balance, String branchName, String state, String country,
			List<Stock> stocks,List<Policy> policy) {
		super();
		this.accontNumber = accontNumber;
		this.accountName = accountName;
		this.balance = balance;
		this.branchName = branchName;
		this.state = state;
		this.country = country;
		this.stocks = stocks;
		this.policy=policy;
		}
	
	public List<Policy> getPolicy() {
		return policy;
	}
	public void setPolicy(List<Policy> policy) {
		this.policy = policy;
	}
	public int getAccontNumber() {
		return accontNumber;
	}
	public void setAccontNumber(int accontNumber) {
		this.accontNumber = accontNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<Stock> getStocks() {
		return stocks;
	}
	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}
	
	@Override
	public String toString() {
		return "Account [accontNumber=" + accontNumber + ", accountName=" + accountName + ", balance=" + balance
				+ ", branchName=" + branchName + ", state=" + state + ", country=" + country + ", stocks=" + stocks
				+ ", policy=" + policy + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(accontNumber, accountName, balance, branchName, country, policy, state, stocks);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return accontNumber == other.accontNumber && Objects.equals(accountName, other.accountName)
				&& balance == other.balance && Objects.equals(branchName, other.branchName)
				&& Objects.equals(country, other.country) && Objects.equals(policy, other.policy)
				&& Objects.equals(state, other.state) && Objects.equals(stocks, other.stocks);
	}
	public void doInitCode() {
		System.out.println("init");
	}
	public void doWindupCode() {
		System.out.println("destroy method");
	}
}
