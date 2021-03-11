 
public class CompanyClass {
	//initializing class arrays.
	private AgencyClass[] agencies;
	private static int countAgencies;
	private AgentClass [] agents;
	private static int countAgents;
	private RealEstateClass[] realestates;
	private static int countRealEstates;
	private CustomerClass[] customers;
	private static int countCustomers;
	private ContractClass[] contracts;
	private static int countContracts;
	
 	
	public CompanyClass(int capasity,int agentNumber,int realEstateNumber,int customersNumber,int contractNumber) {
		agencies=new AgencyClass[capasity];
		countAgencies=0;
		agents=new AgentClass[agentNumber];
		countAgents=0;
		realestates=new RealEstateClass[realEstateNumber];
		countRealEstates=0;
		customers=new CustomerClass[customersNumber];
		countCustomers=0;
		contracts=new ContractClass[contractNumber];
		countContracts=0;
	}
	//initializing class arrays.
	
			//AGENCY\\
	
	//Add Agency method
	public void addAgencies(String name,AddressClass address,PhoneClass phone) {
		agencies[countAgencies]=new AgencyClass(name,address,phone);//call the add constructor
		agencies[countAgencies].setId(countAgencies+1);//set the ýd
		countAgencies++;
		System.out.println("The agency has been added successfully!");
	}
	//Adding Agency method
	
	//Display Agencies method
	public void displayAgencies() {
		
		for(int i=0;i<countAgencies;i++) {
			System.out.println("******AGENCY "+(i+1)+"******");
			agencies[i].display();
			System.out.println();
			
		}
	}
	//Display Agencies method
	
			//AGENCY\\
	
	
			//AGENT\\
	
	//Add Agent method
	public void addAgent(int agency_id,String name,DateClass birthdate,AddressClass address,PhoneClass phone,String gender) {
		agents[countAgents]=new AgentClass(agency_id,name,birthdate,address,phone,gender);//call the add constructor
		agents[countAgents].setId(countAgents+1);//set the ýd
		countAgents++;
		System.out.println("The agent has been added successfully!");
	}
	//Add Agent method
	
	//Delete Agent method
	public void deleteAgent(int id) {
		boolean flag=true;
		for(int i=0;i<countAgents;i++) {
			if(agents[i].getId()==id && agents[i].getAvailibility()!=false) {
				agents[i]=new AgentClass();//call the delete constructor
				flag=false;//if object is deleted, flag will be false.
				System.out.println("The agent has been deleted successfully!");
			}
		}
		if(flag==true) {
			System.out.println("Invalid agent");
		}
	}
	
	//Delete Agent method
	
	//Display agents method
	public void displayAgents() {
		for(int i=0;i<countAgents;i++) {
			if(agents[i].getAvailibility()!=false) {
				System.out.println("******AGENT "+(i+1)+"******");
				agents[i].display();
				System.out.println();
			}
			
			
		}
	}
	//Display agents method
	
			//AGENT\\
	
	
			//REALESTATE\\
	
	//Add Realestate method
	public void addRealEstate(String type,String status,AddressClass address,int surfaceArea,int price,int numberOfRooms) {
		realestates[countRealEstates]= new RealEstateClass(type,status,address,surfaceArea,price,numberOfRooms);
		realestates[countRealEstates].setId(countRealEstates+1);
		countRealEstates++;
		System.out.println("The Real Estate has been added successfully!");
	}
	//Add Realestate method
	
	//Delete Realestate method
	public void deleteRealEstate(int id) {
		boolean flag=true;
		for(int i=0;i<countRealEstates;i++) {
			if(realestates[i].getId()==id && realestates[i].getAvailibility()!=false) {
				realestates[i]=new RealEstateClass();
				System.out.println("The Real Estate has been deleted successfully!");
				flag=false;
			}
		}
		if(flag==true) {
			System.out.println("Invalid real estate");
		}
	}
	//Delete Realestate method
	
	//Display Realestates method
	public void displayRealEstates() {
		for(int i=0;i<countRealEstates;i++) {
			if(realestates[i].getAvailibility()!=false) {
				System.out.println("*** REAL ESTATE "+(i+1)+" ***");
				realestates[i].display();
				System.out.println();
			}
	}
		}
	//Display Realestates method
	
	public void search(String type,String status,String town,String city,String min_max_area, String min_max_price, String min_max_rooms) {
		System.out.println("---- SEARCH RESULTS ----");
		System.out.println();
		int count=0;
		
		//initializing boolean variables for searching no parameters
		boolean s1=false;
		boolean s2=false;
		boolean s3=false;
		boolean s4=false;
		boolean s5=false;
		boolean s6=false;
		boolean s7=false;
		//initializing boolean variables for searching no parameters
		
		int min_area=0;
		int max_area=0;
		int min_price=0;
		int max_price=0;
		int min_room=0;
		int max_room=0;
		
		if(type.equals("")) {
			s1=true; //if parameter is empty  boolean variable will be true
		}
		if(status.equals("")) {
			s2=true;
		}
		if(town.equals("")) {
			s3=true;
		}
		if(city.equals("")) {
			s4=true;
		}
		if(min_max_area.equals("")) {
			s5=true;
		}
		else {//if it is not empty, program will split parameter and convert the integer
			String[] area = min_max_area.split("-");
			min_area=Integer.parseInt(area[0]);
			max_area=Integer.parseInt(area[1]);
		}
		if(min_max_price.equals("")) {
			s6=true;
		}
		else {//if it is not empty, program will split parameter and convert the integer
			String[] price = min_max_price.split("-");
			min_price=Integer.parseInt(price[0]);
			max_price=Integer.parseInt(price[1]);
		}
		if(min_max_rooms.equals("")) {
			s7=true;
		}
		else {//if it is not empty, program will split parameter and convert the integer
			String[] room = min_max_rooms.split("-");
			min_room=Integer.parseInt(room[0]);
			max_room=Integer.parseInt(room[1]);
		}
		
		//controlling the real estates
		for(int i=0;i<countRealEstates;i++) {//controlling the real estates
			if(realestates[i].getAvailibility()==true) {
			if((s1||realestates[i].getType().equals(type)) && 
					(s2||realestates[i].getStatus().equalsIgnoreCase(status)) && 
					(s3||realestates[i].getAddress().getTown().equalsIgnoreCase(town))&&
					(s4||realestates[i].getAddress().getCity().equalsIgnoreCase(city))&&
					(s5||(min_area<=realestates[i].getSurfaceArea() && max_area>=realestates[i].getSurfaceArea()))&&
					(s6||(min_price<=realestates[i].getPrice() && max_price>=realestates[i].getPrice()))&&
					(s7||(min_room<=realestates[i].getNumberOfRooms() && max_room>=realestates[i].getNumberOfRooms()))){
					System.out.println("*** REAL ESTATE "+(count+1)+" ***");
					count++;
					realestates[i].display();
					System.out.println();
			}
		}
	}
		//controlling the real estates
		
}
	
	
			//REALESTATE\\
	
	
			//CUSTOMERS\\
	
	//Add customer method
	public void addCustomer(String name,DateClass birthdate,AddressClass address,PhoneClass phone,String gender) {
		customers[countCustomers]=new CustomerClass(name,birthdate,address,phone,gender);
		customers[countCustomers].setId(countCustomers+1);
		countCustomers++;
		System.out.println("The customer has been added successfully!");
	}
	//Add customer method
	
	//Delete Customer method
	public void deleteCustomer(int id) {
		boolean flag=true;
		for(int i=0;i<countCustomers;i++) {
			if(customers[i].getId()==id) {
				customers[i]=new CustomerClass();
				System.out.println("The customer has been deleted successfully!");
				flag=false;
			}
		}
		if(flag==true) {
			System.out.println("Invalid customer");
		}
	}
	//Delete Customer method
	
	//Display Customer method
		public void displayCustomers() {
			for(int i=0;i<countCustomers;i++) {
				if(customers[i].getAvailibility()!=false) {
					System.out.println("******CUSTOMER "+(i+1)+"******");
					customers[i].display();
					System.out.println();
				}
		}
			}
		//Display Customer method
		
				//CUSTOMERS\\
		
		
				//CONTRACTS\\
		
		public void addContract(int real_estate_id, int customer_id, int agent_id, DateClass contract_date) {
			boolean flag=true;
			//controlling real estate
			if((1>real_estate_id || real_estate_id>countRealEstates+1)) {
				System.out.println("Could not find an appropriate real estate for the entered ID. ");
				flag=false;
			}
			else if(realestates[real_estate_id-1].getAvailibility()!=true) {
				System.out.println( real_estate_id+ " ID numbered real estate has already "+realestates[real_estate_id-1].getAvailableMessage());
				flag=false;
			}
			//controlling real estate
			
			//controlling customer
			if(1>customer_id || customer_id>countCustomers+1) {
				System.out.println("Could not find an appropriate customer for the entered ID.");
				flag=false;
			}
			else if(customers[customer_id-1].getAvailibility()!=true) {
				System.out.println( "Your transaction failed because "+customer_id+" ID numbered customer was removed from the system.");
				flag=false;
			}
			//controlling customer
			
			//controlling agent
			if(1>agent_id || agent_id>countAgents+1) {
				System.out.println(" Could not find an appropriate agent for the entered ID.");
				flag=false;
			}
			else if(agents[agent_id-1].getAvailibility()!=true) {
				System.out.println(  " Your transaction failed because "+agent_id+" ID numbered agent was removed from the system. ");
				flag=false;
			}
			//controlling agent
			
			//if all the controls are okey, program add contract.
			if(flag==true) 
			{
				//controlling real estate's city and agent's office's city are the same. If they are the same program continue.
				if(realestates[real_estate_id-1].getAddress().getCity().equalsIgnoreCase(agencies[agents[agent_id-1].getAgencyID()-1].getAddress().getCity())) 
				{
					
					contracts[countContracts]=new ContractClass(real_estate_id,customer_id,agent_id,contract_date);
					countContracts++;
					realestates[real_estate_id-1].setAvailibility(false);
					//re-setting the available message according to real estate's status.
					if(realestates[real_estate_id-1].getStatus().equals("For Rent")) {	//re-setting the available message according to real estate's status.
						realestates[real_estate_id-1].setAvailableMessage("rented");
					}
					if(realestates[real_estate_id-1].getStatus().equals("For Sale")) {
						realestates[real_estate_id-1].setAvailableMessage("sold");
					}
					//re-setting the available message according to real estate's status.
			
					System.out.println("The contract has been added successfully. " + real_estate_id+ " ID numbered real estate "+realestates[real_estate_id-1].getAvailableMessage() );
				}
				else 
				{
					System.out.println(agent_id+ " numbered agent is not responsible for this region");
				}
			}
			
		}
		
		//displayin contracts
		public void displayContracts() {
			System.out.println("---- CONTRACTS ----");
			System.out.println();
			for(int i=0;i<countContracts;i++) {
				if(contracts[i].getAvailability()!=false) {
					System.out.println("*** CONTRACT "+(i+1)+" ***");
					System.out.println();
					System.out.println("Real Estate:");
					System.out.println();
					realestates[contracts[i].getReal_estate_id()-1].display();
					System.out.println();
					System.out.println("Customer:");
					System.out.println();
					customers[contracts[i].getCustomer_id()-1].display();
					System.out.println();
					System.out.println("Agent:");
					System.out.println();
					agents[contracts[i].getAgent_id()-1].display();
					System.out.println();
					
					}
				}
			}
		//displayin contracts
		
			//STATISTICAL METHODS\\
		
		//calculating salaries
		public void calculateSalaries(String month_year) {
			System.out.println("---- SALARIES ON "+month_year+" ----");
			System.out.println();
			String[] date=month_year.split("/");	//splitting the parameter and converting to integer
			int month=Integer.parseInt(date[0]);
			int year=Integer.parseInt(date[1]);
			for(int i=0;i<countAgents;i++) {
				if(agents[i].getAvailibility()!=false) {
					agents[i].setSalary(2000); //setting the salaries every call
				}
			}
			for(int i=0;i<countContracts;i++) {
				if(contracts[i].getContract_date().getMonth()==month && contracts[i].getContract_date().getYear()==year) {// contract and parameter control.
					int agentIdx = contracts[i].getAgent_id();//finding agent
					int realEstateIdx=contracts[i].getReal_estate_id();//finding real estate
					int price=realestates[realEstateIdx-1].getPrice();//finding price
					String status=realestates[realEstateIdx-1].getStatus();//finding status
					//calculating commision according to status
					if(status.equals("For Sale")) {
						agents[agentIdx-1].setSalary((agents[agentIdx-1].getSalary())+(price/20));
					}
					if(status.equals("For Rent")) {
						agents[agentIdx-1].setSalary((agents[agentIdx-1].getSalary())+(price/5));
					}
					//calculating commision according to status
				}
			}
			//displaying salaries
			for(int i=0;i<countAgents;i++) {
				if(agents[i].getAvailibility()!=false) {
					System.out.println("Agent " + (i+1) + " - "+agents[i].getName());
					System.out.println("Salary: "+agents[i].getSalary()+" TL");
					System.out.println();
				}
			}
			//displaying salaries
		}
		//calculating salaries
		
		//calculating total income.
		public void calculateTotalIncome(String month_year) {
			System.out.println("---- TOTAL INCOME ON "+month_year+" ----");
			System.out.println();
			int income=0;
			String[] date=month_year.split("/");	//splitting the parameter and converting to integer
			int month=Integer.parseInt(date[0]);
			int year=Integer.parseInt(date[1]);
			for(int i=0;i<countContracts;i++) {
				if(contracts[i].getContract_date().getMonth()==month && contracts[i].getContract_date().getYear()==year) {// contract and parameter control.
					int realEstateIdx=contracts[i].getReal_estate_id();//finding real estate
					String status=realestates[realEstateIdx-1].getStatus();//finding status
					//calculating commision according to status
					if(status.equals("For Sale")) {
					income+=realestates[realEstateIdx-1].getPrice()*15/100;
					}
					if(status.equals("For Rent")) {
						income+=realestates[realEstateIdx-1].getPrice()*80/100;
					}
					//calculating commision according to status
				}
		}
			//displaying total income
			System.out.println(income+" TL");
	} 
		//calculating total income.
		
		//finding most profitable agency
		public void mostProfitableAgency(String month_year) {
			System.out.println("---- MOST PROFITABLE AGENCY ON "+month_year+" ----");
			System.out.println();
			boolean emptyFlag=false;
			int[] totalIncomes=new int[countAgencies+3]; //initialize array that will keep the agencies incomes
			String[] date=month_year.split("/"); //splitting the parameter and converting to integer
			int month=Integer.parseInt(date[0]);
			int year=Integer.parseInt(date[1]);
			for(int i=0;i<countContracts;i++) {
				if(contracts[i].getContract_date().getMonth()==month && contracts[i].getContract_date().getYear()==year) {// contract and parameter control.
					emptyFlag=true;
					int agentIdx = contracts[i].getAgent_id();//finding agent
					int agencyIdx= agents[agentIdx-1].getAgencyID();//finding agency
					int realEstateIdx=contracts[i].getReal_estate_id();//finding real estate
					int price=realestates[realEstateIdx-1].getPrice();//finding price
					String status=realestates[realEstateIdx-1].getStatus();//finding real estate's status
					//calculating commision according to status
					if(status.equals("For Sale")) {
						totalIncomes[agencyIdx]+=(price*15/100);
					}
					if(status.equals("For Rent")) {
						totalIncomes[agencyIdx]+=(price*80/100);
					}
					//calculating commision according to status
				}
				
		}
			if(emptyFlag) {
			//finding agency that have most income.
			int max=0;
			int[] tempID=new int[countAgents];
			for(int i=1;i<totalIncomes.length;i++) {
				if(totalIncomes[i]>max) {
					max=totalIncomes[i];
					tempID[0]=i;
				}
				//displaying most profitable agency and income.
				System.out.println(agencies[tempID[0]-1].getName());
				System.out.println(totalIncomes[tempID[0]]+" TL");
			}
		}
			else {
				System.out.println("No sales in this date.");
				return;
			}
			//finding agency that have most income.
			
				
			
			}
		//finding most profitable agency
		
		//finding calculate agent of the month
		public void agentOfTheMonth(String month_year) {
			System.out.println("---- AGENT OF THE MONTH ON "+month_year+" ----");
			System.out.println();
			boolean emptyFlag=false;
			int[] agentsOfMonth=new int[countAgents+3];//initialize array that will keep the agents sales or rents
			String[] date=month_year.split("/");//splitting the parameter and converting to integer
			int month=Integer.parseInt(date[0]);
			int year=Integer.parseInt(date[1]);
			for(int i=0;i<countContracts;i++) {
				if(contracts[i].getContract_date().getMonth()==month && contracts[i].getContract_date().getYear()==year) {// contract and parameter control.
					emptyFlag=true;
					int agentIdx = contracts[i].getAgent_id();//finding agent
					agentsOfMonth[agentIdx]++;//if program found same agent his id numbered array element's value increase.  
				}
		}
			//finding agent that have most sales
			if(emptyFlag) {
			int max=0;
			int[] tempID=new int[countAgents+2];
			for(int i=1;i<agentsOfMonth.length;i++) {
				if(agentsOfMonth[i]>max) {
					max=agentsOfMonth[i];
					tempID[0]=i;
				}
				
			}
			//finding sales and rents number according to real estate status.
			int rent=0;
			int sale=0;
			for(int i=0;i<countContracts;i++) {
				if(contracts[i].getContract_date().getMonth()==month && contracts[i].getContract_date().getYear()==year) {
					if(contracts[i].getAgent_id()==tempID[0]) {
						if(realestates[contracts[i].getReal_estate_id()-1].getStatus().equals("For Rent")){
							rent++;
						}
						if(realestates[contracts[i].getReal_estate_id()-1].getStatus().equals("For Sale")){
							sale++;
						}
					}
				}
			}
			//finding sales and rents number according to real estate status.
			
			//displaying agent of the month and his/her sales or rents
			if(sale==0 && rent==1) {
				System.out.println(agents[tempID[0]-1].getName()+" with "+rent+" rental from "+agencies[agents[tempID[0]-1].getAgencyID()-1].getName());
			}
			else if(sale==0 && rent>1) {
				System.out.println(agents[tempID[0]-1].getName()+" with "+rent+" rentals from "+agencies[agents[tempID[0]-1].getAgencyID()-1].getName());
			}
			else if(sale==1 && rent==0) {
				System.out.println(agents[tempID[0]-1].getName()+" with "+sale+" sale from "+agencies[agents[tempID[0]-1].getAgencyID()-1].getName());
			}
			else if(sale>1 && rent==0) {
				System.out.println(agents[tempID[0]-1].getName()+" with "+sale+" sales from "+agencies[agents[tempID[0]-1].getAgencyID()-1].getName());
			}
			else if(sale==1 && rent==1) {
				System.out.println(agents[tempID[0]-1].getName()+" with " +sale+" sale and "+rent+" rental from "+agencies[agents[tempID[0]-1].getAgencyID()-1].getName());
			}
			else {
				System.out.println(agents[tempID[0]-1].getName()+" wtih "+sale +" sales and "+rent+" rentals from "+agencies[agents[tempID[0]-1].getAgencyID()-1].getName());
			}
			//displaying agent of the month and his/her sales or rents
		}
			else {
				System.out.println("No sales in this date.");
				return;
			}
			//finding agent that have most sales
			
			
		}
		//finding calculate agent of the month
		
			//STATISTICAL METHODS\\
}
		
		
		
	
	

