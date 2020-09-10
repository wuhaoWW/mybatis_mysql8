package com.wh.Tool;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Tool {
private  static    SqlSessionFactory sf=null;
//静态代码块（随着类的创建而创建，能被共享）
static{
//读取配置文件
    InputStream is = null;
    try {
        is = Resources.getResourceAsStream("mybatis-config.xml");
    } catch (IOException e) {
        e.printStackTrace();
    }

    sf  = new SqlSessionFactoryBuilder().build(is);

}
    public  static SqlSession getSqlSession() throws IOException {
        return   sf.openSession(true);
    }
    public static void CloseSqlSession(SqlSession sqlSession){
        if (sqlSession!=null){
            sqlSession.close();
        }
    }

}
