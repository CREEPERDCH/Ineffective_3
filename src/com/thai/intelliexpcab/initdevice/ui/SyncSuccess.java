package com.thai.intelliexpcab.initdevice.ui;

import com.thai.intelliexpcab.maingui.ui.MainPageUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SyncSuccess extends JFrame {

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JPanel jPanel1;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JSeparator jSeparator4;
    private JSeparator jSeparator5;
    private JSeparator jSeparator6;
    private JSeparator jSeparator7;

    public SyncSuccess() {
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
        EventQueue.invokeLater(() -> new SyncSuccess().setVisible(true));
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jButton3 = new JButton();
        jLabel3 = new JLabel();
        jLabel5 = new JLabel();
        jLabel4 = new JLabel();
        jLabel12 = new JLabel();
        jSeparator1 = new JSeparator();
        jLabel6 = new JLabel();
        jSeparator2 = new JSeparator();
        jSeparator3 = new JSeparator();
        jSeparator4 = new JSeparator();
        jButton1 = new JButton();
        jSeparator5 = new JSeparator();
        jLabel10 = new JLabel();
        jSeparator6 = new JSeparator();
        jSeparator7 = new JSeparator();
        jButton2 = new JButton();
        jLabel11 = new JLabel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        jLabel16 = new JLabel();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jPanel1.setBackground(new Color(255, 255, 255));
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/success.png"))); // NOI18N
        jLabel2.setFont(new Font("微软雅黑", Font.PLAIN, 32)); // NOI18N
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("同步设置成功！");
        jButton3.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/uploadyes.png"))); // NOI18N
        jButton3.addActionListener(evt -> {
            jLabel2.setText("正在上传,请稍候...");
            jButton1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/updateadd_gray.png")));
            jButton2.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/updatediv_gray.png")));
            jButton3.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/upload_tray.png")));
            jLabel4.setForeground(new Color(99, 99, 99));
            jLabel12.setForeground(new Color(99, 99, 99));
            jLabel6.setForeground(new Color(99, 99, 99));
            jLabel11.setForeground(new Color(99, 99, 99));
            jLabel13.setForeground(new Color(99, 99, 99));
            jLabel14.setForeground(new Color(99, 99, 99));
            jLabel10.setForeground(new Color(99, 99, 99));
            jLabel15.setForeground(new Color(99, 99, 99));
            jLabel16.setForeground(new Color(99, 99, 99));
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                        boolean isTrue = new Random().nextBoolean();
                        if (isTrue) {
                            jLabel2.setText("上传成功!3秒后跳转到首页...");
                            jLabel1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/success.png")));
                            jButton1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/updateadd.png")));
                            jButton2.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/updatediv.png")));
                            jButton3.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/uploadyes.png")));
                            jLabel4.setForeground(new Color(253, 145, 24));
                            jLabel12.setForeground(new Color(253, 145, 24));
                            jLabel6.setForeground(new Color(253, 145, 24));
                            jLabel11.setForeground(new Color(253, 145, 24));
                            jLabel13.setForeground(new Color(253, 145, 24));
                            jLabel14.setForeground(new Color(253, 145, 24));
                            jLabel10.setForeground(new Color(253, 145, 24));
                            jLabel15.setForeground(new Color(253, 145, 24));
                            jLabel16.setForeground(new Color(253, 145, 24));
                            Thread.sleep(3000);
                            new MainPageUI().setVisible(true);
                            SyncSuccess.this.dispose();
                        } else {
                            new UploadFail().setVisible(true);
                            SyncSuccess.this.dispose();
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SyncSuccess.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }).start();
        });
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/beau_2.png"))); // NOI18N
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/beau_3.png"))); // NOI18N
        jLabel4.setFont(new Font("微软雅黑", Font.PLAIN, 24)); // NOI18N
        jLabel4.setText("柜机编号:");
        jLabel12.setFont(new Font("微软雅黑", Font.PLAIN, 24)); // NOI18N
        jLabel12.setText("01022228889");
        jLabel6.setFont(new Font("微软雅黑", Font.PLAIN, 24)); // NOI18N
        jLabel6.setText("柜机地址:");
        jButton1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/updateadd.png"))); // NOI18N
        jButton1.addActionListener(evt -> {
            jLabel2.setText("正在更新地址,请稍候...");
            jButton1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/updateadd_gray.png")));
            jButton2.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/updatediv_gray.png")));
            jButton3.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/upload_tray.png")));
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SyncSuccess.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    boolean isTrue = new Random().nextBoolean();
                    if (isTrue) {
                        jLabel2.setText("更新地址成功!");
                        jLabel1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/success.png")));
                        jButton1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/updateadd.png")));
                        jButton2.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/updatediv.png")));
                        jButton3.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/uploadyes.png")));
                    } else {
                        jLabel2.setText("更新地址失败!");
                        jLabel1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/fail.png")));
                        jButton1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/updateadd.png")));
                        jButton2.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/updatediv.png")));
                        jButton3.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/uploadyes.png")));
                    }
                }
            }).start();
        });
        jLabel10.setFont(new Font("微软雅黑", Font.PLAIN, 24)); // NOI18N
        jLabel10.setText("柜机规格:");
        jButton2.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/updatediv.png"))); // NOI18N
        jButton2.addActionListener(evt -> {
            jLabel2.setText("正在更新规格,请稍候...");
            jButton1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/updateadd_gray.png")));
            jButton2.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/updatediv_gray.png")));
            jButton3.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/upload_tray.png")));
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SyncSuccess.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    boolean isTrue = new Random().nextBoolean();
                    if (isTrue) {
                        jLabel2.setText("更新规格成功!");
                        jLabel1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/success.png")));
                        jButton1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/updateadd.png")));
                        jButton2.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/updatediv.png")));
                        jButton3.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/uploadyes.png")));
                    } else {
                        jLabel2.setText("更新规格失败!");
                        jLabel1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/fail.png")));
                        jButton1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/updateadd.png")));
                        jButton2.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/updatediv.png")));
                        jButton3.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/uploadyes.png")));
                    }
                }
            }).start();
        });
        jLabel11.setFont(new Font("微软雅黑", Font.PLAIN, 24)); // NOI18N
        jLabel11.setForeground(new Color(253, 145, 24));
        jLabel11.setText("广东省  广州市  番禺区  小谷围镇");
        jLabel13.setFont(new Font("微软雅黑", Font.PLAIN, 24)); // NOI18N
        jLabel13.setForeground(new Color(253, 145, 24));
        jLabel13.setText("广东工业大学");
        jLabel14.setFont(new Font("微软雅黑", Font.PLAIN, 24)); // NOI18N
        jLabel14.setForeground(new Color(253, 145, 24));
        jLabel14.setText("东区第二食堂一楼");
        jLabel15.setFont(new Font("微软雅黑", Font.PLAIN, 24)); // NOI18N
        jLabel15.setForeground(new Color(253, 145, 24));
        jLabel15.setText("规格一");
        jLabel16.setFont(new Font("微软雅黑", Font.PLAIN, 24)); // NOI18N
        jLabel16.setForeground(new Color(99, 99, 99));
        jLabel16.setText("(10行3列30格)");
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(319, 319, 319)
                                                                .addComponent(jLabel1))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(90, 90, 90)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                                .createSequentialGroup()
                                                                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE,
                                                                                        235, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(174, 174, 174))
                                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                                .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addGap(10, 10, 10)
                                                                                        .addComponent(jLabel14))
                                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout
                                                                                        .Alignment.LEADING, false)
                                                                                        .addComponent(jLabel5, GroupLayout.Alignment
                                                                                                        .TRAILING, GroupLayout
                                                                                                        .DEFAULT_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addComponent(jLabel4)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jLabel12))
                                                                                        .addComponent(jLabel3, GroupLayout
                                                                                                .DEFAULT_SIZE, GroupLayout
                                                                                                .DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(jSeparator1)
                                                                                        .addComponent(jSeparator3)
                                                                                        .addComponent(jSeparator4)
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout.createParallelGroup
                                                                                                        (GroupLayout.Alignment.LEADING)
                                                                                                        .addGroup(jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel6)
                                                                                                                .addPreferredGap(LayoutStyle
                                                                                                                        .ComponentPlacement.RELATED)
                                                                                                                .addComponent(jLabel11)
                                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                                        .addComponent(jSeparator2))
                                                                                                .addPreferredGap(LayoutStyle
                                                                                                        .ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton1, GroupLayout
                                                                                                        .PREFERRED_SIZE, 105, GroupLayout
                                                                                                        .PREFERRED_SIZE))
                                                                                        .addComponent(jSeparator5)
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout.createParallelGroup
                                                                                                        (GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(jSeparator6)
                                                                                                        .addGroup(jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel10)
                                                                                                                .addPreferredGap(LayoutStyle
                                                                                                                        .ComponentPlacement.RELATED)
                                                                                                                .addComponent(jLabel15)
                                                                                                                .addPreferredGap(LayoutStyle
                                                                                                                        .ComponentPlacement.RELATED)
                                                                                                                .addComponent(jLabel16)
                                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                                                                .addPreferredGap(LayoutStyle
                                                                                                        .ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton2, GroupLayout
                                                                                                        .PREFERRED_SIZE, 105, GroupLayout
                                                                                                        .PREFERRED_SIZE))
                                                                                        .addComponent(jSeparator7, GroupLayout
                                                                                                .PREFERRED_SIZE, 576, GroupLayout
                                                                                                .PREFERRED_SIZE)
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addGap(10, 10, 10)
                                                                                                .addComponent(jLabel13)))))))
                                                .addGap(0, 92, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(jLabel1)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel12))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout
                                                        .DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel11))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, GroupLayout
                                                        .DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jSeparator5, GroupLayout.PREFERRED_SIZE, GroupLayout
                                                        .DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel15)
                                                        .addComponent(jLabel16))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSeparator6, GroupLayout.PREFERRED_SIZE, GroupLayout
                                                        .DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addComponent(jSeparator7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addContainerGap(104, Short.MAX_VALUE))
        );
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
}
