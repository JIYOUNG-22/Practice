package com.dyong.common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Template {

    private static SqlSessionFactory sqlSessionFactory;

    /* 한 번의 요청 당 1개의 SqlSession 객체가 필요하므로 필요 시 호출한 메소드
    *  SqlSession은 요청이 있을 때 마다 필요하시만 SqlSessionFactory는 한번만 만들어놓으면 되므로 전역적으로 선언해둔다. */
    public static SqlSession getSqlSession() {

        if(sqlSessionFactory == null) {

            try {
                String resource = "config/mybatis-config.xml";
                InputStream inputStream = Resources.getResourceAsStream(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        return sqlSessionFactory.openSession(false);

    }

}
