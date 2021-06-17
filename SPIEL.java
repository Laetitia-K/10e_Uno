

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
    
    void handzeigen()
    {
        
    }

    
}
