package com.xll.sftp;

import com.jcraft.jsch.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.Properties;

/**
 *   SFTP实现  文件上传和下载
 */
public class SFtp {

    /**
     *  连接测试
     */
    @Test
    public void connectTest() {

        ChannelSftp channel;

        String username = "deployer";
        String host = "10.170.16.74";  // 10.170.194.12
        Integer port = 21;
        String password = "Gs@Dep2020@qw";
        Session sshSession = null;
        JSch jsch = new JSch();
        try {
            System.out.println("开始连接");

            sshSession = jsch.getSession(username, host, port);
            sshSession.setPassword(password);

            Properties sshConfig = new Properties();
            sshConfig.put("StrictHostKeyChecking", "no");
            sshSession.setConfig(sshConfig);


            sshSession.connect(3000);

            channel = (ChannelSftp) sshSession.openChannel("sftp");
            channel.connect();
            System.out.println("已经连接");

            String path = "/home/wsc/uploadpic/20200402/";

            String[] folders = path.split("/");
            System.out.println(Arrays.toString(folders));
            String directPath = "";

            for ( String folder : folders ) {
               if (folder == null || folder.length() == 0) {
                   directPath = "/";
                   continue;
               }
               directPath = directPath + folder + "/";
               try {
                   channel.cd(directPath);
               } catch (Exception e) {
                   channel.mkdir(directPath);
                   channel.cd(directPath);
               }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     *  创建多级目录测试
     */
    @Test
    public void mkdirsTest() {

    }

    @Test
    public void tets000() throws Exception{

    }



}
