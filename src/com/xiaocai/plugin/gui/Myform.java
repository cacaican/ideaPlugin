package com.xiaocai.plugin.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName Myform
 * @Description TODO
 * @Author xiaocai
 * @Date 2021/12/15
 */
public class Myform {
    private JButton button1;
    private JButton button2;
    private JCheckBox checkBox1;
    private JPanel sdfg;
    private JCheckBox checkBox2;
    private JTextArea textArea1;
    private JEditorPane editorPane1;



    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        JFrame jFrame = new JFrame();
        Myform myForm = new Myform();
        // Metal风格 (默认)
        String lookAndFeel = "javax.swing.plaf.metal.MetalLookAndFeel";

        // Windows风格
//        lookAndFeel = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        // Windows Classic风格
//        lookAndFeel = "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";

        // Motif风格
//        lookAndFeel = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
        // Mac风格 (需要在相关的操作系统上方可实现)
//        lookAndFeel = "com.sun.java.swing.plaf.mac.MacLookAndFeel";
        // GTK风格 (需要在相关的操作系统上方可实现)
//        lookAndFeel = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel";
        // 可跨平台的默认风格
//        lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName();
        // 当前系统的风格
//        lookAndFeel = UIManager.getSystemLookAndFeelClassName();
        // UIManager.setLookAndFeel ( "com.alee.laf.WebLookAndFeel" );
//        lookAndFeel ="com.alee.laf.WebLookAndFeel";
        // UIManager.setLookAndFeel ( WebLookAndFeel.class.getCanonicalName () );
        UIManager.setLookAndFeel(lookAndFeel);

        jFrame.setContentPane(myForm.sdfg);
        jFrame.setSize(800,200);
        jFrame.setTitle("swingDesigner测试frame");
        jFrame.setVisible(true);
    }
}
