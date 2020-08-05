package club.banyuan.blog.service.impl;

import club.banyuan.blog.dto.UserBaseDto;
import club.banyuan.blog.entity.UserEntity;
import club.banyuan.blog.mapper.UserMapper;
import club.banyuan.blog.service.UserService;
import club.banyuan.blog.utils.UserUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBaseDto getUserBaseInfoById() {

        UserEntity userEntity = userMapper.getUserById(UserUtil.getCurrentUser().getId());
        UserBaseDto userBaseDto = new UserBaseDto();
        if(userEntity!=null){
            BeanUtils.copyProperties(userEntity,userBaseDto);
        }
        return userBaseDto;
    }

    @Override
    public boolean updateUserEmail(String email) {
        return userMapper.updateUserEmail(UserUtil.getCurrentUser().getId(),email) > 0;
    }
}
