package Classes.BancoDeDados;

import Classes.Arquivamento;
import Classes.StringClass;

public class Banco_Lojas {
    private Dados_Lojas galeria[]=null; //N�o deve ser instaciado agora!!!!
    public Banco_Lojas(String Arquivo){
        arqAbrir(Arquivo);
    }
    public Banco_Lojas(){
        galeria = null;
    }

    public void addLoja(String nomeLoja, int imagemILoja, String mapa, int coordX, int coordY){
        if(galeria != null){
            Dados_Lojas novaGaleria[] = new Dados_Lojas[galeria.length+1];
            for(int b=0;b<galeria.length;b++){
                novaGaleria[b] = new Dados_Lojas(
                    galeria[b].getNomeLoja(),
                    galeria[b].getImagemLoja(),
                    galeria[b].getMapa(),
                    galeria[b].getCoordX(),
                    galeria[b].getCoordY(),
                    galeria[b].getProdutos()
                );
            }
            novaGaleria[galeria.length] = new Dados_Lojas(nomeLoja, imagemILoja, mapa, coordX, coordY);
            galeria = novaGaleria;
        }else{
            Dados_Lojas novaGaleria[] = new Dados_Lojas[1];
            novaGaleria[0] = new Dados_Lojas(nomeLoja, imagemILoja, mapa, coordX, coordY);
            galeria = novaGaleria;
        }
    }
    public void addLoja(String nomeLoja, int imagemILoja, String mapa, int coordX, int coordY, Dados_LojaProduto NovosProdutos[]){
        if(galeria != null){
            Dados_Lojas novaGaleria[] = new Dados_Lojas[galeria.length+1];
            for(int b=0;b<galeria.length;b++){
                novaGaleria[b] = new Dados_Lojas(
                    galeria[b].getNomeLoja(),
                    galeria[b].getImagemLoja(),
                    galeria[b].getMapa(),
                    galeria[b].getCoordX(),
                    galeria[b].getCoordY(),
                    galeria[b].getProdutos()
                );
            }
            novaGaleria[galeria.length] = new Dados_Lojas(nomeLoja, imagemILoja, mapa, coordX, coordY);
            galeria = novaGaleria;
        }else{
            Dados_Lojas novaGaleria[] = new Dados_Lojas[1];
            novaGaleria[0] = new Dados_Lojas(nomeLoja, imagemILoja, mapa, coordX, coordY);
            galeria = novaGaleria;
        }
    }
    public void delLojaPorNome(String nomeLoja){
        if(galeria != null){
            Dados_Lojas novaGaleria[] = new Dados_Lojas[galeria.length-1];
            int contLojas=0;
            for(int b=0;b<galeria.length;b++){
                if(galeria[b].getNomeLoja().equals(nomeLoja)){
                    contLojas++;
                    novaGaleria[contLojas-1] = new Dados_Lojas(
                        galeria[b].getNomeLoja(),
                        galeria[b].getImagemLoja(),
                        galeria[b].getMapa(),
                        galeria[b].getCoordX(),
                        galeria[b].getCoordY(),
                        galeria[b].getProdutos()
                    );
                }
            }
            galeria = novaGaleria;
        }
    }
    public void delLojaPorOrdem(int ordem){
        if(galeria != null){
            Dados_Lojas novaGaleria[] = new Dados_Lojas[galeria.length-1];
            int contLojas=0;
            for(int b=0;b<galeria.length;b++){
                if(b!=ordem){
                    contLojas++;
                    novaGaleria[contLojas-1] = new Dados_Lojas(
                        galeria[b].getNomeLoja(),
                        galeria[b].getImagemLoja(),
                        galeria[b].getMapa(),
                        galeria[b].getCoordX(),
                        galeria[b].getCoordY(),
                        galeria[b].getProdutos()
                    );
                }
            }
            galeria = novaGaleria;
        }
    }
    public void delGaleria(){galeria=null;}
    public Dados_Lojas[] getLojas(){return galeria;}
    public Dados_Lojas getLojaPorOrdem(int ordem){
        if(galeria != null){
            return galeria[ordem];
        }else{
            return null;
        }
    }
    public Dados_Lojas getLojaPorNome(String nomeLoja){
        if(galeria != null){
            for(int ordem=0;ordem<galeria.length;ordem++){
                if(galeria[ordem].getNomeLoja().equals(nomeLoja)){
                    return galeria[ordem];
                }
            }
        }
        return null;
    }
    public int getContLojas(){
         if(galeria != null){
             return galeria.length;
         }else{
             return 0;
         }
    }
    public void setLojas(Dados_Lojas NovasLojas[]){galeria=NovasLojas;}
    public void arqAbrir(String Arquivo){
        StringClass Conteudo = new StringClass(Arquivamento.arquivoAbrir(Arquivo));
        //Vector shops = new Vector();
        for(int ln=0;ln<Conteudo.getContLinhas();ln++){
            String Partes[] = Conteudo.getLinha(ln).trim().split(",");
            if(
                Partes.length>=5 &&
                Conteudo.getLinha(ln).trim().indexOf("//")!=0 &&
                Conteudo.getLinha(ln).trim().indexOf("\tshop\t")>=0
            ){
                String Partes2[] = Partes[0].trim().split("\\.");
                String Partes3[] = Partes[3].trim().split("\t");
                if(Partes2.length==2 && Partes3.length==4){
                    addLoja(
                        Partes3[2].toString(),
                        Integer.parseInt(Partes3[3].toString()),
                        Partes2[0].toString(),
                        Integer.parseInt(Partes[1].toString()),
                        Integer.parseInt(Partes[2].toString())
                    );
                    for(int P=4;P<Partes.length;P++){
                        String Partes4[] = Partes[P].trim().split(":");
                         if(Partes4.length==2){
                            getLojaPorOrdem(getContLojas()-1).addProduto(
                                Integer.parseInt(Partes4[0]),
                                Integer.parseInt(Partes4[1])
                            );
                            /*System.out.println(
                                "L:"+getContLojas()+" "+
                                "Ps:"+getLojaPorOrdem(getContLojas()-1).getContProdutos()
                            );/**/
                         }
                    }
                }
            }
        }
    }
}