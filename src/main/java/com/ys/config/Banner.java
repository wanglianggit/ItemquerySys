package com.ys.config;

import com.google.common.collect.Lists;
import com.google.common.io.Files;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import pub.tbc.toolkit.Loops;
import pub.tbc.toolkit.function.Consumer;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;


/**
 * @author tbc on 2016/12/8 15:44:13.
 */
@Slf4j
@Component
public class Banner {
    private final String DEFAULT_BANNER_FILE = getClass().getResource("/").getPath() + "banner.txt";
    private Logger log = LoggerFactory.getLogger(Banner.class);
    public void print() {
        File bannerFile = new File(DEFAULT_BANNER_FILE);
        log.debug("banner : " + bannerFile + " exists: " + bannerFile.exists());
        if (bannerFile.exists()) {
            List<String> banner = null;
            try {
                banner = Files.readLines(bannerFile, Charset.forName("utf-8"));
            } catch (IOException e) {
                log.error(e.getMessage());
                throw new RuntimeException("读取Banner文件出错", e);
            }
            print(banner);
        } else {
            String DEFAULT_BANNER = "" +
                    "                       .::::.\n" +
                    "                     .::::::::.\n" +
                    "                    :::::::::::\n" +
                    "                 ..:::::::::::'\n" +
                    "              '::::::::::::'\n" +
                    "                .::::::::::\n" +
                    "           '::::::::::::::..\n" +
                    "                ..::::::::::::.\n" +
                    "              ``::::::::::::::::\n" +
                    "               ::::``:::::::::'        .:::.\n" +
                    "              ::::'   ':::::'       .::::::::.\n" +
                    "            .::::'      ::::     .:::::::'::::.\n" +
                    "           .:::'       :::::  .:::::::::' ':::::.\n" +
                    "          .::'        :::::.:::::::::'      ':::::.\n" +
                    "         .::'         ::::::::::::::'         ``::::.\n" +
                    "     ...:::           ::::::::::::'              ``::.\n" +
                    "    ```` ':.          ':::::::::'                  ::::..\n" +
                    "                       '.:::::'                    ':'````..\n" +
                    "      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n" +
                    "                美女保佑            永无BUG";
            print(Lists.newArrayList(DEFAULT_BANNER));
        }
    }

    public void print(List<String> strings) {
        Loops.forEach(strings, new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
