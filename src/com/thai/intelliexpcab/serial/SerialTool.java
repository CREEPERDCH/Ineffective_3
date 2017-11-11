package com.thai.intelliexpcab.serial;

import gnu.io.SerialPort;

import java.util.Observer;
import java.util.*;

public class SerialTool implements Observer {

    SerialReader sr = new SerialReader();

    public SerialTool() {
        openSerialPort(""); //打开串口。
    }

    public void update(Observable o, Object arg) {
        String mt = new String((byte[]) arg);
        System.out.println("---" + Bytes2HexString((byte[]) arg)); //串口数据
    }

    /**
     * 往串口发送数据,实现双向通讯.
     *
     * @param message
     */
    public void send(String message) {
        SerialTool serialTool = new SerialTool();
        serialTool.openSerialPort(message);
    }

    /**
     * 打开串口
     *
     * @param message
     */
    public void openSerialPort(String message) {
        HashMap<String, Comparable> params = new HashMap<String, Comparable>();
        String port = "COM1";
        String rate = "9600";
        String dataBit = "" + SerialPort.DATABITS_8;
        String stopBit = "" + SerialPort.STOPBITS_1;
        String parity = "" + SerialPort.PARITY_NONE;
        int parityInt = SerialPort.PARITY_NONE;
        params.put(SerialReader.PARAMS_PORT, port); // 端口名称
        params.put(SerialReader.PARAMS_RATE, rate); // 波特率
        params.put(SerialReader.PARAMS_DATABITS, dataBit); // 数据位
        params.put(SerialReader.PARAMS_STOPBITS, stopBit); // 停止位
        params.put(SerialReader.PARAMS_PARITY, parityInt); // 无奇偶校验
        params.put(SerialReader.PARAMS_TIMEOUT, 100); // 设备超时时间 1秒
        params.put(SerialReader.PARAMS_DELAY, 100); // 端口数据准备时间 1秒
        try {
            sr.open(params);
            sr.addObserver(this);
            if (message != null && message.length() != 0) {
                sr.start();
                sr.run(message);
            }
        } catch (Exception e) {
        }
    }


    /**
     * 字节转16进制字符串
     *
     * @param b
     * @return
     */
    public String Bytes2HexString(byte[] b) {
        String ret = "";
        for (int i = 0; i < b.length; i++) {
            String hex = Integer.toHexString(b[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            ret += hex.toUpperCase();
        }
        return ret;
    }

    /**
     * 16进制转二进制
     *
     * @param hexString
     * @return
     */
    public String hexString2binaryString(String hexString) {
        if (hexString == null || hexString.length() % 2 != 0)
            return null;
        String bString = "", tmp;
        for (int i = 0; i < hexString.length(); i++) {
            tmp = "0000" + Integer.toBinaryString(Integer.parseInt(hexString.substring(i, i + 1), 16));
            bString += tmp.substring(tmp.length() - 4);
        }
        return bString;
    }

    /**
     * @param hex
     * @return 将16进制的字符串转换为一个byte的数组，用于发送指令
     */
    public static byte[] hex2byte(String hex) {
        String digital = "0123456789ABCDEF";
        String hex1 = hex.replace(" ", "");
        char[] hex2char = hex1.toCharArray();
        byte[] bytes = new byte[hex1.length() / 2];
        byte temp;
        for (int p = 0; p < bytes.length; p++) {
            temp = (byte) (digital.indexOf(hex2char[2 * p]) * 16);
            temp += digital.indexOf(hex2char[2 * p + 1]);
            bytes[p] = (byte) (temp & 0xff);
        }
        return bytes;
    }

} 
 
