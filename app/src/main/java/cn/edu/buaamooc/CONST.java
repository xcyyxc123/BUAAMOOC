package cn.edu.buaamooc;

import android.content.Context;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.util.Log;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.MissingResourceException;

/**
 * Created by dt on 2015/10/27.
 */
public class CONST {
    public static final String URL = "http://10.2.13.251";
//    public static final String URL="http://mooc.buaa.edu.cn/";
    public static final String MURL = URL + "/mobile_api";
    public static final String LOGINURL = MURL + "/login";
    public static final String INITURL = MURL + "/init";
    public static final String COURSEURL = MURL + "/courses";
    public static final String COURSEABOUTURL = MURL + "/course_about";
    public static final String COURSEWAREURL = MURL + "/course_courseware";
    public static final String ENROLLURL = MURL + "/course_enroll";
    public static final String GETENROLLURL = MURL + "/get_course_enrollment";
    public static final String FORUMDATAURL = MURL + "/discussion_forum";

    public static final String COURSEPIC =
            Environment.getExternalStorageDirectory().toString() + File.separator + "MOOCAPP" + File.separator + "coursePic";
    public static final String USERIMAGEPIC =
            Environment.getExternalStorageDirectory().toString() + File.separator + "MOOCAPP" + File.separator + "userImage";
//    public static String[] DIRs;
    public static final String DEFAULTVIDEO = Environment.getExternalStorageDirectory().toString() + File.separator + "MOOCAPP"+ File.separator + "VIDEO";
    public static final int REQUEST_TIMEOUT = 2*1000;
    public static final int WAIT_TIMEOUT = 2*1000;

    public static final int enroll_succeed=1;
    public static final int enroll_fail=2;
    public static final int unenroll_succeed=3;
    public static final int unenroll_fail=4;
    public static final int enrolled=5;
    public static final int unenrolled=6;
    public static final int about_succeed=7;
    public static final int about_fail= 8;

//    public static final String

    static{

    }

}
