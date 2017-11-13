package com.thai.intelliexpcab.maingui.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LanguageUI extends JFrame {

    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;

    static LanguageUI sInstance;

    public static LanguageUI getSingleton() {
        if (sInstance == null) {
            synchronized (LanguageUI.class) {
                if (sInstance == null) {
                    sInstance = new LanguageUI();
                }
            }
        }
        return sInstance;
    }


    private LanguageUI() {
        this.setLocation(0, 100);
        this.setUndecorated(true);
        initComponents();
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
        EventQueue.invokeLater(() -> new LanguageUI().setVisible(true));
    }

    private void initComponents() {
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();
        jLabel2 = new JLabel();
        jLabel4 = new JLabel();
        jLabel7 = new JLabel();
        jPanel4 = new JPanel();
        jLabel1 = new JLabel();
        jLabel5 = new JLabel();
        jLabel8 = new JLabel();
        jPanel5 = new JPanel();
        jLabel3 = new JLabel();
        jLabel6 = new JLabel();
        jLabel9 = new JLabel();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jPanel2.setBackground(new Color(255, 209, 34));
        jPanel2.setBorder(BorderFactory.createLineBorder(new Color(255, 209, 34), 2));
        jPanel3.setBackground(new Color(255, 255, 255));
        jPanel3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (!jLabel7.isVisible()) {
                    jLabel7.setVisible(true);
                }
                if (jLabel8.isVisible()) {
                    jLabel8.setVisible(false);
                }
                if (jLabel9.isVisible()) {
                    jLabel9.setVisible(false);
                }
            }
        });
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/icon-china.png"))); // NOI18N
        jLabel4.setFont(new Font("微软雅黑", Font.PLAIN, 16)); // NOI18N
        jLabel4.setForeground(new Color(170, 170, 170));
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("中文");
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/icon-choose.png"))); // NOI18N
//        jLabel7.setVisible(false);
        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4.setBackground(new Color(255, 255, 255));
        jPanel4.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (jLabel7.isVisible()) {
                    jLabel7.setVisible(false);
                }
                if (!jLabel8.isVisible()) {
                    jLabel8.setVisible(true);
                }
                if (jLabel9.isVisible()) {
                    jLabel9.setVisible(false);
                }
            }
        });
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/icon-thailand.png"))); // NOI18N
        jLabel5.setFont(new Font("Browallia New", Font.PLAIN, 32)); // NOI18N
        jLabel5.setForeground(new Color(170, 170, 170));
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setText("ไทย");
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/icon-choose.png"))); // NOI18N
        jLabel8.setVisible(false);
        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5.setBackground(new Color(255, 255, 255));
        jPanel5.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (jLabel7.isVisible()) {
                    jLabel7.setVisible(false);
                }
                if (jLabel8.isVisible()) {
                    jLabel8.setVisible(false);
                }
                if (!jLabel9.isVisible()) {
                    jLabel9.setVisible(true);
                }
            }
        });
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/icon-usa.png"))); // NOI18N
        jLabel6.setFont(new Font("微软雅黑", Font.PLAIN, 18)); // NOI18N
        jLabel6.setForeground(new Color(170, 170, 170));
        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel6.setText("English");
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/icon-choose.png"))); // NOI18N
        jLabel9.setVisible(false);
        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 2, Short.MAX_VALUE))
        );
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        pack();
    }
}
