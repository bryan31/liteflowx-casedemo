package com.example.liteflowx.decl.cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.annotation.LiteflowMethod;
import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.enums.LiteFlowMethodEnum;
import com.yomahub.liteflow.enums.NodeTypeEnum;

@LiteflowComponent("decl_e")
public class DeclECmp{

    @LiteflowMethod(value = LiteFlowMethodEnum.PROCESS_BOOLEAN, nodeType = NodeTypeEnum.BOOLEAN)
    public boolean processIf(NodeComponent bindCmp) throws Exception {
        return Boolean.parseBoolean(bindCmp.getTag());
    }
}
