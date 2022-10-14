package com.multi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.AdmDTO;
import com.multi.dto.ItemDTO;
import com.multi.mapper.ItemMapper;
import com.multi.service.AdmService;

@Controller
public class MainController {

    @Autowired
    AdmService service;
    @Autowired
    ItemMapper mapper;
    
    @RequestMapping("/")
    public String main() {
        return "index";
    }
    
    @RequestMapping("/searchimpl")
    public String searchimpl(Model model, String txt) {
        List<ItemDTO> list = null;
        try {
            list = mapper.searchitem(txt);
            model.addAttribute("list",list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("center","search");
        return "index";
    }
    
    @RequestMapping("/loginimpl")
    public String loginimpl(HttpSession session, String id, String pwd) {
        System.out.println(id+" "+pwd); //올라온거 확인함
        AdmDTO adm = null;
        try {
            adm =service.get(id);
            if(adm==null) {
                return "redirect:";
            }else {
                if(pwd.equals(adm.getPwd())) {
                    session.setAttribute("loginadmin", adm);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session, String id, String pwd) {
        if(session != null) {
            session.invalidate();
        }   
        return "redirect:";
    }
}
