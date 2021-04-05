package com.sha.serverproductmanagement.repository;

import com.sha.serverproductmanagement.model.Product;
import com.sha.serverproductmanagement.model.Reserve;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReserveRepository extends JpaRepository <Reserve, Long>  {
}
