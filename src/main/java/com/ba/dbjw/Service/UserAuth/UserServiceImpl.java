package com.ba.dbjw.Service.UserAuth;


import com.ba.dbjw.Entity.UserAuth.UserAuth;
import com.ba.dbjw.Helpers.CryptPassword;
import com.ba.dbjw.Repo.UserAuth.UserAuthRepoImpl;

public class UserServiceImpl implements UserService<UserAuth> {

    private final UserAuthRepoImpl userRepo = new UserAuthRepoImpl();

    @Override
    public UserAuth login(String userName, String password) {
        UserAuth user = userRepo.findByUserName(userName);
        if (user != null) {
            if (CryptPassword.verifyPassword(user.getPassword(), password)) {
                return user;
            }
        }
        return null;
    }

    public UserAuth register(UserAuth data) {
        UserAuth user = userRepo.findByUserName(data.getUserName());
        if (user == null) {
            userRepo.saveUser(data);
            return data;
        }
        return null;
    }
}
