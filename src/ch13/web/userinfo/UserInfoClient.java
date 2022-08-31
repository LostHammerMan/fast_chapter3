package ch13.web.userinfo;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.UserInfoDao;
import ch13.domain.userInfo.dao.mySql.UserInfoMySqlDao;
import ch13.domain.userInfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.properties");

        //key , value 값을 가진 객체를 불러들임
        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();

        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOracleDao();

        } else if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();

        }else {
            System.out.println("Unsupported DB");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
