public class CustomerClass {
	private int id;
	private String name;
	private DateClass birthDate;
	private AddressClass address;
	private PhoneClass phone;
	private String gender;
	private Boolean availibility;

	public CustomerClass(String inputName,DateClass inputBirthDate,AddressClass inputAddress,PhoneClass inputPhone,String inputGender) {
		name=inputName;
		birthDate=inputBirthDate;
		address=inputAddress;
		phone=inputPhone;
		gender=inputGender;
		availibility=true;
	}
	public CustomerClass() {
		name=null;
		birthDate=null;
		address=null;
		phone=null;
		gender=null;
		availibility=false;
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
	 * @return the availibility
	 */
	public Boolean getAvailibility() {
		return availibility;
	}
	/**
	 * @param availibility the availibility to set
	 */
	public void setAvailibility(Boolean availibility) {
		this.availibility = availibility;
	}
	public void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Birthdate: " + birthDate.display());
		System.out.println("Adress: " + address.display());
		System.out.println("Phone: " +phone.display());
		System.out.println("Gender: " +this.gender);
	}
}
