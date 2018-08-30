package com.ys.util;

import com.thoughtworks.xstream.XStream;
import com.ys.entity.News;
import com.ys.entity.NewsMessage;
import com.ys.entity.TextMessage;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * 消息的格式转换
 * 微信消息发送是post方法的xml格式。
 * 也只接受xml格式消息
 */
public class MessageUtil {

    /**
     * 添加消息类型常亮
     */
    public static final String MESSAGE_TEXT="text";
    public static final String MESSAGE_NEWS="news";
    public static final String MESSAGE_IMAGE="image";
    public static final String MESSAGE_VOICE="voice";
    public static final String MESSAGE_VIDEO="video";
    public static final String MESSAGE_LINK="link";
    public static final String MESSAGE_LOCATION="location";
    public static final String MESSAGE_EVENT="event";
    public static final String MESSAGE_SUBSCRIBE="subscribe";
    public static final String MESSAGE_UNSUBSCRIBE="unsubscribe";
    public static final String MESSAGE_CLICK="click";
    public static final String MESSAGE_VIEW="view";
    /**
     * xml转为map集合
     * @param request
     * @return
     * @throws DocumentException
     * @throws IOException
     */
    public static Map<String ,String > xmlToMap(HttpServletRequest request) throws DocumentException, IOException {
        Map<String ,String > map = new HashMap<String, String>();
        SAXReader reader = new SAXReader();

        //获取输入流
        InputStream ins = request.getInputStream();
        Document doc = reader.read(ins);

        Element root = doc.getRootElement();

        List<Element> list = root.elements();

        for (Element e : list) {
            map.put(e.getName(),e.getText());
        }

        ins.close();
        return map;
    }

    /**
     * 将消息对象转换为XML
     * @param textMessage
     * @return
     */
    public static String textMessageToXml(TextMessage textMessage) {
        XStream xStream = new XStream();
        //将根节点替换成xml
        xStream.alias("xml",textMessage.getClass());
        return xStream.toXML(textMessage);
    }

    /**
     * 主菜单
     * @return
     */
    public static String menuText() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("欢迎您的关注，请按照菜单提示进行操作:\n\n");
        stringBuffer.append("1、课程介绍\n");
        stringBuffer.append("2、慕课网介绍\n");
        stringBuffer.append("3、刁博大人 沈阳工程学院\n");
        stringBuffer.append("回复?调出此菜单");
        return stringBuffer.toString();
    }

    /**
     * 拼接文本消息
     * @param ToUserName
     * @param FromUserName
     * @param Content
     */
    public static String initText(String ToUserName, String FromUserName, String Content) {
        TextMessage text = new TextMessage();
        text.setFromUserName(ToUserName);
        text.setToUserName(FromUserName);
        text.setMsgType(MESSAGE_TEXT);
        text.setCreateTime(String.valueOf(new Date().getTime()));
        text.setContent("您发送的消息是："+Content);
        return textMessageToXml(text);
    }

    public static String firstMenu() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("本套课程介绍微信公众号开发，主要涉及公众号介绍、编辑模式介绍、开发模式介绍等");
        return stringBuffer.toString();
    }

    public static String secondMenu() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("刁博 三环新城");
        return stringBuffer.toString();
    }

    /**
     * 将图文消息对象转换为XML。微信后台只支持XML格式
     * @param newsMessage
     * @return
     */
    public static String newsMessageToXml(NewsMessage newsMessage) {
        XStream xStream = new XStream();
        //将根节点替换成xml
        xStream.alias("xml",newsMessage.getClass());
        xStream.alias("item", new News().getClass());
        return xStream.toXML(newsMessage);
    }

    /**
     * 图文消息的组装
     * @param ToUserName
     * @param FromUserName
     * @return
     */
    public static String initNewsMessage(String ToUserName, String FromUserName) {
        String message = null;
        List<News> newsList = new ArrayList<News>();
        NewsMessage newsMessage = new NewsMessage();
        News news = new News();
        news.setTitle("慕课网介绍");
        news.setDescription("大阿福飒飒的方法等十多个1");
        news.setPicUrl("http://mkpvrk.natappfree.cc/Weixin/images/544c2768919148800eb3be2fbc3c8a2d.jpeg");
        news.setUrl("www.imooc.com");
        newsList.add(news);
        News news2 = new News();
        news2.setTitle("张财的博客");
        news2.setDescription("张财的博客 asdfasd1");
        news2.setPicUrl("http://mkpvrk.natappfree.cc/Weixin/images/abaa43579d014ea42991f324ae2c36fd.jpg");
        news2.setUrl("https://juststarnew.github.io/");
        newsList.add(news2);
        News news3 = new News();
        news3.setTitle("王亮PP");
        news3.setDescription("王亮 asdfasd1");
        news3.setPicUrl("http://mkpvrk.natappfree.cc/Weixin/images/1530497295697.jpg");
        news3.setUrl("http://www.webxml.com.cn/zh_cn/weather_icon.aspx");
        newsList.add(news3);
        newsMessage.setToUserName(FromUserName);
        newsMessage.setFromUserName(ToUserName);
        newsMessage.setCreateTime(String.valueOf(new Date().getTime()));
        newsMessage.setMsgType(MESSAGE_NEWS);
        newsMessage.setArticles(newsList);
        newsMessage.setArticleCount(newsList.size());
        message = newsMessageToXml(newsMessage);
        return message;
    }


}
