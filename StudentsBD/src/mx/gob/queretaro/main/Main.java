package mx.gob.queretaro.main;

import java.util.Scanner;
import mx.gob.queretaro.bo.StudentBo;
import mx.gob.queretaro.views.View;

/**
 *
 * @author ijimeneza
 */
public class Main {
    
    static View vi = new View();
    static StudentBo stb = new StudentBo();
    
    
    public static void main(String[] args){
        String choice, cont = "y";
        Scanner strInput = new Scanner(System.in);
       try{
        while(cont.equalsIgnoreCase("y")){
            choice = "";
            vi.menu();
            choice = strInput.nextLine();
	    
            switch (choice) {
                case "1":
                    stb.addStudent();
                    break;
                case "2":
                    stb.searchStudent();
                    break;
                case "3":
                    stb.updateStudent();
                    break;
                case "4":
                    stb.deleteStudent();
                    break;
                default:
                    break;
                }
             
		        	
	System.out.println("¿Desea continuar? y/n");
	cont = strInput.nextLine();
        }
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
    
}
