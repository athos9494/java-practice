package club.banyuan.blog.service;

import club.banyuan.blog.dto.LoginUserDto;
import club.banyuan.blog.entity.UserEntity;
import club.banyuan.blog.mapper.UserMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userMapper.getUserByUsername(username);
        if (userEntity == null) {
            return new LoginUserDto();
        }
        LoginUserDto loginUserDto = new LoginUserDto();
        BeanUtils.copyProperties(userEntity, loginUserDto);
        return loginUserDto;
    }
}
