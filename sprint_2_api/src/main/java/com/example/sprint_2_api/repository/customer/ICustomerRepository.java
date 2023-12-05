package com.example.sprint_2_api.repository.customer;

import com.example.sprint_2_api.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {

    @Query(value = "select * from customer where id_user = :id",nativeQuery = true)
    Customer findCustomerByIdUser(@Param("id") Long idUser);

    @Modifying
    @Transactional
    @Query(value = "insert into customer (id_user,name) value (:#{#customer.appUser.id},:#{#customer.name})",nativeQuery = true)
    void createCustomer(Customer customer);
}
