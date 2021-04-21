package com.edusystem.entity;

public class Route {
    private String routeId;

    private Integer routeRose;

    private String routeUse;

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId == null ? null : routeId.trim();
    }

    public Integer getRouteRose() {
        return routeRose;
    }

    public void setRouteRose(Integer routeRose) {
        this.routeRose = routeRose;
    }

    public String getRouteUse() {
        return routeUse;
    }

    public void setRouteUse(String routeUse) {
        this.routeUse = routeUse == null ? null : routeUse.trim();
    }
}