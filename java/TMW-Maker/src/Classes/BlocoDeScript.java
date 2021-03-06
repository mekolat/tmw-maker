package Classes;

public class BlocoDeScript {
    private String Nome="";
    private String Tipo="";
    private String Mapa="";
    private int X= 0;
    private int Y= 0;
    private int Imagem = 0;
    private String Script="";
    private int LarguraDeGatilho= 0;
    private int AlturaDeGatilho= 0;
    //public BlocoDeScript(){...}

    public void setNome(String NomeDoBloco){Nome=NomeDoBloco.toString();}
    public void setTipo(String TipoDeBloco){Tipo=TipoDeBloco.toString();}
    public void setMapa(String NomeDoMapa){Mapa=NomeDoMapa.toString();}
    public void setX(int CoordenadaX){X=CoordenadaX;}
    public void setY(int CoordenadaY){Y=CoordenadaY;}
    public void setScript(String ScriptDoBloco){Script=ScriptDoBloco.toString();}
    public void setImagem(int BlocoDaImagem){Imagem=BlocoDaImagem;}
    public void setLarguraDeGatilho(int TilesDeLargura){LarguraDeGatilho=TilesDeLargura;}
    public void setAlturaDeGatilho(int TilesDeAltura){AlturaDeGatilho=TilesDeAltura;}
    
    public String getNome(){return Nome.toString();}
    public String getTipo(){return Tipo.toString();}
    public String getMapa(){return Mapa.toString();}
    public int getX(){return X;}
    public int getY(){return Y;}
    public String getScript(){return Script.toString();}
    public int getImagem(){return Imagem;}
    public int getLarguraDeGatilho(){return LarguraDeGatilho;}
    public int getAlturaDeGatilho(){return AlturaDeGatilho;}
    //public static void main(String args[]) {...}
}
