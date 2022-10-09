import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.UsersMapper;
import org.example.pojo.User;
import org.example.utils.MyBatisUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;


public class testUser {
    private SqlSession session;
    private UsersMapper usersMapper;

    @Before
    public void setUp() throws Exception {
        //程序中的环境配置覆盖了核心配置文件中的配置
        //创建SqlSession实例
        session = MyBatisUtils.getSession();
        //获取接口的代理对象
        usersMapper = session.getMapper(UsersMapper.class);
    }

    //根据主键Number查找单条数据
    @Test
    public void findByNumberTest(){
        User user=usersMapper.findByNumber("CB19130436");
        System.out.println(user);
        session.close();
    }

    //新增user
    @Test
    public void insertUser(){
        User user=new User("CB19130436","软件工程",2019,"刘浩华","男","13531618255",19130456,"导演");
        int result=usersMapper.insertUser(user);
        System.out.println("result:"+result);
        System.out.println(usersMapper.findByNumber("CB19130436"));
        session.commit();
        session.close();
    }

    //删除user
    @Test
    public void delecttUser(){
        int result=usersMapper.deleteUser("CB19130436");
        System.out.println("result:"+result);
        session.commit();
        session.close();
    }

    //修改user
    @Test
    public void updateUser(){
        User user=new User();
        user.setNumber("CB19130436");
        user.setPosition("教师");
        int result=usersMapper.updateUser(user);
        System.out.println("result:"+result);

    }
}
