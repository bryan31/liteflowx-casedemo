package com.example.liteflowx.common.cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeWhileComponent;

@LiteflowComponent("g")
public class GCmp extends NodeWhileComponent {
    @Override
    public boolean processWhile() throws Exception {
        return true;
    }
}
