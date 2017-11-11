package com.thai.intelliexpcab.maingui.ui;


import com.thai.intelliexpcab.initdevice.ui.InitStart;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

public class MainPageUI extends JFrame {

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;

    public MainPageUI() {
        this.setUndecorated(true);
//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.requestFocus();
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setLocation(0, 0);
        initComponents();
    }

    public static void main(String[] args) {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
        EventQueue.invokeLater(() -> new MainPageUI().setVisible(true));
    }

    private void initComponents() {
        jPanel1 = new CustomPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jPanel2 = new JPanel();
        jLabel3 = new JLabel();
        jLabel1 = new JLabel();
        jLabel4 = new JLabel();
        jPanel3 = new JPanel();
        jButton4 = new JButton();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jPanel1.setBackground(new Color(255, 255, 255));
        jButton1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/main_send.png"))); // NOI18N
        jButton1.addActionListener(evt -> {
            new SendInputUI().setVisible(true);
            this.dispose();
        });
        jButton2.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/main_take.png"))); // NOI18N
        jButton2.addActionListener(evt -> {
            new TakeInputUI().setVisible(true);
            this.dispose();
        });
        jButton3.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/main_costumer.png"))); // NOI18N
        jButton3.addActionListener(evt -> {
            new CustomerUI().setVisible(true);
            MainPageUI.this.dispose();
        });
        jPanel2.setBackground(new Color(251, 205, 57));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/main_top.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        this.setTimer1(jLabel1);
        this.setTimer2(jLabel4);
        jPanel3.setBackground(new Color(250, 183, 32));
        jPanel3.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                MainPageUI.this.setAlwaysOnTop(false);
                LanguageUI.getSingleton().setVisible(true);
            }
        });
        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short
                                                .MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout
                                                        .PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout
                                                        .PREFERRED_SIZE))
                                        .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short
                                                .MAX_VALUE)
                                        .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short
                                                .MAX_VALUE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jButton4.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/icon-manage.png"))); // NOI18N
        jButton4.addActionListener(evt -> {
            new InitStart().setVisible(true);
            this.dispose();
        });
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 2, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 363, Short.MAX_VALUE)
                                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 84, GroupLayout
                                                        .PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short
                                        .MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 370, GroupLayout
                                                        .PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 169, GroupLayout
                                                        .PREFERRED_SIZE))
                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 545, GroupLayout.PREFERRED_SIZE))
                                .addGap(271, 271, 271)
                                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 1024, Short.MAX_VALUE)
        );
        pack();
    }

    private void setTimer1(JLabel label) {
        final JLabel time = label;
        new Timer(1000, e -> {
            long currentTimeMillis = System.currentTimeMillis();
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("HH:mm:ss");
            time.setText("       " + simpleDateFormat1.format(currentTimeMillis));
            time.setFont(new Font("微软雅黑", Font.PLAIN, 18));
//            time.setHorizontalTextPosition(SwingConstants.BOTTOM);
        }).start();
    }

    private void setTimer2(JLabel label) {
        final JLabel time = label;
        new Timer(1000, e -> {
            long currentTimeMillis = System.currentTimeMillis();
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM月dd日 EEEE");
            time.setText(simpleDateFormat2.format(currentTimeMillis));
            time.setFont(new Font("微软雅黑", Font.PLAIN, 14));
//            time.setHorizontalTextPosition(SwingConstants.RIGHT);
        }).start();
    }
}
