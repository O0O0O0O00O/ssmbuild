import com.hcj.pojo.Books;
import com.hcj.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        List<Books> books = userService.queryAllBook();
        for (Books book : books) {
            System.out.println(book);
        }
    }
}
