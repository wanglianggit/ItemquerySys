package com.ys.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GetHtml {

    public static List<String> getContent(String url, int page) {
        List<String> list = new ArrayList<>();
        try {
            for (int i = 1; i < page + 1; i++) {
                Document doc = Jsoup.connect(url)//连接请求地址
                        .data("query", "Java")
                        .userAgent("Mozilla")
                        .cookie("auth", "token")
                        .timeout(3000)
                        .post();
                Iterator<Element> iterator = doc.select("ul.u_list > li[style]  span").iterator();//这里用的是id选择器，其他的还有标签选择器、class选择器...
                while (iterator.hasNext()) {
                    Element next = iterator.next();
                    String text = next.text();
//                    System.out.println(text);
                    list.add(text);
                }
            }
        } catch (IOException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();

        }
        return list;
    }
    public static void main(String[] args) {
//        List<String> content = getContent("http://www.creprice.cn/city/cs.html",1);
        List<String> content = getContent("http://www.creprice.cn/district/ZY.html?city=zz",1);
        for (String string : content) {
            System.err.println(string);
        }

    }
}
