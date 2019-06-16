package services;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;

import com.uabc.project.api.entities.Student;
import com.uabc.project.api.services.StudentService;
import com.uabc.project.api.services.impl.StudentServiceImpl;

public class StudentServiceTest {
	private static final String TEST_NOMBRE = "Juan";
	private static final String TEST_APELLIDO_PATERNO = "Perez";
	private static final String TEST_APELLIDO_MATERNO = "Lopez";
	private static final Integer TEST_EDAD = 19;
	
	private Student testStudent;
	
	@Inject
	private StudentService studentService;
	
	@Before
	public void setup(){
		studentService = new StudentServiceImpl();
		
		testStudent = new Student()
				.setNombre(TEST_NOMBRE)
				.setApellidoPaterno(TEST_APELLIDO_PATERNO)
				.setApellidoMaterno(TEST_APELLIDO_MATERNO)
				.setEdad(TEST_EDAD);
	}

	@Test
	public void saveStudent() {
		Student studentSaved = studentService.saveStudent(testStudent);
	
		assertNotNull(studentSaved.getId());
		assertThat(studentSaved.getId(), not(0L));
	}

}
