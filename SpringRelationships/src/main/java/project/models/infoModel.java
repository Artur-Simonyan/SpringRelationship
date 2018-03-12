package project.models;

import javax.persistence.*;

@Entity
@Table(name = "info")
public class infoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int infoId;
    @Column(name = "price")
    int price;
    @Column(name = "quanity")
    int quanity;
    @Column(name = "date")
    String date;


    @OneToOne
    @PrimaryKeyJoinColumn
    private ProductModel productModel;

    public int getInfoId () {
        return infoId;
    }

    public void setInfoId ( int infoId ) {
        this.infoId = infoId;
    }

    public int getPrice () {
        return price;
    }

    public void setPrice ( int price ) {
        this.price = price;
    }

    public int getQuanity () {
        return quanity;
    }

    public void setQuanity ( int quanity ) {
        this.quanity = quanity;
    }

    public String getDate () {
        return date;
    }

    public void setDate ( String date ) {
        this.date = date;
    }

    public ProductModel getProductModel () {
        return productModel;
    }

    public void setProductModel ( ProductModel productModel ) {
        this.productModel = productModel;
    }
}
