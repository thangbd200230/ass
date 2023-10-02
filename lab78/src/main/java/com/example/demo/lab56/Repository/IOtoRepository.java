package com.example.demo.lab56.Repository;

import com.example.demo.lab56.Model.Oto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IOtoRepository extends JpaRepository<Oto, Integer> {
    Page<Oto> findByTenOtoaContains(String tenSearch, Pageable pageable);
}
