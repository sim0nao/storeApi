package model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="tb_sales")
public class SaleModel {
	
	@Id
	@GeneratedValue
	private Integer saleId;
	
	@ManyToOne
	@JoinColumn(name= "product_id")
	private List<ProductModel> products;
	
	private LocalDateTime saleDate;

	

	public SaleModel(Integer saleId, List<ProductModel> products, LocalDateTime saleDate) {
		this.saleId = saleId;
		this.products = products;
		this.saleDate = saleDate;
	}

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public List<ProductModel> getProducts() {
		return products;
	}

	public void setProducts(List<ProductModel> products) {
		this.products = products;
	}

	public LocalDateTime getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(LocalDateTime saleDate) {
		this.saleDate = saleDate;
	}
	
	
	

}
