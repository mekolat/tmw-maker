package Formularios;

import classes.FileClass;
import Classes.ImagemClass;
import Classes.SpritePNG;
import Classes.SpriteXML;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FrmEquipXmlNovo extends javax.swing.JDialog {
    public FrmEquipXmlNovo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    String Barra = System.getProperty("file.separator");
    //String PastaDeSprites="/home/indigovox/localhost/tmwdata/graphics/sprites/";
    String PastaDeSprites=FrmPrincipal.Config.getConexaoLocalhost()+Barra+"tmwdata"+Barra+"graphics"+Barra+"sprites"+Barra;
    String Endereco="";
    SpritePNG Sprite=null;

    private void setComoGeral(){
        FrmPrincipal.xmlEditada.addAcao("stand");
        FrmPrincipal.xmlEditada.getAcao("stand").addAnimacao("down");
        FrmPrincipal.xmlEditada.getAcao("stand").getAnimacao("down").addFrame(0,0,0,0);
        FrmPrincipal.xmlEditada.getAcao("stand").addAnimacao("left");
        FrmPrincipal.xmlEditada.getAcao("stand").getAnimacao("left").addFrame(18,0,0,0);
        FrmPrincipal.xmlEditada.getAcao("stand").addAnimacao("up");
        FrmPrincipal.xmlEditada.getAcao("stand").getAnimacao("up").addFrame(36,0,0,0);
        FrmPrincipal.xmlEditada.getAcao("stand").addAnimacao("right");
        FrmPrincipal.xmlEditada.getAcao("stand").getAnimacao("right").addFrame(64,0,0,0);

        FrmPrincipal.xmlEditada.addAcao("walk");
        FrmPrincipal.xmlEditada.getAcao("walk").addAnimacao("down");
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("down").addSequencia(1, 6, 0, 0, 75);
        FrmPrincipal.xmlEditada.getAcao("walk").addAnimacao("left");
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("left").addSequencia(19, 24, 0, 0, 75);
        FrmPrincipal.xmlEditada.getAcao("walk").addAnimacao("up");
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("up").addSequencia(37, 42, 0, 0, 75);
        FrmPrincipal.xmlEditada.getAcao("walk").addAnimacao("right");
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("right").addSequencia(55, 60, 0, 0, 75);

        FrmPrincipal.xmlEditada.addAcao("sit");
        FrmPrincipal.xmlEditada.getAcao("sit").addAnimacao("down");
        FrmPrincipal.xmlEditada.getAcao("sit").getAnimacao("down").addFrame(7,0,0,0);
        FrmPrincipal.xmlEditada.getAcao("sit").addAnimacao("left");
        FrmPrincipal.xmlEditada.getAcao("sit").getAnimacao("left").addFrame(25,0,0,0);
        FrmPrincipal.xmlEditada.getAcao("sit").addAnimacao("up");
        FrmPrincipal.xmlEditada.getAcao("sit").getAnimacao("up").addFrame(43,0,0,0);
        FrmPrincipal.xmlEditada.getAcao("sit").addAnimacao("right");
        FrmPrincipal.xmlEditada.getAcao("sit").getAnimacao("right").addFrame(61,0,0,0);

        FrmPrincipal.xmlEditada.addAcao("dead");
        FrmPrincipal.xmlEditada.getAcao("dead").addAnimacao("down");
        FrmPrincipal.xmlEditada.getAcao("dead").getAnimacao("down").addFrame(8,0,0,0);
        FrmPrincipal.xmlEditada.getAcao("dead").addAnimacao("left");
        FrmPrincipal.xmlEditada.getAcao("dead").getAnimacao("left").addFrame(26,0,0,0);
        FrmPrincipal.xmlEditada.getAcao("dead").addAnimacao("up");
        FrmPrincipal.xmlEditada.getAcao("dead").getAnimacao("up").addFrame(44,0,0,0);
        FrmPrincipal.xmlEditada.getAcao("dead").addAnimacao("right");
        FrmPrincipal.xmlEditada.getAcao("dead").getAnimacao("right").addFrame(62,0,0,0);

        FrmPrincipal.xmlEditada.addAcao("attack");
        FrmPrincipal.xmlEditada.getAcao("attack").addAnimacao("down");
        FrmPrincipal.xmlEditada.getAcao("attack").getAnimacao("down").addSequencia(9, 12, 0, 0, 75);
        FrmPrincipal.xmlEditada.getAcao("attack").addAnimacao("left");
        FrmPrincipal.xmlEditada.getAcao("attack").getAnimacao("left").addSequencia(27, 30, 0, 0, 75);
        FrmPrincipal.xmlEditada.getAcao("attack").addAnimacao("up");
        FrmPrincipal.xmlEditada.getAcao("attack").getAnimacao("up").addSequencia(45, 48, 0, 0, 75);
        FrmPrincipal.xmlEditada.getAcao("attack").addAnimacao("right");
        FrmPrincipal.xmlEditada.getAcao("attack").getAnimacao("right").addSequencia(63, 66, 0, 0, 75);

        FrmPrincipal.xmlEditada.addAcao("attack_bow");
        FrmPrincipal.xmlEditada.getAcao("attack_bow").addAnimacao("down");
        FrmPrincipal.xmlEditada.getAcao("attack_bow").getAnimacao("down").addSequencia(13, 17, 0, 0, 75);
        FrmPrincipal.xmlEditada.getAcao("attack_bow").addAnimacao("left");
        FrmPrincipal.xmlEditada.getAcao("attack_bow").getAnimacao("left").addSequencia(31, 35, 0, 0, 75);
        FrmPrincipal.xmlEditada.getAcao("attack_bow").addAnimacao("up");
        FrmPrincipal.xmlEditada.getAcao("attack_bow").getAnimacao("up").addSequencia(49, 53, 0, 0, 75);
        FrmPrincipal.xmlEditada.getAcao("attack_bow").addAnimacao("right");
        FrmPrincipal.xmlEditada.getAcao("attack_bow").getAnimacao("right").addSequencia(67, 71, 0, 0, 75);

    }
    private void setComoHead(){
        FrmPrincipal.xmlEditada.addAcao("stand");
        FrmPrincipal.xmlEditada.getAcao("stand").addAnimacao("down");
        FrmPrincipal.xmlEditada.getAcao("stand").getAnimacao("down").addFrame(0,0,-45,0);
        FrmPrincipal.xmlEditada.getAcao("stand").addAnimacao("left");
        FrmPrincipal.xmlEditada.getAcao("stand").getAnimacao("left").addFrame(1,-2,-45,0);
        FrmPrincipal.xmlEditada.getAcao("stand").addAnimacao("up");
        FrmPrincipal.xmlEditada.getAcao("stand").getAnimacao("up").addFrame(2,-2,-45,0);
        FrmPrincipal.xmlEditada.getAcao("stand").addAnimacao("right");
        FrmPrincipal.xmlEditada.getAcao("stand").getAnimacao("right").addFrame(3,2,-45,0);

        FrmPrincipal.xmlEditada.addAcao("walk");
        FrmPrincipal.xmlEditada.getAcao("walk").addAnimacao("down");
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("down").addFrame(0,0,-44,75);
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("down").addFrame(0,0,-45,75);
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("down").addFrame(0,0,-45,75);
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("down").addFrame(0,0,-44,75);
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("down").addFrame(0,0,-45,75);
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("down").addFrame(0,0,-45,75);
        FrmPrincipal.xmlEditada.getAcao("walk").addAnimacao("left");
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("left").addFrame(1,-2,-45,75);
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("left").addFrame(1,-2,-44,75);
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("left").addFrame(1,-2,-45,75);
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("left").addFrame(1,-2,-45,75);
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("left").addFrame(1,-2,-44,75);
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("left").addFrame(1,-2,-45,75);
        FrmPrincipal.xmlEditada.getAcao("walk").addAnimacao("up");
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("up").addFrame(2,-2,-45,75);
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("up").addFrame(2,-2,-46,75);
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("up").addFrame(2,-2,-46,75);
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("up").addFrame(2,-2,-45,75);
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("up").addFrame(2,-2,-46,75);
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("up").addFrame(2,-2,-46,75);
        FrmPrincipal.xmlEditada.getAcao("walk").addAnimacao("right");
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("right").addFrame(3,2,-45,75);
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("right").addFrame(3,2,-44,75);
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("right").addFrame(3,2,-45,75);
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("right").addFrame(3,2,-45,75);
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("right").addFrame(3,2,-44,75);
        FrmPrincipal.xmlEditada.getAcao("walk").getAnimacao("right").addFrame(3,2,-45,75);
    }
    private void CarregarSpritesPNG(){
        CarregarSpritesPNG("player_male_base.png");
    }
    private void CarregarSpritesPNG(String Focar){
        if(FileClass.seExiste(PastaDeSprites)){
            String[] Arquivos = FileClass.listarArquivos(PastaDeSprites);
            //setTitle(""+Arquivos.length);
            if(Arquivos.length>=1){

                String AgrupamentoDeArquivos[] = new String[Arquivos.length];
                int ContArquivos=0;
                for(int a=0;a<Arquivos.length;a++){
                    if(
                        Arquivos[a].substring(Arquivos[a].length()-4, Arquivos[a].length()).equals(".png") &&
                        !Arquivos[a].equals("emotions.png") &&
                        Arquivos[a].indexOf("npc-")!=0 &&
                        Arquivos[a].indexOf("npcs")!=0 &&
                        Arquivos[a].indexOf("icon-")!=0 &&
                        Arquivos[a].indexOf("generic-")!=0 &&
                        Arquivos[a].indexOf("resource-")!=0 &&
                        Arquivos[a].indexOf("hairstyle")!=0 &&
                        Arquivos[a].indexOf("monster-")!=0 &&
                        Arquivos[a].indexOf("monstro-")!=0 &&
                        Arquivos[a].indexOf("player_")!=0
                    ){
                        ContArquivos++;
                        AgrupamentoDeArquivos[ContArquivos-1]=Arquivos[a];
                    }
                }
                Object[] CapsulaDeArquivos= new java.lang.Object[ContArquivos];
                int Selecionado = -1;
                for(int a=0; a<ContArquivos; a++){
                    CapsulaDeArquivos[a]=AgrupamentoDeArquivos[a];
                    if(CapsulaDeArquivos[a].equals(Focar)) Selecionado=a;
                }
                if(ContArquivos>=1){
                    CmbEndereco.setModel(new DefaultComboBoxModel(CapsulaDeArquivos));
                    if(Selecionado>=0) CmbEndereco.setSelectedIndex(Selecionado);
                }
            }
        }
    }
    public void AbrirSprite(){
        String Arquivo=CmbEndereco.getItemAt(CmbEndereco.getSelectedIndex()).toString();
        Endereco=PastaDeSprites+Arquivo;
        if(FileClass.seExiste(Endereco)){
            
            String Tipo[]=new String[]{
                "chest-",
                "feet-boots-",
                "hands-",
                "head-",
                "resource-",
                "leg-",
                "weapon",/*
                "monster-",
                "monstro-",/**/
                "npc",
                "pet-",
                "hairstyle"/*,
                "player_"/**/
            };

            try{
                int T=-1;
                T++; if(Arquivo.substring(0,Arquivo.length()<Tipo[T].length()?Arquivo.length():Tipo[T].length()).equals(Tipo[T])) setDimencao(8,9);
                T++; if(Arquivo.substring(0,Arquivo.length()<Tipo[T].length()?Arquivo.length():Tipo[T].length()).equals(Tipo[T])) setDimencao(8,9);
                T++; if(Arquivo.substring(0,Arquivo.length()<Tipo[T].length()?Arquivo.length():Tipo[T].length()).equals(Tipo[T])) setDimencao(8,9);
                T++; if(Arquivo.substring(0,Arquivo.length()<Tipo[T].length()?Arquivo.length():Tipo[T].length()).equals(Tipo[T])) setDimencao(1,5);
                T++; if(Arquivo.substring(0,Arquivo.length()<Tipo[T].length()?Arquivo.length():Tipo[T].length()).equals(Tipo[T])) setDimencao(1,2);
                T++; if(Arquivo.substring(0,Arquivo.length()<Tipo[T].length()?Arquivo.length():Tipo[T].length()).equals(Tipo[T])) setDimencao(8,9);
                T++; if(Arquivo.substring(0,Arquivo.length()<Tipo[T].length()?Arquivo.length():Tipo[T].length()).equals(Tipo[T])) setDimencao(8,9);
                //T++; if(Arquivo.substring(0,Arquivo.length()<Tipo[T].length()?Arquivo.length():Tipo[T].length()).equals(Tipo[T])) setDimencao(4,10);
                //T++; if(Arquivo.substring(0,Arquivo.length()<Tipo[T].length()?Arquivo.length():Tipo[T].length()).equals(Tipo[T])) setDimencao(4,10);
                T++; if(Arquivo.substring(0,Arquivo.length()<Tipo[T].length()?Arquivo.length():Tipo[T].length()).equals(Tipo[T])) setDimencao(6,14);
                T++; if(Arquivo.substring(0,Arquivo.length()<Tipo[T].length()?Arquivo.length():Tipo[T].length()).equals(Tipo[T])) setDimencao(5,9);
                T++; if(Arquivo.substring(0,Arquivo.length()<Tipo[T].length()?Arquivo.length():Tipo[T].length()).equals(Tipo[T])) setDimencao(1,9);
                //T++; if(Arquivo.substring(0,Arquivo.length()<Tipo[T].length()?Arquivo.length():Tipo[T].length()).equals(Tipo[T])) setDimencao(8,9);
            }catch(StringIndexOutOfBoundsException E){

            }/**/

            Sprite = new SpritePNG(
                Endereco,
                Integer.parseInt(SpnLinhas.getValue().toString()),
                Integer.parseInt(SpnColunas.getValue().toString())
            );
        }
    }
    public void ExibirBloco(){
        if(Sprite instanceof SpritePNG){
            Sprite.setSpriteLinhas(Integer.parseInt(SpnLinhas.getValue().toString()));
            Sprite.setSpriteColunas(Integer.parseInt(SpnColunas.getValue().toString()));
            SldLinha.setValue(SldLinha.getValue()<=Sprite.getSpriteLinhas()-1?SldLinha.getValue():Sprite.getSpriteLinhas()-1);
            SldColuna.setValue(SldColuna.getValue()<=Sprite.getSpriteColunas()-1?SldColuna.getValue():Sprite.getSpriteColunas()-1);
            if(Sprite.getBlocoLargura()>=1 && Sprite.getBlocoAltura()>=1){
                SldLinha.setMaximum(Sprite.getSpriteLinhas()-1);
                SldColuna.setMaximum(Sprite.getSpriteColunas()-1);
                TxtLargura.setText(Sprite.getBlocoLargura()+"/"+Sprite.getSpriteLargura()+"px");
                TxtAltura.setText(Sprite.getBlocoAltura()+"/"+Sprite.getSpriteAltura()+"px");
                LblLinha.setText("Linha: "+SldLinha.getValue());
                LblColuna.setText("Coluna: "+SldColuna.getValue());
                ImagemClass ImgBloco = new ImagemClass(Sprite.getBloco((Sprite.getSpriteColunas()*SldLinha.getValue())+SldColuna.getValue()));
                //if(ImgBloco.getAltura()<90)
                ImgBloco.setZoom(128/(double)ImgBloco.getAltura());
                if(ImgBloco.getLargura()>=PnlBloco.getWidth()){
                    ImgBloco.setZoom(PnlBloco.getWidth()/(double)ImgBloco.getLargura());
                }

                /*SpritePNG SpriteChar = new SpritePNG("/home/indigovox/localhost/tmwdata/graphics/sprites/player_male_base.png",8,9);
                ImagemClass BlocoMesclado = new ImagemClass(SpriteChar.getBloco(numBloco));
                BlocoMesclado.setMesclagem(ImgBloco.getImage(),12,-7);
                LblBloco.setIcon(new ImageIcon(BlocoMesclado.getImage()));/**/

                LblBloco.setIcon(new ImageIcon(ImgBloco.getImage()));
                LblBloco.setToolTipText(
                    "<html><center>"
                    +"<img src=\"file://"+Endereco+"\"><br/>"
                    +"<big><b>Sprite:</b> "+Sprite.getSpriteLargura()+"x"+Sprite.getSpriteAltura()+"px"
                );/**/
            }
            SldLinha.setEnabled(Sprite.getSpriteLinhas()>=2);
            SldColuna.setEnabled(Sprite.getSpriteColunas()>=2);
        }
    }
    public void setDimencao(int Linhas, int Colunas){
        SpnLinhas.setModel(new javax.swing.SpinnerNumberModel(Linhas, 1, 30, 1));
        SpnColunas.setModel(new javax.swing.SpinnerNumberModel(Colunas, 1, 30, 1));
        SldLinha.setValue(0);
        SldLinha.setValue(0);
        //setTitle("Linhas:"+Linhas+" Colunas:"+Colunas);
        ExibirBloco();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrpTipoDeEquipamento = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        BtnImportar = new javax.swing.JButton();
        PnlBloco = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TxtLargura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SpnColunas = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        TxtAltura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        SpnLinhas = new javax.swing.JSpinner();
        SldLinha = new javax.swing.JSlider();
        SldColuna = new javax.swing.JSlider();
        LblColuna = new javax.swing.JLabel();
        LblLinha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BtnCriar = new javax.swing.JButton();
        BtnFechar = new javax.swing.JButton();
        CmbEndereco = new javax.swing.JComboBox();
        LblBloco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo XML de Equipamento");
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        BtnImportar.setText("Importar");
        BtnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnImportarActionPerformed(evt);
            }
        });

        PnlBloco.setBorder(javax.swing.BorderFactory.createTitledBorder("Bloco"));

        jLabel2.setText("Largura:");

        TxtLargura.setEditable(false);
        TxtLargura.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtLargura.setText("999/999px");
        TxtLargura.setOpaque(false);

        jLabel3.setText("Colunas:");

        SpnColunas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        SpnColunas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpnColunasStateChanged(evt);
            }
        });

        jLabel4.setText("Altura:");

        TxtAltura.setEditable(false);
        TxtAltura.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtAltura.setText("999/999px");
        TxtAltura.setOpaque(false);

        jLabel5.setText("Linhas:");

        SpnLinhas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        SpnLinhas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpnLinhasStateChanged(evt);
            }
        });

        SldLinha.setMaximum(8);
        SldLinha.setMinorTickSpacing(1);
        SldLinha.setValue(0);
        SldLinha.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SldLinhaStateChanged(evt);
            }
        });

        SldColuna.setMaximum(9);
        SldColuna.setMinorTickSpacing(1);
        SldColuna.setValue(0);
        SldColuna.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SldColunaStateChanged(evt);
            }
        });

        LblColuna.setText("Coluna: 9");

        LblLinha.setText("Linha: 6");

        javax.swing.GroupLayout PnlBlocoLayout = new javax.swing.GroupLayout(PnlBloco);
        PnlBloco.setLayout(PnlBlocoLayout);
        PnlBlocoLayout.setHorizontalGroup(
            PnlBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlBlocoLayout.createSequentialGroup()
                .addGroup(PnlBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PnlBlocoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlBlocoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtAltura)))
                .addGap(12, 12, 12)
                .addGroup(PnlBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SpnLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpnColunas, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(PnlBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SldLinha, 0, 0, Short.MAX_VALUE)
                    .addComponent(SldColuna, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblColuna)
                    .addComponent(LblLinha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlBlocoLayout.setVerticalGroup(
            PnlBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBlocoLayout.createSequentialGroup()
                .addGroup(PnlBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblColuna, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SldColuna, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpnColunas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SldLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpnLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Sprite:");

        BtnCriar.setMnemonic('C');
        BtnCriar.setText("Criar");
        BtnCriar.setEnabled(false);
        BtnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCriarActionPerformed(evt);
            }
        });

        BtnFechar.setMnemonic('F');
        BtnFechar.setText("Fechar");
        BtnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFecharActionPerformed(evt);
            }
        });

        CmbEndereco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "player_male_base.png", "player_female_base.png" }));
        CmbEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbEnderecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(CmbEndereco, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(BtnImportar))
                .addComponent(PnlBloco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(BtnCriar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnFechar))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtnCriar, BtnFechar});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(BtnImportar)
                    .addComponent(jLabel1)
                    .addComponent(CmbEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnFechar)
                    .addComponent(BtnCriar)))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BtnCriar, BtnFechar});

        LblBloco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Fundos/BlocoDoSprite.png"))); // NOI18N
        LblBloco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LblBloco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblBlocoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(LblBloco)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblBloco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        CarregarSpritesPNG();
        AbrirSprite();
        ExibirBloco();
    }//GEN-LAST:event_formWindowOpened
    private void BtnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_BtnFecharActionPerformed
    private void SpnColunasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpnColunasStateChanged
        //Sprite.setSpriteColunas(Integer.parseInt(SpnColunas.getValue().toString()));
        ExibirBloco();
    }//GEN-LAST:event_SpnColunasStateChanged
    private void SpnLinhasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpnLinhasStateChanged
        //Sprite.setSpriteLinhas(Integer.parseInt(SpnLinhas.getValue().toString()));
        ExibirBloco();
    }//GEN-LAST:event_SpnLinhasStateChanged
    private void SldColunaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SldColunaStateChanged
        ExibirBloco();
    }//GEN-LAST:event_SldColunaStateChanged
    private void SldLinhaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SldLinhaStateChanged
        ExibirBloco();
    }//GEN-LAST:event_SldLinhaStateChanged
    private void CmbEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbEnderecoActionPerformed
        AbrirSprite();
        ExibirBloco();
}//GEN-LAST:event_CmbEnderecoActionPerformed
    private void LblBlocoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblBlocoMouseClicked
        AbrirSprite();
        ExibirBloco();
    }//GEN-LAST:event_LblBlocoMouseClicked
    private void BtnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnImportarActionPerformed
        /**
         * Material Pesquisado em:
         * http://java.sun.com/docs/books/tutorial/uiswing/components/filechooser.html
         * http://www.koders.com/java/fid3C76E6EFEBC0827517FB14397E0D8E9E5126DD92.aspx
         */

        //Handle open button action.
        //evt.getSource() == openButton
        //Create a file chooser
        final JFileChooser Dialogo = new JFileChooser();
        Dialogo.setFileFilter(new FileNameExtensionFilter("Arquivo PNG", "png"));
        //Dialogo.addChoosableFileFilter(new FileNameExtensionFilter("Arquivo JPG", "jpg"));
        Dialogo.setAcceptAllFileFilterUsed(false);

        int Teste = Dialogo.showOpenDialog(this);
        if (Teste == JFileChooser.APPROVE_OPTION) {
            //File Arquivo = Dialogo.getSelectedFile();
            /*This is where a real application would open the file.
            log.append("Opening: " + file.getName() + "." + newline);/**/
            FileClass.arquivoCopiar(
                Dialogo.getSelectedFile(),
                PastaDeSprites+FrmPrincipal.barra+Dialogo.getSelectedFile().getName()
            );
            CarregarSpritesPNG(Dialogo.getSelectedFile().getName());
            FrmPrincipal.setAvisoEmEstatus("Imagem \""+Dialogo.getSelectedFile().getName()+"\" copiado para banco de Sprites!");
        } else {
            //log.append("Open command cancelled by user." + newline);
        }


    }//GEN-LAST:event_BtnImportarActionPerformed
    private void BtnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCriarActionPerformed
        String Arquivo=CmbEndereco.getItemAt(CmbEndereco.getSelectedIndex()).toString();

        FrmPrincipal.xmlEditada = new SpriteXML("base", Sprite);
        if(Arquivo.indexOf("head-")==0) setComoHead();
        else setComoGeral();

        setTitle("A��es = "+FrmPrincipal.xmlEditada.getContAcoes());
    }//GEN-LAST:event_BtnCriarActionPerformed
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmEquipXmlNovo dialog = new FrmEquipXmlNovo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCriar;
    private javax.swing.JButton BtnFechar;
    private javax.swing.JButton BtnImportar;
    private javax.swing.JComboBox CmbEndereco;
    private javax.swing.ButtonGroup GrpTipoDeEquipamento;
    private javax.swing.JLabel LblBloco;
    private javax.swing.JLabel LblColuna;
    private javax.swing.JLabel LblLinha;
    private javax.swing.JPanel PnlBloco;
    private javax.swing.JSlider SldColuna;
    private javax.swing.JSlider SldLinha;
    private javax.swing.JSpinner SpnColunas;
    private javax.swing.JSpinner SpnLinhas;
    private javax.swing.JTextField TxtAltura;
    private javax.swing.JTextField TxtLargura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

}
