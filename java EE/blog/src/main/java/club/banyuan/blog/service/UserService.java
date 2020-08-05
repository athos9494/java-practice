package club.banyuan.blog.service;

import club.banyuan.blog.dto.UserBaseDto;

public interface UserService {

    public UserBaseDto getUserBaseInfoById();

    public boolean updateUserEmail(String email);
}
