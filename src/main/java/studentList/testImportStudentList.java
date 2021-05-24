/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentList;

import java.util.Scanner;

/**
 *
 * @author pooja
 */
public class testImportStudentList {
    

    public static void main(String[] args) {
        
        importStudentList[] array = new importStudentList[8];
        for(int i=0;i<array.length;i++)
        {
            
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the names: ");
        String names = input.nextLine();
        importStudentList a = new importStudentList(names);
        array[i] = a;
    }
        for(importStudentList s:array){
            System.out.println("Entered names are :" +s.getName());
        }
}
}
