package cn.smile.bean.transaction;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Types;

public class UserServiceImpl implements UserService {
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void save(User user) throws Exception {
        jdbcTemplate.update("insert into user(name,age,sex) values (?,?,?)",
                new Object[]{user.getName(),user.getAge(),user.getSex()},new int[]{
                        Types.VARCHAR,Types.INTEGER,Types.VARCHAR
                }
                );

        //事物测试，加上这句代码数据不会被保存到数据库中
        //默认情况下Spring中的事物处理只对RuntimeException方法进行回滚
        throw new RuntimeException("aa");
    }


}
