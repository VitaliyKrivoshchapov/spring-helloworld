import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat beanCat = (Cat) applicationContext.getBean("cat");//передаем в качестве параметра название bean
        System.out.println("From bean " + beanCat.getMessage());
        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        //System.out.println("Bean Hellow World" + helloWorld);

        System.out.println("Bean cat" + cat);
        System.out.println("Bean cat2" + cat2);

        //System.out.println(helloWorld == cat);
    }
}