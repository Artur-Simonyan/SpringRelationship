package project.repository.staffRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.models.StaffModel;

@Repository
public interface CRUDRepository extends CrudRepository<StaffModel,Integer> {
}
