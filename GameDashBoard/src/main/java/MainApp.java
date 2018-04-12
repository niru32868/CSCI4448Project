import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      Game obj = (Game) context.getBean("game1");
      obj.getGameName();
      obj.getGameInfo(); 
   }
}