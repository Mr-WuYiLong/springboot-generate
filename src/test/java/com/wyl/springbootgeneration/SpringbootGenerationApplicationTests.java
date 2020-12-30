package com.wyl.springbootgeneration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootGenerationApplicationTests {

    @Test
    void contextLoads() {
//       List<User> objects = new ArrayList<>();\

       String str =  "广东电网公司江门台山供电局；广东省广电集团有限公司江门台山供电分公司";
        String[] split = str.split("；");
        System.out.println("*********split->{}"+split);

    }

}
