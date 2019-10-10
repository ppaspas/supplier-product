package com.example.demo.model;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepo extends JpaRepository<Supplier, Long> {

    // custom query to search to blog post by title or content
    List<NameOnly> findAllBy();

}

