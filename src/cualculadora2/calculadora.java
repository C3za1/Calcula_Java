
package cualculadora2;


public class calculadora extends javax.swing.JFrame {
String memoria1;
String signo;
String memoria2;
   
    public calculadora() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtresultado = new javax.swing.JTextPane();
        boton1 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        ejecutar = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton_resta = new javax.swing.JButton();
        boton_mult = new javax.swing.JButton();
        boton_suma = new javax.swing.JButton();
        boton_div = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(txtresultado);

        boton1.setBackground(new java.awt.Color(153, 153, 153));
        boton1.setForeground(new java.awt.Color(255, 51, 51));
        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton7.setBackground(new java.awt.Color(153, 153, 153));
        boton7.setForeground(new java.awt.Color(255, 51, 51));
        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });

        boton4.setBackground(new java.awt.Color(153, 153, 153));
        boton4.setForeground(new java.awt.Color(255, 51, 51));
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton0.setBackground(new java.awt.Color(153, 153, 153));
        boton0.setForeground(new java.awt.Color(255, 51, 51));
        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });

        boton2.setBackground(new java.awt.Color(153, 153, 153));
        boton2.setForeground(new java.awt.Color(255, 51, 51));
        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton8.setBackground(new java.awt.Color(153, 153, 153));
        boton8.setForeground(new java.awt.Color(255, 51, 51));
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });

        boton5.setBackground(new java.awt.Color(153, 153, 153));
        boton5.setForeground(new java.awt.Color(255, 51, 51));
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        ejecutar.setBackground(new java.awt.Color(153, 153, 153));
        ejecutar.setForeground(new java.awt.Color(255, 51, 51));
        ejecutar.setText("Ejecutar");
        ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarActionPerformed(evt);
            }
        });

        boton3.setBackground(new java.awt.Color(153, 153, 153));
        boton3.setForeground(new java.awt.Color(255, 51, 51));
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        boton9.setBackground(new java.awt.Color(153, 153, 153));
        boton9.setForeground(new java.awt.Color(255, 51, 51));
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });

        boton6.setBackground(new java.awt.Color(153, 153, 153));
        boton6.setForeground(new java.awt.Color(255, 51, 51));
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });

        boton_resta.setBackground(new java.awt.Color(153, 153, 153));
        boton_resta.setForeground(new java.awt.Color(255, 51, 51));
        boton_resta.setText("-");
        boton_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_restaActionPerformed(evt);
            }
        });

        boton_mult.setBackground(new java.awt.Color(153, 153, 153));
        boton_mult.setForeground(new java.awt.Color(255, 51, 51));
        boton_mult.setText("*");
        boton_mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_multActionPerformed(evt);
            }
        });

        boton_suma.setBackground(new java.awt.Color(153, 153, 153));
        boton_suma.setForeground(new java.awt.Color(255, 51, 51));
        boton_suma.setText("+");
        boton_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_sumaActionPerformed(evt);
            }
        });

        boton_div.setBackground(new java.awt.Color(153, 153, 153));
        boton_div.setForeground(new java.awt.Color(255, 51, 51));
        boton_div.setText("/");
        boton_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_divActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton4)
                        .addGap(18, 18, 18)
                        .addComponent(boton5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton7)
                        .addGap(18, 18, 18)
                        .addComponent(boton8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton9)
                        .addGap(18, 18, 18)
                        .addComponent(boton_mult, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton6)
                        .addGap(18, 18, 18)
                        .addComponent(boton_suma))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton3)
                        .addGap(18, 18, 18)
                        .addComponent(boton0)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_div, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton7)
                    .addComponent(boton8)
                    .addComponent(boton9)
                    .addComponent(boton_mult)
                    .addComponent(boton_div))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton4)
                    .addComponent(boton5)
                    .addComponent(boton6)
                    .addComponent(boton_suma)
                    .addComponent(boton_resta))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton1)
                            .addComponent(boton2)
                            .addComponent(boton3)
                            .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ejecutar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(152, 152, 152))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
      
      String b1 =this.txtresultado.getText();
        
        
        if (b1.length()<=8) {
            txtresultado.setText(txtresultado.getText()+"1");
        }
        else
        {
            txtresultado.setText("Error");
        }
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        String b1 =this.txtresultado.getText();
        
        
        if (b1.length()<=8) {
            txtresultado.setText(txtresultado.getText()+"2");
        }
        else
        {
            txtresultado.setText("Error");
        }
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
      
        String b1 =this.txtresultado.getText();
        
        
        if (b1.length()<=8) {
            txtresultado.setText(txtresultado.getText()+"3");
        }
        else
        {
            txtresultado.setText("Error");
        }
      }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        String b1 =this.txtresultado.getText();
        
        
        if (b1.length()<=8) {
            txtresultado.setText(txtresultado.getText()+"4");
        }
        else
        {
            txtresultado.setText("Error");
        }
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
         String b1 =this.txtresultado.getText();
        
        
        if (b1.length()<=8) {
            txtresultado.setText(txtresultado.getText()+"5");
        }
        else
        {
            txtresultado.setText("Error");
        }
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
         String b1 =this.txtresultado.getText();
        
        
        if (b1.length()<=8) {
            txtresultado.setText(txtresultado.getText()+"6");
        }
        else
        {
            txtresultado.setText("Error");
        }
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
         String b1 =this.txtresultado.getText();
        
        
        if (b1.length()<=8) {
            txtresultado.setText(txtresultado.getText()+"7");
        }
        else
        {
            txtresultado.setText("Error");
        }
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
         String b1 =this.txtresultado.getText();
        
        
        if (b1.length()<=8) {
            txtresultado.setText(txtresultado.getText()+"8");
        }
        else
        {
            txtresultado.setText("Error");
        }
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        String b1 =this.txtresultado.getText();
        
        
        if (b1.length()<=8) {
            txtresultado.setText(txtresultado.getText()+"9");
        }
        else
        {
            txtresultado.setText("Error");
        }
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
         String b1 =this.txtresultado.getText();
        
        
        if (b1.length()<=8) {
            txtresultado.setText(txtresultado.getText()+"0");
        }
        else
        {
            txtresultado.setText("Error");
        }
    }//GEN-LAST:event_boton0ActionPerformed

    private void boton_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_restaActionPerformed
        if (!txtresultado.getText().equals("")) {
            memoria1=txtresultado.getText();
            signo="-";
            txtresultado.setText("");
        }
    }//GEN-LAST:event_boton_restaActionPerformed

    private void boton_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_sumaActionPerformed
        if (!txtresultado.getText().equals("")) {
            memoria1=txtresultado.getText();
            signo="+";
            txtresultado.setText("");
        }
    }//GEN-LAST:event_boton_sumaActionPerformed

    private void boton_multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_multActionPerformed
       if (!txtresultado.getText().equals("")) {
            memoria1=txtresultado.getText();
            signo="*";
            txtresultado.setText("");
        }
    }//GEN-LAST:event_boton_multActionPerformed

    private void boton_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_divActionPerformed
        if (!txtresultado.getText().equals("")) {
            memoria1=txtresultado.getText();
            signo="/";
            txtresultado.setText("");
        }
    }//GEN-LAST:event_boton_divActionPerformed

    private void ejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarActionPerformed
       String resultado;
       memoria2=txtresultado.getText();
       
        if (! memoria2.equals("")) {
            
            resultado=calculadora(memoria1,memoria2,signo);
            txtresultado.setText(resultado);
        }
    }//GEN-LAST:event_ejecutarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtresultado.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static String calculadora(String memoria1, String memoria2, String signo){
    Double resultado=0.0;
    String respuesta;
    
        if (signo.equals("-")) {
            resultado=Double.parseDouble(memoria1)-Double.parseDouble(memoria2);
            
        }
        if (signo.equals("+")) {
            resultado=Double.parseDouble(memoria1)+Double.parseDouble(memoria2);
            
        }
        if (signo.equals("*")) {
            resultado=Double.parseDouble(memoria1)*Double.parseDouble(memoria2);
            
        }
        if (signo.equals("/")) {
            resultado=Double.parseDouble(memoria1)/Double.parseDouble(memoria2);
            
        }
        
        respuesta=resultado.toString();
        return respuesta;
    }
    
    
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
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton boton_div;
    private javax.swing.JButton boton_mult;
    private javax.swing.JButton boton_resta;
    private javax.swing.JButton boton_suma;
    private javax.swing.JButton ejecutar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtresultado;
    // End of variables declaration//GEN-END:variables
}
