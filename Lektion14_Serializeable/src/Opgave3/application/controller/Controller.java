package Opgave3.application.controller;

import java.util.ArrayList;

import Opgave3.application.model.Company;
import Opgave3.application.model.Employee;
import Opgave3.storage.Storage;


public class Controller {

    private static Controller controller;
    private final Storage storage;
    /**
     * Creates a new Company.<br />
     * Requires: hours >= 0.
     */

    public static Controller getController(){
        if(controller == null){
            controller = new Controller();
        }
        return controller;
    }

    private Controller(){
        storage = Storage.getStorage();
    }

    public Company createCompany(String name, int hours) {
        Company company = new Company(name, hours);
        storage.addCompany(company);
        return company;
    }

    /**
     * Deletes the company.<br />
     * Requires: The company has no employees.
     */
    public void deleteCompany(Company company) {
        storage.removeCompany(company);
    }

    /**
     * Updates the company.<br />
     * Requires: hours >= 0.
     */
    public void updateCompany(Company company, String name, int hours) {
        company.setName(name);
        company.setHours(hours);
    }

    /**
     * Get all the companies
     */
    public ArrayList<Company> getCompanies() {
        return storage.getCompanies();
    }

    // -------------------------------------------------------------------------

    /**
     * Creates a new employee.<br />
     * Requires: wage >= 0.
     */
    public Employee createEmployee(String name, int wage) {
        Employee employee = new Employee(name, wage);
        storage.addEmployee(employee);
        return employee;
    }

    /**
     * Creates a new employee.<br />
     * Requires: wage >= 0, company!=null.
     */
    public Employee createEmployee(String name, int wage, Company company) {
        Employee employee = createEmployee(name, wage);
        company.addEmployee(employee);
        return employee;
    }

    /**
     * Deletes the employee.
     */
    public void deleteEmployee(Employee employee) {
        Company company = employee.getCompany();
        if (company != null) {
            company.removeEmployee(employee);
        }
        storage.removeEmployee(employee);
    }

    /**
     * Updates the employee.<br />
     * Requires: wage >= 0.
     */
    public void updateEmployee(Employee employee, String name, int wage) {
        employee.setName(name);
        employee.setWage(wage);
    }
    
    /**
     * Adds the employee to the company. Removes the employee from the old company if present.
     */
    public void addEmployeeToCompany(Employee employee, Company company) {
        company.addEmployee(employee);
    }
    
    /**
     * Removes the employee from the old company if not null.
     * @param company The old company. Can be null.
     * @param employee The employee to remove.
     */
    public void removeEmployeeFromCompany(Employee employee, Company company) {
        if (company != null) {
            company.removeEmployee(employee);            
        }
    }

    /**
     * Get all the employees.
     */
    public ArrayList<Employee> getEmployees() {
        return storage.getEmployees();
    }

    // -------------------------------------------------------------------------

    /**
     * Initializes the storage with some objects.
     */
    public static void initStorage() {
        Company c1 = controller.createCompany("IBM", 37);
        Company c2 = controller.createCompany("AMD", 40);
        controller.createCompany("SLED", 45);
        controller.createCompany("Vector", 32);

        controller.createEmployee("Bob Dole", 210, c2);
        controller.createEmployee("Alice Schmidt", 250, c1);
        controller.createEmployee("George Down", 150, c2);

        controller.createEmployee("Rita Uphill", 300);
    }

    public static void init() {

        initStorage();

    }

}
