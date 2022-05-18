package ark03;

import java.util.ArrayList;

public class NewJFrame extends javax.swing.JFrame {

    ArrayList<Numeros> arrayList = new ArrayList();
    int x = 0;
    int maior = 0;
    int menor = 0;
    float media;

    String valores;
    int[] vetor = new int[6];
    int n = 0;
    int m = 2;

    int somar;
    int multiplicar;

    public NewJFrame() {
        initComponents();
        Menor.setEditable(false);
        Maior.setEditable(false);
        Media.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        novoNumero = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btnExibir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Maior = new javax.swing.JTextField();
        Menor = new javax.swing.JTextField();
        Media = new javax.swing.JTextField();
        msg1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        campoValores = new javax.swing.JTextField();
        CampoOP = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        msg2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ARK-03");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parte 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Digite vários números: ");

        novoNumero.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        novoNumero.setText(" ");

        btnOK.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnOK.setText("Confirmar");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnExibir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnExibir.setText("Exibir");
        btnExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Maior número: ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Menor número: ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Média dos números:");

        Maior.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Menor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Menor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenorActionPerformed(evt);
            }
        });

        Media.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediaActionPerformed(evt);
            }
        });

        msg1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        msg1.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(novoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Media, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(Menor)
                    .addComponent(Maior)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 326, Short.MAX_VALUE))
            .addComponent(btnExibir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(msg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msg1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Maior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Menor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnExibir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parte 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Valores:");

        campoValores.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        campoValores.setText(" ");
        campoValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValoresActionPerformed(evt);
            }
        });

        CampoOP.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CampoOP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Somar", "Multiplicar" }));
        CampoOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoOPActionPerformed(evt);
            }
        });

        btnCalcular.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        msg2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        msg2.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(msg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoValores))
            .addComponent(CampoOP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msg2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Dados do Progama ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValoresActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        valores = campoValores.getText().trim();
        campoValores.setText("");
        try {
            for (int i = 0; i < 6; i++) {
                vetor[i] = Integer.parseInt(valores.substring(n, m));

                n += 2;
                m += 2;
            }
            String op = (String) CampoOP.getSelectedItem();
            if (op.equals("Somar")) {
                for (int i = 0; i < 6; i++) {
                    somar = somar + vetor[i];
                    msg2.setText("O resultado é: " + Integer.toString(somar));
                }
            }
            if (op.equals("Multiplicar")) {
                multiplicar = (((((vetor[0] * vetor[1]) * vetor[2]) * vetor[3]) * vetor[4]) * vetor[5]);
                msg2.setText("O resultado é: " + Integer.toString(multiplicar));
            }
        } catch (Exception e) {
            msg2.setText("Digite somente 12 numeros em sequencia sem espaço entre eles!");
        }

        n = 0;
        m = 2;
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void CampoOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoOPActionPerformed

    private void MenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenorActionPerformed

    private void btnExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirActionPerformed
        int tamanho = 0;
        tamanho = arrayList.size();
        if (tamanho > 0) {
            menor = arrayList.get(0).getNumeros();

            int i = 0;
            while (i != tamanho) {
                if (arrayList.get(i).getNumeros() < menor) {
                    menor = arrayList.get(i).getNumeros();
                }
                if (arrayList.get(i).getNumeros() > maior) {
                    maior = arrayList.get(i).getNumeros();
                }
                media = media + arrayList.get(i).getNumeros();
                i += 1;
            }
            media = media / tamanho;
            Menor.setText(Integer.toString(menor));
            Maior.setText(Integer.toString(maior));
            Media.setText(Float.toString(media));
        } else {
            msg1.setText("Digite um numero para continuar!");
        }
    }//GEN-LAST:event_btnExibirActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        try {
            this.arrayList.add(new Numeros(x));
            this.arrayList.get(x).setNumeros(Integer.parseInt(novoNumero.getText().trim()));
            //this.numeros[x] = Integer.parseInt(novoNumero.getText().trim());
            novoNumero.setText("");
            x += 1;
        } catch (Exception e) {
            msg1.setText("Digite somente numero!");
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void MediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MediaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     Sobre sobre = new Sobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CampoOP;
    private javax.swing.JTextField Maior;
    private javax.swing.JTextField Media;
    private javax.swing.JTextField Menor;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnExibir;
    private javax.swing.JButton btnOK;
    private javax.swing.JTextField campoValores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel msg1;
    private javax.swing.JLabel msg2;
    private javax.swing.JTextField novoNumero;
    // End of variables declaration//GEN-END:variables
}
