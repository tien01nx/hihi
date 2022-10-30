/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ADMIN
 */
public class Students {
    private  String id,name,gender,date,cccd,email,administrativeClass ;

    public Students() {
    }

    public Students(String id, String name, String gender, String date, String cccd, String email, String administrativeClass) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.cccd = cccd;
        this.email = email;
        this.administrativeClass = administrativeClass;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", date=" + date + ", cccd=" + cccd + ", email=" + email + ", administrativeClass=" + administrativeClass + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdministrativeClass() {
        return administrativeClass;
    }

    public void setAdministrativeClass(String administrativeClass) {
        this.administrativeClass = administrativeClass;
    }

  
}
