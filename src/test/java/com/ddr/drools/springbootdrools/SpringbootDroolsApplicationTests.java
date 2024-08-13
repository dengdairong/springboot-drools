package com.ddr.drools.springbootdrools;

import com.ddr.drools.springbootdrools.entity.Order;
import org.junit.jupiter.api.Test;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDroolsApplicationTests {
    @Autowired
    private KieSession kieSession;

    @Test
    void contextLoads() {
        // 创建事实对象
        Order order = new Order();
        order.setAmout(234);
        order.setScore(100);
        // 第四步:
        kieSession.insert(order);
        // 第五步: 执行规则
        kieSession.fireAllRules();
    }

}
