package Classes.BancoDeDados;

import Classes.FileClass;
import Classes.StringClass;
import Formularios.FrmPrincipal;
import java.util.Vector;

public class Banco_Spawns {
    public Banco_Spawns() {
        abrirBanco(EnderecoTXT, EnderecoXML);
    }
    /*******************************************************************************************************
     * ID,Name,Jname,
     * LV,HP,SP,EXP,JEXP,
     * Range1,ATK1,ATK2,DEF,MDEF,
     * STR,AGI,VIT,INT,DEX,LUK,
     * Range2,Range3,Scale,Race,Element,Mode,Speed,Adelay,
     * Amotion,Dmotion,
     * Drop1id,Drop1per,Drop2id,Drop2per,Drop3id,Drop3per,Drop4id,Drop4per,Drop5id,Drop5per,Drop6id,Drop6per,Drop7id,Drop7per,Drop8id,Drop8per,
     * Item1,Item2,MEXP,ExpPer,MVP1id,MVP1per,MVP2id,MVP2per,MVP3id,MVP3per,mutiation count,mutation strength
     *******************************************************************************************************/
    public static String Barra = System.getProperty("file.separator");
    public static String EnderecoTXT = FrmPrincipal.Config.getConexaoLocalhost()+Barra+"eathena-data"+Barra+"db"+Barra+"mob_db.txt";
    public static String EnderecoXML = FrmPrincipal.Config.getConexaoLocalhost()+Barra+"tmwdata"+Barra+"monsters.xml";

    private static Dados_Spawns Spawns[]=null;
    public void abrirBanco(String mobTXT, String mobXML){
        if(FileClass.seExiste(mobTXT)){
            StringClass ConteudoTXT = new StringClass(FileClass.arquivoAbrir(mobTXT));
            FrmPrincipal.PgbBarra.setIndeterminate(false);
            FrmPrincipal.PgbBarra.setEnabled(true);
            FrmPrincipal.PgbBarra.setMinimum(0);
            FrmPrincipal.PgbBarra.setValue(0);
            FrmPrincipal.PgbBarra.setMaximum(ConteudoTXT.getContLinhas()-1);
            for(int l=0;l<ConteudoTXT.getContLinhas();l++){
                FrmPrincipal.PgbBarra.setValue(l);
                FrmPrincipal.PgbBarra.setString((((int)(l+1)/ConteudoTXT.getContLinhas())*100)+"%");
                if(
                    !ConteudoTXT.getLinha(l).trim().equals("") &&
                    !ConteudoTXT.getLinha(l).trim().substring(0, 2).equals("//") &&
                    !ConteudoTXT.getLinha(l).trim().substring(0, 1).equals("#")
                ){
                    String Partes[]=ConteudoTXT.getLinha(l).trim().split(",");
                    if(Partes.length>=47){
                        addSpawn(
                            Integer.parseInt(Partes[0]),
                            Partes[1], Partes[2]
                        );
                        FrmPrincipal.setAvisoEmEstatus("<html>"+
                            "Carregando Monstro: \"<font color=\"#0000FF\">"+Partes[0]+": "+Partes[2]+"</font>\"!",
                            new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/sbl_caveira.png"))
                        );
                        int c=3;
                        getSpawnPorOrdem(getContSpawns()-1).setNivel(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setHP(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setSP(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setExp(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setJob(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setRange1(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setAtaque1(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setAtaque2(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setDefesaFisica(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setDefesaMagica(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setEstatusForca(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setEstatusAgilidade(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setEstatusVitalidade(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setEstatusInteligencia(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setEstatusDestresa(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setEstatusSorte(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setRange2(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setRange3(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setScale(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setRace(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setElement(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setMode(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setSpeed(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setAdelay(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setAMotion(Integer.parseInt(Partes[c++]));
                        getSpawnPorOrdem(getContSpawns()-1).setDMotion(Integer.parseInt(Partes[c++]));

                        for(int d=29;d<=46;d+=2){
                            try{
                                if(Integer.parseInt(Partes[d+0])>0){
                                    getSpawnPorOrdem(getContSpawns()-1).addDrop(
                                        Integer.parseInt(Partes[d+0]),
                                        Integer.parseInt(Partes[d+1])
                                    );
                                }
                            }catch(NumberFormatException ex){ }
                        }
                    }
                }
            }
        }
    }
    public int getContSpawns(){
        if(Spawns != null){
            return Spawns.length;
        }else{
            return 0;
        }
    }
    public Vector getVectorIDs(){
        Vector IDs = new Vector();
        for(int v=0;v<getContSpawns();v++){
            IDs.addElement(getSpawnPorOrdem(v).getID());
        }
        return IDs;
    }
    public Dados_Spawns getSpawnPorOrdem(int ordem){
        if(Spawns != null){
            return Spawns[ordem];
        }else{
            return null;
        }
    }
    public Dados_Spawns getSpawnPorID(int ID){
        if(Spawns != null){
            for(int ordem=0;ordem<Spawns.length;ordem++){
                if(Spawns[ordem].getID()==ID){
                    return Spawns[ordem];
                }
            }
        }
        return null;
    }
    public void addSpawn(int ID, String NomeSumonico, String NameTitulo){
        if(Spawns != null){
            Dados_Spawns novosSpawns[] = new Dados_Spawns[Spawns.length+1];
            for(int b=0;b<Spawns.length;b++){
                novosSpawns[b]=getSpawnPorOrdem(b);
            }
            novosSpawns[Spawns.length] = new Dados_Spawns(ID, NomeSumonico, NameTitulo);
            Spawns = novosSpawns;
        }else{
            Dados_Spawns novosSpawns[] = new Dados_Spawns[1];
            novosSpawns[0] = new Dados_Spawns(ID, NomeSumonico, NameTitulo);
            Spawns = novosSpawns;
        }
    }

    public class Dados_Spawns {
        public Dados_Spawns(int novoID, String novoNomeSumonico, String novoNameTitulo){
            ID=novoID;
            NomeSumonico=novoNomeSumonico;
            NameTitulo=novoNameTitulo;
        }

        //######### mobTXT #####################################################################
        private int ID=0;
        private String NomeSumonico="", NameTitulo="";
        private int N�vel=0, HP=0, SP=0,Exp=0, Job=0, Range1=0, Ataque1=0, Ataque2=0, DefesaFisica=0, DefesaMagica=0;
        private int Stt_STR=0, Stt_AGI=0, Stt_VIT=0, Stt_INT=0, Stt_DEX=0, Stt_LUK=0;
        private int Range2=0, Range3=0, Scale=0, Race=0, Element=0, Mode=0, Speed=0, Adelay=0;
        private int AMotion=0, DMotion=0; //Motion(Movimento de Anima��o), DMotion(MovimrntoDeDano)

        //######### mobXML #####################################################################
        private String targetCursor="";
        //######################################################################################

        private Banco_Drops Drops[]=null;

        public int getID(){return ID;}
        public String getNomeSumonico(){return NomeSumonico;}
        public String getNomeTitulo(){return NameTitulo;}
        public int getNivel(){return N�vel;}
        public int getHP(){return HP;}
        public int getSP(){return SP;}
        public int getExp(){return Exp;}
        public int getJob(){return Job;}
        public int getRange1(){return Range1;}
        public int getAtaque1(){return Ataque1;}
        public int getAtaque2(){return Ataque2;}
        public int getDefesaFisica(){return DefesaFisica;}
        public int getDefesaMagica(){return DefesaMagica;}
        public int getEstatusForca(){return Stt_STR;}
        public int getEstatusAgilidade(){return Stt_AGI;}
        public int getEstatusVitalidade(){return Stt_VIT;}
        public int getEstatusInteligencias(){return Stt_INT;}
        public int getEstatusDestresa(){return Stt_DEX;}
        public int getEstatusSorte(){return Stt_LUK;}
        public int getRange2(){return Range2;}
        public int getRange3(){return Range3;}
        public int getScale(){return Scale;}
        public int getRace(){return Race;}
        public int getElement(){return Element;}
        public int getMode(){return Mode;}
        public int getSpeed(){return Speed;}
        public int getAdelay(){return Adelay;}
        public int getAMotion(){return AMotion;}
        public int getDMotion(){return DMotion;}

        public void setID(int novoID){ID=novoID;}
        public void setNomeSumonico(String novoNomeSumonico){NomeSumonico=novoNomeSumonico;}
        public void setNameTitulo(String novoNameTitulo){NameTitulo=novoNameTitulo;}
        public void setNivel(int novoN�vel){N�vel=novoN�vel;}
        public void setHP(int novoHP){HP=novoHP;}
        public void setSP(int novoSP){SP=novoSP;}
        public void setExp(int novoExp){Exp=novoExp;}
        public void setJob(int novoJob){Job=novoJob;}
        public void setRange1(int novoRange1){Range1=novoRange1;}
        public void setAtaque1(int novoAtaque1){Ataque1=novoAtaque1;}
        public void setAtaque2(int novoAtaque2){Ataque2=novoAtaque2;}
        public void setDefesaFisica(int novoDefesaFisica){DefesaFisica=novoDefesaFisica;}
        public void setDefesaMagica(int novoDefesaMagica){DefesaMagica=novoDefesaMagica;}
        public void setEstatusForca(int novoStt_STR){Stt_STR=novoStt_STR;}
        public void setEstatusAgilidade(int novoStt_AGI){Stt_AGI=novoStt_AGI;}
        public void setEstatusVitalidade(int novoStt_VIT){Stt_VIT=novoStt_VIT;}
        public void setEstatusInteligencia(int novoStt_STR){Stt_STR=novoStt_STR;}
        public void setEstatusDestresa(int novoStt_DEX){Stt_DEX=novoStt_DEX;}
        public void setEstatusSorte(int novoStt_LUK){Stt_LUK=novoStt_LUK;}
        public void setRange2(int novoRange2){Range2=novoRange2;}
        public void setRange3(int novoRange3){Range3=novoRange3;}
        public void setScale(int novoScale){Scale=novoScale;}
        public void setRace(int novoRace){Race=novoRace;}
        public void setElement(int novoElement){Element=novoElement;}
        public void setMode(int novoMode){Mode=novoMode;}
        public void setSpeed(int novoSpeed){Speed=novoSpeed;}
        public void setAdelay(int novoAdelay){Adelay=novoAdelay;}
        public void setAMotion(int novoAMotion){AMotion=novoAMotion;}
        public void setDMotion(int novoDMotion){DMotion=novoDMotion;}

        public int getContDrops(){
            if(Drops != null){
                return Drops.length;
            }else{
                return 0;
            }
        }
        public Banco_Drops getDropPorOrdem(int ordem){
            if(Drops != null){
                return Drops[ordem];
            }else{
                return null;
            }
        }
        public void addDrop(int novoIDitem, int novoPercentual){
            if(Drops != null){
                Banco_Drops novosDrops[] = new Banco_Drops[Drops.length+1];
                for(int b=0;b<Drops.length;b++){
                    novosDrops[b]=getDropPorOrdem(b);
                }
                novosDrops[Drops.length] = new Banco_Drops(novoIDitem, novoPercentual);
                Drops = novosDrops;
            }else{
                Banco_Drops novosDrops[] = new Banco_Drops[1];
                novosDrops[0] = new Banco_Drops(novoIDitem, novoPercentual);
                Drops = novosDrops;
            }
        }
        public class Banco_Drops {
            public Banco_Drops(int novoID, int novoPercentual) {
                id=novoID;
                percentual=novoPercentual;
            }
            private int id=0;
            private int percentual=0;
            public int getID(){return id;}
            public int getpercentual(){return percentual;}
            public void setID(int novoID){id=novoID;}
            public void setPercentual(int novoPercentual){percentual=novoPercentual;}
        }
    }
}