import models.Employee;

public class SalaryCalculator {

    TaxCalculatorFactory factory;

    public SalaryCalculator(TaxCalculatorFactory factory) {
        this.factory = factory;
    }

    public int calculateSalary(Employee employee) throws Exception {

        // Get the right tax calculator for the current employee
        TaxCalculator taxCalculator = factory.newTaxCalculator(employee.getType());

        // Calculate the tax.
        String tax = taxCalculator.calculateTax(employee).toString();

        // Get the base salary for the current employee
        int baseSalary = BaseSalary.getBaseSalary(employee.getType()) ;

        // Check if the returned value is equal to zero then the employee type is not found in our system.
        if(baseSalary == 300){
//            throw new Exception("Can't calculate the salary for this employee since it's have unknown type!");
            return baseSalary;
        }

        return baseSalary - Integer.parseInt(tax);
    }
}
