/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.events.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author FABIAN G
 */
@Entity
@Table(name = "events")
public class Event implements Serializable{
    @Autowired
    Person chair;
    List<Person> comite;
    
    private String name;
    @Id //define la llave rpimaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //genera automaticamente el Id
    private Long id;

 // agergar getters y setters...

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getChair() {
        return chair;
    }

    public void setChair(Person chair) {
        this.chair = chair;
    }

    public List<Person> getComite() {
        return comite;
    }

    public void setComite(List<Person> comite) {
        this.comite = comite;
    }
}