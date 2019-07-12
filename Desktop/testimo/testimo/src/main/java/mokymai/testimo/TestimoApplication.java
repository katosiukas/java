package mokymai.testimo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication

public class TestimoApplication {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
      HelloWorld obj = (HelloWorld) context.getBean("HelloWorld");
      obj.getMessage();
   
  	
    SkaiciaiTeksteTvarkymas stt = (SkaiciaiTeksteTvarkymas) context.getBean("SkaiciaiTeksteTvarkymas");   // Vienintelio sito ir reikia, beanai susideda automatu
 
	stt.ieskotiSkaiciu( "tekstas.txt" );
	stt.ieskotiVienetu();
	stt.parodytiSkaicius();
	stt.parodytiVienetus();
	stt.surasytiVntIrAnti(); 
      
	((AbstractApplicationContext) context).close();
   }
}
