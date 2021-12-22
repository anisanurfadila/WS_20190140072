/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.pws.datamahasiswa;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
/**
 *
 * @author Asus
 */
@Controller
@XmlRootElement
public class XMLController {
     
    @CrossOrigin
    @GetMapping(value = "/listXML", produces = {MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
  
    public List<Mahasiswa> getMahasiswaXML(){
        List<Mahasiswa> mhs = new ArrayList<>();
        MahasiswaJpaController controller = new MahasiswaJpaController();
        try{
            mhs = controller.findMahasiswaEntities();
        }
        catch(Exception e){
        }
        return mhs;
    }
}
