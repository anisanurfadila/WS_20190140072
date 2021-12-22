/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.pws.datamahasiswa;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *
 * @author Asus
 */
@Controller
public class DatabaseController {
    
    @CrossOrigin
    @GetMapping(value = "/listjson", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Mahasiswa> getMahasiswa(){
        List<Mahasiswa> mhs = new ArrayList<>();
        MahasiswaJpaController controller = new MahasiswaJpaController();
        try{
            mhs = controller.findMahasiswaEntities();
        }
        catch(Exception e){
        }
        return mhs;
    }
//    
//    @CrossOrigin
//    @GetMapping(value = "/listXML", produces = {MediaType.APPLICATION_XML_VALUE})
//    @ResponseBody
//    public List<Mahasiswa> getMahasiswaXML(){
//        List<Mahasiswa> mhs = new ArrayList<>();
//        MahasiswaJpaController controller = new MahasiswaJpaController();
//        try{
//            mhs = controller.findMahasiswaEntities();
//        }
//        catch(Exception e){
//        }
//        return mhs;
//    }

}

