package project.repository.staffRepository;

import project.models.StaffModel;

public interface CRUDinterfaceImplementation {
    Iterable<StaffModel> findAll ();
    void delete ( StaffModel staffModel );
}
