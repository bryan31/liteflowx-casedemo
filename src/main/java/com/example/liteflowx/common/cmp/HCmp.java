package com.example.liteflowx.common.cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeBooleanComponent;
import com.yomahub.liteflow.slot.DefaultContext;

@LiteflowComponent("h")
public class HCmp extends NodeBooleanComponent {

    @Override
    public boolean processBoolean() throws Exception {
        DefaultContext context = this.getFirstContextBean();
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
