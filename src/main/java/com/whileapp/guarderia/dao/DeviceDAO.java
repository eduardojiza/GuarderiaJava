/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whileapp.guarderia.dao;

import com.whileapp.guarderia.beans.Device;
import java.util.List;

/**
 *
 * @author eduardo
 */
public interface DeviceDAO {
    public Device add( Device device );
    public Device delete( int id );
    public List<Device> getAll();   
    public Double getTemperature( int id );
}
