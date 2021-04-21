package com.screen.key;

import com.screen.key.jenterkey.JEnterKey;

/**
 *
 * @author Yougeshwar
 */
public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new JEnterKey().setVisible(true);
        });
    }
}
