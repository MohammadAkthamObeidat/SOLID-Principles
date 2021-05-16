import java.math.BigDecimal;
import java.math.MathContext;
import models.Employee;
import models.Salary;

public class NotAppliedOpenClose {

    public Salary calculateSalary(Employee employee) {

        BigDecimal taxDeduction = calculateTax(employee);
        return new Salary();
    }

    private BigDecimal calculateTax(Employee employee) {

        switch (employee.getType()) {
            case FULL_TIME:
                //
                break;
            case PART_TIME:
                //
                break;
            case FREELANCE:
                //
                break;
            default:
                //
                break;
        }

        return new BigDecimal(0L, new MathContext(100));
    }
}
