
import java.util.ArrayList;

class KARTEN
{
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
    
    KLASSISCHEKARTEN blau1;
    KLASSISCHEKARTEN blau2;
    KLASSISCHEKARTEN blau3;
    KLASSISCHEKARTEN blau4;
    KLASSISCHEKARTEN blau5;
    KLASSISCHEKARTEN blau6;
    KLASSISCHEKARTEN blau7;
    KLASSISCHEKARTEN blau8;
    KLASSISCHEKARTEN blau9;
    
    KLASSISCHEKARTEN rot1;
    KLASSISCHEKARTEN rot2;
    KLASSISCHEKARTEN rot3;
    KLASSISCHEKARTEN rot4;
    KLASSISCHEKARTEN rot5;
    KLASSISCHEKARTEN rot6;
    KLASSISCHEKARTEN rot7;
    KLASSISCHEKARTEN rot8;
    KLASSISCHEKARTEN rot9;
    
    KLASSISCHEKARTEN gelb1;
    KLASSISCHEKARTEN gelb2;
    KLASSISCHEKARTEN gelb3;
    KLASSISCHEKARTEN gelb4;
    KLASSISCHEKARTEN gelb5;
    KLASSISCHEKARTEN gelb6;
    KLASSISCHEKARTEN gelb7;
    KLASSISCHEKARTEN gelb8;
    KLASSISCHEKARTEN gelb9;
    
    KLASSISCHEKARTEN gruen1;
    KLASSISCHEKARTEN gruen2;
    KLASSISCHEKARTEN gruen3;
    KLASSISCHEKARTEN gruen4;
    KLASSISCHEKARTEN gruen5;
    KLASSISCHEKARTEN gruen6;
    KLASSISCHEKARTEN gruen7;
    KLASSISCHEKARTEN gruen8;
    KLASSISCHEKARTEN gruen9;
    
    ArrayList<String> Karten = new ArrayList<String>();
    

    KARTEN()
    {
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
        
        blau1 = new KLASSISCHEKARTEN();
        blau2 = new KLASSISCHEKARTEN();
        blau3 = new KLASSISCHEKARTEN();
        blau4 = new KLASSISCHEKARTEN();
        blau5 = new KLASSISCHEKARTEN();
        blau6 = new KLASSISCHEKARTEN();
        blau7 = new KLASSISCHEKARTEN();
        blau8 = new KLASSISCHEKARTEN();
        blau9 = new KLASSISCHEKARTEN(); 
        rot1 = new KLASSISCHEKARTEN(); 
        rot2 = new KLASSISCHEKARTEN(); 
        rot3 = new KLASSISCHEKARTEN(); 
        rot4 = new KLASSISCHEKARTEN(); 
        rot5 = new KLASSISCHEKARTEN(); 
        rot6 = new KLASSISCHEKARTEN(); 
        rot7 = new KLASSISCHEKARTEN(); 
        rot8 = new KLASSISCHEKARTEN(); 
        rot9 = new KLASSISCHEKARTEN(); 
        gelb1 = new KLASSISCHEKARTEN();
        gelb2 = new KLASSISCHEKARTEN(); 
        gelb3 = new KLASSISCHEKARTEN();
        gelb4 = new KLASSISCHEKARTEN(); 
        gelb5 = new KLASSISCHEKARTEN();
        gelb6 = new KLASSISCHEKARTEN(); 
        gelb7 = new KLASSISCHEKARTEN(); 
        gelb8 = new KLASSISCHEKARTEN(); 
        gelb9 = new KLASSISCHEKARTEN(); 
        gruen1 = new KLASSISCHEKARTEN(); 
        gruen2 = new KLASSISCHEKARTEN(); 
        gruen3 = new KLASSISCHEKARTEN(); 
        gruen4 = new KLASSISCHEKARTEN(); 
        gruen5 = new KLASSISCHEKARTEN(); 
        gruen6 = new KLASSISCHEKARTEN();  
        gruen7 = new KLASSISCHEKARTEN(); 
        gruen8 = new KLASSISCHEKARTEN();  
        gruen9 = new KLASSISCHEKARTEN(); 
        
        ArrayList<String> Karten = new ArrayList<String>();
        
        
        
        
    }
    
    void Kartendatenbank()
    {
        String Kartendatenbank[] = new String [35];
        
        Kartendatenbank [0] = "rot1";
        Kartendatenbank [1] = "rot2";
        Kartendatenbank [2] = "rot3";
        Kartendatenbank [3] = "rot4";
        Kartendatenbank [4] = "rot5";
        Kartendatenbank [5] = "rot6";
        Kartendatenbank [6] = "rot7";
        Kartendatenbank [7] = "rot8";
        Kartendatenbank [8] = "rot9";
        Kartendatenbank [9] = "gelb1";
        Kartendatenbank [10] = "gelb2";
        Kartendatenbank [11] = "gelb3";
        Kartendatenbank [12] = "gelb4";
        Kartendatenbank [13] = "gelb5";
        Kartendatenbank [14] = "gelb6";
        Kartendatenbank [15] = "gelb7";
        Kartendatenbank [16] = "gelb8";
        Kartendatenbank [17] = "gelb9";
        Kartendatenbank [18] = "gruen1";
        
        Kartendatenbank [19] = "gruen2";
        Kartendatenbank [20] = "gruen3";
        Kartendatenbank [21] = "gruen4";
        Kartendatenbank [22] = "gruen5";
        Kartendatenbank [23] = "gruen6";
        Kartendatenbank [24] = "gruen7";
        Kartendatenbank [25] = "gruen8";
        Kartendatenbank [26] = "gruen9";
        Kartendatenbank [27] = "blau1";
        Kartendatenbank [28] = "blau2";
        Kartendatenbank [29] = "blau3";
        Kartendatenbank [30] = "blau4";
        Kartendatenbank [31] = "blau5";
        Kartendatenbank [32] = "blau6";
        Kartendatenbank [33] = "blau7";
        Kartendatenbank [34] = "blau8";
        Kartendatenbank [35] = "blau9";
        
    }
}

