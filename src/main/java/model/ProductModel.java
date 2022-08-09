package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_product")
public class ProductModel {

	@Id
	@GeneratedValue
	private Integer productId;

	private String nameProduct;

	private String price;

	public Integer getProductId() {
		return productId;
	}

	public ProductModel(Integer productId, String nameProduct, String price) {
		this.productId = productId;
		this.nameProduct = nameProduct;
		this.price = price;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
