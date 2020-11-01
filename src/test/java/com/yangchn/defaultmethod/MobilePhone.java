package com.yangchn.defaultmethod;

/**
 * @author yangchn
 * @Description
 * @date 2020年11月01日
 */
public interface MobilePhone {

    /**
     * 获取手机品牌
     */
    String getBrand();

    /**
     * 获取手机颜色
     */
    String getColor();

    /**
     * 获取手机长度(毫米)
     */
    Double getLength();

    /**
     * 设置手机时间
     */
    default String setTime(String newTime) {
        return "time set to " + newTime;
    }

    /**
     * 对getLength方法进行拓展，返回厘米为单位的长度
     */
    default String getLengthInCm() {
        return getLength() / 10 + "cm";
    }
}
