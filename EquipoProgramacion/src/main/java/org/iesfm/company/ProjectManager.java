import java.util.HashSet;
import java.util.Objects;


public final class ProjectManager extends Employee{
    private String team;
    private HashSet<String> projects;

    public ProjectManager(int id, String fullName, int numHoursWorked, String team, HashSet<String> projects) {
        super(id, fullName, numHoursWorked);
        this.team = team;
        this.projects = projects;
    }


    @Override
    protected void showSpecificInfo() {

    }

    public boolean makeProject (String newProject){
//      ---OTRA OPCION:
//       boolean existProject = getProjects().contains(newProject);
//
//       if(!existProject){
//           projects.add(newProject);
//           System.out.println("Jefe de Projecto a creado a nuevo projecto " + projects);
//       }
//
//        return !existProject;

        return projects.add(newProject);
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

    public String  getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
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
        return Objects.equals(team, that.team) &&
                Objects.equals(projects, that.projects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), team, projects);
    }
}
