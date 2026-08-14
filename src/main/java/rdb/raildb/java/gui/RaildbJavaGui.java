/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rdbgroup.raildb.java.gui;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author MSTR Xen
 */

public class RaildbJavaGui {

    public static void main(String[] args) {
        JFrame frame = new JFrame("RailDB");
        frame.setLayout(null);
        
        JButton loginBtn = new JButton("LOGIN");
        loginBtn.setBounds(250, 200, 220, 50);
        loginBtn.addActionListener(1);
        frame.add(loginBtn);
        
        JButton registerBtn = new JButton("REGISTER");
        registerBtn.setBounds(250, 300, 220, 50);
        registerBtn.addActionListener(l);
        frame.add(registerBtn);
        
        JPopupMenu menu = new JPopupMenu("ACCOUNT");
 
        
        menu.setVisible(true);
        frame.setVisible(true);
    }
}
