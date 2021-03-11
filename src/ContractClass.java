
public class ContractClass {
	private Boolean availability;
	private int real_estate_id;
	private int customer_id;
	private int agent_id;
	private DateClass contract_date;
	
	public ContractClass(int real_estate_id, int customer_id, int agent_id, DateClass contract_date) {
		this.real_estate_id = real_estate_id;
		this.customer_id = customer_id;
		this.agent_id = agent_id;
		this.contract_date = contract_date;
		this.availability=true;
	}

	/**
	 * @return the availability
	 */
	public Boolean getAvailability() {
		return availability;
	}

	/**
	 * @param availability the availability to set
	 */
	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}

	/**
	 * @return the real_estate_id
	 */
	public int getReal_estate_id() {
		return real_estate_id;
	}

	/**
	 * @param real_estate_id the real_estate_id to set
	 */
	public void setReal_estate_id(int real_estate_id) {
		this.real_estate_id = real_estate_id;
	}

	/**
	 * @return the customer_id
	 */
	public int getCustomer_id() {
		return customer_id;
	}

	/**
	 * @param customer_id the customer_id to set
	 */
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	/**
	 * @return the agent_id
	 */
	public int getAgent_id() {
		return agent_id;
	}

	/**
	 * @param agent_id the agent_id to set
	 */
	public void setAgent_id(int agent_id) {
		this.agent_id = agent_id;
	}

	/**
	 * @return the contract_date
	 */
	public DateClass getContract_date() {
		return contract_date;
	}

	/**
	 * @param contract_date the contract_date to set
	 */
	public void setContract_date(DateClass contract_date) {
		this.contract_date = contract_date;
	}
	
	public void display() {
		System.out.println();
	}

}
