/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author MAHMOUD TALAAT
 */
public class studentsystem {
    private static final List<Student> stud = new ArrayList<>();
    public static void addStudent(int id,String name) {
        Student newstud = new Student(id, name);
        stud.add(newstud);
        System.out.println("Student Added\n"+newstud.displayDetails());
    }
    public static void addStudent (int id,String name,Course course) {
        Student newstud = new Student(id, name);
        stud.add(newstud);
        
        System.out.println("Student Added\n"+newstud.displayDetails());
    }
    public static void editStudent(int id, String newName, Course course, Grade grade) {
        boolean found = false;
        for(int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getId()== id) {
                stud.get(i).setName(newName);
                stud.get(i).addGrade(course,grade);
                System.out.println("Student updated"+stud.get(i).displayDetails());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
    public static void SetcourseStudent(int id,Course course) {
        boolean found = false;
        for(int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getId()== id) {
                stud.get(i).Setcourse(course,null);
                System.out.println("Student updated"+stud.get(i).displayDetails());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
     public static void removecourseStudent(int id,Course course) {
        boolean found = false;
        for(int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getId()== id) {
                stud.get(i).Setcourse(null,null);
                System.out.println("Student updated"+stud.get(i).displayDetails());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
    /*public static void setcoursetoStudent(int id,Course course, Grade grade) {
        boolean found = false;
        for(int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getId()== id) {
                stud.get(i).Setcourse(course,grade);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }*/
    public static void setgradetoStudent(int id,Course course, Grade grade) {
        boolean found = false;
        for(int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getId()== id) {
                stud.get(i).addGrade(course,grade);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
    public static void removeStudent(int id) {
        boolean removed = stud.removeIf(student -> student.getId() == id);
        if (removed) {
            System.out.println("Student with ID " + id + " removed.");
        } 
        else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
    public static void allStudentCourses(int id) { 
        boolean found = false;
        for (int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getId() == id) { 
                List<Course> c=stud.get(i).getCourses();
                for(int j=0;j<c.size();j++){
                    System.out.println(c.get(j).getCourseName());
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
    public static void allStudents(Course course) { 
        for (int i = 0; i < stud.size(); i++) {
            System.out.println("ID: " + stud.get(i).getId() + " ,Name: "+stud.get(i).getName()); 
        }
    }
    public static void viewStudent(int id) { 
        boolean found = false;
        for (int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getId() == id) { 
                stud.get(i).displayDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
    public static void editStudent(int id, String newName) {
        boolean found = false;
        for(int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getId()== id) {
                stud.get(i).setName(newName);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
    /**
     * @param id
     * @return *******************************************************/
    public static boolean isinSys(int id){
    boolean found = false;
        for (int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getId() == id) {
                found = true;
                break;
            }
        }
        return found;
    }
    public static String ShowStudCourses(int id) {
        String s="";
        for(int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getId()== id) {
                List<Course> c=stud.get(i).getCourses();
                for (Course c1 : c) {
                    s+=(c1.getCourseName()+", ");
                }
               
            }
        }
        
        return s;
    }
    public static StringBuilder getStudgrades(int id) {
        StringBuilder details = new StringBuilder();
        String s="";
        for(int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getId()== id) {
                Map<Course, Grade> g=stud.get(i).getGrades();
                for (Map.Entry<Course, Grade> entry : g.entrySet()) {
                    details .append(entry.getValue().getGrade());
                }
            }
        }
        return details;
    }
    /*public static String viewstudID(int id){
    String instid = null;
    boolean found = false;
        for (int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getId() == id){
                instid=String.valueOf((stud.get(i).getId()));
                found = true;
                break;
            }
        }
        return instid;
    }*/
    public static String viewstudName(int id){
        String instName= new String();
        for (int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getId() == id){
                instName=String.valueOf((stud.get(i).getName()));
                //instName = inst.get(i).getName();
            }
        }
        return instName;
    }
    /*********************************************************/
}
