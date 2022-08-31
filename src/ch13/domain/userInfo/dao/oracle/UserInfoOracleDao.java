package ch13.domain.userInfo.dao.oracle;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into Oracle DB userId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into Oracle DB userId = " + userInfo.getUserId());

    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete into Oracle DB userId = " + userInfo.getUserId());

    }
}
