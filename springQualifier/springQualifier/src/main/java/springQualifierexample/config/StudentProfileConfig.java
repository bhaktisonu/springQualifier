package springQualifierexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springQualifierexample.Profile;
import springQualifierexample.Student;

@Configuration
public class StudentProfileConfig {

    @Bean
    public Profile profile() {
        Profile profile = new Profile();
        return  profile;
    }

    @Bean
    public Student student() {
       Student student=new Student();
       student.setName("Isha");
       student.setAge(11);
        return  student;
    }

    @Bean
    public Student student1() {
       Student student=new Student();
       student.setName("Neha");
       student.setAge(12);
        return  student;
    }

}
