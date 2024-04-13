package com.example.liteflowx.mdecl.cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.annotation.LiteflowMethod;
import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.enums.LiteFlowMethodEnum;
import com.yomahub.liteflow.enums.NodeTypeEnum;
import com.yomahub.liteflow.slot.DefaultContext;

@LiteflowComponent
public class CmpConfig {

    @LiteflowMethod(value = LiteFlowMethodEnum.PROCESS, nodeId = "mdecl_a", nodeType = NodeTypeEnum.COMMON)
    public void processA(NodeComponent bindCmp) throws Exception {

    }

    @LiteflowMethod(value = LiteFlowMethodEnum.PROCESS, nodeId = "mdecl_b", nodeType = NodeTypeEnum.COMMON)
    public void processB(NodeComponent bindCmp) throws Exception {

    }

    @LiteflowMethod(value = LiteFlowMethodEnum.PROCESS, nodeId = "mdecl_c", nodeType = NodeTypeEnum.COMMON)
    public void processC(NodeComponent bindCmp) throws Exception {

    }

    @LiteflowMethod(value = LiteFlowMethodEnum.PROCESS_SWITCH, nodeId = "mdecl_d", nodeType = NodeTypeEnum.SWITCH)
    public String processD(NodeComponent bindCmp) throws Exception {
        return bindCmp.getTag();
    }

    @LiteflowMethod(value = LiteFlowMethodEnum.PROCESS_BOOLEAN, nodeId = "mdecl_e", nodeType = NodeTypeEnum.BOOLEAN)
    public boolean processE(NodeComponent bindCmp) throws Exception {
        return Boolean.parseBoolean(bindCmp.getTag());
    }

    @LiteflowMethod(value = LiteFlowMethodEnum.PROCESS_FOR, nodeId = "mdecl_f", nodeType = NodeTypeEnum.FOR)
    public int processF(NodeComponent bindCmp) throws Exception {
        return 3;
    }

    @LiteflowMethod(value = LiteFlowMethodEnum.PROCESS_BOOLEAN, nodeId = "mdecl_g", nodeType = NodeTypeEnum.BOOLEAN)
    public boolean processG(NodeComponent bindCmp) throws Exception {
        return true;
    }

    @LiteflowMethod(value = LiteFlowMethodEnum.PROCESS_BOOLEAN, nodeId = "mdecl_h", nodeType = NodeTypeEnum.BOOLEAN)
    public boolean processH(NodeComponent bindCmp) throws Exception {
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
