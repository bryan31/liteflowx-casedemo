package com.example.liteflowx;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class LiteFlowRun implements CommandLineRunner {

    @Resource
    private FlowExecutor flowExecutor;

    @Override
    public void run(String... args) throws Exception {
        LiteflowResponse response1 = flowExecutor.execute2Resp("chain1");
        System.out.println(response1.isSuccess());

        LiteflowResponse response2 = flowExecutor.execute2Resp("chain2");
        System.out.println(response2.isSuccess());

        LiteflowResponse response3 = flowExecutor.execute2Resp("chain3");
        System.out.println(response3.isSuccess());

        LiteflowResponse response4 = flowExecutor.execute2Resp("chain4");
        System.out.println(response4.isSuccess());

        LiteflowResponse response5 = flowExecutor.execute2Resp("chain5");
        System.out.println(response5.isSuccess());
    }
}
