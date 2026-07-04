package com.resume.resumebuilder;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;

@RestController
@CrossOrigin("*")

public class maincontroller {
    @Autowired
    UserRepository repo;
    @PostMapping("/register")
    public String register(@RequestParam String email, @RequestParam String password) {
       user existing = repo.findByEmail(email);
       if(existing != null){
        return "Email already exist";
       }
       user u = new user();
       u.setEmail(email);
       u.setPassword(password);
       repo.save(u);
       return "Signup success";
    }
    @PostMapping("/logins")
    public String logins(@RequestParam String email, @RequestParam String password) {
       user user = repo.findByEmail(email);
       if(user == null){
        return "User not found";
       }
       if(user.getPassword().equals(password)){
        return "success";
       }
       return "Invalid password";
    }
    @Autowired
    DetailRepository detailrepo;
    @GetMapping("/showtext")
    public details showtext(@RequestParam String name, @RequestParam String title, @RequestParam String summary, @RequestParam String education, @RequestParam String skills, @RequestParam String experience, @RequestParam String language, @RequestParam String certificate, @RequestParam String detail) {
       details d = new details();
       d.setName(name);
       d.setTitle(title);
       d.setSummary(summary);
       d.setEducation(education);
       d.setSkills(skills);
       d.setExperience(experience);
       d.setLanguage(language);
       d.setCertificate(certificate);
       d.setDetail(detail);
       return detailrepo.save(d);
    }
    @GetMapping("/resumedetail")
    public List<details> getResumedetail() {
        return detailrepo.findAll();
    }
    
    
    
    
    
}
