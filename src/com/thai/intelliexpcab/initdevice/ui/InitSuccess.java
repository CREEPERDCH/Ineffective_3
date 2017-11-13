package com.thai.intelliexpcab.initdevice.ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InitSuccess extends JFrame {

    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JTextField jTextField1;

    public InitSuccess() {
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
        EventQueue.invokeLater(() -> new InitSuccess().setVisible(true));
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel4 = new JLabel();
        jButton3 = new JButton();
        jLabel3 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jTextField1 = new JTextField();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jPanel1.setBackground(new Color(255, 255, 255));
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/yes.png"))); // NOI18N
        jLabel2.setFont(new Font("微软雅黑", Font.PLAIN, 24)); // NOI18N
        jLabel2.setText("柜机编号:");
        jLabel4.setFont(new Font("微软雅黑", Font.PLAIN, 24)); // NOI18N
        jLabel4.setText("01022228889");
        jButton3.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/sync.png"))); // NOI18N
        jButton3.addActionListener(evt -> {
            jTextField1.setText("正在同步设置，请稍候...");
            jButton3.setEnabled(false);
            new Thread(() -> {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(InitSuccess.class.getName()).log(Level.SEVERE, null, ex);
                }
                boolean isSuccess = new Random().nextBoolean();
                if (isSuccess) {
                    new SyncFail().setVisible(true);
                    InitSuccess.this.dispose();
                } else {
                    new SyncSuccess().setVisible(true);
                    InitSuccess.this.dispose();
                }
            }).start();
        });
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/beau_2.png"))); // NOI18N
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/beau_3.png"))); // NOI18N
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/beau_4.png"))); // NOI18N
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/line_1.png"))); // NOI18N
        jLabel8.setFont(new Font("微软雅黑", Font.PLAIN, 24)); // NOI18N
        jLabel8.setForeground(new Color(253, 145, 24));
        jLabel8.setText("请管理员登录管理后台完善地址及规格设置！");
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/line_1.png"))); // NOI18N
        jLabel10.setFont(new Font("微软雅黑", Font.PLAIN, 24)); // NOI18N
        jLabel10.setForeground(new Color(253, 145, 24));
        jLabel10.setText("后台设置完成后，请同步设置到设备！");
        jLabel11.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/line_1.png"))); // NOI18N
        jTextField1.setBorder(new EmptyBorder(0, 0, 0, 0));
        jTextField1.setEditable(false);
        jTextField1.setBackground(new Color(255, 255, 255));
        jTextField1.setFont(new Font("微软雅黑", Font.PLAIN, 32)); // NOI18N
        jTextField1.setHorizontalAlignment(JTextField.CENTER);
        jTextField1.setText("获取成功!");
        jTextField1.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                System.out.println("insertUpdate");
            }

            public void removeUpdate(DocumentEvent e) {
                System.out.println("removeUpdate");
            }

            public void changedUpdate(DocumentEvent e) {
                System.out.println("changedUpdate");
            }
        });
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(98, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 576, GroupLayout
                                                                .PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addGap(94, 94, 94))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel4))
                                                        .addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout
                                                                .DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout
                                                                .DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, GroupLayout
                                                                .DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, GroupLayout
                                                                .DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, GroupLayout
                                                                .DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(263, 263, 263)
                                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 238, GroupLayout
                                                        .PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(326, 326, 326)
                                                .addComponent(jLabel1)))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextField1)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(jLabel3)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addComponent(jLabel6))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout
                                                                .PREFERRED_SIZE)
                                                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout
                                                                .PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 33, GroupLayout
                                                        .PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 33, GroupLayout
                                                        .PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(42, 42, 42)
                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))
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
