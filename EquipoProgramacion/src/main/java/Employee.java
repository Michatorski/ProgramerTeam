
import java.util.Objects;

public abstract class Employee {
    private int id;
    private String fullName;
    private int numHoursWorked;

    public Employee(int id, String fullName, int numHoursWorked) {
        this.id = id;
        this.fullName = fullName;
        this.numHoursWorked = numHoursWorked;
    }

    public void  logWorkHours(int addHours){

         numHoursWorked = numHoursWorked + addHours;
        System.out.println("Numeros de horas trabajadas "+ numHoursWorked);
    }


 public abstract void showBasicInfo();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNumHoursWorked() {
        return numHoursWorked;
    }

    public void setNumHoursWorked(int numHoursWorked) {
        this.numHoursWorked = numHoursWorked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                numHoursWorked == employee.numHoursWorked &&
                Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, numHoursWorked);
    }
}
