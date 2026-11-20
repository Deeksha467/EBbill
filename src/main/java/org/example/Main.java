package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int unit;
        float bill=0;
        Scanner sc = new Scanner(System.in);
        unit = sc.nextInt();
        if(unit<=100){
            bill=bill+unit*1.5;
        }
        else if(unit>100 && unit<=200){
            bill=100*1.5+(unit-100)*2.5;
        }else{
            bill=100*1.5+200*2.5+(unit-200)*4.0;
        }
        System.out.println("Total bill amount: "+bill);
    }
}