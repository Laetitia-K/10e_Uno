

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
        
        //fehlt noch klassische karten //
        
        
        
        
        
    }
    
}

