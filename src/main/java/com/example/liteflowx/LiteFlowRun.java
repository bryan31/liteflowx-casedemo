package com.example.liteflowx;

import com.ql.util.express.DefaultContext;
import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class LiteFlowRun implements CommandLineRunner {

    @Resource
    private FlowExecutor flowExecutor;

    @Override
    public void run(String... args) throws Exception {
        // java组件，类声明式，方法声明式 综合
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


        // retry关键字测试
        LiteflowResponse retryResponse1 = flowExecutor.execute2Resp("retry1");
        System.out.println(retryResponse1.isSuccess());

        LiteflowResponse retryResponse2 = flowExecutor.execute2Resp("retry2");
        System.out.println(retryResponse2.isSuccess());

        LiteflowResponse retryResponse3 = flowExecutor.execute2Resp("retry3");
        System.out.println(retryResponse3.isSuccess());

        LiteflowResponse retryResponse4 = flowExecutor.execute2Resp("retry4");
        System.out.println(retryResponse4.isSuccess());

        LiteflowResponse retryResponse5 = flowExecutor.execute2Resp("retry5");
        System.out.println(retryResponse5.isSuccess());

        LiteflowResponse retryResponse6 = flowExecutor.execute2Resp("retry6");
        System.out.println(retryResponse6.isSuccess());

        LiteflowResponse retryResponse7 = flowExecutor.execute2Resp("retry7");
        System.out.println(retryResponse7.isSuccess());

        LiteflowResponse retryResponse8 = flowExecutor.execute2Resp("retry8");
        System.out.println(retryResponse8.isSuccess());

        // 决策路由测试
        List<LiteflowResponse> routeResponse = flowExecutor.executeRouteChain("arg", DefaultContext.class);
        System.out.println(routeResponse.size());

        // 单独执行带<body>的，也要兼容
        LiteflowResponse withBodyResponse = flowExecutor.execute2Resp("with_body");
        System.out.println(withBodyResponse.isSuccess());

        // 继承{{}} 和 SER, PAR关键字测试
        LiteflowResponse extendResponse = flowExecutor.execute2Resp("implA");
        System.out.println(extendResponse.isSuccess());
    }
}
