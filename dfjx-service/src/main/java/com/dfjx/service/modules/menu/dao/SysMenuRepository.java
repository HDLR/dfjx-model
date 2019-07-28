/**
 * 2019 东方金信
 *
 *
 *
 *
 */

package com.dfjx.service.modules.menu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dfjx.service.modules.menu.entity.SysMenuEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 菜单管理
 * @author zdl
 */
@Repository
@Mapper
public interface SysMenuRepository extends BaseMapper<SysMenuEntity> {
	
	/**
	 * 根据父菜单，查询子菜单
	 * @param parentId 父菜单ID
	 */
    @Select("select menu_id, parent_id, name, url, perms, type, icon, order_num from sys_menu where parent_id = #{parentId} order by order_num asc")
	List<SysMenuEntity> queryListParentId(Long parentId);
	
	/**
	 * 获取不包含按钮的菜单列表
	 */
    @Select("select menu_id, parent_id, name, url, perms, type, icon, order_num from sys_menu where type != 2 order by order_num asc")
	List<SysMenuEntity> queryNotButtonList();

}
