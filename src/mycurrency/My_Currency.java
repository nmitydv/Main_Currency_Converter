package mycurrency;

public class My_Currency extends javax.swing.JFrame {

        String[] currencyUnits = {
                        "Units",
                        "INR",
                        "AFN",
                        "ALL",
                        "AOA",
                        "USD",
                        "XCD",
                        "ARS",
                        "AMD",
                        "AWG",
                        "AUD",
                        "AZN",
                        "EUR",
                        "BSD",
                        "BHD",
                        "BDT",
                        "BBD" };
        Double India = 1.0;
        Double Afghani = 0.95;
        Double Lek = 182.52;
        Double Algerian_Dinar = 1.66;
        Double US_Dollar = 0.012;
        Double Kwanzan = 5.49;
        Double East_Caribbean_Dollar = 0.033;
        Double Argentine_Peso = 3.13;
        Double Armeniam_Dram = 4.70;
        Double Aruban_Florin = 4.70;
        Double Australian_Dollar = 0.018;
        Double Euro = 0.011;
        Double Azerbaijanian_Manat = 0.021;
        Double Bahamian_Dollar = 0.012;
        Double Bahraini_Dinar = 0.0046;
        Double Bangladesh_Taka = 1.32;
        Double Barbados_Dollar = 0.025;

        public My_Currency() {
                initComponents();
        }

        @SuppressWarnings("unchecked")

        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                firstCountry = new javax.swing.JComboBox<>();
                secondCountry = new javax.swing.JComboBox<>();
                T1 = new javax.swing.JTextField();
                T2 = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                firstcurrencyunit = new javax.swing.JLabel();
                secondcurrencyunit = new javax.swing.JLabel();
                jButton2 = new javax.swing.JButton();
                jButton1 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 6));

                jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 28)); // NOI18N
                jLabel1.setText(" CURRENCY_CONVERTER");

                firstCountry.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
                firstCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One...", "India",
                                "Afghani", "Lek", "Algerian_Dinar", "US_Dollar", "Kwanzan", "East_Caribbean_Dollar",
                                "Argentine_Peso", "Armeniam_Dram", "Aruban_Florin", "Australian_Dollar", "Euro",
                                "Azerbaijanian_Manat", "Bahamian_Dollar", "Bahraini_Dinar", "Bangladesh_Taka",
                                "Barbados_Dollar" }));
                firstCountry.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                firstCountryItemStateChanged(evt);
                        }
                });

                secondCountry.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
                secondCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One...", "India",
                                "Afghani", "Lek", "Algerian_Dinar", "US_Dollar", "Kwanzan", "East_Caribbean_Dollar",
                                "Argentine_Peso", "Armeniam_Dram", "Aruban_Florin", "Australian_Dollar", "Euro",
                                "Azerbaijanian_Manat", "Bahamian_Dollar", "Bahraini_Dinar", "Bangladesh_Taka",
                                "Barbados_Dollar" }));
                secondCountry.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                secondCountryItemStateChanged(evt);
                        }
                });

                T1.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N

                T2.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
                T2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                T2ActionPerformed(evt);
                        }
                });

                jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
                jLabel2.setText("From Currency ");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
                jLabel3.setText("To Currency ");

                firstcurrencyunit.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
                firstcurrencyunit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                firstcurrencyunit.setText("units");

                secondcurrencyunit.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
                secondcurrencyunit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                secondcurrencyunit.setText("units");

                jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
                jButton2.setText("Convert_Currency");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
                jButton1.setText("Reset");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(62, 62, 62)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(firstcurrencyunit,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(firstCountry, 0, 242,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(T1))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(T2)
                                                                                .addComponent(secondcurrencyunit,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel3,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(secondCountry, 0, 242,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(53, 53, 53))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(239, 239, 239)
                                                                                                .addComponent(jLabel1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                342,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(214, 214, 214)
                                                                                                .addComponent(jButton2)
                                                                                                .addGap(145, 145, 145)
                                                                                                .addComponent(jButton1)))
                                                                .addContainerGap(231, Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(17, 17, 17)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                46,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(21, 21, 21)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel3))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(firstCountry,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                36, Short.MAX_VALUE)
                                                                                .addComponent(secondCountry))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(T1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(T2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(secondcurrencyunit)
                                                                                .addComponent(firstcurrencyunit))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                97, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jButton2)
                                                                                .addComponent(jButton1))
                                                                .addGap(60, 60, 60)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(28, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));

                pack();
        }

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
                double amounttochange = Double.parseDouble(T1.getText());
                double amountInINR = 0.0;
                double amount = 0.0;
                switch (firstCountry.getSelectedItem().toString()) {
                        case "Afghani":
                                amount = amounttochange * Afghani;
                                break;
                        case "India":
                                amount = amounttochange * India;
                                break;
                        case "Lek":
                                amount = amounttochange * Lek;
                                break;
                        case "Algerian_Dinar":
                                amount = amounttochange * Algerian_Dinar;
                                break;
                        case "US_Dollar":
                                amount = amounttochange * US_Dollar;
                                break;

                        case "Kwanzan":
                                amount = amounttochange * Kwanzan;
                                break;
                        case "East_Caribbean_Dollar":
                                amount = amounttochange * East_Caribbean_Dollar;
                                break;
                        case "Argentine_Peso":
                                amount = amounttochange * Argentine_Peso;
                                break;
                        case "Armeniam_Dram":
                                amount = amounttochange * Armeniam_Dram;
                                break;
                        case "Aruban_Florin":
                                amount = amounttochange * Aruban_Florin;
                                break;
                        case "Australian_Dollar":
                                amount = amounttochange * Australian_Dollar;
                                break;
                        case "Euro":
                                amount = amounttochange * Euro;
                                break;
                        case "Azerbaijanian_Manat":
                                amount = amounttochange * Azerbaijanian_Manat;
                                break;
                        case "Bahamian_Dollar":
                                amount = amounttochange * Bahamian_Dollar;
                                break;
                        case "Bahraini_Dinar":
                                amount = amounttochange * Bahraini_Dinar;
                                break;
                        case "Bangladesh_Taka":
                                amount = amounttochange * Bangladesh_Taka;
                                break;
                        case "Barbados_Dollar":
                                amount = amounttochange * Barbados_Dollar;
                                break;
                }

                switch (secondCountry.getSelectedItem().toString()) {
                        case "Lek":
                                amount = amount * Lek;
                                break;
                        case "Afghani":
                                amount = amount * Afghani;
                                break;
                        case "India":
                                amount = amount * India;
                                break;

                        case "Algerian_Dinar":
                                amount = amount * Algerian_Dinar;
                                break;
                        case "US_Dollar":
                                amount = amount * US_Dollar;
                                break;

                        case "Kwanzan":
                                amount = amount * Kwanzan;
                                break;
                        case "East_Caribbean_Dollar":
                                amount = amount * East_Caribbean_Dollar;
                                break;
                        case "Argentine_Peso":
                                amount = amount * Argentine_Peso;
                                break;
                        case "Armeniam_Dram":
                                amount = amount * Armeniam_Dram;
                                break;
                        case "Aruban_Florin":
                                amount = amount * Aruban_Florin;
                                break;
                        case "Australian_Dollar":
                                amount = amount * Australian_Dollar;
                                break;
                        case "Euro":
                                amount = amount * Euro;
                                break;
                        case "Azerbaijanian_Manat":
                                amount = amount * Azerbaijanian_Manat;
                                break;
                        case "Bahamian_Dollar":
                                amount = amount * Bahamian_Dollar;
                                break;
                        case "Bahraini_Dinar":
                                amount = amount * Bahraini_Dinar;
                                break;
                        case "Bangladesh_Taka":
                                amount = amount * Bangladesh_Taka;
                                break;
                        case "Barbados_Dollar":
                                amount = amount * Barbados_Dollar;
                                break;
                }
                // YE SIRF EK COUNTRY TO ANOTHER COUNTRY ME HI KAR SAKTA H ISKE AAGE KA CODE
                // LIKHNA H
                String value = String.format("%.2f", amount);
                T2.setText(value);
        }

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
                secondCountry.setSelectedIndex(0);
                firstCountry.setSelectedIndex(0);
                T1.setText("");
                T2.setText("");
        }

        private void secondCountryItemStateChanged(java.awt.event.ItemEvent evt) {
                int position = secondCountry.getSelectedIndex();
                secondcurrencyunit.setText(currencyUnits[position]);

        }

        private void T2ActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void firstCountryItemStateChanged(java.awt.event.ItemEvent evt) {
                int position = firstCountry.getSelectedIndex();
                firstcurrencyunit.setText(currencyUnits[position]);

        }

        public static void main(String args[]) {

                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(My_Currency.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(My_Currency.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(My_Currency.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(My_Currency.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new My_Currency().setVisible(true);
                        }
                });
        }

        private javax.swing.JTextField T1;
        private javax.swing.JTextField T2;
        private javax.swing.JComboBox<String> firstCountry;
        private javax.swing.JLabel firstcurrencyunit;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JComboBox<String> secondCountry;
        private javax.swing.JLabel secondcurrencyunit;
}