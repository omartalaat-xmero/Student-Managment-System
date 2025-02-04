/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagementsystem;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.SwingUtilities;

/**
 *
 * @author MAHMOUD TALAAT
 */
public class MainSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Course c=new Course("java"),c1=new Course("mathI"),c2=new Course("Compiler constraction"),c3=new Course("Computer vision");
        courses cs=new courses();
        cs.insertCourse(c);
        cs.insertCourse(c1);
        cs.insertCourse(c2);
        cs.insertCourse(c3);
        System.out.println(cs.printCourses(c));
        Grade g=new Grade();
        studentsystem.addStudent(1203, "omar talaat");
        g.setGradeValue(70);
        studentsystem.setgradetoStudent(1203,c1,g);
        studentsystem.setcoursetoStudent(1203, c1,g);
        instructorsystem.addInstructor(1, "talaat",Arrays.asList(c1,c2));
    }           
}