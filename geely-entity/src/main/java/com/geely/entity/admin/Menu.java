package com.geely.entity.admin;

public class Menu {
    private Integer menuId;

    private String menuName;

    private String menuParent;

    private Integer menuPid;

    private String menuUrl;

    public Menu(Integer menuId, String menuName, String menuParent, Integer menuPid, String menuUrl) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuParent = menuParent;
        this.menuPid = menuPid;
        this.menuUrl = menuUrl;
    }

    public Menu() {
        super();
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuParent() {
        return menuParent;
    }

    public void setMenuParent(String menuParent) {
        this.menuParent = menuParent == null ? null : menuParent.trim();
    }

    public Integer getMenuPid() {
        return menuPid;
    }

    public void setMenuPid(Integer menuPid) {
        this.menuPid = menuPid;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }
}