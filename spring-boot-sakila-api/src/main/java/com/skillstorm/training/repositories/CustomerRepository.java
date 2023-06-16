package com.skillstorm.training.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.skillstorm.training.models.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Short> {

	@Query("SELECT c FROM Customer c "
			+ " JOIN c.address a "
			+ " JOIN a.city t "
			+ " JOIN t.country co "
			+ " WHERE :city IS NULL OR c.address.city.city = :city AND "
			+ " :country IS NULL OR c.address.city.country.country = :country AND "
			+ " :code IS NULL OR c.address.postalCode = :code")
	Iterable<Customer> findBySearchCriteria(@Param("country") String country,
											@Param("city") String city, 
											@Param("code") String postalCode);
}
