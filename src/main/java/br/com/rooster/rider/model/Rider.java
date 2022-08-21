package br.com.rooster.rider.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rider {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long id;

    @Column(nullable=false)
    public String name;

    @Column(nullable=false)
    public String city;

}