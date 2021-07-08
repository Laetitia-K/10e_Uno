
import java.util.Random; 
public class SPIEL
{
    CARD stack; 
    int pn; // Anzahl der Spieler 
    int cp; // aktueller spieler 
    boolean reversed; //reihenfloge
    boolean reihenfolge;
    CARD cards [][]; // klammer 1 = welcher spieler 2= wie vielte karte
    SPIEL(int playernumber) 
    { boolean ok = true; // kann das spiel weitergehen
        pn = playernumber; 
        if(pn > 4 || pn < 2) 
        { ok = false; 
            System.out.println("Wrong playercount. Game cancelled"); 
        }
        else 
        { cards = new CARD [pn][18]; 
            for( int p = 0; p < pn; p++) 
            { for( int i = 0; i<8; i++) 
                { cards[p][i]= GetRnC();}       //Spiel wird gestartet
            }
        }
        stack = GetRnC(); // Zufallskarte
        if(ok)
        {Play();}

    }
    

    void Play() 
    { boolean b = true; // Checkt ob siegbedingung erfüllt ja = false
        cp = 0; 
        while(b) 
        {  
            boolean reihenfolge = true;
            
            if(stack.GetV() == 'v') 
            {Add(4);
                // Hier muss noch die Farbwahl hin 
            }
            if(stack.GetV() == 'z')
            {Add(2);}
            PrintCards(); 
            KartenSpielen();
            if (stack.GetV() == 'a') 
            { // Also die Aussetzen Karte gelegt
                cp = cp + 2;
            }
            else 
            { cp++; 
            }
            
            if (cp == 4) 
            {cp = 0;}
            else if (cp == 5) 
            {cp = 1;}
            
            if (stack.GetV() == 'r')
            {
              reihenfolge = false;
              if (cp == -4) 
              {cp = 0;}
              else if (cp == -5) 
              {cp = -1;}
                
            }

            for(int i = 0; i<4; i++) 
            { if(cards[i][0] == null) 
                { b = false; 
                    System.out.println("Player" + i +"hat gewonnen!") ;  
                }
            }
        }

    }
    

    void PrintCards() 
    { System.out.println("Player" + cp); 
        System.out.println("Stapel:" + "Farbe:" + stack.GetC() + "Zahl:" + stack.GetV()); 
        boolean b = true; 
        int i = 0; 
        while(b) 
        { if (cards[cp][i] != null) 
            { System.out.println( (i+1) + "Farbe:" + cards[cp][i].GetC() + "Zahl:" + cards[cp][i].GetV()); 
                i++;
            }
            else
            {b = false;}
        }
    }
    
    

    void KartenSpielen() 
    { char key = GetKeyInput();  // was wurde gedrückt
        boolean b = false; 
        while(b == false)
        { switch (key) 
            {   case'1':
                b = Try(0); 
                break; 
                case '2': 
                b = Try(1);
                break; 
                case '3': 
                b = Try(2); 
                break; 
                case '4': 
                b = Try(3); 
                break; 
                case '5': 
                b = Try(4); 
                break; 
                case '6': 
                b = Try(5); 
                break; 
                case '7':
                b = Try(6); 
                break; 
                case '8': 
                b = Try(7); 
                break; 
                case '9': 
                b = Try(8); 
                break; 
                case 'q': 
                b = Try(9); 
                break; 
                case 'w': 
                b = Try(10); 
                break; 
                case 'e': 
                b = Try(11);
                break; 
                case 'r': 
                b = Try(12); 
                break; 
                case 't': 
                b = Try(13); 
                break; 
                case 'z':
                b = Try(14); 
                break; 
                case 'u':
                b = Try(15); 
                break; 
                case 'i': 
                b = Try(16); 
                break; 
                case 'o': 
                b = Try(17); 
                case '0': 
                b = true; 
                Add(1); 
                break; 
            } 
        }
    }

    boolean Try(int i) // kann man Karte legen
    { CARD c = cards[cp][i];
        if (c.GetV() == stack.GetV() || c.GetC() == stack.GetC()|| c.GetV() == 'v'|| c.GetV() == 'f') //wenn man legen kann dann stapel auf aktuelle karte setzen
        { stack = c; 
            Remove(i); // entfernt karte
            return true; 
        }
        else 
        { System.out.println("du kannst keine Karte legen"); 
            return false; // kann karte nicht legen
        }

    }

    void Add(int n) 
    { for (int i = 0; i<n; i++) 
        { boolean b = true; 
            int z = 0; 
            while(b) 
            { if (cards[cp][z] != null && z<18) 
                { z++;
                }
                else
                {b = false;
                    cards[cp][z] = GetRnC();  
                }
            }
        }
    }

    void Remove (int n) // entfernt karte an stelle n und rückt karten die nachkommen nach
    { for(int i = n; i<17; i++) 
        { cards[cp][i] = cards[cp][i+1]; 
        }
        cards[cp][17] = null;
    }

    char GetKeyInput() // was wurde eingegeben; durch charkater rückgabe; werte von 0-9 und q-o
    { return '_'; 
    }

    CARD GetRnC() // Methode random
    { return null; 
    }
    
}