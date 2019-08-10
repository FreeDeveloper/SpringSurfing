package cn.smile.bean.transaction;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class UserRowMapper implements RowMapper {

    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        User person = new User(resultSet.getInt("id"),resultSet.getString("name"),resultSet.getInt("age"),resultSet.getString("sex"));
        return person;
    }
}
