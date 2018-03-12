package project.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "staff")
public class StaffModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int staffId;
    @Column(name = "staff_name")
    String staffName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "position_id", nullable = false)
    private PositionModel positionModel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", nullable = false)
    private DepartmantModel departmantModel;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "salary_staff", joinColumns = {
            @JoinColumn(name = "staff_id") },
            inverseJoinColumns = { @JoinColumn(name = "salary_id") })
    private Set<SalaryModel> salaryModelSet=new HashSet <SalaryModel> (  );

    public Set <SalaryModel> getSalaryModelSet () {
        return salaryModelSet;
    }

    public void setSalaryModelSet ( Set <SalaryModel> salaryModelSet ) {
        this.salaryModelSet = salaryModelSet;
    }

    public DepartmantModel getDepartmantModel () {
        return departmantModel;
    }

    public void setDepartmantModel ( DepartmantModel departmantModel ) {
        this.departmantModel = departmantModel;
    }

    public PositionModel getPositionModel () {
        return positionModel;
    }

    public void setPositionModel ( PositionModel positionModel ) {
        this.positionModel = positionModel;
    }

    public int getStaffId () {
        return staffId;
    }

    public void setStaffId ( int staffId ) {
        this.staffId = staffId;
    }

    public String getStaffName () {
        return staffName;
    }

    public void setStaffName ( String staffName ) {
        this.staffName = staffName;
    }
}
