package com.example.java_demau_2023.controllers;

import com.example.java_demau_2023.models.*;
import com.example.java_demau_2023.repositories.NganhRepositories;
import com.example.java_demau_2023.repositories.SinhVienRepositories;
import com.example.java_demau_2023.repositories.TotNghiepRepositories;
import com.example.java_demau_2023.repositories.TruongRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@Controller
@RequestMapping(path = "sinhvien")
public class SinhVienController {
    @Autowired
    private SinhVienRepositories sinhVienRepositories;
    @Autowired
    private TruongRepositories truongRepositories;
    @Autowired
    private NganhRepositories nganhRepositories;
    @Autowired
    private TotNghiepRepositories totNghiepRepositories;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(ModelMap modelMap){
        Iterable<SinhVien> sinhViens = sinhVienRepositories.findAll();
        modelMap.addAttribute("sinhviens", sinhViens);
        return "sinhvien";
    }

    @RequestMapping(value = "/insertTN", method = RequestMethod.GET)
    public String insertTN(ModelMap modelMap){
        modelMap.addAttribute("dto", new SinhVienTN());
        modelMap.addAttribute("nganhs", nganhRepositories.findAll());
        modelMap.addAttribute("truongs", truongRepositories.findAll());
        return "insertTN";
    }

    @RequestMapping(value = "/updateTN/{SoCMND}", method = RequestMethod.GET)
    public String updateTN(ModelMap modelMap, @PathVariable Integer SoCMND){
        Optional<TotNghiep> totNghiepOptional = totNghiepRepositories.findById(SoCMND);
        Optional<SinhVien> sinhVienOptional = sinhVienRepositories.findById(SoCMND);
        TotNghiep totNghiep = totNghiepOptional.get();
        SinhVien sinhVien = sinhVienOptional.get();
        SinhVienTN sinhVienTN = new SinhVienTN(totNghiep.getSoCMND(),totNghiep.getMaTruong(), totNghiep.getMaNganh(), totNghiep.getHeTN(), totNghiep.getNgayTN(), totNghiep.getLoaiTN(),sinhVien.getHoTen(), sinhVien.getEmail(), sinhVien.getSoDT(), sinhVien.getDiaChi());
        modelMap.addAttribute("dto", sinhVienTN);
        return "updateTN";
    }

    @RequestMapping(value = "/deleteTN/{SoCMND}", method = RequestMethod.POST)
    public String deleteTN(ModelMap modelMap, @PathVariable Integer SoCMND) {
        System.out.println("haha");
        System.out.println(SoCMND);
        totNghiepRepositories.deleteById(SoCMND);
        sinhVienRepositories.deleteById(SoCMND);
        return "redirect:/sinhvien";
    }

    @RequestMapping(value = "/insertTN", method = RequestMethod.POST)
    public String insertTN(ModelMap modelMap,
                           @ModelAttribute("dto") SinhVienTN dto){
        System.out.println(dto.getSoCMND());
        SinhVien sinhVien = new SinhVien();
        sinhVien.setSoCMND(dto.getSoCMND());
        sinhVien.setHoTen(dto.getHoTen());
        sinhVien.setEmail(dto.getEmail());
        sinhVien.setDiaChi(dto.getDiaChi());
        sinhVien.setSoDT(dto.getSoDT());
        sinhVienRepositories.save(sinhVien);

        TotNghiep totNghiep = new TotNghiep();
        totNghiep.setSoCMND(dto.getSoCMND());
        totNghiep.setMaTruong(dto.getMaTruong());
        totNghiep.setMaNganh(dto.getMaTruong());
        totNghiep.setHeTN(dto.getHeTN());
        totNghiep.setNgayTN(dto.getNgayTN());
        totNghiep.setLoaiTN(dto.getLoaiTN());
        totNghiepRepositories.save(totNghiep);

        return "redirect:/sinhvien";
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
