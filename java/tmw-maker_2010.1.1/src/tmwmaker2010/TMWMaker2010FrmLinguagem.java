/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TMWMaker2010FrmLinguagem.java
 *
 * Created on Mar 19, 2010, 7:37:03 PM
 */

package tmwmaker2010;

/**
 *
 * @author indigovox
 */
public class TMWMaker2010FrmLinguagem extends javax.swing.JFrame {

    /** Creates new form TMWMaker2010FrmLinguagem */
    public TMWMaker2010FrmLinguagem() {
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

      jToggleButton1 = new javax.swing.JToggleButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(tmwmaker2010.TMWMaker2010App.class).getContext().getResourceMap(TMWMaker2010FrmLinguagem.class);
      setTitle(resourceMap.getString("Form.title")); // NOI18N
      setName("Form"); // NOI18N

      jToggleButton1.setMnemonic('R');
      jToggleButton1.setText(resourceMap.getString("BtnFechar.text")); // NOI18N
      jToggleButton1.setName("BtnFechar"); // NOI18N

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(176, Short.MAX_VALUE)
            .addComponent(jToggleButton1)
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(123, Short.MAX_VALUE)
            .addComponent(jToggleButton1)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TMWMaker2010FrmLinguagem().setVisible(true);
            }
        });
    }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JToggleButton jToggleButton1;
   // End of variables declaration//GEN-END:variables

}