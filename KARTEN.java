

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

