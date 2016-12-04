package sk.upjs.ics.lyz_skola;

public class ZakazniciForm extends javax.swing.JFrame {

    private UvodnyPanelForm uvodnyPanel;
    private ZakaznikDao zakaznikDao = ObjectFactory.INSTANCE.getZakaznikDao();
    private Integer vstupZoznam;
    private String priezvisko = null;
    private Integer telefon = 0;
    private Long id = 0L;
    
    public ZakazniciForm() {
        
    }
    
    public ZakazniciForm(UvodnyPanelForm uvodnyPanel){
        initComponents();
        this.uvodnyPanel = uvodnyPanel;
        vstupZoznam = 0;
        this.aktualizovatZoznam();
    }
    
    private void aktualizovatZoznam(){
        ZakazniciTableModel zakazniciModel = (ZakazniciTableModel) zakaznikTable.getModel();
        zakazniciModel.aktualizovat(vstupZoznam,priezvisko,telefon,id);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        zakaznikTable = new javax.swing.JTable();
        pridatZakaznikaButton = new javax.swing.JButton();
        spatButton = new javax.swing.JButton();
        podlaPriezviskaButton = new javax.swing.JButton();
        podlaIDButton = new javax.swing.JButton();
        zoraditLabel = new javax.swing.JLabel();
        filterLabel = new javax.swing.JLabel();
        priezviskoTextField = new javax.swing.JTextField();
        telefonFilterTextField = new javax.swing.JTextField();
        hladajPriezviskoButton = new javax.swing.JButton();
        hladajTelefonButton = new javax.swing.JButton();
        editaciaLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        idZakaznikaLabel = new javax.swing.JLabel();
        poznamkaLabel = new javax.swing.JLabel();
        poznamkaTextField = new javax.swing.JTextField();
        telefonLabel = new javax.swing.JLabel();
        telefonEditTextField = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        vymazButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        zakaznikTable.setModel(new ZakazniciTableModel());
        jScrollPane1.setViewportView(zakaznikTable);

        pridatZakaznikaButton.setText("Pridať Zákazníka");
        pridatZakaznikaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridatZakaznikaButtonActionPerformed(evt);
            }
        });

        spatButton.setText("Späť");
        spatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spatButtonActionPerformed(evt);
            }
        });

        podlaPriezviskaButton.setText("Podľa Priezviska");
        podlaPriezviskaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                podlaPriezviskaButtonActionPerformed(evt);
            }
        });

        podlaIDButton.setText("Podľa ID");
        podlaIDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                podlaIDButtonActionPerformed(evt);
            }
        });

        zoraditLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zoraditLabel.setText("Zoradiť :");
        zoraditLabel.setToolTipText("");
        zoraditLabel.setIconTextGap(6);

        filterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        filterLabel.setText("Filter : ");
        filterLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        priezviskoTextField.setText("Priezvisko");
        priezviskoTextField.setToolTipText("");
        priezviskoTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priezviskoTextFieldMouseClicked(evt);
            }
        });

        telefonFilterTextField.setText("Telefon");
        telefonFilterTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telefonFilterTextFieldMouseClicked(evt);
            }
        });

        hladajPriezviskoButton.setText("Hľadaj");
        hladajPriezviskoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hladajPriezviskoButtonActionPerformed(evt);
            }
        });

        hladajTelefonButton.setText("Hľadaj");
        hladajTelefonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hladajTelefonButtonActionPerformed(evt);
            }
        });

        editaciaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editaciaLabel.setText("Editácia/Zmazanie podľa ID. ID musí byť vyplnené.");

        idZakaznikaLabel.setText("*ID Zákazníka :");

        poznamkaLabel.setText("Poznámka :");

        telefonLabel.setText("Telefón :");

        editButton.setText("Editácia");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        vymazButton.setText("Vymazať Zákazníka");
        vymazButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vymazButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pridatZakaznikaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spatButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(podlaPriezviskaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(podlaIDButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zoraditLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(filterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priezviskoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(telefonFilterTextField))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(hladajTelefonButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(telefonLabel))
                            .addComponent(idZakaznikaLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hladajPriezviskoButton)
                                .addGap(196, 196, 196)
                                .addComponent(poznamkaLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editButton)
                                .addGap(18, 18, 18)
                                .addComponent(vymazButton)
                                .addGap(0, 26, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idTextField)
                                .addGap(122, 122, 122))
                            .addComponent(poznamkaTextField)
                            .addComponent(telefonEditTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(editaciaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pridatZakaznikaButton)
                        .addGap(18, 18, 18)
                        .addComponent(spatButton)
                        .addGap(44, 44, 44)
                        .addComponent(zoraditLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(podlaPriezviskaButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(podlaIDButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(editaciaLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hladajTelefonButton)
                        .addComponent(telefonLabel)
                        .addComponent(telefonEditTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(filterLabel)
                            .addComponent(idZakaznikaLabel)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(priezviskoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hladajPriezviskoButton)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(poznamkaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(poznamkaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(3, 3, 3))))
                        .addGap(18, 18, 18)
                        .addComponent(telefonFilterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(vymazButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spatButtonActionPerformed
        this.dispose();
        uvodnyPanel.setVisible(true);
    }//GEN-LAST:event_spatButtonActionPerformed

    private void podlaPriezviskaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_podlaPriezviskaButtonActionPerformed
        vstupZoznam = 1;
        aktualizovatZoznam();
    }//GEN-LAST:event_podlaPriezviskaButtonActionPerformed

    private void podlaIDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_podlaIDButtonActionPerformed
        vstupZoznam = 0;
        aktualizovatZoznam();
    }//GEN-LAST:event_podlaIDButtonActionPerformed

    private void priezviskoTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priezviskoTextFieldMouseClicked
        if(priezviskoTextField.getText().equals("Priezvisko")){
            priezviskoTextField.setText("");
        }
    }//GEN-LAST:event_priezviskoTextFieldMouseClicked

    private void telefonFilterTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefonFilterTextFieldMouseClicked
        if(telefonFilterTextField.getText().equals("Telefon")){
            telefonFilterTextField.setText("");
        }
    }//GEN-LAST:event_telefonFilterTextFieldMouseClicked

    private void hladajPriezviskoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hladajPriezviskoButtonActionPerformed
        priezvisko = priezviskoTextField.getText();
        vstupZoznam = 2;
        aktualizovatZoznam();
    }//GEN-LAST:event_hladajPriezviskoButtonActionPerformed

    private void hladajTelefonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hladajTelefonButtonActionPerformed
        String tel = telefonFilterTextField.getText();
        try {
            telefon = Integer.parseInt(tel);
            vstupZoznam = 3;
            aktualizovatZoznam();
        } catch (Exception e) {
            NespravneUdajeDialog nespravnyUdaj = new NespravneUdajeDialog(this, true);
            nespravnyUdaj.setVisible(true);
        }
        
    }//GEN-LAST:event_hladajTelefonButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if(!idTextField.getText().equals("")){
            try {
                id = Long.parseLong(idTextField.getText());
                if(!telefonEditTextField.getText().equals("")){
                    telefon = Integer.parseInt(telefonEditTextField.getText());
                    zakaznikDao.aktualizujTelefon(telefon, id);
                }
                if(!poznamkaTextField.getText().equals("")){
                    String poznamka = poznamkaTextField.getText();
                    zakaznikDao.aktualizujPoznamka(poznamka, id);
                }
                vstupZoznam = 4;
                aktualizovatZoznam();
            } catch (Exception e) {
                NespravneUdajeDialog nespravnyUdaj = new NespravneUdajeDialog(this, true);
                nespravnyUdaj.setVisible(true);
            }
            
        }else{
            NespravneUdajeDialog nespravnyUdaj = new NespravneUdajeDialog(this, true);
            nespravnyUdaj.setVisible(true);   
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void vymazButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vymazButtonActionPerformed
        if(!idTextField.getText().equals("")){
            try {
                id = Long.parseLong(idTextField.getText());
                zakaznikDao.vymazZakaznika(id);
                vstupZoznam = 0;
                this.aktualizovatZoznam();
            } catch (Exception e) {
            }
            
        }else{
            NespravneUdajeDialog nespravnyUdaj = new NespravneUdajeDialog(this, true);
            nespravnyUdaj.setVisible(true);
        }
    }//GEN-LAST:event_vymazButtonActionPerformed

    private void pridatZakaznikaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatZakaznikaButtonActionPerformed
        PridatZakaznika pridatZakaznika = new PridatZakaznika(this, true);
        pridatZakaznika.setVisible(true);
        vstupZoznam = 0;
        this.aktualizovatZoznam();
    }//GEN-LAST:event_pridatZakaznikaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ZakazniciForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZakazniciForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZakazniciForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZakazniciForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZakazniciForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editButton;
    private javax.swing.JLabel editaciaLabel;
    private javax.swing.JLabel filterLabel;
    private javax.swing.JButton hladajPriezviskoButton;
    private javax.swing.JButton hladajTelefonButton;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel idZakaznikaLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton podlaIDButton;
    private javax.swing.JButton podlaPriezviskaButton;
    private javax.swing.JLabel poznamkaLabel;
    private javax.swing.JTextField poznamkaTextField;
    private javax.swing.JButton pridatZakaznikaButton;
    private javax.swing.JTextField priezviskoTextField;
    private javax.swing.JButton spatButton;
    private javax.swing.JTextField telefonEditTextField;
    private javax.swing.JTextField telefonFilterTextField;
    private javax.swing.JLabel telefonLabel;
    private javax.swing.JButton vymazButton;
    private javax.swing.JTable zakaznikTable;
    private javax.swing.JLabel zoraditLabel;
    // End of variables declaration//GEN-END:variables
}
