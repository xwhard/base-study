package standard.proxytest;


/**
 * @author:xwh
 * @date 2019/3/13 8:23
 */
//目标对象
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("模拟：保存用户！");
    }

    @Override
    public void find() {
        System.out.println("模拟：查询用户");
    }
}
