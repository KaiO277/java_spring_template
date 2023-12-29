package com.example.java_demau_2023.controllers;

import com.example.java_demau_2023.models.Nganh;
import com.example.java_demau_2023.models.SinhVien;
import com.example.java_demau_2023.models.Truong;
import com.example.java_demau_2023.repositories.NganhRepositories;
import com.example.java_demau_2023.repositories.SinhVienRepositories;
import com.example.java_demau_2023.repositories.TruongRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "sinhvien")
public class SinhVienController {
    @Autowired
    private SinhVienRepositories sinhVienRepositories;
    @Autowired
    private TruongRepositories truongRepositories;
    @Autowired
    private NganhRepositories nganhRepositories;


    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(ModelMap modelMap){
        Iterable<SinhVien> sinhViens = sinhVienRepositories.findAll();
        modelMap.addAttribute("sinhviens", sinhViens);
        return "sinhvien";
    }



    @RequestMapping(value = "/insertSV", method = RequestMethod.GET)
    public String insertSV(ModelMap modelMap){
        modelMap.addAttribute("nganhs", nganhRepositories.findAll());
        modelMap.addAttribute("truongs", truongRepositories.findAll());
        Iterable<Truong> truongs = truongRepositories.findAll();
        for (Truong truong : truongs) {
            System.out.println(truong.getTenTruong());
        }
        modelMap.addAttribute("sinhvien", new SinhVien());
        return "insertSV";
    }

    @RequestMapping(value = "/insertSV", method = RequestMethod.POST)
    public String insertSV(ModelMap modelMap,
                           @ModelAttribute("sinhvien") SinhVien sinhVien){
        sinhVienRepositories.save(sinhVien);
        return "redirect:/sinhvien";
    }
}
