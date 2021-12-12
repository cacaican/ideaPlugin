package com.xiaocai.plugin.demo2.component;

import com.intellij.openapi.components.BaseComponent;
import com.xiaocai.plugin.demo2.dialog.TuantDialog;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName ApplicationComponentDemo1
 * @Description TODO
 * @Author xiaocai
 * @Date 2021/12/12
 */
public class ApplicationComponentDemo1  implements BaseComponent {
    @Override
    public void initComponent() {
        System.out.println("获取到应用加载时候的方法");
        TuantDialog tuantDialog = new TuantDialog();
        tuantDialog.show();

    }

}
