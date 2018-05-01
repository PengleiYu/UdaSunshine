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
     * 网络地址常量
     */
    private static final String DYNAMIC_WEATHER_URL = "https://andfun-weather.udacity.com/weather";
    private static final String STATIC_WEATHER_URL = "https://andfun-weather.udacity.com/staticweather";

    private static final String FORECAST_BASE_URL = STATIC_WEATHER_URL;

    /**
     * 参数配置
     */
    private static final String format = "json";
    private static final String units = "metric";
    private static final int numDays = 14;

    /**
     * 参数名列表
     */
    static final String QUERY_PARAM = "q";
    static final String LAT_PARAM = "lat";
    static final String LON_PARAM = "lon";
    static final String FORMAT_PARAM = "mode";
    static final String UNITS_PARAM = "units";
    static final String DAYS_PARAM = "cnt";

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
