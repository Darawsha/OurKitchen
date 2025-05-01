package mainpackage;

import java.util.ArrayList;

public class MySystem {
	private ArrayList<Chef> chefs;
	private ArrayList<Admin> admins;
	private ArrayList<Person> persons;
	private ArrayList<Manager> managers;
	private ArrayList<Order> orders;
	private ArrayList<Stock> stocks;

	public MySystem() {
		chefs = new ArrayList<>();
		admins = new ArrayList<>();
		persons = new ArrayList<>();
		managers = new ArrayList<>();
		orders = new ArrayList<>();
		stocks = new ArrayList<>();
	}

	
	public ArrayList<Chef> getChefs() {
		return chefs;
	}

	public void setChefs(ArrayList<Chef> chefs) {
		this.chefs = chefs;
	}

	public ArrayList<Admin> getAdmins() {
		return admins;
	}

	public void setAdmins(ArrayList<Admin> admins) {
		this.admins = admins;
	}

	public ArrayList<Person> getPersons() {
		return persons;
	}

	public void setPersons(ArrayList<Person> persons) {
		this.persons = persons;
	}

	public ArrayList<Manager> getManagers() {
		return managers;
	}

	public void setManagers(ArrayList<Manager> managers) {
		this.managers = managers;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}

	public ArrayList<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(ArrayList<Stock> stocks) {
		this.stocks = stocks;
	}

}
