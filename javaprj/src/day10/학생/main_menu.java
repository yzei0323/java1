package day10.학생;

public class main_menu {

public static void main(String[] args) {
		
		menu[] list  = new menu[7];			    				
		MenuProgram   p = new MenuProgram (list );
		p.makeMenu();
		
		p.run();
		
		
	}

}
