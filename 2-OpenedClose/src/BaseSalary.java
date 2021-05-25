import models.EmployeeType;

public class BaseSalary {

    public static int getBaseSalary(EmployeeType employeeType){
        switch (employeeType){
            case FULL_TIME:
                return 1500;
            case PART_TIME:
                return 500;
            case FREELANCE:
                return 700;
            default:
                return 300;
        }
    }
}
