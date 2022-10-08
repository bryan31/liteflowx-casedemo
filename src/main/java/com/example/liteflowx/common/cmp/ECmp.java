package com.example.liteflowx.common.cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeIfComponent;

@LiteflowComponent("e")
public class ECmp extends NodeIfComponent {
    @Override
    public boolean processIf() throws Exception {
        return Boolean.parseBoolean(this.getTag());
    }
}
