package com.example.penglei.udasunshine.utilities;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 * 网络请求类
 */
public class NetworkUtils {

    /**
     * 构建URL
     *
     * @param locationQuery 位置字段
     */
    public static URL buildUrl(String locationQuery) {
        return null;
    }

    /**
     * 构建URL
     *
     * @param lat 维度
     * @param lon 经度
     */
    public static URL builUrl(double lat, double lon) {
        return null;
    }

    /**
     * 从url获取响应
     */
    public static String getResponseFromHttpUrl(URL url) throws IOException {
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        try {
            Scanner scanner = new Scanner(connection.getInputStream());
            scanner.useDelimiter("\\A");
            if (scanner.hasNext()) return scanner.next();
            else return null;
        } finally {
            connection.disconnect();
        }
    }
}
