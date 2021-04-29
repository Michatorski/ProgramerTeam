package org.iesfm.company.composicion;

import org.iesfm.company.Programer;

import java.util.Objects;

public class CompanyComposicion {

    public static final int PROGRAMMER_ID = 1;
    public static final int PROJECTMANAGER_ID = 2;
    public static final int SCRUMMASTER_ID = 3;

    public static final String PROGRAMMER_FULLNAME = "Miguel de Cervantes";
    public static final String PROJECTMANAGER_FULLNAME = "Theodor Roosvelt";
    public static final String SCRUMMASTER_FULLNAME = "Raul Herrero";

    public static final int PROGRAMMER_HOURSWORKED = 10;
    public static final int PROJECTMANAGER_HOURSWORKED = 7;
    public static final int SCRUMMASTER_HOURSWORKED = 8;


    private int id;
    private String fullName;
    private int numHoursWorked;

    public CompanyComposicion(int id, String fullName, int numHoursWorked) {
        this.id = id;
        this.fullName = fullName;
        this.numHoursWorked = numHoursWorked;
    }

    public void showInfo(){
        
    }

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
        CompanyComposicion that = (CompanyComposicion) o;
        return id == that.id &&
                numHoursWorked == that.numHoursWorked &&
                Objects.equals(fullName, that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, numHoursWorked);
    }
}
