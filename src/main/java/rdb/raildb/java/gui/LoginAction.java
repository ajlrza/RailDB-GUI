/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rdbgroup.raildb.java.gui;
import java.io.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author MSTR Xen
 */
public class MenuAction  {

    public LoginAction(JButton Component) {
        Component.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Your login logic goes here
                System.out.println("Login button clicked!");
            }
        });
    }
    
    public RegisterAction(JButton Component) {
        Component.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
                System.out.println("Register button clicked");
        }
    });
}

