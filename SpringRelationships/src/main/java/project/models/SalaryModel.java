package project.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "salary")
public class SalaryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int salaryId;
    @Column(name ="staff_salary")
    int staffSalary;

   @ManyToMany(mappedBy = "salaryModelSet")
    private Set<StaffModel> staffModelSet3 = new HashSet<StaffModel> ();

    public Set <StaffModel> getStaffModelSet3 () {
        return staffModelSet3;
    }

    public void setStaffModelSet3 ( Set <StaffModel> staffModelSet3 ) {
        this.staffModelSet3 = staffModelSet3;
    }

    public int getSalaryId () {
        return salaryId;
    }

    public void setSalaryId ( int salaryId ) {
        this.salaryId = salaryId;
    }

    public int getStaffSalary () {
        return staffSalary;
    }

    public void setStaffSalary ( int staffSalary ) {
        this.staffSalary = staffSalary;
    }

    @Override
    public String toString () {
        return  String.valueOf ( staffSalary);
    }
}
