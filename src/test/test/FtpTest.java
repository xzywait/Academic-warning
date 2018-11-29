package test;

import cn.edu.nwsuaf.utils.FtpUtil;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by xzy on 2017/4/25.
 */
//ftp 地址：120.24.53.158 密码:e4b646078
public class FtpTest {
    @Test
    public void testFtpClient() throws IOException {
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect("120.24.53.158",21);
        ftpClient.login("www","e4b646078");

        FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\wanggang\\Desktop\\brg.jpg"));
        System.out.print(inputStream);;
        ftpClient.changeWorkingDirectory("/ftpdir/images");
        ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
        ftpClient.enterLocalPassiveMode();
        System.out.print(ftpClient.storeFile("brg.jpg",inputStream));
        inputStream.close();
        ftpClient.logout();
    }
    @Test
    public  void  testFtpUtils() throws Exception {
        FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\wanggang\\Desktop\\abc.txt"));
        FtpUtil.uploadFile("120.24.53.158",21,"www","e4b646078","ftpdir","/test","ftpabc.txt",inputStream);

    }
}
