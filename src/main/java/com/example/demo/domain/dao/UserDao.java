package com.example.demo.domain.dao;

import com.example.demo.domain.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao {//Data Access Objectの略で、Databaseにアクセスするためのインターフェースの役割を果たす。

    @Autowired//newする必要がなくなる。Springの根幹であるDI（Dependency Injection）を行う。
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Transactional//更新系には必要、トランザクション制御を行う。
    public void insert(User user) {
        final String SQL =
                "INSERT INTO user (user_id, user_name, email_address, password, created_at, updated_at)" +
                        "values (:userId,:userName,:emailAddress,:password,NOW(3),NOW(3));";

        jdbcTemplate.update(SQL, new BeanPropertySqlParameterSource(user));
    }
}
