package project.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "position")
public class PositionModel {
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    int positionId;
    @Column(name = "job")
    String job;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "positionModel")
    private Set<StaffModel> staffModelSet2 = new HashSet <StaffModel> (  );

    public Set <StaffModel> getStaffModelSet2 () {
        return staffModelSet2;
    }

    public void setStaffModelSet2 ( Set <StaffModel> staffModelSet2 ) {
        this.staffModelSet2 = staffModelSet2;
    }

    public int getPositionId () {
        return positionId;
    }

    public void setPositionId ( int positionId ) {
        this.positionId = positionId;
    }

    public String getJob () {
        return job;
    }

    public void setJob ( String job ) {
        this.job = job;
    }

    @Override
    public String toString () {
        return job;
    }

}
