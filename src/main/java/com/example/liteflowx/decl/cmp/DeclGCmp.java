package com.example.liteflowx.decl.cmp;

import com.yomahub.liteflow.annotation.LiteflowCmpDefine;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.annotation.LiteflowMethod;
import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.core.NodeWhileComponent;
import com.yomahub.liteflow.enums.LiteFlowMethodEnum;
import com.yomahub.liteflow.enums.NodeTypeEnum;

@LiteflowComponent("decl_g")
@LiteflowCmpDefine(NodeTypeEnum.WHILE)
public class DeclGCmp{
    @LiteflowMethod(value = LiteFlowMethodEnum.PROCESS_WHILE, nodeType = NodeTypeEnum.WHILE)
    public boolean processWhile(NodeComponent bindCmp) throws Exception {
        return true;
    }
}
