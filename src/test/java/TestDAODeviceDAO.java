/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.whileapp.guarderia.App;
import com.whileapp.guarderia.beans.Device;
import com.whileapp.guarderia.dao.DeviceDAO;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author eduardo
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=App.class)
public class TestDAODeviceDAO {
    @Autowired
    private DeviceDAO deviceDAO;
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testInjection() {
        List<Device> devices = deviceDAO.getAll();
        for(int i = 0; i < devices.size(); i++){
            System.out.println( devices.get(i) );
        }
    }
}
