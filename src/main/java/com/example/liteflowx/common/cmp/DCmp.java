package com.example.liteflowx.common.cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeSwitchComponent;

@LiteflowComponent("d")
public class DCmp extends NodeSwitchComponent {
    @Override
    public String processSwitch() throws Exception {
        return this.getTag();
    }
}
