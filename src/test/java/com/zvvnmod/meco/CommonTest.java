package com.zvvnmod.meco;

import com.zvvnmod.meco.translate.letter.from.delehi.FromDelehiCodeMapper;
import com.zvvnmod.meco.unicode.UnicodeConverter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

/**
 * AUTHOR: zorigt
 * DATE  : 2021/5/31
 * WEEK  : 周一
 * TIME  : 14:34
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class CommonTest {
    private static final transient Logger logger = LoggerFactory.getLogger(CommonTest.class);

    private static final String html = "<tr>\n" +
            "<td>%s</td>\n" +
            "<td>%s</td>\n" +
            "<td style=\"font-family: Mongolian White\"><span>᠊᠊</span>%s<span>᠊᠊</span></td>\n" +
//            "<td style=\"font-family: minwei; display: none;\"><span>᠊᠊</span>%s<span>᠊᠊</span></td>\n" +
            "<td style=\"font-family: Mongolian-zorigt;\">%s</td>\n" +
            "</tr>";

    private static final String changaHtml = "<tr>\n" +
            "<td>%s</td>\n" +
            "<td>%s</td>\n" +
            "<td style=\"font-family: Mongolian White\"><span>ᠠ</span>%s<span>ᠰᠠ</span></td>\n" +
//            "<td style=\"font-family: minwei; display: none;\"><span>ᠠ</span>%s<span>᠊᠊</span></td>\n" +
            "<td style=\"font-family: Mongolian-zorigt;\">%s</td>\n" +
            "</tr>";

    private static final String hundiiHtml = "<tr>\n" +
            "<td>%s</td>\n" +
            "<td>%s</td>\n" +
            "<td style=\"font-family: Mongolian White\"><span>ᠡ</span>%s<span>᠊᠊</span></td>\n" +
//            "<td style=\"font-family: minwei; display: none;\"><span>ᠡ</span>%s<span>᠊᠊</span></td>\n" +
            "<td style=\"font-family: Mongolian-zorigt;\">%s</td>\n" +
            "</tr>";

    @Test
    public void printKey() {
        int number = 0;
        for (Map.Entry<String, String> entry : FromDelehiCodeMapper.mapper.map.entrySet()) {
            System.out.println(String.format(html, number++, UnicodeConverter.toCodePoint(entry.getKey()),
                    entry.getKey(), entry.getValue()));
        }
    }

    @Test
    public void printChaghKey() {
        int number = 0;
        for (Map.Entry<String, String> entry : FromDelehiCodeMapper.chaghMapper.map.entrySet()) {
            System.out.println(String.format(changaHtml, number++, UnicodeConverter.toCodePoint(entry.getKey()),
                    entry.getKey(), entry.getValue()));
        }
    }

    @Test
    public void printHundiiKey() {
        int number = 0;
        for (Map.Entry<String, String> entry : FromDelehiCodeMapper.hundiiMapper.map.entrySet()) {
            System.out.println(String.format(hundiiHtml, number++, UnicodeConverter.toCodePoint(entry.getKey()),
                    entry.getKey(), entry.getValue()));
        }
    }
}
