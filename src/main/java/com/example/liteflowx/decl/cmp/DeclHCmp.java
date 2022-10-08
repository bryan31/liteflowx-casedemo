package com.example.liteflowx.decl.cmp;

import com.yomahub.liteflow.annotation.LiteflowCmpDefine;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.annotation.LiteflowMethod;
import com.yomahub.liteflow.core.NodeBreakComponent;
import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.enums.LiteFlowMethodEnum;
import com.yomahub.liteflow.enums.NodeTypeEnum;
import com.yomahub.liteflow.slot.DefaultContext;

@LiteflowComponent("decl_h")
@LiteflowCmpDefine(NodeTypeEnum.BREAK)
public class DeclHCmp{

    @LiteflowMethod(value = LiteFlowMethodEnum.PROCESS_BREAK, nodeType = NodeTypeEnum.BREAK)
    public boolean processBreak(NodeComponent bindCmp) throws Exception {
        DefaultContext context = bindCmp.getFirstContextBean();
        String count_key = "count";
        if (context.hasData(count_key)){
            int count = context.getData(count_key);
            if (count >= 3){
                return true;
            }else{
                context.setData(count_key, ++count);
                return false;
            }
        }else{
            context.setData(count_key, 1);
            return false;
        }
    }
}
