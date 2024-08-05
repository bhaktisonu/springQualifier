package springQualifierexample;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springQualifierexample.config.StudentProfileConfig;

@SpringBootApplication
public class SpringQualifierApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(StudentProfileConfig.class);
		context.refresh();
		Profile profile=context.getBean(Profile.class);

		profile.printName();
		profile.printAge();
	}

}
