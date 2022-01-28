package p1;

public class Policy {
	private int policyId;
	private String policyName;
	private int sumAssured;
	private int premiumAmount;
	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Policy(int policyId, String policyName, int sumAssured, int premiumAmount) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.sumAssured = sumAssured;
		this.premiumAmount = premiumAmount;
	}

	public int getSumAssured() {
		return sumAssured;
	}

	public void setSumAssured(int sumAssured) {
		this.sumAssured = sumAssured;
	}

	public int getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", sumAssured=" + sumAssured
				+ ", premiumAmount=" + premiumAmount + "]";
	}
	
	

}
