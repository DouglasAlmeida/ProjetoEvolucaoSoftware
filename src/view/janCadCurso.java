/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author gattuso
 */
public class janCadCurso extends javax.swing.JFrame {

    /**
     * Creates new form janCadCurso
     */
    public janCadCurso() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        duracao = new javax.swing.JLabel();
        universidade = new javax.swing.JLabel();
        campus = new javax.swing.JLabel();
        formacao = new javax.swing.JLabel();
        edtTitulo = new javax.swing.JTextField();
        edtDuracao = new javax.swing.JTextField();
        edtFormacao = new javax.swing.JTextField();
        edtUniversidade = new javax.swing.JTextField();
        edtCampus = new javax.swing.JTextField();
        cadcurso = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/img/save.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setBounds(90, 230, 140, 40);
        jLayeredPane1.add(btnSalvar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/img/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBounds(240, 230, 140, 40);
        jLayeredPane1.add(btnCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        titulo.setText("Título do Curso:");
        titulo.setBounds(20, 70, 120, 17);
        jLayeredPane1.add(titulo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        duracao.setText("Duração:");
        duracao.setBounds(20, 100, 64, 17);
        jLayeredPane1.add(duracao, javax.swing.JLayeredPane.DEFAULT_LAYER);

        universidade.setText("Universidade:");
        universidade.setBounds(20, 160, 99, 17);
        jLayeredPane1.add(universidade, javax.swing.JLayeredPane.DEFAULT_LAYER);

        campus.setText("Campus:");
        campus.setBounds(20, 190, 80, 17);
        jLayeredPane1.add(campus, javax.swing.JLayeredPane.DEFAULT_LAYER);

        formacao.setText("Formação: ");
        formacao.setBounds(20, 130, 90, 17);
        jLayeredPane1.add(formacao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        edtTitulo.setBounds(140, 70, 240, 27);
        jLayeredPane1.add(edtTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        edtDuracao.setBounds(140, 100, 240, 27);
        jLayeredPane1.add(edtDuracao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        edtFormacao.setBounds(140, 130, 240, 27);
        jLayeredPane1.add(edtFormacao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        edtUniversidade.setBounds(140, 160, 240, 27);
        jLayeredPane1.add(edtUniversidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        edtCampus.setBounds(140, 190, 240, 27);
        jLayeredPane1.add(edtCampus, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cadcurso.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        cadcurso.setText("Cadastro de Curso");
        cadcurso.setBounds(120, 20, 160, 21);
        jLayeredPane1.add(cadcurso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator1.setBounds(0, 50, 400, 6);
        jLayeredPane1.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(janCadCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(janCadCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(janCadCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(janCadCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new janCadCurso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel cadcurso;
    private javax.swing.JLabel campus;
    private javax.swing.JLabel duracao;
    private javax.swing.JTextField edtCampus;
    private javax.swing.JTextField edtDuracao;
    private javax.swing.JTextField edtFormacao;
    private javax.swing.JTextField edtTitulo;
    private javax.swing.JTextField edtUniversidade;
    private javax.swing.JLabel formacao;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel universidade;
    // End of variables declaration//GEN-END:variables
}
