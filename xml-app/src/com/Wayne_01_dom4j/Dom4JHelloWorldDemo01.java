package com.Wayne_01_dom4j;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/*
    目标：学会使用dom4j解析XML文件中的数据。
        1、导入dom4j框架。
        2、准备一个XML文件。
*/
public class Dom4JHelloWorldDemo01 {
    @Test
    public void parseXMLData() throws Exception {
        // 1、创建一个Dom4j的解析对象，代表整个dom4j框架
        SAXReader saxReader = new SAXReader();
        // 2、把XML文件加载到内存中成为一个Docunment文档对象
//        Document document = saxReader.read(new File("xml-app\\src\\hello_world.xml")); //需要通过模块名去定位
//        Document document = saxReader.read(new FileInputStream("xml-app\\src\\hello_world.xml"));

        //注意: getResourceAsStream中的/是直接去src下寻找的文件
        InputStream is = Dom4JHelloWorldDemo01.class.getResourceAsStream("/hello_world.xml");
        Document document = saxReader.read(is);

        // 3、获取根元素对象
        Element root = document.getRootElement();
        System.out.println(root.getName());

        // 4、拿根元素下的全部子元素对象(一级)
//        List<Element> sonEles = root.elements();
        List<Element> sonFles = root.elements("name");
        for (Element sonEle : sonFles) {
            System.out.println(sonEle.getName());
        }

        //拿某个子元素
        Element userEle = root.element("hobby");
        System.out.println(userEle.getName());
        // 默认提取第一个子元素对象
        Element contact = root.element("info");
        // 获取子元素文本
        System.out.println(contact.elementText("age"));
        // 去掉前后空格
        System.out.println(contact.elementTextTrim("name"));

        // 根据元素获取属性值
        Attribute idAttr = contact.attribute("id");
        System.out.println(idAttr.getName() + "-->" + idAttr.getValue());
        // 直接提取属性值
        System.out.println(contact.attributeValue("id"));
        System.out.println(contact.attributeValue("sex"));

        // 获取当前元素下的子元素对象
        Element email = contact.element("address");
        System.out.println(email.getText());

    }
}
