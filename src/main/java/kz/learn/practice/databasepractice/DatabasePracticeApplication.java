package kz.learn.practice.databasepractice;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@RequiredArgsConstructor
@SpringBootApplication
public class DatabasePracticeApplication implements CommandLineRunner {
	private final SchoolRepository schoolRepository;
	private final StudentRepository studentRepository;


    public static void main(String[] args) {
		SpringApplication.run(DatabasePracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student("Ivan", "Ivanovov", "aaa@aaa.com", 18, 5);
		Student student1 = new Student("Akhmet", "Akhmetov", "akhmet@akhmet.com", 19, 10);
		Student student2 = new Student("Sabit", "Sabitov", "sabit@sabit.com", 20, 20);
		Student student3 = new Student("Igor", "Igorov", "Igor@Igor.com", 21, 30);
		Student student4 = new Student("Fill", "Fillov", "Fill@Fill.com", 20, 40);
		Student student5 = new Student("Ivan", "Ivanovov", "awd@ad.com", 55, 54);

		School school = new School("Sport internat 58", 500);
		School school1 = new School("16 Shkola na Zhukovke", 600);
		School school2 = new School("Shkola dly trudnih podrostkov 75", 700);

		studentRepository.saveAll(Arrays.asList(student, student1, student2, student3, student4));
		schoolRepository.saveAll(Arrays.asList(school, school1, school2));

		System.out.println(studentRepository.findByFirstName("Ivan"));
		System.out.println(studentRepository.findByFirstName("Igor"));

		System.out.println(studentRepository.findByAge(20));
		System.out.println(studentRepository.findByAge(19));

		System.out.println(schoolRepository.findByName("Sport internat 58"));
		System.out.println(schoolRepository.findByName("Shkola dly trudnih podrostkov 75"));

		System.out.println(schoolRepository.getTotalStudentCount());

	}
}
