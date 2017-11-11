package com.thai.intelliexpcab.maingui.ui;

import com.thai.intelliexpcab.serial.SerialTool;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class SendInputUI extends JFrame {

    private SerialTool serialTool;
    private JButton jButton1;
    private JButton jButton10;
    private JButton jButton11;
    private JButton jButton12;
    private JButton jButton13;
    private JButton jButton14;
    private JButton jButton15;
    private JButton jButton16;
    private JButton jButton2;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;

    public SendInputUI() {
        this.setUndecorated(true);
//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.requestFocus();
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setLocation(0, 0);
        serialTool = new SerialTool();
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
        EventQueue.invokeLater(() -> new SendInputUI().setVisible(true));
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jButton1 = new JButton();
        jLabel1 = new JLabel();
        jTextField2 = new JTextField();
        jTextField1 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jTextField5 = new JTextField();
        jTextField6 = new JTextField();
        jButton2 = new JButton();
        jPanel3 = new JPanel();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jButton8 = new JButton();
        jButton9 = new JButton();
        jButton10 = new JButton();
        jButton11 = new JButton();
        jButton12 = new JButton();
        jButton13 = new JButton();
        jButton14 = new JButton();
        jButton15 = new JButton();
        jButton16 = new JButton();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel2.setBackground(new Color(251, 205, 57));
        jPanel2.setPreferredSize(new Dimension(768, 100));
        jButton1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/return.png"))); // NOI18N
        jButton1.addActionListener(evt -> {
            new MainPageUI().setVisible(true);
            this.dispose();
        });
        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(23, Short.MAX_VALUE))
        );
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/send_input_text.png"))); // NOI18N
        jTextField2.setEditable(false);
        jTextField2.setFont(new Font("黑体", Font.BOLD, 48)); // NOI18N
        jTextField2.setHorizontalAlignment(JTextField.CENTER);
        jTextField2.setFocusable(false);
        jTextField1.setEditable(false);
        jTextField1.setFont(new Font("黑体", Font.BOLD, 48)); // NOI18N
        jTextField1.setHorizontalAlignment(JTextField.CENTER);
        jTextField1.setFocusable(false);
        jTextField1.addActionListener(evt -> {
        });
        jTextField3.setEditable(false);
        jTextField3.setFont(new Font("黑体", Font.BOLD, 48)); // NOI18N
        jTextField3.setHorizontalAlignment(JTextField.CENTER);
        jTextField3.setFocusable(false);
        jTextField4.setEditable(false);
        jTextField4.setFont(new Font("黑体", Font.BOLD, 48)); // NOI18N
        jTextField4.setHorizontalAlignment(JTextField.CENTER);
        jTextField4.setFocusable(false);
        jTextField5.setEditable(false);
        jTextField5.setFont(new Font("黑体", Font.BOLD, 48)); // NOI18N
        jTextField5.setHorizontalAlignment(JTextField.CENTER);
        jTextField5.setFocusable(false);
        jTextField6.setEditable(false);
        jTextField6.setFont(new Font("黑体", Font.BOLD, 48)); // NOI18N
        jTextField6.setHorizontalAlignment(JTextField.CENTER);
        jTextField6.setFocusable(false);
        jTextField6.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("---begin send---");
                serialTool.send("23230D000B4001010147000D0A");
                System.out.println("---Send end---");
                new SendChooseUI().setVisible(true);
                SendInputUI.this.dispose();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
        jButton2.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/remember_send.png"))); // NOI18N
        jButton2.addActionListener(evt -> {
            new CustomerUI().setVisible(true);
            this.dispose();
        });
        jPanel3.setBackground(new Color(251, 205, 57));
        jButton5.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/1.png"))); // NOI18N
        jButton5.addActionListener(evt -> {
            if (jTextField1.getText().length() == 0) {
                jTextField1.setText("1");
            } else {
                if (jTextField2.getText().length() == 0) {
                    jTextField2.setText("1");
                } else {
                    if (jTextField3.getText().length() == 0) {
                        jTextField3.setText("1");
                    } else {
                        if (jTextField4.getText().length() == 0) {
                            jTextField4.setText("1");
                        } else {
                            if (jTextField5.getText().length() == 0) {
                                jTextField5.setText("1");
                            } else {
                                if (jTextField6.getText().length() == 0) {
                                    jTextField6.setText("1");
                                }
                            }
                        }
                    }
                }
            }
        });
        jButton6.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/2.png"))); // NOI18N
        jButton6.addActionListener(evt -> {
            if (jTextField1.getText().length() == 0) {
                jTextField1.setText("2");
            } else {
                if (jTextField2.getText().length() == 0) {
                    jTextField2.setText("2");
                } else {
                    if (jTextField3.getText().length() == 0) {
                        jTextField3.setText("2");
                    } else {
                        if (jTextField4.getText().length() == 0) {
                            jTextField4.setText("2");
                        } else {
                            if (jTextField5.getText().length() == 0) {
                                jTextField5.setText("2");
                            } else {
                                if (jTextField6.getText().length() == 0) {
                                    jTextField6.setText("2");
                                }
                            }
                        }
                    }
                }
            }
        });
        jButton7.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/3.png"))); // NOI18N
        jButton7.addActionListener(evt -> {
            if (jTextField1.getText().length() == 0) {
                jTextField1.setText("3");
            } else {
                if (jTextField2.getText().length() == 0) {
                    jTextField2.setText("3");
                } else {
                    if (jTextField3.getText().length() == 0) {
                        jTextField3.setText("3");
                    } else {
                        if (jTextField4.getText().length() == 0) {
                            jTextField4.setText("3");
                        } else {
                            if (jTextField5.getText().length() == 0) {
                                jTextField5.setText("3");
                            } else {
                                if (jTextField6.getText().length() == 0) {
                                    jTextField6.setText("3");
                                }
                            }
                        }
                    }
                }
            }
        });
        jButton8.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/4.png"))); // NOI18N
        jButton8.addActionListener(evt -> {
            if (jTextField1.getText().length() == 0) {
                jTextField1.setText("4");
            } else {
                if (jTextField2.getText().length() == 0) {
                    jTextField2.setText("4");
                } else {
                    if (jTextField3.getText().length() == 0) {
                        jTextField3.setText("4");
                    } else {
                        if (jTextField4.getText().length() == 0) {
                            jTextField4.setText("4");
                        } else {
                            if (jTextField5.getText().length() == 0) {
                                jTextField5.setText("4");
                            } else {
                                if (jTextField6.getText().length() == 0) {
                                    jTextField6.setText("4");
                                }
                            }
                        }
                    }
                }
            }
        });
        jButton9.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/5.png"))); // NOI18N
        jButton9.addActionListener(evt -> {
            if (jTextField1.getText().length() == 0) {
                jTextField1.setText("5");
            } else {
                if (jTextField2.getText().length() == 0) {
                    jTextField2.setText("5");
                } else {
                    if (jTextField3.getText().length() == 0) {
                        jTextField3.setText("5");
                    } else {
                        if (jTextField4.getText().length() == 0) {
                            jTextField4.setText("5");
                        } else {
                            if (jTextField5.getText().length() == 0) {
                                jTextField5.setText("5");
                            } else {
                                if (jTextField6.getText().length() == 0) {
                                    jTextField6.setText("5");
                                }
                            }
                        }
                    }
                }
            }
        });
        jButton10.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/6.png"))); // NOI18N
        jButton10.addActionListener(evt -> {
            if (jTextField1.getText().length() == 0) {
                jTextField1.setText("6");
            } else {
                if (jTextField2.getText().length() == 0) {
                    jTextField2.setText("6");
                } else {
                    if (jTextField3.getText().length() == 0) {
                        jTextField3.setText("6");
                    } else {
                        if (jTextField4.getText().length() == 0) {
                            jTextField4.setText("6");
                        } else {
                            if (jTextField5.getText().length() == 0) {
                                jTextField5.setText("6");
                            } else {
                                if (jTextField6.getText().length() == 0) {
                                    jTextField6.setText("6");
                                }
                            }
                        }
                    }
                }
            }
        });
        jButton11.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/7.png"))); // NOI18N
        jButton11.setFocusPainted(false);
        jButton11.addActionListener(evt -> {
            if (jTextField1.getText().length() == 0) {
                jTextField1.setText("7");
            } else {
                if (jTextField2.getText().length() == 0) {
                    jTextField2.setText("7");
                } else {
                    if (jTextField3.getText().length() == 0) {
                        jTextField3.setText("7");
                    } else {
                        if (jTextField4.getText().length() == 0) {
                            jTextField4.setText("7");
                        } else {
                            if (jTextField5.getText().length() == 0) {
                                jTextField5.setText("7");
                            } else {
                                if (jTextField6.getText().length() == 0) {
                                    jTextField6.setText("7");
                                }
                            }
                        }
                    }
                }
            }
        });
        jButton12.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/8.png"))); // NOI18N
        jButton12.addActionListener(evt -> {
            if (jTextField1.getText().length() == 0) {
                jTextField1.setText("8");
            } else {
                if (jTextField2.getText().length() == 0) {
                    jTextField2.setText("8");
                } else {
                    if (jTextField3.getText().length() == 0) {
                        jTextField3.setText("8");
                    } else {
                        if (jTextField4.getText().length() == 0) {
                            jTextField4.setText("8");
                        } else {
                            if (jTextField5.getText().length() == 0) {
                                jTextField5.setText("8");
                            } else {
                                if (jTextField6.getText().length() == 0) {
                                    jTextField6.setText("8");
                                }
                            }
                        }
                    }
                }
            }
        });
        jButton13.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/9.png"))); // NOI18N
        jButton13.addActionListener(evt -> {
            if (jTextField1.getText().length() == 0) {
                jTextField1.setText("9");
            } else {
                if (jTextField2.getText().length() == 0) {
                    jTextField2.setText("9");
                } else {
                    if (jTextField3.getText().length() == 0) {
                        jTextField3.setText("9");
                    } else {
                        if (jTextField4.getText().length() == 0) {
                            jTextField4.setText("9");
                        } else {
                            if (jTextField5.getText().length() == 0) {
                                jTextField5.setText("9");
                            } else {
                                if (jTextField6.getText().length() == 0) {
                                    jTextField6.setText("9");
                                }
                            }
                        }
                    }
                }
            }
        });
        jButton14.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/delete.png"))); // NOI18N
        jButton14.addActionListener(evt -> {
            if (jTextField1.getText().length() != 0
                    || jTextField2.getText().length() != 0
                    || jTextField3.getText().length() != 0
                    || jTextField4.getText().length() != 0
                    || jTextField5.getText().length() != 0
                    || jTextField6.getText().length() != 0) {
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
            }
        });
        jButton15.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/0.png"))); // NOI18N
        jButton15.addActionListener(evt -> {
            if (jTextField1.getText().length() == 0) {
                jTextField1.setText("0");
            } else {
                if (jTextField2.getText().length() == 0) {
                    jTextField2.setText("0");
                } else {
                    if (jTextField3.getText().length() == 0) {
                        jTextField3.setText("0");
                    } else {
                        if (jTextField4.getText().length() == 0) {
                            jTextField4.setText("0");
                        } else {
                            if (jTextField5.getText().length() == 0) {
                                jTextField5.setText("0");
                            } else {
                                if (jTextField6.getText().length() == 0) {
                                    jTextField6.setText("0");
                                }
                            }
                        }
                    }
                }
            }
        });
        jButton16.setIcon(new ImageIcon(getClass().getResource("/com/thai/intelliexpcab/resources/back.png"))); // NOI18N
        jButton16.addActionListener(evt -> {
            if (jTextField6.getText().length() != 0) {
                jTextField6.setText("");
            } else {
                if (jTextField5.getText().length() != 0) {
                    jTextField5.setText("");
                } else {
                    if (jTextField4.getText().length() != 0) {
                        jTextField4.setText("");
                    } else {
                        if (jTextField3.getText().length() != 0) {
                            jTextField3.setText("");
                        } else {
                            if (jTextField2.getText().length() != 0) {
                                jTextField2.setText("");
                            } else {
                                if (jTextField1.getText().length() != 0) {
                                    jTextField1.setText("");
                                }
                            }
                        }
                    }
                }
            }
        });
        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jButton14, GroupLayout.PREFERRED_SIZE, 127, GroupLayout
                                                        .PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton15, GroupLayout.PREFERRED_SIZE, 135, GroupLayout
                                                        .PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton16, GroupLayout.PREFERRED_SIZE, 135, GroupLayout
                                                        .PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 137, GroupLayout
                                                        .PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 135, GroupLayout
                                                        .PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 135, GroupLayout
                                                        .PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 128, GroupLayout
                                                        .PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton12, GroupLayout.PREFERRED_SIZE, 135, GroupLayout
                                                        .PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton13, GroupLayout.PREFERRED_SIZE, 135, GroupLayout
                                                        .PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 137, GroupLayout
                                                        .PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 135, GroupLayout
                                                        .PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 135, GroupLayout
                                                        .PREFERRED_SIZE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton13, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton12, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton16, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton15, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton14, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(19, Short.MAX_VALUE))
        );
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                        .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(jLabel1)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 21, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
                                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel1)
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
