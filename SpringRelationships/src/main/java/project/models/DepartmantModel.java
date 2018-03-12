package project.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "department")
public class DepartmantModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int departmentId;

    @Column(name = "departmant_name")
    String departmantName;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "departmantModel")
    private Set<StaffModel> staffModelSet1 = new HashSet<StaffModel> ();

    public Set <StaffModel> getStaffModelSet1 () {
        return staffModelSet1;
    }

    public void setStaffModelSet1 ( Set <StaffModel> staffModelSet1 ) {
        this.staffModelSet1 = staffModelSet1;
    }


    public int getDepartmentId () {
        return departmentId;
    }

    public void setDepartmentId ( int departmentId ) {
        this.departmentId = departmentId;
    }

    public String getDepartmantName () {
        return departmantName;
    }

    public void setDepartmantName ( String departmantName ) {
        this.departmantName = departmantName;
    }
    @Override
    public String toString () {
        return  departmantName;
    }
}
