package com.thai.intelliexpcab;

import com.thai.intelliexpcab.consf.Constant;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;

public class Dom4JReadXml {
    private Element root = null;

    public Dom4JReadXml() {
        File file = new File(Constant.XML_FILE_PATH);
        /**
         * 读取xml文件
         */
        SAXReader saxReader = new SAXReader();
        try {
            Document document = saxReader.read(file);
            // 获取根元素
            root = document.getRootElement();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 获取版本号
     */
    public String getVersion() {
        Element version = root.element("Version");
        return version.getText();

    }

//    public String getServerIp() {
//        Element server = root.element("UpdateServer");
//        Element ip = server.element("IP");
//        return ip.getText();
//    }

    public String getServerPort() {
        Element server = root.element("UpdateServer");
        Element port = server.element("Port");
        return port.getText();
    }

    public void setVersion(String ver) {
        /**
         * 修改文本
         * 方法：Element标签类的setTest("新文本值")方法
         * 1.得到标签对象
         * 2.修改文本
         */
        try {
            Element element = root.element("Version");
            element.setText(ver);

            //指定文件输出的位置
            FileOutputStream out = new FileOutputStream(Constant.XML_FILE_PATH);
            // 指定文本的写出的格式：
            OutputFormat format = OutputFormat.createPrettyPrint();   //漂亮格式：有空格换行
            format.setEncoding("UTF-8");
            //1.创建写出对象
            XMLWriter writer = null;
            writer = new XMLWriter(out, format);

            //2.写出Document对象
            writer.write(root);
            writer.flush();
            //3.关闭流
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
