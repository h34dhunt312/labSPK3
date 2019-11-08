import jdk.nashorn.internal.scripts.JO;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Gejala extends javax.swing.JFrame {

    public Gejala() {
        initComponents();
    }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents () {

            jButton1 = new javax.swing.JButton();
            jLabel1 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Sistem Pakar Diagnosa Penyakit Lambung");
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

            jButton1.setText("Check Kesehatan Lambung");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jLabel1.setText("Silahkan tekan tombol untuk memulai diagnosa penyakit anda");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap(100, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jButton1)
                                            .addComponent(jLabel1))
                                    .addGap(100, 100, 100))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap(150, Short.MAX_VALUE)
                                    .addComponent(jButton1)
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel1)
                                    .addContainerGap(150, Short.MAX_VALUE))
            );

            getAccessibleContext().setAccessibleDescription("Pembuat Sistem : Caesarico Ariaundhi Bethananda");

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void jButton1ActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            // TODO add your handling code here:
            //Coding untuk menampilkan JDialog berisikan gejala penyakit
            boolean running = true;
            Scanner scan = new Scanner(System.in);

            while (running) {
                int window1 = JOptionPane.showOptionDialog(this,
                        "Apakah Anda SIAP ?",
                        "WINDOW SPK LAMBUNG",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);

                if (window1 == JOptionPane.YES_OPTION) {
                    int gejala1 = JOptionPane.showOptionDialog(this,
                            "Apakah anda mengalami mual dan muntah ?",
                            "Gejala 1",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, null, null);

                    if (gejala1 == JOptionPane.YES_OPTION) {
                        int gejala2 = JOptionPane.showOptionDialog(this,
                                "Apakah nafsu makan anda berkurang ?",
                                "Gejala 2",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE, null, null, null);

                        if (gejala2 == JOptionPane.YES_OPTION) {
                            int gejala3 = JOptionPane.showOptionDialog(this,
                                    "Apakah perut Anda sakit ?",
                                    "Gejala 3",
                                    JOptionPane.YES_NO_OPTION,
                                    JOptionPane.QUESTION_MESSAGE, null, null, null);

                            if (gejala3 == JOptionPane.YES_OPTION) {
                                int gejala4 = JOptionPane.showOptionDialog(this,
                                        "Apakah perut Anda kembung ?",
                                        "Gejala 4",
                                        JOptionPane.YES_NO_OPTION,
                                        JOptionPane.QUESTION_MESSAGE, null, null, null);

                                if (gejala4 == JOptionPane.YES_OPTION) {
                                    int gejala5 = JOptionPane.showOptionDialog(this,
                                            "Apakah Anda merasakan nyeri pada ulung hati ?",
                                            "Gejala 5",
                                            JOptionPane.YES_NO_OPTION,
                                            JOptionPane.QUESTION_MESSAGE, null, null, null);

                                    if (gejala5 == JOptionPane.YES_OPTION) {
                                        int gejala6 = JOptionPane.showOptionDialog(this,
                                                "Apakah Anda merasakan panas di dada ?",
                                                "Gejala 6",
                                                JOptionPane.YES_NO_OPTION,
                                                JOptionPane.QUESTION_MESSAGE, null, null, null);

                                        if (gejala6 == JOptionPane.YES_OPTION) {
                                            int gejala20 = JOptionPane.showOptionDialog(this,
                                                    "Apakah Anda mudah kenyang ?",
                                                    "Gejala 20",
                                                    JOptionPane.YES_NO_OPTION,
                                                    JOptionPane.QUESTION_MESSAGE, null, null, null);

                                            if (gejala20 == JOptionPane.YES_OPTION) {
                                                int gejala21 = JOptionPane.showOptionDialog(this,
                                                        "Apakah Anda mengalami keluar cairan dari lambung ?",
                                                        "Gejala 21",
                                                        JOptionPane.YES_NO_OPTION,
                                                        JOptionPane.QUESTION_MESSAGE, null, null, null);

                                                    if (gejala21 == JOptionPane.YES_OPTION) {
                                                        JOptionPane.showMessageDialog(this,
                                                                "Anda Mengalami Penyakit DISPEPSIA");


                                                        int gejala16 = JOptionPane.showOptionDialog(this,
                                                                "Apakah lambung Anda terasa panas ?",
                                                                "Gejala Penyakit 16",
                                                                JOptionPane.YES_NO_OPTION,
                                                                JOptionPane.QUESTION_MESSAGE, null, null, null);


                                                }
                                            }
                                        }
                                    }
                                    else if (gejala5 == JOptionPane.NO_OPTION) {
                                        int gejala13 = JOptionPane.showOptionDialog(this,
                                                "Apakah Anda merasakan nyeri saat menelan ?",
                                                "Gejala 13",
                                                JOptionPane.YES_NO_OPTION,
                                                JOptionPane.QUESTION_MESSAGE, null, null, null);

                                        if (gejala13 == JOptionPane.YES_OPTION) {
                                            int gejala14 = JOptionPane.showOptionDialog(this,
                                                    "Apakah Tinja/Feses Anda berwarna hitam/berdarah ?",
                                                    "Gejala 14",
                                                    JOptionPane.YES_NO_OPTION,
                                                    JOptionPane.QUESTION_MESSAGE, null, null, null);

                                            if (gejala14 == JOptionPane.YES_OPTION) {
                                                int gejala15 = JOptionPane.showOptionDialog(this,
                                                        "Apakah berat badan Anda menurun ?",
                                                        "Gejala 15",
                                                        JOptionPane.YES_NO_OPTION,
                                                        JOptionPane.QUESTION_MESSAGE, null, null, null);

                                                if (gejala15 == JOptionPane.YES_OPTION) {
                                                    int gejala16 = JOptionPane.showOptionDialog(this,
                                                            "Apakah lambung Anda terasa panas ?",
                                                            "Gejala 16",
                                                            JOptionPane.YES_NO_OPTION,
                                                            JOptionPane.QUESTION_MESSAGE, null, null, null);

                                                    if (gejala16 == JOptionPane.YES_OPTION) {
                                                        int gejala17 = JOptionPane.showOptionDialog(this,
                                                                "Apakah merasakan lemah/letih/lesu ?",
                                                                "Gejala 17",
                                                                JOptionPane.YES_NO_OPTION,
                                                                JOptionPane.QUESTION_MESSAGE, null, null, null);

                                                        if (gejala17 == JOptionPane.YES_OPTION) {
                                                            JOptionPane.showMessageDialog(this,
                                                                    "Anda mengalami penyakit KANKER LAMBUNG");
                                                        }
                                                    }
                                                }
                                            }
                                            else if (gejala14 == JOptionPane.NO_OPTION) {
                                                int gejala15 = JOptionPane.showOptionDialog(this,
                                                        "Apakah berat badan Anda menurun ?",
                                                        "Gejala 15",
                                                        JOptionPane.YES_NO_OPTION,
                                                        JOptionPane.QUESTION_MESSAGE, null, null, null);

                                                if (gejala15 == JOptionPane.YES_OPTION) {
                                                    int gejala16 = JOptionPane.showOptionDialog(this,
                                                            "Apakah lambung Anda terasa panas ?",
                                                            "Gejala 16",
                                                            JOptionPane.YES_NO_OPTION,
                                                            JOptionPane.QUESTION_MESSAGE, null, null, null);

                                                    if (gejala16 == JOptionPane.YES_OPTION) {
                                                        JOptionPane.showMessageDialog(this,
                                                                "Anda mengalami penyakit GASTROPARESIS");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                else if (gejala4 == JOptionPane.NO_OPTION) {
                                    int gejala5 = JOptionPane.showOptionDialog(this,
                                            "Apakah Anda merasakan nyeri pada ulung hati ?",
                                            "Gejala 5",
                                            JOptionPane.YES_NO_OPTION,
                                            JOptionPane.QUESTION_MESSAGE, null, null, null);

                                    if (gejala5 == JOptionPane.YES_OPTION) {
                                        int gejala18 = JOptionPane.showOptionDialog(this,
                                                "Apakah Anda merasakan sesak nafas ?",
                                                "Gejala 18",
                                                JOptionPane.YES_NO_OPTION,
                                                JOptionPane.QUESTION_MESSAGE, null, null, null);

                                        if (gejala18 == JOptionPane.YES_OPTION) {
                                            int gejala19 = JOptionPane.showOptionDialog(this,
                                                    "Apakah muka Anda pucat ?",
                                                    "Gejala 19",
                                                    JOptionPane.YES_NO_OPTION,
                                                    JOptionPane.QUESTION_MESSAGE, null, null, null);

                                            if (gejala19 == JOptionPane.YES_OPTION) {
                                                JOptionPane.showMessageDialog(this,
                                                        "Anda mengalami penyakit MAAG");
                                            }
                                        }
                                    }
                                }
                            }
                            else if (gejala3 == JOptionPane.NO_OPTION) {
                                int gejala5 = JOptionPane.showOptionDialog(this,
                                        "Apakah Anda merasakan nyeri pada ulung hati ?",
                                        "Gejala 5",
                                        JOptionPane.YES_NO_OPTION,
                                        JOptionPane.QUESTION_MESSAGE, null, null, null);

                                if (gejala5 == JOptionPane.YES_OPTION) {
                                    int gejala22 = JOptionPane.showOptionDialog(this,
                                            "Apakah merasakan sakit pada tukak lambung ?",
                                            "Gejala Penyakit22",
                                            JOptionPane.YES_NO_OPTION,
                                            JOptionPane.QUESTION_MESSAGE, null, null, null);

                                    if (gejala22 == JOptionPane.YES_OPTION) {
                                        JOptionPane.showMessageDialog(this,
                                                "Anda mengalami penyakit TUKAK LAMBUNG");
                                    }
                                }
                            }
                        }
                        else if (gejala2 == JOptionPane.NO_OPTION) {
                            int gejala6 = JOptionPane.showOptionDialog(this,
                                    "Apakah Anda merasakan panas di dada ?",
                                    "Gejala 6",
                                    JOptionPane.YES_NO_OPTION,
                                    JOptionPane.QUESTION_MESSAGE, null, null, null);

                            if (gejala6 == JOptionPane.YES_OPTION) {
                                int gejala7 = JOptionPane.showOptionDialog(this,
                                        "Apakah Anda merasakan nyeri di dada ?",
                                        "Gejala 7",
                                        JOptionPane.YES_NO_OPTION,
                                        JOptionPane.QUESTION_MESSAGE, null, null, null);

                                if (gejala7 == JOptionPane.YES_OPTION) {
                                    int gejala8 = JOptionPane.showOptionDialog(this,
                                            "Apakah Anda sering sendawa ?",
                                            "Gejala 8",
                                            JOptionPane.YES_NO_OPTION,
                                            JOptionPane.QUESTION_MESSAGE, null, null, null);

                                    if (gejala8 == JOptionPane.YES_OPTION) {
                                        int gejala9 = JOptionPane.showOptionDialog(this,
                                                "Apakah Anda sering cegukan ?",
                                                "Gejala Penyakit 9",
                                                JOptionPane.YES_NO_OPTION,
                                                JOptionPane.QUESTION_MESSAGE, null, null, null);

                                        if (gejala9 == JOptionPane.YES_OPTION) {
                                            int gejala10 = JOptionPane.showOptionDialog(this,
                                                    "Apakah Anda mengalami suara serak ?",
                                                    "Gejala 10",
                                                    JOptionPane.YES_NO_OPTION,
                                                    JOptionPane.QUESTION_MESSAGE, null, null, null);

                                            if (gejala10 == JOptionPane.YES_OPTION) {
                                                int gejala11 = JOptionPane.showOptionDialog(this,
                                                        "Apakah perut Anda sulit menelan ?",
                                                        "Gejala 11",
                                                        JOptionPane.YES_NO_OPTION,
                                                        JOptionPane.QUESTION_MESSAGE, null, null, null);

                                                if (gejala11 == JOptionPane.YES_OPTION) {
                                                    int gejala12 = JOptionPane.showOptionDialog(this,
                                                            "Apakah Anda merasakan sulit untuk menelan ?",
                                                            "Gejala 12",
                                                            JOptionPane.YES_NO_OPTION,
                                                            JOptionPane.QUESTION_MESSAGE, null, null, null);

                                                    if (gejala12 == JOptionPane.YES_OPTION) {
                                                        JOptionPane.showMessageDialog(this,
                                                                "Anda mengalami penyakit GERD");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        running = false;
                    }
                }
                running = false;
        }
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
                    java.util.logging.Logger.getLogger(Gejala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(Gejala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(Gejala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(Gejala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new Gejala().setVisible(true);
                    }
                });
            }

            // Variables declaration - do not modify//GEN-BEGIN:variables
            private javax.swing.JButton jButton1;
            private javax.swing.JLabel jLabel1;
            // End of variables declaration//GEN-END:variables
        }