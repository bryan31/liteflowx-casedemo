package com.example.liteflowx.common.cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

@LiteflowComponent("k")
public class Kcmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        String curLoopStr = this.getCurrLoopObj();
        System.out.println(curLoopStr);
    }
}
