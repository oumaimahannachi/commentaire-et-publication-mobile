/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gui;
import com.codename1.io.Preferences;

/**
 *
 * @author lenovo
 */
public class CategorieManager {
    public static Preferences pref ; // 3ibara memoire sghira nsajlo fiha data 
    
    // hethom données ta3 user lyt7b tsajlhom fi session  ba3d login 
    private static int id ; 
    private static String nom ; 
    private static String color; 
    
     public static Preferences getPref() {
        return pref;
    }

    public static void setPref(Preferences pref) {
        CategorieManager.pref = pref;
    }

    public static int getId() {
        return pref.get("id",id);// kif nheb njib id categorie apres njibha men pref 
    }

    public static void setId(int id) {
        pref.set("id",id);//nsajl id categorie w na3tiha identifiant "id";
        
        
    }
    
    public static String getNom() {
        return pref.get("nom",nom);
    }

    public static void setNom(String nom) {
         pref.set("nom",nom);
    }

    public static String getColor() {
        return pref.get("color",color);
    }

    public static void setColor(String color) {
         pref.set("color",color);
    }
}
