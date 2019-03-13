package standard.proxytest.staticproxy;

import standard.proxytest.IUserDao;
import standard.proxytest.UserDao;

/**
 * @author:xwh
 * @date 2019/3/13 9:47
 */
public class UserDaoProxy implements IUserDao {

    // 代理对象，需要维护一个目标对象
    private IUserDao target = new UserDao();

    @Override
    public void save() {
        System.out.println("代理操作： 开启事务...");
        target.save();   // 执行目标对象的方法
        System.out.println("代理操作：提交事务...");
    }

    @Override
    public void find() {
        target.find();
    }
}
