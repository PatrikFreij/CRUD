package crud;

import java.util.ArrayList;
import java.util.Scanner;


public class CRUD {//Create Read Update Delete

    ArrayList<String> myList = new ArrayList<>();;
    Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {

        
        
        
    }
    public void Create() {
        myList.add(sc.nextLine());
    }
    public void Print() {
        System.out.println(myList);
    }
    public void Update() {
    
    }
    public void Delete() {
        //mylist Remove
    }
}
