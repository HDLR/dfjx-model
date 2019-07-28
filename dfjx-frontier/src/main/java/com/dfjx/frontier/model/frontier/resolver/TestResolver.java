package com.dfjx.frontier.model.frontier.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.dfjx.frontier.model.frontier.response.TestResult;
import org.springframework.stereotype.Service;

@Service
public class TestResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

    public TestResult queryName(String id){
        TestResult r = new TestResult();
        r.setName("ZDL");
        r.setCode("Num1");
        r.setBz("用于测试类");
        return r;
    }

}
