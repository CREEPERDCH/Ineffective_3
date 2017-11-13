package com.thai.intelliexpcab.maingui.ui;


import com.thai.intelliexpcab.initdevice.ui.InitStart;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

public class MainPageUI extends JFrame {

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel8;
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
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel6 = new JLabel();
        jLabel8 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jPanel3 = new CustomPanel();
        jLabel5 = new JLabel();
        jButton3 = new JButton();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(255, 255, 255));

        jPanel2.setBackground(new Color(250, 183, 32));

        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/icon-language.png"))); // NOI18N
        jLabel1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                MainPageUI.this.setAlwaysOnTop(false);
                LanguageUI.getSingleton().setVisible(true);
            }
        });
        jLabel2.setFont(new java.awt.Font("微软雅黑", Font.PLAIN, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("十号巷  宏府东街  市中心行政区  曼谷");
        jLabel3.setVerticalAlignment(SwingConstants.TOP);
        jLabel4.setVerticalAlignment(SwingConstants.BOTTOM);
        jLabel6.setFont(new java.awt.Font("微软雅黑", Font.PLAIN, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel6.setText("快递柜地址 : ");
        jLabel8.setFont(new java.awt.Font("微软雅黑", Font.PLAIN, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel8.setText("01022228889");
        jLabel8.setVerticalAlignment(SwingConstants.TOP);
        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jButton1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/send.png"))); // NOI18N
        jButton1.addActionListener(e -> {
            new SendInputUI().setVisible(true);
            this.dispose();
        });
        jButton2.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/take.png"))); // NOI18N
        jButton2.addActionListener(e -> {
            new TakeInputUI().setVisible(true);
            this.dispose();
        });
        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/icon-manage.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                new InitStart().setVisible(true);
                MainPageUI.this.dispose();
            }
        });
        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(341, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(27, 27, 27))
        );
        jButton3.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/custom.png"))); // NOI18N
        jButton3.addActionListener(e -> {
            new CustomerUI().setVisible(true);
            this.dispose();
        });
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, javax.swing
                                        .GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 320, GroupLayout
                                                        .PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 512, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short
                                        .MAX_VALUE)
                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, javax.swing
                                        .GroupLayout.PREFERRED_SIZE))
        );
        this.setTimer1(jLabel4);
        this.setTimer2(jLabel3);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        }).start();
    }

    private void setTimer2(JLabel label) {
        final JLabel time = label;
        new Timer(1000, e -> {
            long currentTimeMillis = System.currentTimeMillis();
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM月dd日 EEEE");
            time.setText(simpleDateFormat2.format(currentTimeMillis));
            time.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        }).start();
    }
}
