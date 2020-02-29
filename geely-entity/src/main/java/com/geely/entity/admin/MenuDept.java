package com.geely.entity.admin;

public class MenuDept {
    private Integer menuDeptId;

    private Integer menuId;

    private Integer deptId;

    public MenuDept(Integer menuDeptId, Integer menuId, Integer deptId) {
        this.menuDeptId = menuDeptId;
        this.menuId = menuId;
        this.deptId = deptId;
    }

    public MenuDept() {
        super();
    }

    public Integer getMenuDeptId() {
        return menuDeptId;
    }

    public void setMenuDeptId(Integer menuDeptId) {
        this.menuDeptId = menuDeptId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
}