package mx.uam.is.practicadiseno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Programa {

	public static void main(String[] args) {
		
		//carga el aplication context
		new ClassPathXmlApplicationContext("mx/uam/is/practicadiseno/applicationContext.xml");
		
	}

}
