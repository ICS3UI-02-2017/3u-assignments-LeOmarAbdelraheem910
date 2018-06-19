/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FINAL_ASSIGNMENT;

/**
 *
 * @author Omar
 */
public class TemperatureConverter extends javax.swing.JFrame {

    /**
     * Creates new form TemperatureConverter
     */
    public TemperatureConverter() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        degreesFahrenheitTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fahrenheitToCelsiusKelvin = new javax.swing.JButton();
        celsiusToFahrenheitKelvin = new javax.swing.JButton();
        kelvinTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        degreesCelsiusTextField = new javax.swing.JTextField();
        kelvinToFahrenheitCelsius = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temperature Converter");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel3.setText("Degrees Celsius:");

        degreesFahrenheitTextField.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        degreesFahrenheitTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreesFahrenheitTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel2.setText("Kelvin:");

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel4.setText("Degrees Fahrenheit:");

        fahrenheitToCelsiusKelvin.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        fahrenheitToCelsiusKelvin.setText("F --> C and K");
        fahrenheitToCelsiusKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fahrenheitToCelsiusKelvinActionPerformed(evt);
            }
        });

        celsiusToFahrenheitKelvin.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        celsiusToFahrenheitKelvin.setText("C --> F and K");
        celsiusToFahrenheitKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celsiusToFahrenheitKelvinActionPerformed(evt);
            }
        });

        kelvinTextField.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        kelvinTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelvinTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel1.setText("Welcome to the Temperature Converter!");

        degreesCelsiusTextField.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        degreesCelsiusTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreesCelsiusTextFieldActionPerformed(evt);
            }
        });

        kelvinToFahrenheitCelsius.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        kelvinToFahrenheitCelsius.setText("K --> F and C");
        kelvinToFahrenheitCelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelvinToFahrenheitCelsiusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(degreesFahrenheitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(degreesCelsiusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kelvinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(celsiusToFahrenheitKelvin)
                            .addComponent(fahrenheitToCelsiusKelvin)
                            .addComponent(kelvinToFahrenheitCelsius)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kelvinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kelvinToFahrenheitCelsius))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(degreesCelsiusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celsiusToFahrenheitKelvin))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(degreesFahrenheitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fahrenheitToCelsiusKelvin))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kelvinTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelvinTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kelvinTextFieldActionPerformed

    private void kelvinToFahrenheitCelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelvinToFahrenheitCelsiusActionPerformed
        //Turn the text of the Kelvin textbox from a String to a double.
        String degreesKelvinString = kelvinTextField.getText();

        double degreesKelvin = Double.parseDouble(degreesKelvinString);

        //perform a conversion calculation from Kelvin to Celsius.
        double degreesCelsius = degreesKelvin - 273;

        degreesCelsius = Math.round(degreesCelsius * 100);

        degreesCelsius = degreesCelsius / 100;

        //perform a conversion calculation from Kelvin to Fahrenheit
        double degreesFahrenheit = (degreesKelvin * 9 / 5 - 459.67);

        degreesFahrenheit = Math.round(degreesFahrenheit * 100);

        degreesFahrenheit = degreesFahrenheit / 100;

        //The end result will be a display of the corresponding Celsius and Fahrenheit temperatures.
        String degreesCelsiusText = Double.toString(degreesCelsius);

        String degreesFahrenheitText = Double.toString(degreesFahrenheit);

        degreesCelsiusTextField.setText(degreesCelsiusText);
        degreesFahrenheitTextField.setText(degreesFahrenheitText);
    }//GEN-LAST:event_kelvinToFahrenheitCelsiusActionPerformed

    private void degreesCelsiusTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreesCelsiusTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degreesCelsiusTextFieldActionPerformed

    private void celsiusToFahrenheitKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celsiusToFahrenheitKelvinActionPerformed
        //Turn the text of the Celsius textbox from a String to a double.

        String degreesCelsiusString = degreesCelsiusTextField.getText();

        double degreesCelsius = Double.parseDouble(degreesCelsiusString);

        //perform a conversion calculation from Celsius to Kelvin.
        double degreesKelvin = degreesCelsius + 273;

        degreesCelsius = Math.round(degreesCelsius * 100);

        degreesCelsius = degreesCelsius / 100;

        //perform a conversion calculation from Celsius to Fahrenheit
        double degreesFahrenheit = degreesCelsius * 1.8 + 32;

        degreesFahrenheit = Math.round(degreesFahrenheit * 100);

        degreesFahrenheit = degreesFahrenheit / 100;

        //The end result will be a display of the corresponding Kelvin and Fahrenheit temperatures.
        String KelvinText = Double.toString(degreesKelvin);

        String degreesFahrenheitText = Double.toString(degreesFahrenheit);

        kelvinTextField.setText(KelvinText);
        degreesFahrenheitTextField.setText(degreesFahrenheitText);
    }//GEN-LAST:event_celsiusToFahrenheitKelvinActionPerformed

    private void degreesFahrenheitTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreesFahrenheitTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degreesFahrenheitTextFieldActionPerformed

    private void fahrenheitToCelsiusKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fahrenheitToCelsiusKelvinActionPerformed
        //Turn the text of the Fahrenheit textbox from a String to a double.
        String degreesFahrenheitString = degreesFahrenheitTextField.getText();

        double degreesFahrenheit = Double.parseDouble(degreesFahrenheitString);

        //perform a conversion calculation from Fahrenheit to Kelvin.
        double degreesKelvin = (degreesFahrenheit + 459.67) * 5 / 9;

        degreesKelvin = Math.round(degreesKelvin * 100);

        degreesKelvin = degreesKelvin / 100;

        //perform a conversion calculation from Fahrenheit to Celsius
        double degreesCelsius = (degreesFahrenheit - 32) * 5 / 9;

        degreesCelsius = Math.round(degreesCelsius * 100);

        degreesCelsius = degreesCelsius / 100;

        //The end result will be a display of the corresponding Celsius and Kelvin temperatures.
        String KelvinText = Double.toString(degreesKelvin);

        String degreesCelsiusText = Double.toString(degreesCelsius);

        kelvinTextField.setText(KelvinText);
        degreesCelsiusTextField.setText(degreesCelsiusText);
    }//GEN-LAST:event_fahrenheitToCelsiusKelvinActionPerformed

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
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemperatureConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton celsiusToFahrenheitKelvin;
    private javax.swing.JTextField degreesCelsiusTextField;
    private javax.swing.JTextField degreesFahrenheitTextField;
    private javax.swing.JButton fahrenheitToCelsiusKelvin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField kelvinTextField;
    private javax.swing.JButton kelvinToFahrenheitCelsius;
    // End of variables declaration//GEN-END:variables
}
