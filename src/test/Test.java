/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Scanner;
/**
 *
 * @author khush
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter information of 5 students : ");
        Student[] s = new Student[5];
        for(int i=0;i<5;i++)
        {
            s[i] = new Student();
            System.out.println("Enter ID :");
            s[i].setId(sc.nextInt());
            System.out.println("Enter name :");
            s[i].setName(sc.next());
        }
        for(int i=0;i<5;i++)
        {
            System.out.println("ID :"+ s[i].getId()+"  Name :"+s[i].getName());
        }
    }
    
}
