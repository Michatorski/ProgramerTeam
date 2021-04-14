
import java.util.HashSet;
import java.util.Objects;


public final class ScrumMaster extends Employee{

    private HashSet<String> teams;

    public ScrumMaster(int id, String fullName, int numHoursWorked, HashSet<String> teams) {
        super(id, fullName, numHoursWorked);
        this.teams = teams;
    }


    public HashSet<String> getTeams() {
        return teams;
    }

    public void setTeams(HashSet<String> teams) {
        this.teams = teams;
    }

    @Override
    public void showBasicInfo() {
        System.out.println("Numero ID es " + getId());
      System.out.println(" Nombre completo "+ getFullName() );
       System.out.println(" Numero de horas trabajadas" + getNumHoursWorked())
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ScrumMaster that = (ScrumMaster) o;
        return Objects.equals(teams, that.teams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), teams);
    }
}
