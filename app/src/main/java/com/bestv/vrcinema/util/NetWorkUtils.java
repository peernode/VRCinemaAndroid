package com.bestv.vrcinema.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by xujunyang on 17/1/10.
 * 网络工具类
 */

public class NetWorkUtils {
    public static boolean isNetworkConnected(Context context){
        if(context != null){
            // 获取手机所有连接管理对象,包括wifi, net等连接管理
            ConnectivityManager manager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
            // 获取NetworkInfo对象
            NetworkInfo networkInfo = manager.getActiveNetworkInfo();
            if(networkInfo != null){
                return networkInfo.isAvailable();
            }
        }
        return false;
    }

    public static boolean isWifiConnected(Context context){
        if(context != null){
            ConnectivityManager manager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = manager.getActiveNetworkInfo();
            if(networkInfo != null && networkInfo.getType() == ConnectivityManager.TYPE_WIFI){
                return networkInfo.isAvailable();
            }
        }
        return false;
    }

    public static boolean isMobileConnected(Context context){
        if(context != null){
            ConnectivityManager manager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = manager.getActiveNetworkInfo();
            if(networkInfo != null && networkInfo.getType() == ConnectivityManager.TYPE_MOBILE){
                return networkInfo.isAvailable();
            }
        }
        return false;
    }

    public static int getConnectedType(Context context){
        if(context != null){
            ConnectivityManager manager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = manager.getActiveNetworkInfo();
            if(networkInfo != null && networkInfo.isAvailable()){
                return networkInfo.getType();
            }
        }
        return -1;
    }
}
