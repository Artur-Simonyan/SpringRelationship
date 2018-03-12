package project.models;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int productId;
    @Column(name = "Product_name")
    String productName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", nullable = false)
    private DepartmantModel departmantForProduct;

    @OneToOne(mappedBy = "productModel")
    infoModel infoModel;

    public DepartmantModel getDepartmantForProduct () {
        return departmantForProduct;
    }

    public void setDepartmantForProduct ( DepartmantModel departmantForProduct ) {
        this.departmantForProduct = departmantForProduct;
    }

    public infoModel getInfoModel () {
        return infoModel;
    }

    public void setInfoModel ( infoModel infoModel ) {
        this.infoModel = infoModel;
    }

    public String getProductName () {
        return productName;
    }

    public void setProductName ( String productName ) {
        this.productName = productName;
    }


    public int getProductId () {
        return productId;
    }

    public void setProductId ( int productId ) {
        this.productId = productId;
    }

    public String getProdutcName () {
        return productName;
    }

    public void setProdutcName ( String produtcName ) {
        this.productName = produtcName;
    }

    @Override
    public String toString () {
        return  productName ;
    }
}
