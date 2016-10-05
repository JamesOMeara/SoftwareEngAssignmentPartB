package Tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entities.Student;
import org.joda.time.DateTime;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author James
 */
public class TestStudent {
    
    private Student s;
    private DateTime d;
            
    public TestStudent() {
        d = new DateTime();
        s = new Student("james", 10, d);
    }
   
     @Test
     public void hello() {
         String username = s.getUsrname();
         assertEquals("james10 should be ture", username, "james10");
     }
}
