package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.ClientModel;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Integer>{

}
