package repository;

import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.SaleModel;

@Repository
public interface SaleRepository extends JpaRepository <SaleModel, Integer> {
	
	public Client findByClientId();
	
	

}
