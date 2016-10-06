/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entities.*;
import java.util.ArrayList;
import org.joda.time.DateTime;
        
/**
 *
 * @author James
 */
public class Main {
    
    public static void main(String[] args){
        
        
        
        //create students
        Student stud;
        ArrayList<Student> studs = new ArrayList<Student>();
        
        for (int i = 0; i < 20; i++){
            DateTime dt = new DateTime();
            
            stud = new Student( generateName() , generateAge() , dt);
            studs.add(stud);
        }
        
        for (Student s: studs){
            System.out.println(s.getName() + " " + s.getAge() + " " + s.getDob() );
            System.out.println(s);
        }
        
        
        //create modules
        ArrayList<Module> mods = new ArrayList<Module>();

        Module CT123 = new Module("some course", "CT123");
        CT123.setStudents(studs);
        mods.add(CT123);
        
        Module CT234 = new Module("other course", "CT234");
        CT234.setStudents(studs);
        mods.add(CT234);

   
        
        //create Programme
        Programme BCT4 = new Programme("4th Year Computer Science", new DateTime(), new DateTime());
        BCT4.setModules(mods);
    }
    
  
    
    static int generateAge(){
        int num = (int) (Math.random()*100);
        return num;
    }
    static String generateName(){
        int num = (int) (Math.random()*1000);
        String name = "james" + num;
        return name;
    }
    
}
