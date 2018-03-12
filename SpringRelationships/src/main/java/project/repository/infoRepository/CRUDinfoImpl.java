package project.repository.infoRepository;

import project.models.infoModel;

public interface CRUDinfoImpl {
    Iterable<infoModel> findAll ();
    infoModel find ( int id );
    void save ( infoModel infoModell );
    void delete ( infoModel infoModel );
}
