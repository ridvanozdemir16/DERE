
public class AgentClass {
	private int id;
	private String name;
	private Boolean availibility;
	private int agencyID;
	private DateClass birthDate;
	private AddressClass address;
	private PhoneClass phone;
	private String gender;
	private int salary;

	public AgentClass(int inputAgencyID ,String inputName,DateClass inputBirthDate,AddressClass inputAddress,PhoneClass inputPhone,String inputGender) {
		agencyID=inputAgencyID;
		availibility=true;
		name=inputName;
		birthDate=inputBirthDate;
		address=inputAddress;
		phone=inputPhone;
		gender=inputGender;
		salary=2000;
	}
	public AgentClass() {
		
		name=null;
		availibility=false;
		birthDate=null;
		address=null;
		phone=null;
		gender=null;
	}
	
	


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the availiblity
	 */
	public Boolean getAvailibility() {
		return availibility;
	}
	/**
	 * @param availiblity the availiblity to set
	 */
	public void setAvailibility(Boolean availibility) {
		this.availibility = availibility;
	}
	/**
	 * @return the agencyID
	 */
	public int getAgencyID() {
		return agencyID;
	}
	/**
	 * @param agencyID the agencyID to set
	 */
	public void setAgencyID(int agencyID) {
		this.agencyID = agencyID;
	}
	/**
	 * @return the birthDate
	 */
	public DateClass getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(DateClass birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @return the address
	 */
	public AddressClass getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(AddressClass address) {
		this.address = address;
	}
	/**
	 * @return the phone
	 */
	public PhoneClass getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(PhoneClass phone) {
		this.phone = phone;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void display() {
		System.out.println("Agent ID: " +this.id);
		System.out.println("Agency ID: " +this.agencyID);
		System.out.println("Name: "+ this.name);
		System.out.println("Birthdate: "+ birthDate.display());
		System.out.println("Adress: " + address.display());
		System.out.println("Phone: " +phone.display());
		System.out.println("Gender: " +this.gender);
		
	}
}
	


