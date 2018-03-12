package project.repository.infoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.models.infoModel;

import javax.transaction.Transactional;

@Service("CRUDinfoImpl")
@Transactional
public class CRUDinfoClass implements CRUDinfoImpl {
    @Autowired
    CRUDinfo cruDinfo;
    @Override
    public Iterable <infoModel> findAll () {
        return cruDinfo.findAll ();
    }

    @Override
    public infoModel find ( int id ) {
        return cruDinfo.findOne ( id );
    }

    @Override
    public void save ( infoModel infoModell ) {
        cruDinfo.save ( infoModell );
    }

    @Override
    public void delete ( infoModel infoModel ) {
        cruDinfo.delete ( infoModel );
    }
}
