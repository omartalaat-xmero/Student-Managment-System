/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;
// View the total number of instructors
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.lang.String;
import studentmanagementsystem.Course;
/**
 *
 * @author MAHMOUD TALAAT
 */
public class instructorsystem {
    private static final List<Instructor> inst = new ArrayList<>();
    public static void addInstructor(int id, String name, List<Course> courses) {
        Instructor newinst = new Instructor(id, name,courses);
        inst.add(newinst);
       System.out.println("Instructor Added\n"+newinst.displayDetails());
    }
    public static void editInstructorName(int id,String name) {
        boolean found = false;
        for(int i = 0; i < inst.size(); i++) {
            if (inst.get(i).getId()== id) {
                inst.get(i).setName(name);
                System.out.println("Instructor updated\n"+inst.get(i).displayDetails());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Instructor with ID " + id + " not found.");
        }
    }
    public static void deleteInstructorCourse(int id,Course c) {
        boolean found = false;
        for(int i = 0; i < inst.size(); i++) {
            if (inst.get(i).getId()== id) {
                inst.get(i).removeCourse(c);
                System.out.println("Instructor updated"+inst.get(i).displayDetails());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Instructor with ID " + id + " not found.");
        }
    }
    public static void removeInstructor(int id) {
        boolean removed = inst.removeIf(instructor -> instructor.getId() == id);
        if (removed) {
            System.out.println("Instructor with ID " + id + " removed.");
        } 
        else {
            System.out.println("Instructor with ID " + id + " not found.");
        }
    }
    public static void viewInstructor(int id) { 
        boolean found = false;
        for (int i = 0; i < inst.size(); i++) {
            if (inst.get(i).getId() == id) { 
                System.out.println(inst.get(i).displayDetails());
                System.out.println("****************************");
                System.out.println(inst.get(i).getId());
                System.out.println(inst.get(i).getName());
                System.out.println(inst.get(i).getCourses());
                System.out.println("*****************************");
                
                found = true;
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null,"Instructor Not Found");
            System.out.println("Instructor with ID " + id + " not found.");
        }
    }
    public static boolean isinSys(int id){
    boolean found = false;
        for (int i = 0; i < inst.size(); i++) {
            if (inst.get(i).getId() == id) {
                found = true;
                break;
            }
        }
        return found;
    }
    public static void addInst(int id,String name) {
        Instructor newinst = new Instructor(id, name);
        inst.add(newinst);
        System.out.println("Instructor Added\n"+newinst.displayDetails());
    }
    public static void addInstructorCourse(int id,Course c) {
        boolean found = false;
        for(int i = 0; i < inst.size(); i++) {
            if (inst.get(i).getId()== id) {
                inst.get(i).addCourses(c);
                System.out.println("Instructor updated"+inst.get(i).displayDetails());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Instructor with ID " + id + " not found.");
        }
    }
    public static String ShowInstCourses(int id) {
        String s="";
        for(int i = 0; i < inst.size(); i++) {
            if (inst.get(i).getId()== id) {
                List<Course> c=inst.get(i).getCourses();
                for (Course c1 : c) {
                    s+=(c1.getCourseName()+"\n");
                }
               
            }
        }
        
        return s;
    }
    /*public static String viewInstID(int id){
    String instid = null;
    boolean found = false;
        for (int i = 0; i < inst.size(); i++) {
            if (inst.get(i).getId() == id){
                instid=String.valueOf((inst.get(i).getId()));
                found = true;
                break;
            }
        }
        return instid;
    }*/
    public static String viewInstName(int id){
        String instName= new String();
        for (int i = 0; i < inst.size(); i++) {
            if (inst.get(i).getId() == id){
                instName=String.valueOf((inst.get(i).getName()));
                //instName = inst.get(i).getName();
            }
        }
        return instName;
    }
}
