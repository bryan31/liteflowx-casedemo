package com.example.liteflowx.common.cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeBooleanComponent;

@LiteflowComponent("g")
public class GCmp extends NodeBooleanComponent {
    @Override
    public boolean processBoolean() throws Exception {
        return true;
    }
}
