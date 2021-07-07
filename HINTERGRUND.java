



class HINTERGRUND 
{
  RECHTECK kartenstapelfeld;
  RECHTECK kartenstapelfeld2;
  KREIS kartenstapelfeld3;
  RECHTECK kartenstapelfeld4;
  
  RECHTECK ablegestapel;
  RECHTECK ablegestapel2;
  
  RECHTECK karte1a;
  RECHTECK karte1b;
  RECHTECK karte2a;
  RECHTECK karte2b;
  RECHTECK karte3a;
  RECHTECK karte3b;
  RECHTECK karte4a;
  RECHTECK karte4b;
  RECHTECK karte5a;
  RECHTECK karte5b;
  RECHTECK karte6a;
  RECHTECK karte6b;
  RECHTECK karte7a;
  RECHTECK karte7b;
  RECHTECK karte8a;
  RECHTECK karte8b;
  RECHTECK karte9a;
  RECHTECK karte9b;
  RECHTECK karte10a;
  RECHTECK karte10b;
  
    
  HINTERGRUND()
  {
    
    kartenstapelfeld = new RECHTECK();
     kartenstapelfeld.GroesseSetzen(140,200);
     kartenstapelfeld.PositionSetzen(450,150);
    
     kartenstapelfeld2 = new RECHTECK();
     kartenstapelfeld2.GroesseSetzen(130,190);
     kartenstapelfeld2.PositionSetzen(455,155); 
     kartenstapelfeld2.FarbeSetzen("schwarz");
    
     kartenstapelfeld3 = new KREIS();
     kartenstapelfeld3.RadiusSetzen(35);
     kartenstapelfeld3.MittelpunktSetzen(520,245);
    
     kartenstapelfeld4 = new RECHTECK();
     kartenstapelfeld4.GroesseSetzen(90,30);
     kartenstapelfeld4.PositionSetzen(475,230); 
     kartenstapelfeld4.FarbeSetzen("grau");
    
     karte1a = new RECHTECK();
     karte1a.PositionSetzen(100,470);
     karte1a.GroesseSetzen(140,200);
     
     karte1b = new RECHTECK();
     karte1b.PositionSetzen(105,475);
     karte1b.GroesseSetzen(130,190);
     karte1b.FarbeSetzen("schwarz");
     
     karte2a = new RECHTECK();
     karte2a.PositionSetzen(200,470);
     karte2a.GroesseSetzen(140,200);
     
     karte2b = new RECHTECK();
     karte2b.PositionSetzen(205,475);
     karte2b.GroesseSetzen(130,190);
     karte2b.FarbeSetzen("schwarz");
     
     karte3a = new RECHTECK();
     karte3a.PositionSetzen(300,470);
     karte3a.GroesseSetzen(140,200);
     
     karte3b = new RECHTECK();
     karte3b.PositionSetzen(305,475);
     karte3b.GroesseSetzen(130,190);
     karte3b.FarbeSetzen("schwarz");
     
     karte4a = new RECHTECK();
     karte4a.PositionSetzen(400,470);
     karte4a.GroesseSetzen(140,200);
    
     karte4b = new RECHTECK();
     karte4b.PositionSetzen(405,475);
     karte4b.GroesseSetzen(130,190);
     karte4b.FarbeSetzen("schwarz");
     
     karte5a = new RECHTECK();
     karte5a.PositionSetzen(500,470);
     karte5a.GroesseSetzen(140,200);
     
     karte5b = new RECHTECK();
     karte5b.PositionSetzen(505,475);
     karte5b.GroesseSetzen(130,190);
     karte5b.FarbeSetzen("schwarz");
     
     karte6a = new RECHTECK();
     karte6a.PositionSetzen(100,-120);
     karte6a.GroesseSetzen(140,200);
     
     karte6b = new RECHTECK();
     karte6b.PositionSetzen(105,-115);
     karte6b.GroesseSetzen(130,190);
     karte6b.FarbeSetzen("schwarz");
     
     karte7a = new RECHTECK();
     karte7a.PositionSetzen(200,-120);
     karte7a.GroesseSetzen(140,200);
     
     karte7b = new RECHTECK();
     karte7b.PositionSetzen(205,-115);
     karte7b.GroesseSetzen(130,190);
     karte7b.FarbeSetzen("schwarz");
     
     karte8a = new RECHTECK();
     karte8a.PositionSetzen(300,-120);
     karte8a.GroesseSetzen(140,200);
     
     karte8b = new RECHTECK();
     karte8b.PositionSetzen(305,-115);
     karte8b.GroesseSetzen(130,190);
     karte8b.FarbeSetzen("schwarz");
     
     karte9a = new RECHTECK();
     karte9a.PositionSetzen(400,-120);
     karte9a.GroesseSetzen(140,200);
     
     karte9b = new RECHTECK();
     karte9b.PositionSetzen(405,-115);
     karte9b.GroesseSetzen(130,190);
     karte9b.FarbeSetzen("schwarz");
     
     karte10a = new RECHTECK();
     karte10a.PositionSetzen(500,-120);
     karte10a.GroesseSetzen(140,200);
     
     karte10b = new RECHTECK();
     karte10b.PositionSetzen(505,-115);
     karte10b.GroesseSetzen(130,190);
     karte10b.FarbeSetzen("schwarz");
     
     
     
    
     
     ablegestapel = new RECHTECK();
     ablegestapel.PositionSetzen(250,150);
     ablegestapel.GroesseSetzen(140,200);
     ablegestapel.FarbeSetzen("blau");
       
     ablegestapel2 = new RECHTECK();
     ablegestapel2.PositionSetzen(255,155);
     ablegestapel2.GroesseSetzen(130,190);
     ablegestapel2.FarbeSetzen("grau");
        
    
  }
  
  
    
 }
