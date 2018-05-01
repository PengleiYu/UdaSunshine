package com.example.penglei.udasunshine.data;

import android.content.Context;

public class SunshinePreferences {
    /**
     * 偏好中的键名
     */
    private static final String PREF_CITY_NAME = "city_name";
    private static final String PREF_COORD_LAT = "coordinate_lat";
    private static final String PREF_COORD_LON = "coordinate_lon";

    /**
     * 默认值
     */
    private static final String DEFAULT_WEATHER_LOCATION = "94043,USA";
    private static final double[] DEFAULT_WEATHER_COORDINATES = {37.4284, 122.0724};
    private static final String DEFAULT_MAP_LOCATION = "1600 Amphitheatre Parkway, Mountain View, CA 94043";

    /**
     * 在偏好中设置地点细节
     *
     * @param cityName 城市名
     */
    public static void setLocationDetails(Context context, String cityName, double lat, double lon) {

    }

    /**
     * 在偏好的地点；数据库可能被清空
     *
     * @param locationSetting 新的地点
     */
    public static void setLocation(Context context, String locationSetting, double lat, double lon) {

    }

    /**
     * 重置存储的地点经纬度
     */
    public static void resetLocationCoordinates(Context context) {

    }

    /**
     * 获取地理坐标；未设置则返回默认值
     */
    public static double[] getLoationCoordinates(Context context) {
        return getDefaultCoordinates();
    }

    /**
     * 获取偏好的天气地点；未设置则返回默认值
     */
    public static String getPreferredWeatherLocation(Context context) {
        return getDefaultWeatherLocation();
    }

    /**
     * 地点经纬度是否可用
     * 待学习了PlacePicker API后才可用
     */
    public static boolean isLocationLatLonAvailable(Context context) {
        return false;
    }

    /**
     * 是否是公制
     */
    public static boolean isMetric(Context context) {
        return true;
    }

    private static String getDefaultWeatherLocation() {
        return DEFAULT_WEATHER_LOCATION;
    }

    public static double[] getDefaultCoordinates() {
        return DEFAULT_WEATHER_COORDINATES;
    }
}
