package com.example.demo.lab56.controller;


import com.example.demo.lab56.Model.Oto;
import com.example.demo.lab56.service.IOtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/lab56/home")
public class OtoController {
    @Autowired
    private IOtoService service;
    @GetMapping
    public String getAll(Model model
            , @RequestParam(defaultValue = "1") int page
            ,@RequestParam(name = "searchTen", required = false)String searchTen) {
        Pageable pageable = PageRequest.of(page - 1, 3);
        List<Oto> otos = service.getAll();
        Page<Oto> hocSinhPage;
        if(searchTen == null || searchTen.isBlank()){
            hocSinhPage = service.getalloto(pageable);
        }else {
            hocSinhPage = service.findByTenOtoaContains(searchTen,pageable);
        }
        model.addAttribute("hocSinhPage", hocSinhPage);
        model.addAttribute("otos",otos);
        return "lab56/home";
    }
    @RequestMapping("/add")
    public String newProduct(Oto oto, RedirectAttributes redirectAttributes){
        service.addOto(oto);
        redirectAttributes.addFlashAttribute("otos","Thêm thành công");
        return  "redirect:/lab56/home";
    }
}
