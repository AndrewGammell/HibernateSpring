package application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.concretepage.config.AppConfig;
import com.concretepage.dao.IPersonDao;

public class Application {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();
		IPersonDao pdao = ctx.getBean(IPersonDao.class);
		pdao.savePerson();
		ctx.close();

		System.out.println("Done");
	}
}