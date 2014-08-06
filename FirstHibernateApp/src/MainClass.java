import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.cmcltd.bollywood.dto.Movie;

public class MainClass {

	public static void main(String[] args) {

		Movie m = new Movie();
		m.setId(15822L);
		m.setName("Spiderman");
		m.setBudget(1200);
		m.setInfo("This is info");
		m.setDescription("This is a very long  description containing tons of data  .. . ");
		m.setReleaseDate(new Date(1997, 11, 7));

		SessionFactory sf = new Configuration().configure()
				.buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();

		// save
		s.save(m);

		s.getTransaction().commit();

		System.out.println("Data Saved ");
	}

}
