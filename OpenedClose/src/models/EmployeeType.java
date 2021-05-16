package models;

public enum EmployeeType {

    FULL_TIME(1),
    PART_TIME(2),
    FREELANCE(3);

    public int value;

    EmployeeType(int value) {
        this.value = value;
    }
}
