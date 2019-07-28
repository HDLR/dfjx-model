package com.dfjx.api.controller;

import com.dfjx.api.FeignClientConfig;
import com.dfjx.api.dto.SysMenuDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Set;

@FeignClient(contextId = "ServiceSysMenu",
        name = FeignClientConfig.NAME, url = FeignClientConfig.URL, configuration = FeignClientsConfiguration.class)
public interface ISysMenuController {

    /**
     * 导航菜单
     */
    @GetMapping("/sys/menu/nav")
    List<SysMenuDto> nav();

    /**
     * 所有菜单列表
     */
    @GetMapping("/sys/menu/list")
    List<SysMenuDto> list();

    /**
     * 选择菜单(添加、修改菜单)
     */
    @GetMapping("/sys/menu/select")
    List<SysMenuDto> select();

    /**
     * 菜单信息
     */
    @GetMapping("/sys/menu/info/{menuId}")
    SysMenuDto info(@PathVariable("menuId") Long menuId);

    @PostMapping("/sys/menu/save")
    void save(@RequestBody SysMenuDto menu);

    @PostMapping("/sys/menu/update")
    void update(@RequestBody SysMenuDto menu);

}
