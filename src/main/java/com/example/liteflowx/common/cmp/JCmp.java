package com.example.liteflowx.common.cmp;

import cn.hutool.core.collection.ListUtil;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeIteratorComponent;

import java.util.Iterator;

@LiteflowComponent("j")
public class JCmp extends NodeIteratorComponent {
    @Override
    public Iterator<?> processIterator() throws Exception {
        return ListUtil.toList("1","2","3").iterator();
    }
}
