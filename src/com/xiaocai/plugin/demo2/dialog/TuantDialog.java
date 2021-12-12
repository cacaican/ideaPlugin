package com.xiaocai.plugin.demo2.dialog;

import com.intellij.openapi.ui.DialogWrapper;
import com.xiaocai.plugin.demo2.ContentUtil;
import org.jetbrains.annotations.Nullable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

/**
 * @ClassName TuantDialog
 * @Description TODO
 * @Author xiaocai
 * @Date 2021/12/12
 */
public class TuantDialog extends DialogWrapper {

    private JLabel label ;
    public TuantDialog() {
        super(true);
        init();//初始化dialog
        setTitle("每天一碗毒鸡汤");//设置对话框标题标题
    }

    /**
     * 创建对话框中间的内容面板
     * @return
     */
    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        //创建一个面板，设置其布局为边界布局
        JPanel centerPanel = new JPanel(new BorderLayout());
        //创建一个文字标签，来承载内容
        label = new JLabel("毒鸡汤的内容");
        //设置首先大小
        label.setPreferredSize(new Dimension(100,100));
        //将文字标签添加的面板的正中间
        centerPanel.add(label,BorderLayout.CENTER);
        return centerPanel;
    }

    @Override
    protected JComponent createSouthPanel() {
        JPanel southPanel = new JPanel(new FlowLayout());
        JButton button=new JButton("再干一碗");
        button.addActionListener(e -> {
            label.setText(ContentUtil.getContent());
        });
        southPanel.add(button);
        return southPanel;
    }








}
