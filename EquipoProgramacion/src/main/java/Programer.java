import java.util.List;
import java.util.Objects;

public final class Programer extends Employee {
    private List<String> codeLanguage;
    private String team;

    public Programer(int id, String fullName, int numHoursWorked, List<String> codeLanguage, String team) {
        super(id, fullName, numHoursWorked);
        this.codeLanguage = codeLanguage;
        this.team = team;
    }

    public List<String> getCodeLanguage() {
        return codeLanguage;
    }

    public void setCodeLanguage(List<String> codeLanguage) {
        this.codeLanguage = codeLanguage;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Programer programer = (Programer) o;
        return Objects.equals(codeLanguage, programer.codeLanguage) &&
                Objects.equals(team, programer.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), codeLanguage, team);
    }
}
