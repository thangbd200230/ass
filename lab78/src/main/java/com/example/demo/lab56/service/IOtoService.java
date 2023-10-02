package com.example.demo.lab56.service;

import com.example.demo.lab56.Model.Oto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IOtoService {
    List<Oto> getAll();
    Oto addOto(Oto oto);
    List<Oto> getTenOto(String keyword);
    Oto getOto(Integer id);
    Oto updateOto(Oto oto);
    Integer deleteOto(Integer id);
    Page<Oto> findByTenOtoaContains(String tenSearch, Pageable pageable);
    Page<Oto> getalloto(Pageable pageable);

}
