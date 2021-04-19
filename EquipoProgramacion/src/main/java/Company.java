import java.util.*;

public class Company extends Employee{

    private String name;
    private ArrayList<Employee> employees;

    public Company(int id, String fullName, int numHoursWorked, String name, ArrayList<Employee> employees) {
        super(id, fullName, numHoursWorked);
        this.name = name;
        this.employees = employees;
    }

    public List <Programer> getProgramers(){
        List<Programer> listProgramer = new ArrayList<>();

        for (Employee employee: employees) {
            if (employee instanceof Programer){
                listProgramer.add((Programer) employee);
            }
        }
        return listProgramer;
    }

    public List <ProjectManager> getProjectManager(){
        List<ProjectManager> listManager = new ArrayList<>();

        for (Employee employee: employees) {
            if (employee instanceof ProjectManager){
                listManager.add((ProjectManager) employee);
            }
        }
        return listManager;
    }

    public List <ScrumMaster> getScrumMaster(){
        List<ScrumMaster> listScrumMaster = new ArrayList<>();

        for (Employee employee: employees) {
            if (employee instanceof ScrumMaster){
                listScrumMaster.add((ScrumMaster) employee);
            }
        }
        return listScrumMaster;
    }

    public Set <String> getProjectList(){
        List<ProjectManager> managers = getProjectManager();
        Set<String> listProject = new HashSet<>();

        for (ProjectManager boss : managers){
            listProject.addAll(boss.getProjects());
        }

        return listProject;
    }

    public Set <String> getTeamList(){
        Set<String> teams = new HashSet<>();

        List<ScrumMaster> scrumMasters = getScrumMaster();
        for (ScrumMaster scrumMaster: scrumMasters){
            teams.addAll(scrumMaster.getTeams());
        }

        List<Programer> programers = getProgramers();
        for (Programer programer: programers){
            teams.add(programer.getTeam());
        }

        return teams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void showBasicInfo() {


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(employees, company.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employees);
    }
}
