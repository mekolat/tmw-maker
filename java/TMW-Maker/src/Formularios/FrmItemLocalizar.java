/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmItemLocalizar.java
 *
 * Created on 09/06/2010, 15:20:20
 */

package Formularios;

import Classes.ConfigClass;
import javax.swing.JOptionPane;

/**
 *
 * @author indigovox
 */
public class FrmItemLocalizar extends javax.swing.JDialog {

    /** Creates new form FrmItemLocalizar */
    public FrmItemLocalizar(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrpTipoDeItem = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtLocalizar = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        OptNomeTitulo = new javax.swing.JRadioButton();
        OptNomeSumonico = new javax.swing.JRadioButton();
        BtnFechar = new javax.swing.JButton();
        BtnLocalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Localizar Item");
        setResizable(false);

        TxtLocalizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtLocalizarKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TxtLocalizar);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Localizar por:"));

        GrpTipoDeItem.add(OptNomeTitulo);
        OptNomeTitulo.setSelected(true);
        OptNomeTitulo.setText("Nome T�tulo");

        GrpTipoDeItem.add(OptNomeSumonico);
        OptNomeSumonico.setText("Nome Sum�nico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OptNomeTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(OptNomeSumonico)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OptNomeTitulo)
                    .addComponent(OptNomeSumonico))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtnFechar.setMnemonic('F');
        BtnFechar.setText("Fechar");
        BtnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFecharActionPerformed(evt);
            }
        });

        BtnLocalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Botoes/sbl_lupa.gif"))); // NOI18N
        BtnLocalizar.setMnemonic('L');
        BtnLocalizar.setText("Localizar");
        BtnLocalizar.setEnabled(false);
        BtnLocalizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLocalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnLocalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnFechar)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtnFechar, BtnLocalizar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnFechar)
                    .addComponent(BtnLocalizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BtnFechar, BtnLocalizar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_BtnFecharActionPerformed
    private void BtnLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLocalizarActionPerformed
        int Inicio=FrmItens.CmbIDs.getSelectedIndex();
        int Ponteiro=Inicio;
        if(Ponteiro==FrmItens.CmbIDs.getItemCount()-1) Ponteiro=0;
        boolean SeSair=false,Redirecionado=false;
        TxtLocalizar.setEnabled(false);
        OptNomeTitulo.setEnabled(false);
        OptNomeSumonico.setEnabled(false);
        BtnLocalizar.setEnabled(false);
        BtnFechar.setEnabled(false);

        do{
            Ponteiro++;
            if(
                (OptNomeTitulo.isSelected() && FrmItens.Itens[Ponteiro].getNomeTitulo().toLowerCase().indexOf(TxtLocalizar.getText().toLowerCase())>=0) ||
                (OptNomeSumonico.isSelected() && FrmItens.Itens[Ponteiro].getNomeSumonico().toLowerCase().indexOf(TxtLocalizar.getText().toLowerCase())>=0)
            ){
                SeSair=true;
                FrmItens.CmbIDs.setSelectedIndex(Ponteiro);
            }else if(Ponteiro==FrmItens.CmbIDs.getItemCount()-1 && SeSair==false && Redirecionado==false){
                int R = JOptionPane.YES_OPTION;
                Object[] Opcoes = {"Sim", "N�o"};
                R = JOptionPane.showOptionDialog(
                    null, "<html>" +
                    "N�o foi possivel encontrar \""+TxtLocalizar.getText()+"\"<br/>" +
                    "Deseja procurar novamente desde o in�cio??",
                    "LOCALIZADOR DE ITENS",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    Opcoes,
                    Opcoes[1]
                );
                if(R == JOptionPane.YES_OPTION){
                    Redirecionado=true;
                    Ponteiro=-1;
                }else{
                    SeSair=true;
                }
            }else if(Ponteiro==FrmItens.CmbIDs.getItemCount()-1 && SeSair==false && Redirecionado==true){
                SeSair=true;
                ConfigClass.Mensagem_Erro("Item n�o encontrado!","LOCALIZADOR DE ITENS");
            }
        }while(!SeSair);
        TxtLocalizar.setEnabled(true);
        OptNomeTitulo.setEnabled(true);
        OptNomeSumonico.setEnabled(true);
        BtnLocalizar.setEnabled(true);
        BtnFechar.setEnabled(true);

    }//GEN-LAST:event_BtnLocalizarActionPerformed

    private void TxtLocalizarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtLocalizarKeyReleased
        BtnLocalizar.setEnabled(TxtLocalizar.getText().length()>=1);
    }//GEN-LAST:event_TxtLocalizarKeyReleased

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmItemLocalizar dialog = new FrmItemLocalizar(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton BtnFechar;
    private javax.swing.JButton BtnLocalizar;
    private javax.swing.ButtonGroup GrpTipoDeItem;
    private javax.swing.JRadioButton OptNomeSumonico;
    private javax.swing.JRadioButton OptNomeTitulo;
    private javax.swing.JTextPane TxtLocalizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
