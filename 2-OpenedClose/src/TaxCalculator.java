import java.math.BigDecimal;
import java.math.MathContext;

import models.Employee;

public interface TaxCalculator {
    public BigDecimal calculateTax(Employee employee);

}
