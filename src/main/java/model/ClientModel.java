package model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_client")
public class ClientModel {

	@Id
	@GeneratedValue
	private Integer clientId;

	private String name;

	private String cpfDocument;

	private LocalDateTime birthDate;

	private String adress;

	@ManyToOne
	private SaleModel sales;
	
	

	public ClientModel(Integer clientId, String name, String cpfDocument, LocalDateTime birthDate, String adress,
			SaleModel sales) {
		this.clientId = clientId;
		this.name = name;
		this.cpfDocument = cpfDocument;
		this.birthDate = birthDate;
		this.adress = adress;
		this.sales = sales;
	}

	public SaleModel getSales() {
		return sales;
	}

	public void setSales(SaleModel sales) {
		this.sales = sales;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpfDocument() {
		return cpfDocument;
	}

	public void setCpfDocument(String cpfDocument) {
		this.cpfDocument = cpfDocument;
	}

	public LocalDateTime getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDateTime birthDate) {
		this.birthDate = birthDate;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

}
