package models;

import java.util.UUID;

public class Employee {

    UUID idNumber;
    EmployeeType type;

    public Employee(UUID idNumber, EmployeeType type) {

        this.idNumber = idNumber;
        this.type = type;
    }

    public UUID getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(UUID idNumber) {
        this.idNumber = idNumber;
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }
}
