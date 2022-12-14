package org.sid.customerservice.repository;

import org.sid.customerservice.entities.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<customer, Long> {
}
