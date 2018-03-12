package project.repository.productRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.models.ProductModel;

import javax.transaction.Transactional;

@Service("CRUDproductImpl")
@Transactional
public class CRUDproductClass implements CRUDproductImpl{
    @Autowired
    CRUDproduct cruDproduct;

    @Override
    public Iterable <ProductModel> findAll () {
        return cruDproduct.findAll ();
    }

    @Override
    public ProductModel find ( int id ) {
        return cruDproduct.findOne ( id );
    }

    @Override
    public void save ( ProductModel productModel ) {
        cruDproduct.save ( productModel );
    }

    @Override
    public void delete ( ProductModel productModel ) {
        cruDproduct.delete ( productModel );
    }
}
