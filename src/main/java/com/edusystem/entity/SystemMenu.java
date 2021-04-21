package com.edusystem.entity;

import java.util.Date;

public class SystemMenu {
    private String id;

    private String name;

    private String path;

    private String component;

    private String redirect;

    private String url;

    private String metaTitle;

    private String metaIcon;

    private Integer metaNocache;

    private Integer alwaysshow;

    private Integer metaAffix;

    private Integer type;

    private Integer hidden;

    private Integer pid;

    private Integer sort;

    private Integer status;

    private Integer level;

    private Date ctime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component == null ? null : component.trim();
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect == null ? null : redirect.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle == null ? null : metaTitle.trim();
    }

    public String getMetaIcon() {
        return metaIcon;
    }

    public void setMetaIcon(String metaIcon) {
        this.metaIcon = metaIcon == null ? null : metaIcon.trim();
    }

    public Integer getMetaNocache() {
        return metaNocache;
    }

    public void setMetaNocache(Integer metaNocache) {
        this.metaNocache = metaNocache;
    }

    public Integer getAlwaysshow() {
        return alwaysshow;
    }

    public void setAlwaysshow(Integer alwaysshow) {
        this.alwaysshow = alwaysshow;
    }

    public Integer getMetaAffix() {
        return metaAffix;
    }

    public void setMetaAffix(Integer metaAffix) {
        this.metaAffix = metaAffix;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}