import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import enigma.core.Enigma;
import enigma.core.Enigma;

public class Menu {
	CompanyClass DERE = new CompanyClass(1000,2000,2000,2000,1000);
	enigma.console.Console cn=Enigma.getConsole("DERE",175,45,12,0);
	
	//reading data from file
	public void readFile(String inputFile) throws FileNotFoundException, IOException {
		int count=0;
		int i=0;
		try(BufferedReader scanner1 = new BufferedReader(new FileReader("input.txt"));){
			while(scanner1.readLine()!=null) {
				count++;	//counting line counts
			}
			String[] array=new String[count];	//initialize array according to line count
			try(Scanner scanner =  new Scanner(new FileReader("input.txt"))){
				while(scanner.hasNextLine()) {
					
					array[i]=scanner.nextLine(); //putting the lines into array.
					i++;
				}
				for(int j=0;j<count;j++) 
				{
					String [] array1=null;
					if(array[j].contains("search")) {
						array1=array[j].split(";",-1);
					}
					else {
					array1=array[j].split(";"); }//splitting
					
					//if statements for executing methods according to first word of the line
					if(array1[0].equals("addAgency")) 
					{
					
						AddressClass address = new AddressClass(array1[2], array1[3], array1[4]);
						PhoneClass phone = new PhoneClass(Integer.parseInt(array1[5].substring(1,4)),Integer.parseInt(array1[5].substring(4)));
						DERE.addAgencies(array1[1], address,phone);
					}
					else if(array1[0].equals("displayAgencies")) {
						DERE.displayAgencies();
					}
					else if(array1[0].equals("addAgent")) {
						AddressClass address = new AddressClass(array1[4], array1[5], array1[6]);
						PhoneClass phone = new PhoneClass(Integer.parseInt(array1[7].substring(1, 4)),Integer.parseInt(array1[7].substring(4)));
						DateClass birthdate=new DateClass(Integer.parseInt(array1[3].substring(0,2)),Integer.parseInt(array1[3].substring(3,5)),Integer.parseInt(array1[3].substring(6)));
						//date controlling
						if(birthdate.dateControl()==true) {
							DERE.addAgent(Integer.parseInt(array1[1]),array1[2],birthdate,address, phone,array1[8]);
						}
						else {
							System.out.println("Given date information is invalid!");
						}
						//date controlling
					}
					else if(array1[0].equals("deleteAgent")) {
						DERE.deleteAgent(Integer.parseInt(array1[1]));
					}
					else if(array1[0].equals("displayAgents")) {
						DERE.displayAgents();
					}
					else if(array1[0].equals("addRealEstate")) {
						AddressClass address = new AddressClass(array1[3], array1[4], array1[5]);
						DERE.addRealEstate(array1[1], array1[2], address, Integer.parseInt(array1[6]), Integer.parseInt(array1[7]), Integer.parseInt(array1[8]));
					}
					else if(array1[0].equals("deleteRealEstate")) {
						DERE.deleteRealEstate(Integer.parseInt(array1[1]));
					}
					else if(array1[0].equals("displayRealEstates")) {
						DERE.displayRealEstates();
					}
					else if(array1[0].equals("addCustomer")) {
						AddressClass address = new AddressClass(array1[3], array1[4], array1[5]);
						PhoneClass phone = new PhoneClass(Integer.parseInt(array1[6].substring(1, 4)),Integer.parseInt(array1[6].substring(4)));
						DateClass birthdate=new DateClass(Integer.parseInt(array1[2].substring(0,2)),Integer.parseInt(array1[2].substring(3,5)),Integer.parseInt(array1[2].substring(6)));
						//date controlling
						if(birthdate.dateControl()==true) {
							DERE.addCustomer(array1[1],birthdate,address, phone,array1[7]);
						}
						else {
							System.out.println("Given date information is invalid!");
						}
						//date controlling
					}
					else if(array1[0].equals("deleteCustomer")) {
						DERE.deleteCustomer(Integer.parseInt(array1[1]));
					}
					else if(array1[0].equals("displayCustomers")) {
						DERE.displayCustomers();
					}
					else if(array1[0].equals("addContract")) {
						DateClass date=new DateClass(Integer.parseInt(array1[4].substring(0,2)),Integer.parseInt(array1[4].substring(3,5)),Integer.parseInt(array1[4].substring(6)));
						//date controlling
						if(date.dateControl()==true) {
							DERE.addContract(Integer.parseInt(array1[1]),Integer.parseInt(array1[2]),Integer.parseInt(array1[3]),date);
						}
						else {
							System.out.println("Given date information is invalid!");
						}
						//date controlling
					}
					else if(array1[0].equals("displayContracts")) {
						DERE.displayContracts();
					}
					else if(array[j].equals("search;;;;;;;")) {
						System.out.println("----SEARCH RESULTS----");
						System.out.println();
						DERE.displayRealEstates();
					}
					else if(array1[0].equals("search")) {
						DERE.search(array1[1], array1[2], array1[3], array1[4], array1[5], array1[6], array1[7]);
					}
					else if(array1[0].equals("calculateSalaries")) {
						DERE.calculateSalaries(array1[1]);
					}
					else if(array1[0].equals("calculateTotalIncome")) {
						DERE.calculateTotalIncome(array1[1]);
					}
					else if(array1[0].equals("mostProfitableAgency")) {
						DERE.mostProfitableAgency(array1[1]);
					}
					else if(array1[0].equals("agentOfTheMonth")) {
						DERE.agentOfTheMonth(array1[1]);
					}
					cn.readLine();
				}
				//if statements for executing methods according to first word of the line
				run(); //end of the lines return the command screen.
				
			} catch (FileNotFoundException e) {
				System.out.println("Error!");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error!");
				e.printStackTrace();
			}
			}
		
	}
	
	//displaying menu
	public void displayMenu() {
		clearConsole();
		enigma.console.Console cn=Enigma.getConsole();
		System.out.println("═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
		System.out.println("                                                           © DOKUZ EYLUL REAL ESTATE COMPANY , 2019");
		System.out.println("═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
		cn.getTextWindow().setCursorPosition(0, 40);
		System.out.println("═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
		System.out.println("          HELP(H)                                                                                                          EXIT(E)");
		System.out.println("═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
	}
	
	//executing methods according to inputs
	public void takeInput(String input) throws FileNotFoundException, IOException {
		String [] array1=null;
		if(input.contains("search")) {
			array1=input.split(";",-1);
		}
		else {
		array1=input.split(";"); }//splitting //splitting input
		if(array1[0].equals("addAgency")) 
		{
			AddressClass address = new AddressClass(array1[2], array1[3], array1[4]);
			PhoneClass phone = new PhoneClass(Integer.parseInt(array1[5].substring(1,4)),Integer.parseInt(array1[5].substring(4)));
			DERE.addAgencies(array1[1], address,phone);
		}
		else if(array1[0].equals("displayAgencies")) {
			DERE.displayAgencies();
		}
		else if(array1[0].equals("addAgent")) {
			AddressClass address = new AddressClass(array1[4], array1[5], array1[6]);
			PhoneClass phone = new PhoneClass(Integer.parseInt(array1[7].substring(1, 4)),Integer.parseInt(array1[7].substring(4)));
			DateClass birthdate=new DateClass(Integer.parseInt(array1[3].substring(0,2)),Integer.parseInt(array1[3].substring(3,5)),Integer.parseInt(array1[3].substring(6)));
			if(birthdate.dateControl()==true) {
				DERE.addAgent(Integer.parseInt(array1[1]),array1[2],birthdate,address, phone,array1[8]);
			}
			else {
				System.out.println("Given date information is invalid!");
			}
		}
		else if(array1[0].equals("deleteAgent")) {
			DERE.deleteAgent(Integer.parseInt(array1[1]));
		}
		else if(array1[0].equals("displayAgents")) {
			DERE.displayAgents();
		}
		else if(array1[0].equals("addRealEstate")) {
			AddressClass address = new AddressClass(array1[3], array1[4], array1[5]);
			DERE.addRealEstate(array1[1], array1[2], address, Integer.parseInt(array1[6]), Integer.parseInt(array1[7]), Integer.parseInt(array1[8]));
		}
		else if(array1[0].equals("deleteRealEstate")) {
			DERE.deleteRealEstate(Integer.parseInt(array1[1]));
		}
		else if(array1[0].equals("displayRealEstates")) {
			DERE.displayRealEstates();
		}
		else if(array1[0].equals("addCustomer")) {
			AddressClass address = new AddressClass(array1[3], array1[4], array1[5]);
			PhoneClass phone = new PhoneClass(Integer.parseInt(array1[6].substring(1, 4)),Integer.parseInt(array1[6].substring(4)));
			DateClass birthdate=new DateClass(Integer.parseInt(array1[2].substring(0,2)),Integer.parseInt(array1[2].substring(3,5)),Integer.parseInt(array1[2].substring(6)));
			if(birthdate.dateControl()==true) {
				DERE.addCustomer(array1[1],birthdate,address, phone,array1[7]);
			}
			else {
				System.out.println("Given date information is invalid!");
			}
		}
		else if(array1[0].equals("deleteCustomer")) {
			DERE.deleteCustomer(Integer.parseInt(array1[1]));
		}
		else if(array1[0].equals("displayCustomers")) {
			DERE.displayCustomers();
		}
		else if(array1[0].equals("addContract")) {
			DateClass date=new DateClass(Integer.parseInt(array1[4].substring(0,2)),Integer.parseInt(array1[4].substring(3,5)),Integer.parseInt(array1[4].substring(6)));
			if(date.dateControl()==true) {
				DERE.addContract(Integer.parseInt(array1[1]),Integer.parseInt(array1[2]),Integer.parseInt(array1[3]),date);
			}
			else {
				System.out.println("Given date information is invalid!");
			}
		}
		else if(array1[0].equals("displayContracts")) {
			DERE.displayContracts();
		}
		else if(input.equals("search;;;;;;;")) {
			System.out.println("----SEARCH RESULTS----");
			System.out.println();
			DERE.displayRealEstates();
		}
		else if(array1[0].equals("search")) {
			DERE.search(array1[1], array1[2], array1[3], array1[4], array1[5], array1[6], array1[7]);
		}
		else if(array1[0].equals("calculateSalaries")) {
			DERE.calculateSalaries(array1[1]);
		}
		else if(array1[0].equals("calculateTotalIncome")) {
			DERE.calculateTotalIncome(array1[1]);
		}
		else if(array1[0].equals("mostProfitableAgency")) {
			DERE.mostProfitableAgency(array1[1]);
		}
		else if(array1[0].equals("agentOfTheMonth")) {
			DERE.agentOfTheMonth(array1[1]);
		}
		else if(input.equalsIgnoreCase("clear")) {
			clearConsole();
		}
		else{
			System.out.println("Please enter a valid command. If you want to see commands press 'H' ");
		}
		cn.readLine();
		run();
	}
	
	//clear the console
	public void clearConsole()
	{
		for(int i=0;i<100;i++) {
			System.out.println();
		}
		cn.getTextWindow().setCursorPosition(0, 0);
	}
	
	
	
	//tutorial parts
	public void tutorial2() throws FileNotFoundException, IOException {
		String input=null;
		do 
		{
		clearConsole();
		Scanner sc=new Scanner(System.in);
		enigma.console.Console cn=Enigma.getConsole();
		System.out.println("═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
		System.out.println("                                                           © DOKUZ EYLUL REAL ESTATE COMPANY , 2019");
		System.out.println("═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
		cn.getTextWindow().setCursorPosition(0, 40);
		System.out.println("═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
		System.out.println("          BACK(Z)                                         NEXT(X)                                                                EXIT(E)");
		System.out.println("═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
		cn.getTextWindow().setCursorPosition(0, 4);
		System.out.println("--> Deleting a real estate");
		cn.getTextWindow().setCursorPosition(0, 6);
		System.out.println("  deleteRealEstate;real_estate_id");
		cn.getTextWindow().setCursorPosition(0, 8);
		System.out.println("--> Deleting a customer");
		cn.getTextWindow().setCursorPosition(0, 10);
		System.out.println("  deleteCustomer;customer_id");
		cn.getTextWindow().setCursorPosition(0,12);
		System.out.println("--> Displayig all agencies");
		System.out.println();
		cn.getTextWindow().setCursorPosition(0, 14);
		System.out.println("  displayAgencies");
		System.out.println();
		cn.getTextWindow().setCursorPosition(0, 16);
		System.out.println("--> Displayig all agents");
		System.out.println();
		cn.getTextWindow().setCursorPosition(0, 18);
		System.out.println("  displayAgents");
		System.out.println();
		cn.getTextWindow().setCursorPosition(0, 20);
		System.out.println("--> Displayig all real estates");
		System.out.println();
		cn.getTextWindow().setCursorPosition(0, 22);
		System.out.println("  displayRealEstates");
		System.out.println();
		cn.getTextWindow().setCursorPosition(0, 24);
		System.out.println("--> Displayig all customers");
		System.out.println();
		cn.getTextWindow().setCursorPosition(0, 26);
		System.out.println("  displayCustomers");
		System.out.println();
		cn.getTextWindow().setCursorPosition(0, 28);
		System.out.println("--> Displayig all contracts");
		System.out.println();
		cn.getTextWindow().setCursorPosition(0, 30);
		System.out.println("  displayContracts");
		System.out.println();
		cn.getTextWindow().setCursorPosition(0, 32);
		System.out.println("--> Searchin a real estate");
		System.out.println();
		cn.getTextWindow().setCursorPosition(0, 34);
		System.out.println("  search;type;status;town;city;min_surface_area-max_surface_area;min_price-max_price;min_#_of_rooms-max_#_of_rooms");
		System.out.println();
		cn.getTextWindow().setCursorPosition(0, 36);
		System.out.println("--> Calculating all agents's salaries on any month");
		System.out.println();
		cn.getTextWindow().setCursorPosition(0, 38);
		System.out.println("  calculateSalaries;month/year");
		input=sc.nextLine();
		if(input.equalsIgnoreCase("x")) {
			tutorial3();
		}
		else if(input.equalsIgnoreCase("z")) {
			tutorial1();
		}
		else {
			System.out.println("Please enter a valid command. If you want to see commands press 'H' ");
		}
		}while(!(input.equalsIgnoreCase("e")));
		System.out.println("Çıkış yapılıyor");
		cn.readLine();
		System.exit(1);
		
	}
	
	public void tutorial1() throws FileNotFoundException, IOException {
			String input=null;
			do {
			clearConsole();
			Scanner sc=new Scanner(System.in);
			enigma.console.Console cn=Enigma.getConsole();
			System.out.println("═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
			System.out.println("                                                           © DOKUZ EYLUL REAL ESTATE COMPANY , 2019");
			System.out.println("═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
			cn.getTextWindow().setCursorPosition(0, 40);
			System.out.println("═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
			System.out.println("          BACK(Z)                                                   NEXT(X)                                                       EXIT(E)");
			System.out.println("═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
			cn.getTextWindow().setCursorPosition(0, 4);
			System.out.println("                                                                      // COMMANDS \\");
			cn.getTextWindow().setCursorPosition(0, 6);
			System.out.println("--> Reading data from a txt file");
			cn.getTextWindow().setCursorPosition(0, 8);
			System.out.println("  load;fileName.txt");
			cn.getTextWindow().setCursorPosition(0, 10);
			System.out.println("--> Adding a new agency");
			cn.getTextWindow().setCursorPosition(0, 12);
			System.out.println("  addAgency;name;address;town;city;phone");
			cn.getTextWindow().setCursorPosition(0, 14);
			System.out.println("--> Adding a new agent");
			cn.getTextWindow().setCursorPosition(0, 16);
			System.out.println("  addAgent;agency_id;name;birthdate;address;town;city;phone;gender");
			cn.getTextWindow().setCursorPosition(0, 18);
			System.out.println("--> Adding a new real estate");
			cn.getTextWindow().setCursorPosition(0, 20);
			System.out.println("  addRealEstate;type;status;address;town;city;surface_area;price;#_of_rooms");
			cn.getTextWindow().setCursorPosition(0, 22);
			System.out.println("--> Adding a new customer");
			cn.getTextWindow().setCursorPosition(0, 24);
			System.out.println("  addCustomer;name;birthdate;address;town;city;phone;gender");
			cn.getTextWindow().setCursorPosition(0, 26);
			System.out.println("--> Adding a new contract");
			cn.getTextWindow().setCursorPosition(0, 28);
			System.out.println("  addContract;real_estate_id;customer_id;agent_id;contract_date");
			cn.getTextWindow().setCursorPosition(0, 30);
			System.out.println("--> Adding a new contract");
			cn.getTextWindow().setCursorPosition(0, 32);
			System.out.println("  addContract;real_estate_id;customer_id;agent_id;contract_date");
			cn.getTextWindow().setCursorPosition(0, 34);
			System.out.println("--> Deleting a agent");
			cn.getTextWindow().setCursorPosition(0, 36);
			System.out.println("  deleteAgent;agent_id");
			input=sc.nextLine();
			if(input.equalsIgnoreCase("x")) {
				tutorial2();
			}
			if(input.equalsIgnoreCase("z")) {
				run();
			}
			else {
				System.out.println("Please enter a valid command. If you want to see commands press 'H' ");
			}
		}while(!(input.equalsIgnoreCase("e")));
			System.out.println("Çıkış yapılıyor");
			cn.readLine();
			System.exit(1);
	}
	
	public void tutorial3() throws FileNotFoundException, IOException {
		String input=null;
		do 
		{
		clearConsole();
		Scanner sc=new Scanner(System.in);
		enigma.console.Console cn=Enigma.getConsole();
		System.out.println("═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
		System.out.println("                                                           © DOKUZ EYLUL REAL ESTATE COMPANY , 2019");
		System.out.println("═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
		cn.getTextWindow().setCursorPosition(0, 40);
		System.out.println("═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
		System.out.println("          BACK(Z)                                                                                                              EXIT(E)");
		System.out.println("═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
		cn.getTextWindow().setCursorPosition(0, 4);
		System.out.println("-->  Calculating total income on any month");
		System.out.println();
		cn.getTextWindow().setCursorPosition(0, 6);
		System.out.println("  calculateTotalIncome;month/year");
		System.out.println();
		cn.getTextWindow().setCursorPosition(0, 8);
		System.out.println("--> Finding most profitable agency on any month");
		System.out.println();
		cn.getTextWindow().setCursorPosition(0, 10);
		System.out.println("  mostProfitableAgency;month/year");
		cn.getTextWindow().setCursorPosition(0,12);
		System.out.println("--> Finding most valuable agent on any month");
		cn.getTextWindow().setCursorPosition(0,14);
		System.out.println("  agentOfTheMonth;month/year");
		cn.getTextWindow().setCursorPosition(0,16);
		System.out.println("--> Clearing to screen");
		cn.getTextWindow().setCursorPosition(0,18);
		System.out.println("  clear");
		input=sc.nextLine();
		if(input.equalsIgnoreCase("z")) {
			tutorial2();
			cn.getTextWindow().setCursorPosition(0, 3);
		}
		else {
			System.out.println("Please enter a valid command. If you want to see commands press 'H' ");
			
		}
	}while(!(input.equalsIgnoreCase("e")));
		System.out.println("Çıkış yapılıyor");
		cn.readLine();
		System.exit(1);
}
	//tutorial parts
	
	//run method
	public void run() throws FileNotFoundException, IOException {
		
		Scanner sc=new Scanner(System.in); //initialize the scanner
		
		displayMenu();
		cn.getTextWindow().setCursorPosition(0, 4);
		String input=null;
		do { //do-while loop, if input is "e" or "E" program will end.
		input= sc.nextLine();
		String[] words=input.split(";");
		if(input.equalsIgnoreCase("h")) {
			tutorial1();
		}
		else if(words[0].equals("load")) {//if input starts load call the readFile method.
			clearConsole();
			readFile(words[1]);
		}
		else if(input.equalsIgnoreCase("clear")) {//if input starts load call the clear method.
			clearConsole();
			run();
		}
		else 
		{//otherwise call the takeInput method.
			clearConsole();
			takeInput(input);
		}
		
		}while(!(input.equalsIgnoreCase("e")));
		System.out.println("Çıkış yapılıyor");
		cn.readLine();
		System.exit(1);
		
	}
}


