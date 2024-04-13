package com.example.liteflowx.common.cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeBooleanComponent;

@LiteflowComponent("e")
public class ECmp extends NodeBooleanComponent {
    @Override
    public boolean processBoolean() throws Exception {
        return Boolean.parseBoolean(this.getTag());
    }
}
