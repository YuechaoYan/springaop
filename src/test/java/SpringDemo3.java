import com.yychao.aop.dao.OrderDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo3 {

    @Resource
    private OrderDao orderDao;

    @Test
    public void demo1(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        OrderDao orderDao = (OrderDao) applicationContext.getBean("orderDaoImpl");
        orderDao.save();
        orderDao.update();
        orderDao.delete();
        orderDao.find();
    }
//    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        OrderDao orderDao = (OrderDao) applicationContext.getBean("orderDao");
//        orderDao.save();
//    }

}
