package edu.njucm.weibo.mapper;

import edu.njucm.weibo.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    List<User> selectAll();
    @Select("select * from tb_user where id=#{id}")
    User selectById(int id);
}
