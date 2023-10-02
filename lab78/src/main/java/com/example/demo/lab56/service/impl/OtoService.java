package com.example.demo.lab56.service.impl;

import com.example.demo.lab56.Model.Oto;
import com.example.demo.lab56.Repository.IOtoRepository;
import com.example.demo.lab56.service.IOtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OtoService implements IOtoService {
    @Autowired
    private IOtoRepository repository;
    @Override
    public List<Oto> getAll() {
        return repository.findAll();
    }

    @Override
    public Oto addOto(Oto oto) {
        oto.setProductId(null);
        return repository.save(oto);
    }

    @Override
    public List<Oto> getTenOto(String keyword) {
        return null;
    }

    @Override
    public Oto getOto(Integer id) {
        return null;
    }

    @Override
    public Oto updateOto(Oto oto) {
        return null;
    }

    @Override
    public Integer deleteOto(Integer id) {
        return null;
    }

    @Override
    public Page<Oto> findByTenOtoaContains(String tenSearch, Pageable pageable) {
        return repository.findByTenOtoaContains(tenSearch,pageable);
    }

    @Override
    public Page<Oto> getalloto(Pageable pageable) {
        return repository.findAll(pageable);
    }


}
