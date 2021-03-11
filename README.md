This is a group project that are made for CME1252 Project Based Learning-II class at first year of computer engineering department at Dokuz Eylul University. 15-03-2019

Group Members:

    Alp GÜLTEKİN - https://github.com/alp-gultekin
    Kaan KAVUNCUOGLU
    

The subject of the project is to develop a real estate management software for the Dokuz Eylul Real Estate company.

# General Information

The software has to include some entities to handle the records of agencies, real estates, customers, employees, contracts etc. that are explained below:

Company:

    DERE is a real estate company operating in many cities. The company is represented by differentagencies in these cities. Each agency has its own employees and deals with the real estate market in its region.

Agency:

    The company has four agencies in the cities Izmir, Istanbul, Ankara and Antalya. New agencies can join the system over time. Each agency has some attributes including id, name, address, and phone.
    
Agent:

    Several agents can work on each agency, who has several properties such as id, name, the agency where he/she works, birthdate, address, phone, gender, salary etc. The salary of each agent is minimum wage (currently 2000 TL). Agents earn a 5‰ commission for every home they sell and earn 20% of rental price of property they rent. Commissions are payed collectively at the end of the month with salaries.
    
Real Estate:

    The types of real estates that the company rents or sells can be classified as flat, villa, summer villa, farmhouse and office. The system should store the information for each real estate, including its id, type, status (for rent or for sale), availability (is it sold/rented or not), address, surface area, price and number of rooms.
    
Customer:

    System stores the customer information such as id, name, birthdate, address, phone, gender etc.
    
Contract:

    When a customer arrives to an agency, if the customer will rent or purchase a real estate, he/she has to fill a form about him/her and then an agent enters the customer information to the system.  When a customer rents or purchases a real estate, the system keeps the contract details into the system, such as related customer, rented/sold real estate, agent who performs operation, contract date, etc. The company gains 15‰ commissions from each sale or it charges 80% of rental price.
    
# Operations
Agency, Agent, Real Estate, Customer and Contract entities have id properties to identify each record. These properties must be auto increment numbers and the system user should not have to enter id information during adding new records. When a new real estate is added, the availability status must be “true”. This property must be updated to false when it is sold or rented. Likewise, when a new agent or customer is added, the active status must be “true, and these records should be flagged as “false” when they are deleted.

The software provides the followings for a given month and year:

    - calculate salaries
    - calculate total income
    - find the most profitable agency
    - find the agent of the month
The software also enables users to search real estates according to the specified options

# Software Initialization
At the beginning of the program, an input file (input.txt) is generally read and evaluated line by line. Semicolon character ( ; ) is used as delimiter in this file. Each line corresponds an individual command. Each command must be parsed and executed in order. The system user can also enter commands from console screen after loading of input file. A sample input file content is given below:
