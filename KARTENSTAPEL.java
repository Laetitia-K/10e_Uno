
 class KARTENSTAPEL
{
    KARTENSTAPEL kartenstock;
    KARTENSTAPEL ablegestapel;
    KARTENSTAPEL spielerhand1;
    KARTENSTAPEL spielerhand2;
    KARTENSTAPEL spielerhand3;
    KARTENSTAPEL spielerhand4;
    
    
    KARTENSTAPEL()
    {
        kartenstock  = new KARTENSTAPEL();
        ablegestapel = new KARTENSTAPEL();
        spielerhand1 = new KARTENSTAPEL();
        spielerhand2 = new KARTENSTAPEL();
        spielerhand3 = new KARTENSTAPEL();
        spielerhand4 = new KARTENSTAPEL();
    }   
}
