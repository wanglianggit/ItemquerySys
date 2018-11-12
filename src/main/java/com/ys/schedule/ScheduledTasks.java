package com.ys.schedule;

import com.ys.entity.CityPrice;
import com.ys.service.CityPriceService;
import com.ys.util.DownloadFile;
import com.ys.util.ExportExcel;
import com.ys.util.GetHtml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
@Configurable
@EnableScheduling
public class ScheduledTasks {

    @Autowired
    private CityPriceService cityPriceService;
    //每1分钟执行一次
    @Scheduled(cron="20 56 17 * * ?")
//    @Scheduled(cron="20 * * * * ?")
    public void reportCurrentByCron() {
        String url = "http://www.creprice.cn/district/ZY.html?city=zz";
        String url2 = "http://www.creprice.cn/city/cs.html";
        List<Map<String,String>> mapList = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("url", url);
        map.put("city", "郑州");
        Map<String, String> map2 = new HashMap<>();
        map2.put("url", url2);
        map2.put("city", "长沙");
        mapList.add(map);
        mapList.add(map2);
        for (Map<String,String> m : mapList) {
            List<String> content = GetHtml.getContent(m.get("url"), 1);
            if (null != content && 0 < content.size()) {
                CityPrice vo = new CityPrice();
                vo.setFcity(m.get("city"));
                vo.setCratetime(new Date());
                vo.setFlastcityprice(content.get(0));
                vo.setFlastpricerate(content.get(1));
                vo.setFnearcityprice(content.get(3));
                vo.setFnearpricerate(content.get(4));
                vo.setFtodaycityprice(content.get(6));
                vo.setFtodaypricerate(content.get(7));
                System.out.println("====房价信息====" + vo.toString());
                cityPriceService.insertSelective(vo);
                //生成excle表格
                List<CityPrice> list = new ArrayList<>();
                list.add(vo);
                ExportExcel<CityPrice> ex = new ExportExcel<CityPrice>();
                DownloadFile uploadFile = new DownloadFile();
                //特别注意：实体类的属性的顺序一定要与数据库保持一致(可以不导出某一字段，但实体类中要将该字段的顺序移到末尾)
                String[] headers = {"编码","城市","上月房价","上月同比增长","近一月房价","环比增长","今日房价","环比增长","时间"};
                OutputStream out = null;
                SimpleDateFormat sim = new SimpleDateFormat("yyyyMMdd");
                try {
                    String path = "/usr/local/images/statics/" + m.get("city") + "_" + sim.format(new Date()) + ".xls";
//                String path = "D://301//file//" + sim.format(new Date()) + ".xls";
                    out = new FileOutputStream(path);
                    ex.exportExcel("cityprice",headers, list, out);
                    out.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            System.out.println("Scheduling Tasks Examples By Cron: The time is now " + new Date());
        }

    }
}
