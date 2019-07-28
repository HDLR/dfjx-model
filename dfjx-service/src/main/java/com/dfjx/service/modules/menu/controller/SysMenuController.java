package com.dfjx.service.modules.menu.controller;

import com.dfjx.api.controller.ISysMenuController;
import com.dfjx.api.dto.SysMenuDto;
import com.dfjx.service.modules.menu.entity.SysMenuEntity;
import com.dfjx.service.modules.menu.services.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@RestController
public class SysMenuController implements ISysMenuController {

    private SysMenuService sysMenuService;

    @Autowired
    public SysMenuController(SysMenuService sysMenuService){
        this.sysMenuService = sysMenuService;
    }

    @Override
    public List<SysMenuDto> nav() {
        List<SysMenuEntity> menuList = sysMenuService.getUserMenuList(1L);
        List<SysMenuDto> dtoList = menuList.stream().map(SysMenuEntity::of).filter(Optional::isPresent).map(Optional::get).collect(toList());
        return dtoList;
    }

    @Override
    public List<SysMenuDto> list() {
        List<SysMenuEntity> menuList = sysMenuService.list();
        for(SysMenuEntity sysMenuEntity : menuList){
            SysMenuEntity parentMenuEntity = sysMenuService.getById(sysMenuEntity.getParentId());
            if(parentMenuEntity != null){
                sysMenuEntity.setParentName(parentMenuEntity.getName());
            }
        }
        List<SysMenuDto> dtoList = menuList.stream().map(SysMenuEntity::of).filter(Optional::isPresent).map(Optional::get).collect(toList());
        return dtoList;
    }

    @Override
    public List<SysMenuDto> select() {
        return null;
    }

    @Override
    public SysMenuDto info(Long menuId) {
        return null;
    }

    @Override
    public void save(SysMenuDto menu) {

    }

    @Override
    public void update(SysMenuDto menu) {

    }
}
