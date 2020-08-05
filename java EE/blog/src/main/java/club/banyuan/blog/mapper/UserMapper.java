package club.banyuan.blog.mapper;

import club.banyuan.blog.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    public UserEntity getUserByUsername(@Param("username") String username);

    public UserEntity getUserById(@Param("id") long id);

    public int updateUserEmail(@Param("id") long id ,@Param("email") String email);
}
