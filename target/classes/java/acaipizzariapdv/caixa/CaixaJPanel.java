/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package acaipizzariapdv.caixa;

//import acaipizzariapdv.caixa.CaixaModel;
import acaipizzariapdv.caixa.saidasEntradas.JFrameSaidasEntradas;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.Calendar;

import acaipizzariapdv.caixa.saidasEntradas.TableModelEntradasSaidas;
import acaipizzariapdv.caixa.saidasEntradas.SaidasEntradasController;
import acaipizzariapdv.caixa.saidasEntradas.SaidasEntradasModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class CaixaJPanel extends javax.swing.JPanel {

    //Dados necessários para registrar hora da abertura e fechamento do caixa
    public Date date;
    public Calendar calendar = Calendar.getInstance();
    public Date dataHora;

    public boolean caixaAberto = false;
    public String SaldoInicial;
    CaixaModel caixa = new CaixaModel();
    
    TableModelEntradasSaidas tableModelEntradasSaidas;
    List<SaidasEntradasModel> listaSaidasEntradas = new ArrayList();
    SaidasEntradasController saidasEntradasController = new SaidasEntradasController();

    public CaixaJPanel() {
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

        jPanelCaixa = new javax.swing.JPanel();
        jLabelStatus = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelSaldoInicialValor = new javax.swing.JLabel();
        jLabelStatusValor = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelEntradasCartaoValor = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelEntradasPixValor = new javax.swing.JLabel();
        jLabelEntradasDinheiroValor = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelTotalEntradasValor = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelTotalSaidasValor = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabelSaldoDinheiroValor = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabelSaldoTotalValor = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabelValorInicial = new javax.swing.JLabel();
        jButtonAbrirFecharCaixa = new javax.swing.JButton();
        jTextFieldValorInicial = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonAdicionarSaidaEntrada = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSaidasEntradas = new javax.swing.JTable();
        jButtonAtualizar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));
        setMinimumSize(new java.awt.Dimension(800, 450));

        jPanelCaixa.setBackground(new java.awt.Color(204, 204, 204));
        jPanelCaixa.setMinimumSize(new java.awt.Dimension(294, 460));
        jPanelCaixa.setPreferredSize(new java.awt.Dimension(294, 460));

        jLabelStatus.setText("Status:");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("Movimentações");

        jLabel4.setText("Saldo Incial:");

        jLabelSaldoInicialValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSaldoInicialValor.setText("0,00");
        jLabelSaldoInicialValor.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabelSaldoInicialValor.setMaximumSize(new java.awt.Dimension(70, 18));
        jLabelSaldoInicialValor.setMinimumSize(new java.awt.Dimension(70, 18));
        jLabelSaldoInicialValor.setPreferredSize(new java.awt.Dimension(70, 18));

        jLabelStatusValor.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabelStatusValor.setForeground(new java.awt.Color(204, 0, 102));
        jLabelStatusValor.setText("Fechado");

        jLabel7.setText("Entradas em Cartão:");

        jLabelEntradasCartaoValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelEntradasCartaoValor.setText("0,00");
        jLabelEntradasCartaoValor.setMaximumSize(new java.awt.Dimension(70, 18));
        jLabelEntradasCartaoValor.setMinimumSize(new java.awt.Dimension(70, 18));
        jLabelEntradasCartaoValor.setPreferredSize(new java.awt.Dimension(70, 18));
        jLabelEntradasCartaoValor.setRequestFocusEnabled(false);

        jLabel9.setText("Entradas em Pix:");

        jLabelEntradasPixValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelEntradasPixValor.setText("0,00");
        jLabelEntradasPixValor.setMaximumSize(new java.awt.Dimension(70, 18));
        jLabelEntradasPixValor.setMinimumSize(new java.awt.Dimension(70, 18));
        jLabelEntradasPixValor.setPreferredSize(new java.awt.Dimension(70, 18));

        jLabelEntradasDinheiroValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelEntradasDinheiroValor.setText("0,00");
        jLabelEntradasDinheiroValor.setMaximumSize(new java.awt.Dimension(70, 18));
        jLabelEntradasDinheiroValor.setMinimumSize(new java.awt.Dimension(70, 18));
        jLabelEntradasDinheiroValor.setPreferredSize(new java.awt.Dimension(70, 18));

        jLabel12.setText("Entradas em Dinheiro:");

        jLabelTotalEntradasValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTotalEntradasValor.setText("0,00");
        jLabelTotalEntradasValor.setMaximumSize(new java.awt.Dimension(70, 18));
        jLabelTotalEntradasValor.setMinimumSize(new java.awt.Dimension(70, 18));
        jLabelTotalEntradasValor.setPreferredSize(new java.awt.Dimension(70, 18));

        jLabel14.setText("Total de entradas:");

        jLabelTotalSaidasValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTotalSaidasValor.setText("0,00");
        jLabelTotalSaidasValor.setMaximumSize(new java.awt.Dimension(70, 18));
        jLabelTotalSaidasValor.setMinimumSize(new java.awt.Dimension(70, 18));
        jLabelTotalSaidasValor.setPreferredSize(new java.awt.Dimension(70, 18));

        jLabel16.setText("Total de Saídas:");

        jLabelSaldoDinheiroValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSaldoDinheiroValor.setText("0,00");
        jLabelSaldoDinheiroValor.setMaximumSize(new java.awt.Dimension(70, 18));
        jLabelSaldoDinheiroValor.setMinimumSize(new java.awt.Dimension(70, 18));
        jLabelSaldoDinheiroValor.setPreferredSize(new java.awt.Dimension(70, 18));

        jLabel18.setText("Saldo em dinheiro:");

        jLabelSaldoTotalValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSaldoTotalValor.setText("0,00");
        jLabelSaldoTotalValor.setMaximumSize(new java.awt.Dimension(70, 18));
        jLabelSaldoTotalValor.setMinimumSize(new java.awt.Dimension(70, 18));
        jLabelSaldoTotalValor.setPreferredSize(new java.awt.Dimension(70, 18));

        jLabel20.setText("Saldo Total:");

        jLabelValorInicial.setText("Saldo Inicial:");

        jButtonAbrirFecharCaixa.setBackground(new java.awt.Color(204, 0, 102));
        jButtonAbrirFecharCaixa.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButtonAbrirFecharCaixa.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAbrirFecharCaixa.setText("Abrir Caixa");
        jButtonAbrirFecharCaixa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAbrirFecharCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAbrirFecharCaixaMouseClicked(evt);
            }
        });

        jTextFieldValorInicial.setMinimumSize(new java.awt.Dimension(70, 28));
        jTextFieldValorInicial.setPreferredSize(new java.awt.Dimension(70, 28));

        javax.swing.GroupLayout jPanelCaixaLayout = new javax.swing.GroupLayout(jPanelCaixa);
        jPanelCaixa.setLayout(jPanelCaixaLayout);
        jPanelCaixaLayout.setHorizontalGroup(
            jPanelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCaixaLayout.createSequentialGroup()
                        .addGroup(jPanelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCaixaLayout.createSequentialGroup()
                                .addComponent(jLabelStatus)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelCaixaLayout.createSequentialGroup()
                                .addGroup(jPanelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelCaixaLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelEntradasPixValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelCaixaLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelEntradasDinheiroValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelCaixaLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelTotalEntradasValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelCaixaLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelTotalSaidasValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelCaixaLayout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelSaldoDinheiroValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelCaixaLayout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelSaldoTotalValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelCaixaLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jSeparator2)
                                    .addComponent(jSeparator4)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCaixaLayout.createSequentialGroup()
                                        .addGroup(jPanelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabelEntradasCartaoValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelSaldoInicialValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1)))
                        .addContainerGap())
                    .addGroup(jPanelCaixaLayout.createSequentialGroup()
                        .addComponent(jLabelValorInicial)
                        .addGroup(jPanelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCaixaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelStatusValor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCaixaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(jTextFieldValorInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jButtonAbrirFecharCaixa)
                        .addGap(20, 20, 20))))
        );
        jPanelCaixaLayout.setVerticalGroup(
            jPanelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCaixaLayout.createSequentialGroup()
                .addGroup(jPanelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCaixaLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelStatus)
                            .addComponent(jLabelStatusValor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelValorInicial)
                            .addComponent(jTextFieldValorInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCaixaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonAbrirFecharCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)))
                .addGroup(jPanelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCaixaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(402, 402, 402))
                    .addGroup(jPanelCaixaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabelSaldoInicialValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabelEntradasCartaoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabelEntradasPixValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabelEntradasDinheiroValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabelTotalEntradasValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabelTotalSaidasValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabelSaldoDinheiroValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabelSaldoTotalValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel3.setMinimumSize(new java.awt.Dimension(280, 460));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 460));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Pedido", "Forma Pagamento", "Valor", "Data e Hora"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 153, 0));
        jLabel21.setText("Pagamentos");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel21.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(0, 93, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );

        jPanel2.setMinimumSize(new java.awt.Dimension(300, 76));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 70));

        jButtonAdicionarSaidaEntrada.setBackground(new java.awt.Color(255, 252, 251));
        jButtonAdicionarSaidaEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagens/icones/addSaida.png"))); // NOI18N
        jButtonAdicionarSaidaEntrada.setText("Saida / Entrada");
        jButtonAdicionarSaidaEntrada.setIconTextGap(8);
        jButtonAdicionarSaidaEntrada.setPreferredSize(new java.awt.Dimension(162, 28));
        jButtonAdicionarSaidaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarSaidaEntradaActionPerformed(evt);
            }
        });

        jScrollPane2.setPreferredSize(new java.awt.Dimension(300, 402));

        jTableSaidasEntradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Valor", "Categoria", "Solicitante"
            }
        ));
        jTableSaidasEntradas.setShowGrid(true);
        jScrollPane2.setViewportView(jTableSaidasEntradas);

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAdicionarSaidaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAtualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdicionarSaidaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jPanelCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void myInit() {
        tableModelEntradasSaidas = new TableModelEntradasSaidas();
        jTableSaidasEntradas.setModel(tableModelEntradasSaidas);
        System.out.println(tableModelEntradasSaidas.getRowCount());

    }


    private void jButtonAbrirFecharCaixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAbrirFecharCaixaMouseClicked
        // TODO add your handling code here:

        if (!caixaAberto) {
            abrirCaixa();
        } else {
            fecharCaixa();
        }
    }//GEN-LAST:event_jButtonAbrirFecharCaixaMouseClicked

    private void jButtonAdicionarSaidaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarSaidaEntradaActionPerformed
        // TODO add your handling code here:
        JFrameSaidasEntradas registroSaidasEntradas = new JFrameSaidasEntradas(caixa.getId_caixa());
        registroSaidasEntradas.setVisible(true);


    }//GEN-LAST:event_jButtonAdicionarSaidaEntradaActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // TODO add your handling code here:
        
        
            listaSaidasEntradas = saidasEntradasController.consultarEntradasSaidas();
            tableModelEntradasSaidas.setSaidasEntradas(listaSaidasEntradas);
            tableModelEntradasSaidas.fireTableDataChanged();
            
            System.out.println(tableModelEntradasSaidas.getRowCount());
            System.out.println(tableModelEntradasSaidas.getColumnName(0));
            System.out.println(tableModelEntradasSaidas.getValueAt(1,0));
            System.out.println("table: "+jTableSaidasEntradas.getValueAt(1,0));
           // jTableSaidasEntradas.setModel(tableModelEntradasSaidas);
            
         /*else {
            JOptionPane.showMessageDialog(jPanel2, "Caixa fechado");
        } */

    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void abrirCaixa() {
        try {
            if (!jTextFieldValorInicial.getText().isEmpty()) {

                //NumberFormat numberFormatUS = NumberFormat.getCurrencyInstance(Locale.US);
                //NumberFormat numberFormatBR = NumberFormat.getCurrencyInstance();
                jLabelSaldoInicialValor.setText("R$ " + jTextFieldValorInicial.getText().replaceAll(",", "."));
                jLabelStatusValor.setText("Aberto");
                jLabelStatusValor.setForeground(new java.awt.Color(51, 153, 0));

                jButtonAbrirFecharCaixa.setBackground(new java.awt.Color(51, 153, 0));
                jButtonAbrirFecharCaixa.setText("Fechar caixa");

                jTextFieldValorInicial.setEditable(false);

                this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)));
                caixaAberto = true;

                //dataHora = calendar.getTime();
                caixa.setAberto(caixaAberto);
                caixa.setAbertoAs(calendar.getTime());
                caixa.setValor_inicial(Double.parseDouble(jTextFieldValorInicial.getText().replaceAll(",", ".")));

                CaixaController caixaController = new CaixaController();
                caixa.setId_caixa(caixaController.salvarCaixa(caixa));
                System.out.println("O id Cadastrado foi: " + caixa.getId_caixa());
                jTextFieldValorInicial.setText("");
            } else {
                JOptionPane.showMessageDialog(jPanelCaixa, "Não foi possível abrir o caixa. Valor do fundo de troco vazio ou inválido.");
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao abrir o caixa.", e);
        }
    }

    private void fecharCaixa() {
        jLabelStatusValor.setText("Fechado");
        jLabelStatusValor.setForeground(new java.awt.Color(204, 0, 102));

        jButtonAbrirFecharCaixa.setBackground(new java.awt.Color(204, 0, 102));
        jButtonAbrirFecharCaixa.setText("Abrir Caixa");

        this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jTextFieldValorInicial.setEditable(true);
        caixaAberto = false;

        caixa.setTotal_entradas_cartao(Double.parseDouble(jLabelEntradasCartaoValor.getText().replaceAll(",", ".")));
        caixa.setTotal_entradas_pix(Double.parseDouble(jLabelEntradasPixValor.getText().replaceAll(",", ".")));
        caixa.setTotal_entradas_dinheiro(Double.parseDouble(jLabelEntradasDinheiroValor.getText().replaceAll(",", ".")));
        caixa.setTotal_entradas(Double.parseDouble(jLabelTotalEntradasValor.getText().replaceAll(",", ".")));
        caixa.setTotal_saidas(Double.parseDouble(jLabelTotalSaidasValor.getText().replaceAll(",", ".")));
        caixa.setSaldo_final_dinheiro(Double.parseDouble(jLabelSaldoDinheiroValor.getText().replaceAll(",", ".")));
        caixa.setSaldo_final(Double.parseDouble(jLabelSaldoTotalValor.getText().replaceAll(",", ".")));
        caixa.setAberto(caixaAberto);
        caixa.setFechadoAs(calendar.getTime());

        CaixaController caixaControler = new CaixaController();
        caixaControler.salvarMovimentacoesCaixa(caixa);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrirFecharCaixa;
    private javax.swing.JButton jButtonAdicionarSaidaEntrada;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelEntradasCartaoValor;
    private javax.swing.JLabel jLabelEntradasDinheiroValor;
    private javax.swing.JLabel jLabelEntradasPixValor;
    private javax.swing.JLabel jLabelSaldoDinheiroValor;
    private javax.swing.JLabel jLabelSaldoInicialValor;
    private javax.swing.JLabel jLabelSaldoTotalValor;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelStatusValor;
    private javax.swing.JLabel jLabelTotalEntradasValor;
    private javax.swing.JLabel jLabelTotalSaidasValor;
    private javax.swing.JLabel jLabelValorInicial;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelCaixa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableSaidasEntradas;
    private javax.swing.JTextField jTextFieldValorInicial;
    // End of variables declaration//GEN-END:variables
}
