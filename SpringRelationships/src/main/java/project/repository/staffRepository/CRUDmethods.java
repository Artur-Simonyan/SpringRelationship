package project.repository.staffRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.models.StaffModel;

import javax.transaction.Transactional;


@Service("CRUDinterfaceImplementation")
@Transactional
public class CRUDmethods implements CRUDinterfaceImplementation{
    @Autowired
    CRUDRepository crud;

    @Override
    public Iterable <StaffModel> findAll () {
        return crud.findAll ();
    }
    @Override
    public void delete ( StaffModel model ) {
        crud.delete ( model );
    }
}
