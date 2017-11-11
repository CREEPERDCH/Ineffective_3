package com.thai.intelliexpcab.maingui.ui;

import javax.swing.*;
import java.awt.*;

public class SendChooseUI extends JFrame {

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton20;
    private JButton jButton25;
    private JButton jButton29;
    private JButton jButton30;
    private JButton jButton31;
    private JButton jButton32;
    private JButton jButton33;
    private JButton jButton34;
    private JButton jButton35;
    private JButton jButton36;
    private JButton jButton37;
    private JButton jButton38;
    private JButton jButton39;
    private JButton jButton40;
    private JButton jButton41;
    private JButton jButton42;
    private JButton jButton43;
    private JButton jButton44;
    private JButton jButton45;
    private JButton jButton46;
    private JButton jButton47;
    private JButton jButton48;
    private JButton jButton67;
    private JButton jButton68;
    private JButton jButton69;
    private JButton jButton70;
    private JButton jButton71;
    private JButton jButton72;
    private JButton jButton73;
    private JButton jButton74;
    private JButton jButton75;
    private JButton jButton76;
    private JButton jButton77;
    private JButton jButton78;
    private JButton jButton79;
    private JButton jButton80;
    private JButton jButton81;
    private JButton jButton82;
    private JButton jButton83;
    private JButton jButton84;
    private JButton jButton85;
    private JButton jButton86;
    private JButton jButton87;
    private JButton jButton88;
    private JButton jButton89;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;

    public SendChooseUI() {
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
        EventQueue.invokeLater(() -> new SendChooseUI().setVisible(true));
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jButton1 = new JButton();
        jLabel1 = new JLabel();
        jButton20 = new JButton();
        jButton25 = new JButton();
        jPanel3 = new JPanel();
        jButton2 = new JButton();
        jButton48 = new JButton();
        jButton47 = new JButton();
        jButton67 = new JButton();
        jButton68 = new JButton();
        jButton69 = new JButton();
        jButton70 = new JButton();
        jButton71 = new JButton();
        jButton72 = new JButton();
        jButton73 = new JButton();
        jButton74 = new JButton();
        jButton75 = new JButton();
        jButton76 = new JButton();
        jButton77 = new JButton();
        jButton78 = new JButton();
        jButton29 = new JButton();
        jButton30 = new JButton();
        jButton31 = new JButton();
        jButton32 = new JButton();
        jButton33 = new JButton();
        jButton38 = new JButton();
        jButton39 = new JButton();
        jButton40 = new JButton();
        jButton41 = new JButton();
        jButton42 = new JButton();
        jButton79 = new JButton();
        jButton80 = new JButton();
        jButton81 = new JButton();
        jButton82 = new JButton();
        jButton83 = new JButton();
        jButton84 = new JButton();
        jButton85 = new JButton();
        jButton86 = new JButton();
        jButton87 = new JButton();
        jButton88 = new JButton();
        jButton34 = new JButton();
        jButton35 = new JButton();
        jButton36 = new JButton();
        jButton37 = new JButton();
        jButton43 = new JButton();
        jButton44 = new JButton();
        jButton45 = new JButton();
        jButton46 = new JButton();
        jButton89 = new JButton();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel2.setBackground(new Color(251, 205, 57));
        jButton1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/return.png"))); // NOI18N
        jButton1.addActionListener(evt -> {
            new SendInputUI().setVisible(true);
            this.dispose();
        });
        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(646, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(23, Short.MAX_VALUE))
        );
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/send_choose_text.png"))); // NOI18N
        jButton20.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton20.setText("jButton20");
        jButton20.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton25.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton25.setText("jButton20");
        jButton25.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jPanel3.setBackground(new Color(255, 96, 10));
        jButton2.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/screen.png"))); // NOI18N
        jButton2.setText("jButton2");
        jButton2.setFocusPainted(false);
        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(352, Short.MAX_VALUE))
        );
        jButton48.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton48.setText("jButton20");
        jButton48.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton47.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton47.setText("jButton20");
        jButton47.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton67.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton67.setText("jButton20");
        jButton67.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton68.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton68.setText("jButton20");
        jButton68.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton69.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton69.setText("jButton20");
        jButton69.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton70.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton70.setText("jButton20");
        jButton70.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton71.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box_gray.png"))); // NOI18N
        jButton71.setText("jButton20");
        jButton71.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton72.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton72.setText("jButton20");
        jButton72.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton73.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton73.setText("jButton20");
        jButton73.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton74.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton74.setText("jButton20");
        jButton74.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton75.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton75.setText("jButton20");
        jButton75.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton76.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton76.setText("jButton20");
        jButton76.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton77.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton77.setText("jButton20");
        jButton77.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton78.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton78.setText("jButton20");
        jButton78.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton29.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton29.setText("jButton20");
        jButton29.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton30.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton30.setText("jButton20");
        jButton30.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton31.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton31.setText("jButton20");
        jButton31.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton32.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton32.setText("jButton20");
        jButton32.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton33.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton33.setText("jButton20");
        jButton33.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton38.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton38.setText("jButton20");
        jButton38.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton39.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton39.setText("jButton20");
        jButton39.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton40.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton40.setText("jButton20");
        jButton40.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton41.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton41.setText("jButton20");
        jButton41.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton42.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton42.setText("jButton20");
        jButton42.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton79.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton79.setText("jButton20");
        jButton79.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton80.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton80.setText("jButton20");
        jButton80.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton81.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton81.setText("jButton20");
        jButton81.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton82.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton82.setText("jButton20");
        jButton82.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton83.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box_gray.png"))); // NOI18N
        jButton83.setText("jButton20");
        jButton83.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton84.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton84.setText("jButton20");
        jButton84.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton85.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton85.setText("jButton20");
        jButton85.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton86.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton86.setText("jButton20");
        jButton86.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton87.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box_gray.png"))); // NOI18N
        jButton87.setText("jButton20");
        jButton87.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton88.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton88.setText("jButton20");
        jButton88.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton34.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton34.setText("jButton20");
        jButton34.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton35.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton35.setText("jButton20");
        jButton35.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton36.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton36.setText("jButton20");
        jButton36.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton37.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton37.setText("jButton20");
        jButton37.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton43.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton43.setText("jButton20");
        jButton43.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton44.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton44.setText("jButton20");
        jButton44.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton45.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton45.setText("jButton20");
        jButton45.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton46.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton46.setText("jButton20");
        jButton46.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        jButton89.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/box.png"))); // NOI18N
        jButton89.setText("jButton20");
        jButton89.addActionListener(evt -> {
            new SendInUI().setVisible(true);
            this.dispose();
        });
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jLabel1)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton67, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 90,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton68, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 90,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton89, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 90,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton41, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 90,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton30, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 90,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton29, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 90,
                                                                GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton70, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton71, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton72, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton39, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                        .addComponent(jButton38, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                        .addComponent(jButton40, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addComponent(jButton73, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 100,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton42, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton76, GroupLayout.PREFERRED_SIZE, 100,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton75, GroupLayout.PREFERRED_SIZE, 100,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton77, GroupLayout.PREFERRED_SIZE, 100,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton78, GroupLayout.PREFERRED_SIZE, 100,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton33, GroupLayout.PREFERRED_SIZE, 100,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton31, GroupLayout.PREFERRED_SIZE, 100,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton32, GroupLayout.PREFERRED_SIZE, 100,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton79, GroupLayout.PREFERRED_SIZE, 100,
                                                                GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton25, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addComponent(jButton47, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addComponent(jButton20, GroupLayout.PREFERRED_SIZE, 90,
                                                                GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton69, GroupLayout.PREFERRED_SIZE, 100, GroupLayout
                                                        .PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton74, GroupLayout.PREFERRED_SIZE, 100, GroupLayout
                                                        .PREFERRED_SIZE)))
                                .addGap(8, 8, 8)
                                .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton87, GroupLayout.Alignment.TRAILING, GroupLayout
                                                .PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton86, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton85, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(
                                                GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton88, GroupLayout.PREFERRED_SIZE, 130, GroupLayout
                                                        .PREFERRED_SIZE)
                                                .addComponent(jButton34, GroupLayout.PREFERRED_SIZE, 130, GroupLayout
                                                        .PREFERRED_SIZE)
                                                .addComponent(jButton35, GroupLayout.PREFERRED_SIZE, 130, GroupLayout
                                                        .PREFERRED_SIZE)
                                                .addComponent(jButton36, GroupLayout.PREFERRED_SIZE, 130, GroupLayout
                                                        .PREFERRED_SIZE)
                                                .addComponent(jButton45, GroupLayout.PREFERRED_SIZE, 130, GroupLayout
                                                        .PREFERRED_SIZE)
                                                .addComponent(jButton84, GroupLayout.PREFERRED_SIZE, 130, GroupLayout
                                                        .PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton82, GroupLayout.PREFERRED_SIZE, 130, GroupLayout
                                                        .PREFERRED_SIZE)
                                                .addComponent(jButton81, GroupLayout.Alignment.LEADING, GroupLayout
                                                        .PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton80, GroupLayout.Alignment.LEADING, GroupLayout
                                                        .PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButton83, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton37, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton43, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton44, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton46, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton48, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139)
                                .addComponent(jLabel1)
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton84, GroupLayout.PREFERRED_SIZE, 40,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton48, GroupLayout.PREFERRED_SIZE, 40,
                                                                        GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton85, GroupLayout.PREFERRED_SIZE, 40,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton86, GroupLayout.PREFERRED_SIZE, 40,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton87, GroupLayout.PREFERRED_SIZE, 40,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton88, GroupLayout.PREFERRED_SIZE, 40,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton34, GroupLayout.PREFERRED_SIZE, 58,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton35, GroupLayout.PREFERRED_SIZE, 58,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton36, GroupLayout.PREFERRED_SIZE, 58,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton45, GroupLayout.PREFERRED_SIZE, 127,
                                                                GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jButton80, GroupLayout.PREFERRED_SIZE, 40,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton81, GroupLayout.PREFERRED_SIZE, 40,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton82, GroupLayout.PREFERRED_SIZE, 40,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton83, GroupLayout.PREFERRED_SIZE, 40,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton37, GroupLayout.PREFERRED_SIZE, 58,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton43, GroupLayout.PREFERRED_SIZE, 58,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton44, GroupLayout.PREFERRED_SIZE, 58,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton46, GroupLayout.PREFERRED_SIZE, 127,
                                                                GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jPanel3, GroupLayout.Alignment.LEADING, GroupLayout
                                                        .PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout
                                                        .PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(46, 46, 46)
                                                        .addComponent(jButton47, GroupLayout.PREFERRED_SIZE, 40,
                                                                GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton20, GroupLayout.PREFERRED_SIZE, 40,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton69, GroupLayout.PREFERRED_SIZE, 40,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton74, GroupLayout.PREFERRED_SIZE, 40,
                                                                        GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGap(190, 190, 190)
                                                                        .addComponent(jButton25, GroupLayout.PREFERRED_SIZE, 58, GroupLayout
                                                                                .PREFERRED_SIZE))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGap(6, 6, 6)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout
                                                                                .Alignment.LEADING, false)
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addComponent(jButton70, GroupLayout
                                                                                                .PREFERRED_SIZE, 40, GroupLayout
                                                                                                .PREFERRED_SIZE)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement
                                                                                                .RELATED)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout
                                                                                                .Alignment.BASELINE)
                                                                                                .addComponent(jButton71, GroupLayout
                                                                                                        .PREFERRED_SIZE, 40, GroupLayout
                                                                                                        .PREFERRED_SIZE)
                                                                                                .addComponent(jButton89, GroupLayout
                                                                                                        .PREFERRED_SIZE, 40, GroupLayout
                                                                                                        .PREFERRED_SIZE))
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement
                                                                                                .RELATED)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout
                                                                                                .Alignment.BASELINE)
                                                                                                .addComponent(jButton72, GroupLayout
                                                                                                        .PREFERRED_SIZE, 40, GroupLayout
                                                                                                        .PREFERRED_SIZE)
                                                                                                .addComponent(jButton67, GroupLayout
                                                                                                        .PREFERRED_SIZE, 40, GroupLayout
                                                                                                        .PREFERRED_SIZE))
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement
                                                                                                .RELATED)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout
                                                                                                .Alignment.BASELINE)
                                                                                                .addComponent(jButton73, GroupLayout
                                                                                                        .PREFERRED_SIZE, 40, GroupLayout
                                                                                                        .PREFERRED_SIZE)
                                                                                                .addComponent(jButton68, GroupLayout
                                                                                                        .PREFERRED_SIZE, 40, GroupLayout
                                                                                                        .PREFERRED_SIZE))
                                                                                        .addGap(70, 70, 70)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout
                                                                                                .Alignment.LEADING)
                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                        .addGap(128, 128, 128)
                                                                                                        .addGroup(jPanel1Layout.createParallelGroup
                                                                                                                (GroupLayout.Alignment
                                                                                                                        .BASELINE)
                                                                                                                .addComponent(jButton42, GroupLayout
                                                                                                                                .PREFERRED_SIZE, 127,
                                                                                                                        GroupLayout
                                                                                                                                .PREFERRED_SIZE)
                                                                                                                .addComponent(jButton41, GroupLayout
                                                                                                                                .PREFERRED_SIZE, 127,
                                                                                                                        GroupLayout
                                                                                                                                .PREFERRED_SIZE)))
                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                        .addGap(64, 64, 64)
                                                                                                        .addGroup(jPanel1Layout.createParallelGroup
                                                                                                                (GroupLayout.Alignment
                                                                                                                        .BASELINE)
                                                                                                                .addComponent(jButton39, GroupLayout
                                                                                                                                .PREFERRED_SIZE, 58,
                                                                                                                        GroupLayout
                                                                                                                                .PREFERRED_SIZE)
                                                                                                                .addComponent(jButton30, GroupLayout
                                                                                                                                .PREFERRED_SIZE, 58,
                                                                                                                        GroupLayout
                                                                                                                                .PREFERRED_SIZE)))))
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addGap(184, 184, 184)
                                                                                        .addComponent(jButton40, GroupLayout
                                                                                                .PREFERRED_SIZE, 58, GroupLayout
                                                                                                .PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addGap(248, 248, 248)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(
                                                                                                GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jButton38, GroupLayout
                                                                                                                .PREFERRED_SIZE, 58,
                                                                                                        GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jButton29, GroupLayout
                                                                                                                .PREFERRED_SIZE, 58,
                                                                                                        GroupLayout.PREFERRED_SIZE)))))))
                                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(
                                                        GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jButton75, GroupLayout.PREFERRED_SIZE, 40,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton76, GroupLayout.PREFERRED_SIZE, 40,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton77, GroupLayout.PREFERRED_SIZE, 40,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton78, GroupLayout.PREFERRED_SIZE, 40,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addGap(70, 70, 70)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(128, 128, 128)
                                                                                .addComponent(jButton79, GroupLayout.PREFERRED_SIZE,
                                                                                        127, GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(64, 64, 64)
                                                                                .addComponent(jButton32, GroupLayout.PREFERRED_SIZE,
                                                                                        58, GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(184, 184, 184)
                                                                .addComponent(jButton33, GroupLayout.PREFERRED_SIZE, 58,
                                                                        GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(248, 248, 248)
                                                                .addComponent(jButton31, GroupLayout.PREFERRED_SIZE, 58,
                                                                        GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(31, Short.MAX_VALUE))
        );
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
    }
}
