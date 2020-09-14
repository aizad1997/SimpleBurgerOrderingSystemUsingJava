/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MBurger;

import javax.swing.JButton;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author norasyikin
 */
public class MyBurger extends javax.swing.JFrame {
  
    /**
     * Creates new form MyBurger
     */
    public MyBurger() {
        initComponents();
        JOptionPane.showMessageDialog(null,"WELCOME TO PITSTOP BURGER");
    }
    private final double chicken_original = 2.70;
    private final double beef_original = 2.70;
    private final double deer_original = 5.00;
    private final double chicken_double = 3.00;
    private final double beef_double = 3.80;
    private final double chicken_special = 3.50;
    private final double beef_special = 3.50;
    private final double benjo_b = 2.00;
    private final double chicken_oblong = 3.00;
    private final double beef_oblong = 3.50;
    private final double cheese_c = 0.50;
    private double price1 = 0.00;
    private double price2 = 0.00;
    private double price3 = 0.00;
    private double price4 = 0.00;
    private double price5 = 0.00;
    private double price6 = 0.00;
    private double price7 = 0.00;
    private double price8 = 0.00;
    private double price9 = 0.00;
    private double price10 = 0.00;
    private double price11 = 0.00;
    private double subTotal = 0.00;
    private double totalTax = 0.00;
    private double grandTotal = 0.00;
   
    int count1,count2,count3,count4,count5,count6,count7,count8,count9,count10,count11;
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelItem = new javax.swing.JPanel();
        label_original = new javax.swing.JLabel();
        c_original = new javax.swing.JButton();
        b_original = new javax.swing.JButton();
        d_original = new javax.swing.JButton();
        label_double = new javax.swing.JLabel();
        c_double = new javax.swing.JButton();
        b_double = new javax.swing.JButton();
        Special = new javax.swing.JLabel();
        c_special = new javax.swing.JButton();
        b_special = new javax.swing.JButton();
        label_other = new javax.swing.JLabel();
        c_oblong = new javax.swing.JButton();
        b_oblong = new javax.swing.JButton();
        b_benjo = new javax.swing.JButton();
        label_add = new javax.swing.JLabel();
        c_cheese = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanelOrderList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        menu = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        jBtnCalculate = new javax.swing.JButton();
        jBtnReset = new javax.swing.JButton();
        order_detail = new javax.swing.JLabel();
        sub_total = new javax.swing.JLabel();
        tax = new javax.swing.JLabel();
        grrand_total = new javax.swing.JLabel();
        SubTotal = new javax.swing.JTextField();
        Tax = new javax.swing.JTextField();
        GrandTotal = new javax.swing.JTextField();
        system_name = new javax.swing.JLabel();
        jbtnExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIconImages(null);

        jPanelItem.setBackground(new java.awt.Color(255, 204, 102));
        jPanelItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255), 6));
        jPanelItem.setForeground(new java.awt.Color(51, 204, 255));

        label_original.setBackground(new java.awt.Color(255, 255, 51));
        label_original.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_original.setForeground(new java.awt.Color(255, 255, 51));
        label_original.setText("Original");

        c_original.setBackground(new java.awt.Color(255, 255, 51));
        c_original.setText("Chicken Burger : RM 2.70");
        c_original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_originalActionPerformed(evt);
            }
        });

        b_original.setBackground(new java.awt.Color(255, 255, 51));
        b_original.setText("Beef Burger : RM 2.70");
        b_original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_originalActionPerformed(evt);
            }
        });

        d_original.setBackground(new java.awt.Color(255, 255, 51));
        d_original.setText("Deer Burger : RM 5.00 ");
        d_original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_originalActionPerformed(evt);
            }
        });

        label_double.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_double.setForeground(new java.awt.Color(255, 255, 51));
        label_double.setText("Double");

        c_double.setBackground(new java.awt.Color(255, 255, 51));
        c_double.setText(" Chicken Burger : RM 3.00");
        c_double.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_doubleActionPerformed(evt);
            }
        });

        b_double.setBackground(new java.awt.Color(255, 255, 51));
        b_double.setText("Beef Burger : RM 3.80");
        b_double.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_doubleActionPerformed(evt);
            }
        });

        Special.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Special.setForeground(new java.awt.Color(255, 255, 51));
        Special.setText("Special");

        c_special.setBackground(new java.awt.Color(255, 255, 51));
        c_special.setText(" Chicken Burger : RM 3.50");
        c_special.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_specialActionPerformed(evt);
            }
        });

        b_special.setBackground(new java.awt.Color(255, 255, 51));
        b_special.setText("Beef Burger : RM 3.50");
        b_special.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_specialActionPerformed(evt);
            }
        });

        label_other.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_other.setForeground(new java.awt.Color(0, 204, 204));
        label_other.setText("Other");

        c_oblong.setBackground(new java.awt.Color(0, 204, 204));
        c_oblong.setText("Chicken Oblong : RM 3.00");
        c_oblong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_oblongActionPerformed(evt);
            }
        });

        b_oblong.setBackground(new java.awt.Color(0, 204, 204));
        b_oblong.setText("Beef Oblong : RM 3.50");
        b_oblong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_oblongActionPerformed(evt);
            }
        });

        b_benjo.setBackground(new java.awt.Color(0, 204, 204));
        b_benjo.setText("Benjo : RM 2.00");
        b_benjo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_benjoActionPerformed(evt);
            }
        });

        label_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_add.setForeground(new java.awt.Color(255, 128, 0));
        label_add.setText("Add On");

        c_cheese.setBackground(new java.awt.Color(255, 128, 0));
        c_cheese.setText("Cheese : RM 0.50");
        c_cheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cheeseActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MBurger/newpackage/b deer.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MBurger/newpackage/b daging.jpg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MBurger/newpackage/b ayam.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MBurger/newpackage/d ayam.jpg"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MBurger/newpackage/d daging.jpg"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MBurger/newpackage/s ayam.jpg"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MBurger/newpackage/s daging.jpg"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MBurger/newpackage/oblong ayam.jpg"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MBurger/newpackage/olong daging.jpg"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MBurger/newpackage/benjo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanelItemLayout = new javax.swing.GroupLayout(jPanelItem);
        jPanelItem.setLayout(jPanelItemLayout);
        jPanelItemLayout.setHorizontalGroup(
            jPanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelItemLayout.createSequentialGroup()
                .addGroup(jPanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelItemLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(label_add, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelItemLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(label_original))
                    .addGroup(jPanelItemLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(jPanelItemLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4)))
                .addGap(63, 63, 63)
                .addGroup(jPanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_double, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelItemLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(Special))
                    .addGroup(jPanelItemLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelItemLayout.createSequentialGroup()
                        .addComponent(label_other)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelItemLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(37, 37, 37))))
            .addGroup(jPanelItemLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(66, 66, 66)
                .addComponent(jLabel6)
                .addGap(72, 72, 72)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(37, 37, 37))
            .addGroup(jPanelItemLayout.createSequentialGroup()
                .addComponent(b_original, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelItemLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b_benjo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelItemLayout.createSequentialGroup()
                        .addGroup(jPanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelItemLayout.createSequentialGroup()
                                .addComponent(c_double)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c_special, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(c_oblong))
                            .addGroup(jPanelItemLayout.createSequentialGroup()
                                .addComponent(b_double, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b_special, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b_oblong, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelItemLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelItemLayout.createSequentialGroup()
                        .addComponent(c_cheese, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelItemLayout.createSequentialGroup()
                        .addComponent(d_original, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(38, 38, 38))))
            .addGroup(jPanelItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(c_original, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelItemLayout.setVerticalGroup(
            jPanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelItemLayout.createSequentialGroup()
                        .addGroup(jPanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_double, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Special)
                            .addComponent(label_other))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addGap(32, 32, 32))
                    .addGroup(jPanelItemLayout.createSequentialGroup()
                        .addComponent(label_original, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_original, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_double, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_special, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_oblong, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelItemLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(d_original, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_add))
                    .addGroup(jPanelItemLayout.createSequentialGroup()
                        .addGroup(jPanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelItemLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(24, 24, 24)
                                .addGroup(jPanelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b_double, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_special, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_original, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_oblong, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_benjo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_cheese, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanelOrderList.setBackground(new java.awt.Color(255, 153, 204));
        jPanelOrderList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255), 6));
        jPanelOrderList.setForeground(new java.awt.Color(51, 204, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        menu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menu.setForeground(new java.awt.Color(0, 153, 255));
        menu.setText("Menu");

        price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        price.setForeground(new java.awt.Color(0, 153, 255));
        price.setText("Price");

        jBtnCalculate.setBackground(new java.awt.Color(0, 0, 204));
        jBtnCalculate.setText("Calculate");
        jBtnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCalculateActionPerformed(evt);
            }
        });

        jBtnReset.setBackground(new java.awt.Color(0, 0, 204));
        jBtnReset.setText("Reset");
        jBtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetActionPerformed(evt);
            }
        });

        order_detail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        order_detail.setForeground(new java.awt.Color(204, 51, 255));
        order_detail.setText("Order Details");

        sub_total.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sub_total.setText("Sub Total");

        tax.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tax.setText("Tax 12% (GST & SST)");

        grrand_total.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        grrand_total.setForeground(new java.awt.Color(255, 0, 0));
        grrand_total.setText("Grand Total");

        javax.swing.GroupLayout jPanelOrderListLayout = new javax.swing.GroupLayout(jPanelOrderList);
        jPanelOrderList.setLayout(jPanelOrderListLayout);
        jPanelOrderListLayout.setHorizontalGroup(
            jPanelOrderListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrderListLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(price)
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOrderListLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanelOrderListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOrderListLayout.createSequentialGroup()
                        .addGroup(jPanelOrderListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelOrderListLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanelOrderListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sub_total)
                                    .addComponent(tax)
                                    .addComponent(grrand_total)))
                            .addComponent(jBtnCalculate))
                        .addGap(30, 30, 30)
                        .addGroup(jPanelOrderListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(Tax)
                            .addComponent(GrandTotal))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOrderListLayout.createSequentialGroup()
                        .addGroup(jPanelOrderListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBtnReset)
                            .addGroup(jPanelOrderListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(order_detail)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))))
        );
        jPanelOrderListLayout.setVerticalGroup(
            jPanelOrderListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrderListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(order_detail)
                .addGap(9, 9, 9)
                .addGroup(jPanelOrderListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelOrderListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCalculate)
                    .addComponent(jBtnReset))
                .addGap(36, 36, 36)
                .addGroup(jPanelOrderListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub_total))
                .addGap(19, 19, 19)
                .addGroup(jPanelOrderListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tax)
                    .addComponent(Tax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelOrderListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grrand_total)
                    .addComponent(GrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        system_name.setBackground(new java.awt.Color(255, 51, 51));
        system_name.setFont(new java.awt.Font("Candles", 1, 24)); // NOI18N
        system_name.setForeground(new java.awt.Color(255, 0, 0));
        system_name.setText("PitStop Burger Ordering System");

        jbtnExit.setBackground(new java.awt.Color(255, 0, 51));
        jbtnExit.setText("EXIT");
        jbtnExit.setToolTipText("");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MBurger/newpackage/L0VE_002.GIF"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MBurger/newpackage/burger.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelOrderList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(system_name, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(system_name, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelOrderList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addComponent(jPanelItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCalculateActionPerformed
        subTotal = price1 + price2 + price3 + price4 + price5 + price6 + price7 + price8 + price9 + price10 + price11;
        String amount = String.format("RM %.2f", subTotal);
        SubTotal.setText(amount);
       
        totalTax = subTotal * 0.12;
        grandTotal = subTotal + totalTax;
        String gst_sst = String.format("RM %.2f\n" ,totalTax);
        Tax.setText(gst_sst);
        String totalAll = String.format("RM %.2f\n" ,grandTotal);
        GrandTotal.setText(totalAll);
        
        
    
        
        
    }//GEN-LAST:event_jBtnCalculateActionPerformed

    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed
                price1 = 0.00;
                price2 = 0.00;
                price3 = 0.00;
                price4 = 0.00;
                price5 = 0.00;
                price6 = 0.00;
                price7 = 0.00;
                price8 = 0.00;
                price9 = 0.00;
                price10 = 0.00;
                price11 = 0.00;
                
                count1 = 0;
                count2 = 0;
                count3 = 0;
                count4 = 0;
                count5 = 0;
                count6 = 0;
                count7 = 0;
                count8 = 0;
                count9 = 0;
                count10 = 0;
                count11 = 0;
              
		jTextArea1.setText("");
		
		SubTotal.setText("");
		Tax.setText("");
		GrandTotal.setText("");
		
		
                
    }//GEN-LAST:event_jBtnResetActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void c_cheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cheeseActionPerformed

        String Cheese = jTextArea1.getText() + String.format("Cheese\t\t\t    RM%.2f\n", cheese_c);
        jTextArea1.setText(Cheese);
        count11++;
        price11 = cheese_c * count11;

    }//GEN-LAST:event_c_cheeseActionPerformed

    private void b_benjoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_benjoActionPerformed

        String Benjo = jTextArea1.getText() + String.format("Benjo\t\t\t    RM%.2f\n", benjo_b);
        jTextArea1.setText(Benjo);
        count10++;
        price10 = benjo_b * count10;
    }//GEN-LAST:event_b_benjoActionPerformed

    private void b_oblongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_oblongActionPerformed

        String BeefOblong = jTextArea1.getText() + String.format("Beef Oblong\t\t\t    RM%.2f\n", beef_oblong);
        jTextArea1.setText(BeefOblong);
        count9++;
        price8 = beef_oblong * count9;
    }//GEN-LAST:event_b_oblongActionPerformed

    private void c_oblongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_oblongActionPerformed

        String ChickenOblong = jTextArea1.getText() + String.format("Chicken Oblong\t\t    RM%.2f\n", chicken_oblong);
        jTextArea1.setText(ChickenOblong);
        count8++;
        price7 = chicken_oblong * count8;
    }//GEN-LAST:event_c_oblongActionPerformed

    private void b_specialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_specialActionPerformed

        String BeefSpecial = jTextArea1.getText() + String.format("Special Beef Burger\t\t    RM%.2f\n", beef_special);
        jTextArea1.setText(BeefSpecial);
        count7++;
        price9 = beef_special * count7;
    }//GEN-LAST:event_b_specialActionPerformed

    private void c_specialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_specialActionPerformed

        String ChickenSpecial = jTextArea1.getText() + String.format("Special Chicken Burger\t\t    RM%.2f\n", chicken_special);
        jTextArea1.setText(ChickenSpecial);
        count6++;
        price6 = chicken_special * count6;
    }//GEN-LAST:event_c_specialActionPerformed

    private void b_doubleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_doubleActionPerformed

        String BeefDouble = jTextArea1.getText() + String.format("Double Beef Burger\t\t    RM%.2f\n", beef_double);
        jTextArea1.setText(BeefDouble);
        count5++;
        price5 = beef_double * count5;
    }//GEN-LAST:event_b_doubleActionPerformed

    private void c_doubleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_doubleActionPerformed

        String ChickenDouble = jTextArea1.getText() + String.format("Double Chicken Burger\t\t    RM%.2f\n", chicken_double);
        jTextArea1.setText(ChickenDouble);
        count4++;
        price4 = chicken_double * count4;
    }//GEN-LAST:event_c_doubleActionPerformed

    private void d_originalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_originalActionPerformed

        String DeerOriginal = jTextArea1.getText() + String.format("Original Deer Burger\t\t    RM%.2f\n", deer_original);
        jTextArea1.setText(DeerOriginal);
        count3++;
        price3 = deer_original * count3;
    }//GEN-LAST:event_d_originalActionPerformed

    private void b_originalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_originalActionPerformed

        String BeefOriginal = jTextArea1.getText() + String.format("Original Beef Burger\t\t    RM%.2f\n", beef_original);
        jTextArea1.setText(BeefOriginal);
        count2++;
        price2 = beef_original * count2;
    }//GEN-LAST:event_b_originalActionPerformed

    private void c_originalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_originalActionPerformed

        String ChickenOriginal = jTextArea1.getText() + String.format("Original Chicken Burger\t\t    RM%.2f\n", chicken_original);
        jTextArea1.setText(ChickenOriginal);
        count1++;
        price1 = chicken_original * count1;
    }//GEN-LAST:event_c_originalActionPerformed

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
            java.util.logging.Logger.getLogger(MyBurger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyBurger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyBurger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyBurger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyBurger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GrandTotal;
    private javax.swing.JLabel Special;
    private javax.swing.JTextField SubTotal;
    private javax.swing.JTextField Tax;
    private javax.swing.JButton b_benjo;
    private javax.swing.JButton b_double;
    private javax.swing.JButton b_oblong;
    private javax.swing.JButton b_original;
    private javax.swing.JButton b_special;
    private javax.swing.JButton c_cheese;
    private javax.swing.JButton c_double;
    private javax.swing.JButton c_oblong;
    private javax.swing.JButton c_original;
    private javax.swing.JButton c_special;
    private javax.swing.JButton d_original;
    private javax.swing.JLabel grrand_total;
    private javax.swing.JButton jBtnCalculate;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelItem;
    private javax.swing.JPanel jPanelOrderList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JLabel label_add;
    private javax.swing.JLabel label_double;
    private javax.swing.JLabel label_original;
    private javax.swing.JLabel label_other;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel order_detail;
    private javax.swing.JLabel price;
    private javax.swing.JLabel sub_total;
    private javax.swing.JLabel system_name;
    private javax.swing.JLabel tax;
    // End of variables declaration//GEN-END:variables
}
