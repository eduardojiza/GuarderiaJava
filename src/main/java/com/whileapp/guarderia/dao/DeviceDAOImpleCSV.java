/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whileapp.guarderia.dao;

import com.whileapp.guarderia.beans.Device;
import com.whileapp.guarderia.socket.ClientSocket;
import com.whileapp.guarderia.socket.ClientSocketImple;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author eduardo
 */
@Component
public class DeviceDAOImpleCSV implements DeviceDAO{
    private static List<Device> devices = new ArrayList();
    
    static{
        devices.add(new Device(1, "device1", "192.168.1.70", 9000, 55.1));
        //devices.add(new Device(2, "device2", "192.168.1.2", "8080", 33.3));
    }

    @Override
    public Device add(Device device) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Device delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Device> getAll() {
        return devices;
    }

    @Override
    public Double getTemperature( int id ) {
        Device device = getElementById( id );
        Double num;
        if( device == null ) {
            return null;
        }
        //Math.random()*(HASTA-DESDE+1)+DESDE
        ClientSocket cs = new ClientSocketImple( device.getIp(), device.getPort() );
        num = Double.parseDouble( cs.sendMessage( "H" ) );
        device.setTemperature( num );
        System.out.println( device );
        return num;
    }
    
    private Device getElementById( int id ) {
        Device device = null;
        for ( int i = 0; i < devices.size(); i++ ) {
            if( devices.get( i ).getId() == id ){
                device = devices.get( i );
                break;
            }
        }
        
        return device;
    }
}
