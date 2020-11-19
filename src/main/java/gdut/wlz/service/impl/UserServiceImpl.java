package gdut.wlz.service.impl;

import gdut.wlz.dao.UserDao;
import gdut.wlz.service.UserService;

/**
 * @author: BUG_BOY
 * DATE:2020/11/5  17:01
 */

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 转钱操作
     * 先减掉一个人的钱，再加到另一个人的账户
     */
    public void transfer() {
        //减钱
        userDao.subtractMoney();
        //加钱
        userDao.addMoney();
    }
}
