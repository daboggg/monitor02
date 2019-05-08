package ru.zinin.monitor02.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Share {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String tiсker;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTiсker() {
        return tiсker;
    }

    public void setTiсker(String tiсker) {
        this.tiсker = tiсker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
