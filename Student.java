/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut;


import java.util.ArrayList;
import java.util.List;
import za.ac.tut.Expenses;

/**
 *
 * @author Student
 */
public class Student {
    private String names;
    private String studentNumber;
    List<Expenses> expenses;

    public Student() {
    }

    public Student(String names, String studentNumber, List<Expenses> expenses) {
        this.names = names;
        this.studentNumber = studentNumber;
        this.expenses = expenses;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    
    public List<Expenses> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expenses> expenses) {
        this.expenses = expenses;
    }
    
    public double calculateTotalExpensis(List<Expenses> expenses){
        double totalExpenses = 0;
        
        for(int i = 0; i < expenses.size();i++){
            double expenseAmount = expenses.get(i).getExpenseAmount();
            totalExpenses += expenseAmount;
        }
        
        return totalExpenses;
    }
    
}
