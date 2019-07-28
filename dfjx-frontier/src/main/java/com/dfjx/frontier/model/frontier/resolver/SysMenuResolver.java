package com.dfjx.frontier.model.frontier.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.dfjx.api.controller.ISysMenuController;
import com.dfjx.api.dto.SysMenuDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenuResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

    public List<SysMenuDto> sysMenuNav(){
        return controller.nav();
    }

    public List<SysMenuDto> sysMenuList(){
        return controller.list();
    }

    private ISysMenuController controller;

    @Autowired
    public SysMenuResolver(ISysMenuController controller){
        this.controller = controller;
    }
}
