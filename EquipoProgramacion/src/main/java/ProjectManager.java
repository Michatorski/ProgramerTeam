import java.util.HashSet;
import java.util.Objects;


public final class ProjectManager extends Employee{
    private HashSet<String> teams;
    private HashSet<String> projects;

    public ProjectManager(int id, String fullName, int numHoursWorked, HashSet<String> teams, HashSet<String> projects) {
        super(id, fullName, numHoursWorked);
        this.teams = teams;
        this.projects = projects;
    }


    @Override
    public void showBasicInfo() {
        System.out.println("Numero ID es " + getId());
        System.out.println(" Nombre completo "+ getFullName() );
        System.out.println(" Numero de horas trabajadas" + getNumHoursWorked() );

    }

    public void makeProject (String newProject){
        this.teams.add(newProject);
        System.out.println("Jefe de Projecto a creado a nuevo projecto " + projects);
    }

    public boolean leaveTeam( String newProject){
        boolean isOnTeam = false;
        for (String project: projects){
            if (project.equals(newProject)){
                isOnTeam= true;
            }
        }
        return isOnTeam;
    }

    public HashSet<String> getTeams() {
        return teams;
    }

    public void setTeams(HashSet<String> teams) {
        this.teams = teams;
    }

    public HashSet<String> getProjects() {
        return projects;
    }

    public void setProjects(HashSet<String> projects) {
        this.projects = projects;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProjectManager that = (ProjectManager) o;
        return Objects.equals(teams, that.teams) &&
                Objects.equals(projects, that.projects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), teams, projects);
    }
}
