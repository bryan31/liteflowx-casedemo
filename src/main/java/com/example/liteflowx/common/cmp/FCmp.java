package com.example.liteflowx.common.cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeForComponent;

@LiteflowComponent("f")
public class FCmp extends NodeForComponent {
    @Override
    public int processFor() throws Exception {
        return 3;
    }
}
