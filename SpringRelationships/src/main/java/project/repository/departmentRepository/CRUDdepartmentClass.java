package project.repository.departmentRepository;

import org.springframework.stereotype.Service;
import project.models.DepartmantModel;

import javax.transaction.Transactional;

@Service("CRUDdepartmentImpl")
@Transactional
public class CRUDdepartmentClass implements CRUDdepartmentImpl {
    CRUDdepartment cruDdepartment;
    @Override
    public void delete ( DepartmantModel departmantModel ) {
        cruDdepartment.delete ( departmantModel );
    }
}
