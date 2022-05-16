/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gui;
import com.codename1.components.FloatingHint;
import com.codename1.ui.Button;
import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.Toolbar;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.Resources;
import com.mycompany.entities.Publication;
import com.mycomany.services.PublicationService;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author lenovo
 */
public class ModifierPublicationForm extends BaseForm{
     Form current;
    public ModifierPublicationForm(Resources res , Publication r) {
         super("Newsfeed",BoxLayout.y()); //herigate men Newsfeed w l formulaire vertical
    
        Toolbar tb = new Toolbar(true);
        current = this ;
        setToolbar(tb);
        getTitleArea().setUIID("Container");
        setTitle("Ajout Reclamation");
        getContentPane().setScrollVisible(false);
        
        
        super.addSideMenu(res);
        
        TextField titre = new TextField(r.getTitre() , "Titre" , 20 , TextField.ANY);
        TextField text = new TextField(r.getText() , "Text" , 20 , TextField.ANY);
        
 
        
        
        
        
        
        
        titre.setUIID("NewsTopLine");
        
        titre.setSingleLineTextArea(true);
        
         text.setUIID("NewsTopLine");
        
        text.setSingleLineTextArea(true);
        
        Button btnModifier = new Button("Modifier");
       btnModifier.setUIID("Button");
       
       //Event onclick btnModifer
       
       btnModifier.addPointerPressedListener(l ->   { 
           
           r.setTitre(titre.getText());
            r.setText(text.getText());
           SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
           format.format(new Date());
      
       
       //appel fonction modfier reclamation men service
       
       if(PublicationService.getInstance().modifierPublication(r)) { // if true
           new ListePublicationFrom(res).show();
       }
        });
       Button btnAnnuler = new Button("Annuler");
       btnAnnuler.addActionListener(e -> {
           new ListePublicationFrom(res).show();
       });
       
       
       Label l2 = new Label("");
       
       Label l3 = new Label("");
       
       Label l4 = new Label("");
       
       Label l5 = new Label("");
       
        Label l1 = new Label();
        
        Container content = BoxLayout.encloseY(
                l1, l2, 
                new FloatingHint(titre),
                createLineSeparator(),
                new FloatingHint(text),
                 createLineSeparator(),
                btnModifier,
                btnAnnuler
                
               
        );
        
        add(content);
        show();
        
        
    }  
}
