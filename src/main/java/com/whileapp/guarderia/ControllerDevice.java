/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whileapp.guarderia;

import com.whileapp.guarderia.beans.Device;
import com.whileapp.guarderia.dao.DeviceDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author eduardo
 */
@RestController
public class ControllerDevice {
    @Autowired
    private DeviceDAO deviceDAO;
    
    @CrossOrigin(origins = "http://127.0.0.1:9000")
    @RequestMapping("/devices")
    public List<Device> getAll() {
        return deviceDAO.getAll();
    }
    @CrossOrigin(origins = "http://127.0.0.1:9000")
    @RequestMapping("/device/temperature/{id}")
    public Double getTemperature(@PathVariable("id") int id) {
        return deviceDAO.getTemperature(id);
    }
}
