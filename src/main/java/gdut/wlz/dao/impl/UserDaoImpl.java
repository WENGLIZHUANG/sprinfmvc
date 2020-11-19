package gdut.wlz.dao.impl;

import gdut.wlz.dao.UserDao;
import gdut.wlz.domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author: BUG_BOY
 * DATE:2020/11/5  16:45
 */

public class UserDaoImpl implements UserDao {


    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void findAll() {
        List<User> query = jdbcTemplate.query("select * from usercount", new BeanPropertyRowMapper<User>(User.class));
        System.out.println(query);
    }

    public void addMoney() {
        jdbcTemplate.update("update usercount set money=money+? where username=?",10000,"gg");
    }

    public void subtractMoney() {
        jdbcTemplate.update("update usercount set money=money-? where username=?",10000,"BUGBOY");
    }
}
