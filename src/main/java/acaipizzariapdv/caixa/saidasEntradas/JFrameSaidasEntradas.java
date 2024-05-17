/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package acaipizzariapdv.caixa.saidasEntradas;

import acaipizzariapdv.caixa.CaixaJPanel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class JFrameSaidasEntradas extends javax.swing.JFrame {

    SaidasEntradasModel saidasEntradasModel = new SaidasEntradasModel();
    TableModelEntradasSaidas tableModelEntradasSaidas = new TableModelEntradasSaidas();
    List<SaidasEntradasModel> listaSaidasEntradas = new ArrayList();
    
    public JFrameSaidasEntradas(int caixaId) {
        saidasEntradasModel.setId_caixa(caixaId);
        initComponents();
        myInit();
    }
    public JFrameSaidasEntradas() {
        
        initComponents();
        myInit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEntradasSaidas = new javax.swing.ButtonGroup();
        buttonGroupSegmento = new javax.swing.ButtonGroup();
        jPanelContainer = new javax.swing.JPanel();
        jPanelRegistro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonSaida = new javax.swing.JRadioButton();
        jRadioButtonEntrada = new javax.swing.JRadioButton();
        jLabelValor = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jLabelSegmento = new javax.swing.JLabel();
        jRadioButtonAcai = new javax.swing.JRadioButton();
        jRadioButtonPizzaria = new javax.swing.JRadioButton();
        jComboBoxCategorias = new javax.swing.JComboBox<>();
        jLabelCategoria = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBoxSolicitante = new javax.swing.JComboBox<>();
        jLabelSolicitante = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObservacao = new javax.swing.JTextArea();
        jLabelObservacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelContainer.setBackground(new java.awt.Color(204, 204, 204));

        jPanelRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de entradas e saidas.");

        jRadioButtonSaida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonSaida.setText("Saída");
        jRadioButtonSaida.setActionCommand("Saída");
        jRadioButtonSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSaidaActionPerformed(evt);
            }
        });

        jRadioButtonEntrada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonEntrada.setText("Entrada");
        jRadioButtonEntrada.setActionCommand("Entrada");
        jRadioButtonEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEntradaActionPerformed(evt);
            }
        });

        jLabelValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelValor.setText("Valor:");

        jLabelSegmento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSegmento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSegmento.setText("Segmento:");

        jRadioButtonAcai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonAcai.setText("Açai");
        jRadioButtonAcai.setActionCommand("Açai");

        jRadioButtonPizzaria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonPizzaria.setText("Pizzaria");
        jRadioButtonPizzaria.setActionCommand("Pizzaria");

        jComboBoxCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um opção.", "Compra de insumos.", "Salários.", "Diarias.", "Compra de untensílios.", " " }));
        jComboBoxCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriasActionPerformed(evt);
            }
        });

        jLabelCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCategoria.setText("Categoria:");

        jButtonRegistrar.setBackground(new java.awt.Color(51, 102, 255));
        jButtonRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jComboBoxSolicitante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Edinelson", "Carlito", " " }));
        jComboBoxSolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSolicitanteActionPerformed(evt);
            }
        });

        jLabelSolicitante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSolicitante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSolicitante.setText("Solicitante:");

        jTextAreaObservacao.setColumns(20);
        jTextAreaObservacao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObservacao);

        jLabelObservacao.setText("Observação:");

        javax.swing.GroupLayout jPanelRegistroLayout = new javax.swing.GroupLayout(jPanelRegistro);
        jPanelRegistro.setLayout(jPanelRegistroLayout);
        jPanelRegistroLayout.setHorizontalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSolicitante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jRadioButtonAcai)
                                .addGap(47, 47, 47)
                                .addComponent(jRadioButtonPizzaria)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanelRegistroLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelValor)
                                .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                                .addComponent(jRadioButtonSaida)
                                .addGap(54, 54, 54)
                                .addComponent(jRadioButtonEntrada)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabelSegmento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistroLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jComboBoxSolicitante, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxCategorias, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRegistrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabelObservacao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRegistroLayout.setVerticalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonSaida)
                    .addComponent(jRadioButtonEntrada))
                .addGap(18, 18, 18)
                .addComponent(jLabelValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSegmento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonPizzaria)
                    .addComponent(jRadioButtonAcai))
                .addGap(18, 18, 18)
                .addComponent(jLabelCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSolicitante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelObservacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelContainerLayout = new javax.swing.GroupLayout(jPanelContainer);
        jPanelContainer.setLayout(jPanelContainerLayout);
        jPanelContainerLayout.setHorizontalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanelContainerLayout.setVerticalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   

    private void myInit(){
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jLabelCategoria.setVisible(false);
        jComboBoxCategorias.setVisible(false);
        
        buttonGroupEntradasSaidas.add(jRadioButtonSaida);
        buttonGroupEntradasSaidas.add(jRadioButtonEntrada);
        
        buttonGroupSegmento.add(jRadioButtonAcai);
        buttonGroupSegmento.add(jRadioButtonPizzaria);
        
        //adiciona um ouvinte de evento
        //RegistroHandler listernerRegistro = new CaixaJPanel().new RegistroHandler();
        //jButtonRegistrar.addActionListener(listernerRegistro);
    }
   

    private void jComboBoxCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCategoriasActionPerformed

    private void jRadioButtonSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSaidaActionPerformed
        // TODO add your handling code here:
        jLabelCategoria.setVisible(true);
        jComboBoxCategorias.setVisible(true);
    }//GEN-LAST:event_jRadioButtonSaidaActionPerformed

    private void jRadioButtonEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEntradaActionPerformed
        // TODO add your handling code here:
        jLabelCategoria.setVisible(false);
        jComboBoxCategorias.setVisible(false);
    }//GEN-LAST:event_jRadioButtonEntradaActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:
        //SaidasEntradasModel saidasEntradasModel = new SaidasEntradasModel();
        SaidasEntradasController saidasEntradasController = new SaidasEntradasController();
        if(buttonGroupEntradasSaidas.getSelection() != null & 
                !jTextFieldValor.getText().isEmpty() & 
                buttonGroupSegmento.getSelection() != null){
        saidasEntradasModel.setEntradaSaida(buttonGroupEntradasSaidas.getSelection().getActionCommand());
        saidasEntradasModel.setValor(Double.parseDouble(jTextFieldValor.getText().replaceAll(",", ".")));
        saidasEntradasModel.setSegmento(buttonGroupSegmento.getSelection().getActionCommand());
        saidasEntradasModel.setCategoria(jComboBoxCategorias.getSelectedItem().toString());
        saidasEntradasModel.setSolicitante(jComboBoxSolicitante.getSelectedItem().toString());
        saidasEntradasModel.setObservacao(jTextAreaObservacao.getText());
        saidasEntradasModel.setData_hora(new Date());
        listaSaidasEntradas.add(saidasEntradasModel);
        tableModelEntradasSaidas.setSaidasEntradas(listaSaidasEntradas);
        saidasEntradasController.salvarSaidaEntrada(saidasEntradasModel);
        
        
        buttonGroupEntradasSaidas.clearSelection();
        jTextFieldValor.setText("");
        buttonGroupSegmento.clearSelection();
        jComboBoxCategorias.setSelectedItem(null);
        
        JOptionPane.showMessageDialog(jPanelContainer, "Registro adicionado com sucesso!");
        
        // fechar janela de registro.
        this.dispose();
        } else {
            JOptionPane.showMessageDialog(jPanelContainer, 
                    "Não foi posssível realizar registro.Selecione e preencha os campos vazios.");
        }
        
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jComboBoxSolicitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSolicitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSolicitanteActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameSaidasEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameSaidasEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameSaidasEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameSaidasEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameSaidasEntradas().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupEntradasSaidas;
    private javax.swing.ButtonGroup buttonGroupSegmento;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JComboBox<String> jComboBoxCategorias;
    private javax.swing.JComboBox<String> jComboBoxSolicitante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelObservacao;
    private javax.swing.JLabel jLabelSegmento;
    private javax.swing.JLabel jLabelSolicitante;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JPanel jPanelContainer;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JRadioButton jRadioButtonAcai;
    private javax.swing.JRadioButton jRadioButtonEntrada;
    private javax.swing.JRadioButton jRadioButtonPizzaria;
    private javax.swing.JRadioButton jRadioButtonSaida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaObservacao;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}