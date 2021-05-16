import models.Employee;
import models.EmployeeType;

public class TaxCalculatorFactory {

    public TaxCalculator newTaxCalculator(EmployeeType employeeType){

        switch (employeeType){
            case FULL_TIME:
                return new TaxCalculatorFullTime();
            case PART_TIME:
                return new TaxCalculatorPartTime();
            case FREELANCE:
                return new TaxCalculatorFreelance();
            default:
                //
                break;
        }
        return new TaxCalculatorFullTime(); // just to fix the error.
    }
}
