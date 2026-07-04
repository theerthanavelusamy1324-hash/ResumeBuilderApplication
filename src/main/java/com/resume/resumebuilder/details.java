package com.resume.resumebuilder;
import jakarta.persistence.*;
@Entity
@Table(name="details")

public class details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String title;
    private String summary;
    private String education;
    private String skills;
    private String experience;
    private String language;
    private String certificate;
    private String detail;
    public details(){}
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
      public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
      public String getSummary(){
        return summary;
    }
    public void setSummary(String summary){
        this.summary = summary;
    }
      public String getEducation(){
        return education;
    }
    public void setEducation(String education){
        this.education = education;
    }
      public String getSkills(){
        return skills;
    }
    public void setSkills(String skills){
        this.skills = skills;
    }
      public String getExperience(){
        return experience;
    }
    public void setExperience(String experience){
        this.experience = experience;
    }
      public String getLanguage(){
        return language;
    }
    public void setLanguage(String language){
        this.language = language;
    }
      public String getCertificate(){
        return certificate;
    }
    public void setCertificate(String certificate){
        this.certificate = certificate;
    }
      public String getDetail(){
        return detail;
    }
    public void setDetail(String detail){
        this.detail = detail;
    }

}
