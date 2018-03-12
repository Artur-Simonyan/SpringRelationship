package project.repository.productRepository;

import org.springframework.data.repository.CrudRepository;
import project.models.ProductModel;

public interface CRUDproduct extends CrudRepository<ProductModel,Integer> {
}
