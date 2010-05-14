
package Formularios;

import Classes.BlocoDeScript;
import Classes.ConfigClass;
import java.lang.Object;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.text.BadLocationException;

public class FrmNovoBloco extends javax.swing.JDialog {
    public FrmNovoBloco(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TbpTipoDeBloco = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtNovoBlocoScriptNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtNovoBlocoScriptMapa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SpnNovoBlocoScriptCoordX = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        SpnNovoBlocoScriptCoordY = new javax.swing.JSpinner();
        CmbNovoBlocoScriptImagem = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SpnNovoBlocoScriptGatilhoLargura = new javax.swing.JSpinner();
        SpnNovoBlocoScriptGatilhoAltura = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtNovoBlocoScriptUtilidade = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        TxtNovoBlocoFuncaoNome = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtNovoBlocoFunctionUtilidade = new javax.swing.JTextArea();
        BtnFechar = new javax.swing.JButton();
        BtnAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Bloco de Script");
        setResizable(false);

        jLabel1.setText("Nome:");

        TxtNovoBlocoScriptNome.setText("Fulano");

        jLabel2.setText("Mapa:");

        TxtNovoBlocoScriptMapa.setText("001");

        jLabel4.setText("Coord. X:");

        SpnNovoBlocoScriptCoordX.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(100), Integer.valueOf(0), null, Integer.valueOf(1)));

        jLabel5.setText("Coord. Y:");

        SpnNovoBlocoScriptCoordY.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(100), Integer.valueOf(0), null, Integer.valueOf(1)));

        CmbNovoBlocoScriptImagem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N�o (Script Intang�vel)", "048 (npc.xml?img=61)", "049 (npc.xml?img=49)", "100 (npc.xml?img=0)", "101 (npc.xml?img=1)", "102 (npc.xml?img=2)", "103 (npc.xml?img=3)", " " }));
        CmbNovoBlocoScriptImagem.setSelectedIndex(1);

        jLabel6.setText("Imagem:");

        jLabel7.setText("Larg. Gatilho:");

        jLabel8.setText("Altu. Gatilho:");

        SpnNovoBlocoScriptGatilhoLargura.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(-1), null, Integer.valueOf(1)));

        SpnNovoBlocoScriptGatilhoAltura.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(-1), null, Integer.valueOf(1)));

        jLabel9.setText(".gat");

        TxtNovoBlocoScriptUtilidade.setColumns(20);
        TxtNovoBlocoScriptUtilidade.setRows(5);
        TxtNovoBlocoScriptUtilidade.setText("Pegar� XXX itens e YYYY de GP (dinheiro).\nDar� um item Z.");
        jScrollPane2.setViewportView(TxtNovoBlocoScriptUtilidade);

        jLabel13.setText("Descri��o da Utilidade:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CmbNovoBlocoScriptImagem, 0, 218, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SpnNovoBlocoScriptGatilhoLargura, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(SpnNovoBlocoScriptCoordX, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(TxtNovoBlocoScriptMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8))
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SpnNovoBlocoScriptGatilhoAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                            .addComponent(SpnNovoBlocoScriptCoordY, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))))
                            .addComponent(TxtNovoBlocoScriptNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {SpnNovoBlocoScriptCoordX, SpnNovoBlocoScriptCoordY, SpnNovoBlocoScriptGatilhoAltura, SpnNovoBlocoScriptGatilhoLargura, TxtNovoBlocoScriptMapa});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNovoBlocoScriptNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNovoBlocoScriptMapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(SpnNovoBlocoScriptCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpnNovoBlocoScriptCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpnNovoBlocoScriptGatilhoLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(SpnNovoBlocoScriptGatilhoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmbNovoBlocoScriptImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {SpnNovoBlocoScriptCoordX, SpnNovoBlocoScriptCoordY, SpnNovoBlocoScriptGatilhoAltura, SpnNovoBlocoScriptGatilhoLargura, TxtNovoBlocoScriptMapa, jLabel2, jLabel4, jLabel5, jLabel7, jLabel8, jLabel9});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CmbNovoBlocoScriptImagem, jLabel6});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {TxtNovoBlocoScriptNome, jLabel1});

        TbpTipoDeBloco.addTab("Script", jPanel1);

        jLabel11.setText("Chamada:");

        TxtNovoBlocoFuncaoNome.setText("ExemploDeFuncao");

        jLabel12.setText("Descri��o da Utilidade:");

        TxtNovoBlocoFunctionUtilidade.setColumns(20);
        TxtNovoBlocoFunctionUtilidade.setRows(5);
        TxtNovoBlocoFunctionUtilidade.setText("Coletar dados de par�metros 1, 2 ... X,\ne retornar resultado na veri�vel Y.");
        jScrollPane1.setViewportView(TxtNovoBlocoFunctionUtilidade);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNovoBlocoFuncaoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxtNovoBlocoFuncaoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        TbpTipoDeBloco.addTab("Fun��o", jPanel2);

        BtnFechar.setMnemonic('F');
        BtnFechar.setText("Fechar");
        BtnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFecharActionPerformed(evt);
            }
        });

        BtnAdicionar.setMnemonic('A');
        BtnAdicionar.setText("Adicionar");
        BtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnFechar))
                    .addComponent(TbpTipoDeBloco, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtnAdicionar, BtnFechar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TbpTipoDeBloco, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnFechar)
                    .addComponent(BtnAdicionar))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BtnAdicionar, BtnFechar});

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void BtnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_BtnFecharActionPerformed
    private void BtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdicionarActionPerformed
        if(TbpTipoDeBloco.getSelectedIndex()==0){
            String ImagemTXT = CmbNovoBlocoScriptImagem.getItemAt(CmbNovoBlocoScriptImagem.getSelectedIndex()).toString();
            String Partes[] = ImagemTXT.split(" ");
            int ImagemInt = (int)Integer.parseInt(Partes[0]);

            int newSize=0;
            try{
                newSize = FrmPalco.Instancia.length + 1;
            } catch (Exception Er){
                newSize=1;
            }

            BlocoDeScript[] NovoInstancia = new BlocoDeScript[newSize];
            int i=0;
            Object[] Titulo= new java.lang.Object[newSize];
            if(newSize >= 2){
                for (i = 0; i<(newSize-1); i++) {
                    NovoInstancia[i] = FrmPalco.Instancia[i];
                    Titulo[i] = new Object();
                    Titulo[i] = (i+1) + "� " + FrmPalco.Instancia[i].getNome() + " (" + FrmPalco.Instancia[i].getMapa() + ":" + FrmPalco.Instancia[i].getX() + "," + FrmPalco.Instancia[i].getY() + ")";
                     Titulo[i] = "<html><font color=\"#888888\">"+(i+1) + "� </font>" +
                        ""+FrmPalco.Instancia[i].getNome()+
                        " <font color=\"#888888\">"+
                            "("+FrmPalco.Instancia[i].getMapa()+":"+FrmPalco.Instancia[i].getX()+","+FrmPalco.Instancia[i].getY()+")"+
                            " [img "+FrmPalco.Instancia[i].getImagem()+":"+FrmPalco.Instancia[i].getLarguraDeGatilho()+","+FrmPalco.Instancia[i].getAlturaDeGatilho()+"]"+
                        "</font>";
                }
            }
            Titulo[i] = new Object();
            Titulo[i] = "<html><font color=\"#888888\">"+(i+1)+"� script </font> "+
                TxtNovoBlocoScriptNome.getText().toString()+" "+
                "<font color=\"#888888\">"+
                    " ("+TxtNovoBlocoScriptMapa.getText().toString()+":"+SpnNovoBlocoScriptCoordX.getValue().toString()+","+SpnNovoBlocoScriptCoordY.getValue().toString()+")"+
                    " [img "+ ImagemInt +":"+ SpnNovoBlocoScriptGatilhoLargura.getValue() +","+ SpnNovoBlocoScriptGatilhoAltura.getValue() +"]"+
                "</font>";

            
            NovoInstancia[i] = new BlocoDeScript();
            NovoInstancia[i].setTipo("script");
            NovoInstancia[i].setNome(TxtNovoBlocoScriptNome.getText().toString());
            NovoInstancia[i].setMapa(TxtNovoBlocoScriptMapa.getText().toString());
            NovoInstancia[i].setX(Integer.parseInt(SpnNovoBlocoScriptCoordX.getValue().toString()));
            NovoInstancia[i].setY(Integer.parseInt(SpnNovoBlocoScriptCoordY.getValue().toString()));
            NovoInstancia[i].setImagem(ImagemInt);
            NovoInstancia[i].setLarguraDeGatilho(Integer.parseInt(SpnNovoBlocoScriptGatilhoLargura.getValue().toString()));
            NovoInstancia[i].setAlturaDeGatilho(Integer.parseInt(SpnNovoBlocoScriptGatilhoAltura.getValue().toString()));
    
            FrmPalco.Instancia = NovoInstancia;
            

            //FrmPalco.CmbScript.setModel(model);
            FrmPalco.CmbScript.setModel(new DefaultComboBoxModel(Titulo));

            String Utilidade="";
            TxtNovoBlocoScriptUtilidade.setText(TxtNovoBlocoScriptUtilidade.getText().trim());
            if(!TxtNovoBlocoScriptUtilidade.getText().trim().equals("")){
                for(int l=0;l<TxtNovoBlocoScriptUtilidade.getLineCount();l++){
                    try {
                        Utilidade += "//    * "+
                        TxtNovoBlocoScriptUtilidade.getText().substring(
                            TxtNovoBlocoScriptUtilidade.getLineStartOffset(l),
                            TxtNovoBlocoScriptUtilidade.getLineEndOffset(l)-(l<(TxtNovoBlocoScriptUtilidade.getLineCount()-1)?1:0)
                        ) +
                        "\n";
                    } catch (BadLocationException ex) {
                        Logger.getLogger(FrmNovoBloco.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            NovoInstancia[i].setScript(
                "///////////////////////////////////////////////////////////////////\n"+
                "//  PROGRAMADOR: "+(FrmPrincipal.Config.getExecucaoParametroPersonagem().isEmpty()?"<Desconhecido>":FrmPrincipal.Config.getExecucaoParametroPersonagem())+"\n"+
                "//  ACRIA��O: "+ConfigClass.AGORAtoFORMATO("dd/MM/yyyy h:mm a")+"\n"+
                (Utilidade.equals("")?"":"//  UTILIDADE DO SCRIPT:\n"+Utilidade)+
                "///////////////////////////////////////////////////////////////////\n"+
                "_inicio:\n"+
                "\n"+
                "     //Insira seu Eathena Script aqui...\n"+
                "\n"+
                "close;"
            );
            FrmPalco.TxtScriptPalco.setText(NovoInstancia[i].getScript());
        }else if(TbpTipoDeBloco.getSelectedIndex()==1){
            int newSize=0;
            try{
                newSize = FrmPalco.Instancia.length + 1;
            } catch (Exception Er){
                newSize=1;
            }

            BlocoDeScript[] NovoInstancia = new BlocoDeScript[newSize];
            int i=0;
            Object[] Titulo= new java.lang.Object[newSize];
            if(newSize >= 2){
                for (i = 0; i<(newSize-1); i++) {
                    NovoInstancia[i] = FrmPalco.Instancia[i];
                    Titulo[i] = new Object();
                    Titulo[i] = (i+1) + "� " + FrmPalco.Instancia[i].getNome() + " (" + FrmPalco.Instancia[i].getMapa() + ":" + FrmPalco.Instancia[i].getX() + "," + FrmPalco.Instancia[i].getY() + ")";
                     Titulo[i] = "<html><font color=\"#888888\">"+(i+1) + "� </font>" +
                        ""+FrmPalco.Instancia[i].getNome()+
                        " <font color=\"#888888\">"+
                            "("+FrmPalco.Instancia[i].getMapa()+":"+FrmPalco.Instancia[i].getX()+","+FrmPalco.Instancia[i].getY()+")"+
                            " [img "+FrmPalco.Instancia[i].getImagem()+":"+FrmPalco.Instancia[i].getLarguraDeGatilho()+","+FrmPalco.Instancia[i].getAlturaDeGatilho()+"]"+
                        "</font>";
                }
            }
            Titulo[i] = new Object();
            Titulo[i] = "<html><font color=\"#888888\">"+(i+1)+"� function</font> "+
                TxtNovoBlocoFuncaoNome.getText().toString()+"<font color=\"#888888\">( )</font>";


            NovoInstancia[i] = new BlocoDeScript();
            NovoInstancia[i].setTipo("function");
            NovoInstancia[i].setNome(TxtNovoBlocoFuncaoNome.getText().toString());
            NovoInstancia[i].setMapa("");
            NovoInstancia[i].setX(0);
            NovoInstancia[i].setY(0);
            NovoInstancia[i].setImagem(0);
            NovoInstancia[i].setLarguraDeGatilho(0);
            NovoInstancia[i].setAlturaDeGatilho(0);

            FrmPalco.Instancia = NovoInstancia;


            //FrmPalco.CmbScript.setModel(model);
            FrmPalco.CmbScript.setModel(new DefaultComboBoxModel(Titulo));

            String Utilidade="";
            TxtNovoBlocoFunctionUtilidade.setText(TxtNovoBlocoFunctionUtilidade.getText().trim());
            if(!TxtNovoBlocoFunctionUtilidade.getText().trim().equals("")){
                for(int l=0;l<TxtNovoBlocoFunctionUtilidade.getLineCount();l++){
                    try {
                        Utilidade += "//    * "+
                        TxtNovoBlocoFunctionUtilidade.getText().substring(
                            TxtNovoBlocoFunctionUtilidade.getLineStartOffset(l),
                            TxtNovoBlocoFunctionUtilidade.getLineEndOffset(l)-(l<(TxtNovoBlocoFunctionUtilidade.getLineCount()-1)?1:0)
                        ) +
                        "\n";
                    } catch (BadLocationException ex) {
                        Logger.getLogger(FrmNovoBloco.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            NovoInstancia[i].setScript(
                "///////////////////////////////////////////////////////////////////\n"+
                "//  PROGRAMADOR: "+(FrmPrincipal.Config.getExecucaoParametroPersonagem().isEmpty()?"<Desconhecido>":FrmPrincipal.Config.getExecucaoParametroPersonagem())+"\n"+
                "//  ACRIA��O: "+ConfigClass.AGORAtoFORMATO("dd/MM/yyyy h:mm a")+"\n"+
                (Utilidade.equals("")?"":"//  UTILIDADE DO SCRIPT:\n"+Utilidade)+
                "///////////////////////////////////////////////////////////////////\n"+
                "_inicio:\n"+
                "\n"+
                "     //Insira seu Eathena Script aqui...\n"+
                "\n"+
                "_fim:"
            );
            FrmPalco.TxtScriptPalco.setText(NovoInstancia[i].getScript());
        }
        FrmPalco.CmbScript.setSelectedIndex(FrmPalco.CmbScript.getItemCount()-1);
        FrmPalco.CmbScript.setEnabled(false);
        //FrmPalco.CmbScript.setVisible(true);
        FrmPalco.TxtScriptPalco.setEnabled(true);
        FrmPalco.BtnScriptComandoMes.setEnabled(true);
        FrmPalco.BtnScriptComandoIF.setEnabled(true);

        FrmPalco.BtnNovoBloco.setEnabled(true);
        FrmPalco.BtnAbrirBloco.setEnabled(true);
        FrmPalco.BtnSalvarBloco.setEnabled(true);
        //FrmPalco.BtnExcluirBloco.setEnabled(true);
        dispose();
    }//GEN-LAST:event_BtnAdicionarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmNovoBloco dialog = new FrmNovoBloco(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton BtnAdicionar;
    private javax.swing.JButton BtnFechar;
    private javax.swing.JComboBox CmbNovoBlocoScriptImagem;
    private javax.swing.JSpinner SpnNovoBlocoScriptCoordX;
    private javax.swing.JSpinner SpnNovoBlocoScriptCoordY;
    private javax.swing.JSpinner SpnNovoBlocoScriptGatilhoAltura;
    private javax.swing.JSpinner SpnNovoBlocoScriptGatilhoLargura;
    private javax.swing.JTabbedPane TbpTipoDeBloco;
    private javax.swing.JTextField TxtNovoBlocoFuncaoNome;
    private javax.swing.JTextArea TxtNovoBlocoFunctionUtilidade;
    private javax.swing.JTextField TxtNovoBlocoScriptMapa;
    private javax.swing.JTextField TxtNovoBlocoScriptNome;
    private javax.swing.JTextArea TxtNovoBlocoScriptUtilidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
