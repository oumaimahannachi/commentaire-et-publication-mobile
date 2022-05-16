/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

/**
 *
 * @author lenovo
 */
public class Publication {
    private int id;
    private String titre, text;
    private String date;

    public Publication() {
    }

    public Publication(int id, String titre, String text, String date) {
        this.id = id;
        this.titre = titre;
        this.text = text;
        this.date = date;
    }

    public Publication(String titre, String text, String date) {
        this.titre = titre;
        this.text = text;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Publication{" + "id=" + id + ", titre=" + titre + ", text=" + text + ", date=" + date + '}';
    }
    
}
