package project.repository.productRepository;

import project.models.ProductModel;


public interface CRUDproductImpl {
    Iterable<ProductModel> findAll ();
    ProductModel find ( int id );

    void save ( ProductModel productModel );
    void delete ( ProductModel productModel );
}
