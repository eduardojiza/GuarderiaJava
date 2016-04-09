package com.whileapp.guarderia.beans;

/**
 *
 * @author eduardo
 */
public class Device {
    private Integer id;
    private String name;
    private String ip;
    private String port;
    private Double temperature;

    public Device() {
    }

    public Device(Integer id, String name, String ip, String port, Double temperature) {
        this.id = id;
        this.name = name;
        this.ip = ip;
        this.port = port;
        this.temperature = temperature;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Device{" + "id=" + id + ", name=" + name + ", ip=" + ip + ", port=" + port + ", temperature=" + temperature + '}';
    }

}
