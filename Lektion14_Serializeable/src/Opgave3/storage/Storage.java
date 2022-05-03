package Opgave3.storage;

import java.util.ArrayList;

import Opgave3.application.model.Company;
import Opgave3.application.model.Employee;


public class Storage {
	private static Storage storage;
	private static ArrayList<Company> companies = new ArrayList<>();
	private static ArrayList<Employee> employees = new ArrayList<>();

	public static Storage getStorage(){
		if(storage == null){
			Storage storage = new Storage();
		}
		return storage;
	}
	// -------------------------------------------------------------------------

	public ArrayList<Company> getCompanies() {
		return new ArrayList<Company>(companies);
	}

	public void addCompany(Company company) {
		companies.add(company);
	}

	public void removeCompany(Company company) {
		companies.remove(company);
	}

	// -------------------------------------------------------------------------

	public ArrayList<Employee> getEmployees() {
		return new ArrayList<Employee>(employees);
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	// -------------------------------------------------------------------------

}
