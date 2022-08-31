package ch13.domain.userInfo.dao.mySql;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MySQL DB userId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into MySQL DB userId = " + userInfo.getUserId());

    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete into MySQL DB userId = " + userInfo.getUserId());

    }
}
