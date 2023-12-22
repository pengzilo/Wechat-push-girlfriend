package com.pt.vx.config;


/**
 * 天气相关配置
 */
public class WeatherConfig {
    /**
     * 天气相关的总开关
     * true则为开启，false则为关闭
     */
    public static boolean OPEN = false;

    /**
     * 天气资源的key
     */
    public static final String weatherSourceKey = "2516b29e44e9c277ef3b3be2b6f94504";

    /**
     * 天气资源类型
     * 0 为高德地图
     * 1 为和风天气
     */
    public static Integer weatherSourceType = 0;

    /**
     * 天气类型
     * 0 为实时天气
     * 1 为天气预报
     * 默认天气预报
     */
    public static Integer getWeatherType = 0;


}
