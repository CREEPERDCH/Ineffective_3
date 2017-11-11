package com.thai.intelliexpcab.utils;

/**
 * 处理快递柜信号
 */
public class PortSignalUtil {
    /**
     * 测柜子是否打开
     * 1是打开中
     * 2是关闭
     * -1是参数有误
     */
    public static int checkDoor(String param) {
        if (param != null) {
            String p = param.replaceAll("\\s*", "");//可以替换大部分空白字符， 不限于空格 ； \s 可以匹配空格、制表符、换页符等空白字符的其中任意一个。
            if (p.length() == 26) {//判断指令长度
                String hexCode = p.substring(14, 16);//拿到锁信号
                String s = hexString2binaryString(hexCode);
                return Integer.parseInt(s.substring(s.length() - 1, s.length()));
            }
        }
        return -1;
    }

    /**
     * 测柜子是否有物品
     * <p>
     * 0是有物品
     * 1是没物品
     * -1是参数有误
     *
     * @return
     */
    public static int checkAnything(String param) {
        if (param != null) {
            String p = param.replaceAll("\\s*", "");//可以替换大部分空白字符， 不限于空格 ； \s 可以匹配空格、制表符、换页符等空白字符的其中任意一个。
            if (p.length() == 26) {//判断指令长度
                String hexCode = p.substring(16, 18);//拿到物信号
                String s = hexString2binaryString(hexCode);
                return Integer.parseInt(s.substring(s.length() - 1, s.length()));
            }
        }
        return -1;
    }


    /**
     * 16进制转二进制
     *
     * @param hexString
     * @return
     */
    public static String hexString2binaryString(String hexString) {
        if (hexString == null || hexString.length() % 2 != 0)
            return null;
        String bString = "", tmp;
        for (int i = 0; i < hexString.length(); i++) {
            tmp = "0000" + Integer.toBinaryString(Integer.parseInt(hexString.substring(i, i + 1), 16));
            bString += tmp.substring(tmp.length() - 4);
        }
        return bString;
    }
}
