
import java.awt.*;
import java.awt.event.*;
import java.util.Random; 
import java.util.ArrayList;


class SPIEL 
// Kontrollsystem// 
// farben, nummern, uno gesagt, spieler skipp, ziehen //
{
    SPIELER spieler1;
    SPIELER spieler2;
    SPIELER spieler3;
    SPIELER spieler4;
    

    FARBWUNSCH farbwunsch;

    AUSSETZEN arot;
    AUSSETZEN agelb;
    AUSSETZEN agruen;
    AUSSETZEN ablau;

    RICHTUNGSWECHSEL rrot;
    RICHTUNGSWECHSEL rgelb;
    RICHTUNGSWECHSEL rgruen;
    RICHTUNGSWECHSEL rblau;

    ZWEIZIEHEN zrot;
    ZWEIZIEHEN zgelb;
    ZWEIZIEHEN zgruen;
    ZWEIZIEHEN zblau;

    VIERZIEHEN vierziehen;
    
    int karte;
    
    
    SPIEL()
    {
        spieler1 = new SPIELER();
        spieler2 = new SPIELER();
        spieler3 = new SPIELER();
        spieler4 = new SPIELER();
        
        farbwunsch = new FARBWUNSCH();
        
        arot = new AUSSETZEN();
        agelb = new AUSSETZEN();
        agruen = new AUSSETZEN();
        ablau = new AUSSETZEN();
        
        rrot = new RICHTUNGSWECHSEL();
        rgelb = new RICHTUNGSWECHSEL();
        rgruen = new RICHTUNGSWECHSEL();
        rblau = new RICHTUNGSWECHSEL();
        
        zrot = new ZWEIZIEHEN();
        zgelb = new ZWEIZIEHEN();
        zgruen = new ZWEIZIEHEN();
        zblau = new ZWEIZIEHEN();
        
        vierziehen = new VIERZIEHEN();
        
        
        
    }
    
    void spielbeginn()
    {
        
        {
            
        }
        
    }
    
    void nimmObersteKarte()
    {
        
    }
    
    void zeigeKarte()
    {
        
    }
    
    void handzeigen()
    {
        
    }
    
    
    void kartelegen()
    {
        switch (karte)
      {
        case '1':
        //karte an stelle 1 auswärhlen.. usw bei anderen//
        break;
        case '2':
        break;
        case '3':
        break;
        case '4':
        break;
        case '5':
        break;
        case '6':
        break;
        case '7':
        break;
        case '8':
        break;
        case '9':
        break;
          
        case '0' :  
        System.out.println("kein Zug möglich? Ziehe eine Karte mit K!");
        break;
        }
    }
    
    void kartenehmen()
    {
      //random karte vom zeihstapel//
      //ziehstapel -1//
    }
    
    void reihenfolge()
    {
    }
    
    void spielablauf()
    {
      //karten geben//
      System.out.println("Spieler 1 beginnt!");
      
      
    }
    
    void mischen()
    {
        
    }
}

    

