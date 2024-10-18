import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld hello1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld hello2 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        System.out.printf("hello1 = '%s', hashcode = '%d'\n", hello1, hello1.hashCode());
        System.out.printf("hello2 = '%s', hashcode = '%d'\n", hello2, hello2.hashCode());
        System.out.printf("hello1 = hello2 => '%s'\n\n", hello1 == hello2);

        System.out.printf("cat1 = '%s', hashcode = '%d'\n", cat1, cat1.hashCode());
        System.out.printf("cat2 = '%s', hashcode = '%d'\n", cat2, cat2.hashCode());
        System.out.printf("cat1 == cat2 => '%s'\n\n", cat1 == cat2);
    }
}