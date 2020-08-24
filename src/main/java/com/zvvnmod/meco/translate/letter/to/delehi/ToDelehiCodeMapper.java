package com.zvvnmod.meco.translate.letter.to.delehi;

import com.zvvnmod.meco.translate.letter.from.CodeMapper;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/17
 * WEEK  : 周一
 * TIME  : 10:54
 */
public class ToDelehiCodeMapper {
    public static CodeMapper mapper = new CodeMapper(1024);

    static {
        buildMapper1();
        buildMapper2();
    }

    private static void buildMapper1() {
        mapper.put("\ue000", "\u1821");
        mapper.put("\ue000\ue005", "\u1820");
        mapper.put("\ue000\ue006", "\u1822");
        mapper.put("\ue000\ue008", "\u1823");
        mapper.put("\ue000\ue00c", "\u1820");
        mapper.put("\ue000\ue00d", "\u1821");
        mapper.put("\ue000\ue00e", "\u1822");
        mapper.put("\ue000\ue00f", "\u1823");
        mapper.put("\ue000\ue010", "\u1826");
        mapper.put("\ue000\ue011", "\u1826\u180b");
        mapper.put("\ue000\ue008\ue006", "\u1826");

        mapper.put("\ue001", "\u1823\u180b");
        mapper.put("\ue001\ue008", "\u1823\u180b\u1823");
        mapper.put("\ue001\ue008\ue00c", "\u202f\u1824\u1833");
        mapper.put("\ue001\ue00c", "\u202f\u1826\u1828");
        mapper.put("\ue001\ue011", "\u202f\u1824\u1824");

        mapper.put("\ue002", "\u1822");
        mapper.put("\ue002\ue006", "\u202f\u1836\u180b\u1822");

        mapper.put("\ue005", "\u1820");
        mapper.put("\ue006", "\u180d\u1822");
        mapper.put("\ue008", "\u1823");
        mapper.put("\ue008\ue006", "\u1825\u180b");

        //default
        mapper.put("\ue00c", "\u1820");

        mapper.put("\ue00d", "\u180e\u1820");

        mapper.put("\ue00e", "\u1822");
        mapper.put("\ue00e\ue00d", "\u1836\u180e\u1820");

        mapper.put("\ue00f", "\u1823\u180b");

        mapper.put("\ue010", "\u1826\u180b");
        mapper.put("\ue011", "\u1823");

        mapper.put("\ue015", "\u1829");

        mapper.put("\ue016", "\u1829");

        mapper.put("\ue01a", "\u1822\u180b");
        mapper.put("\ue01a\ue00d", "\u1835\u180e\u1820");

        mapper.put("\ue01b", "\u1823\u180b");
    }

    private static void buildMapper2() {
        //n
        mapper.put("\ue027", "\u1828");
        mapper.put("\ue028", "\u1828");
        mapper.put("\ue077", "\u1828\u180e\u1820");
        //b
        mapper.put("\ue029", "\u182a");
        mapper.put("\ue02a", "\u182a");
        mapper.put("\ue02b", "\u182a");

        mapper.put("\ue078", "\u182a\u1820");
        mapper.put("\ue079", "\u182a\u1822");
        mapper.put("\ue07a", "\u182a\u1823");
        mapper.put("\ue07b", "\u182a\u1825");
        mapper.put("\ue07c", "\u182a\u1820");
        mapper.put("\ue07d", "\u182a\u1820");
        mapper.put("\ue07e", "\u182a\u1820");
        mapper.put("\ue07f", "\u182a\u1822");
        mapper.put("\ue080", "\u182a\u1822");
        mapper.put("\ue081", "\u182a\u1822");
        mapper.put("\ue082", "\u182a\u1823");
        mapper.put("\ue083", "\u182a\u1823");
        mapper.put("\ue084", "\u182a\u1823");

        mapper.put("\ue0c1", "\u182a\u1827");
        mapper.put("\ue0c2", "\u182a\u1827");
        mapper.put("\ue0c3", "\u182a\u1827");
        mapper.put("\ue0c4", "\u182a\u1827");

        mapper.put("\ue0cd", "\u182a\u1825\u180b");
        //p
        mapper.put("\ue02c", "\u182b");
        mapper.put("\ue02d", "\u182b");
        mapper.put("\ue02e", "\u182b");

        mapper.put("\ue085", "\u182b\u1820");
        mapper.put("\ue086", "\u182b\u1822");
        mapper.put("\ue087", "\u182b\u1823");
        mapper.put("\ue088", "\u182b\u1825");
        mapper.put("\ue089", "\u182b\u1820");
        mapper.put("\ue08a", "\u182b\u1820");
        mapper.put("\ue08b", "\u182b\u1820");
        mapper.put("\ue08c", "\u182b\u1822");
        mapper.put("\ue08d", "\u182b\u1822");
        mapper.put("\ue08e", "\u182b\u1822");
        mapper.put("\ue08f", "\u182b\u1823");
        mapper.put("\ue090", "\u182b\u1823");
        mapper.put("\ue091", "\u182b\u1823");

        mapper.put("\ue0c5", "\u182b\u1827");
        mapper.put("\ue0c6", "\u182b\u1827");
        mapper.put("\ue0c7", "\u182b\u1827");
        mapper.put("\ue0c8", "\u182b\u1827");
        mapper.put("\ue0ce", "\u182b\u1825\u180b");
        //h
        mapper.put("\ue02f", "\u182c");
        mapper.put("\ue030", "\u182c");
        mapper.put("\ue031", "\u182c");
        mapper.put("\ue032", "\u182c\u180d");
        mapper.put("\ue032\ue00d", "\u182c\u180e\u1820");
        mapper.put("\ue033", "\u182c\u180c");

        mapper.put("\ue0bd", "\u182c\u1827");
        mapper.put("\ue0be", "\u182c\u1827");
        mapper.put("\ue0bf", "\u182c\u1827");
        mapper.put("\ue0c0", "\u182c\u1827");
        //g
        mapper.put("\ue034", "\u182d");
        mapper.put("\ue035", "\u182d");
        //h,g
        mapper.put("\ue092", "\u182c\u1822");
        mapper.put("\ue093", "\u182c\u1825");
        mapper.put("\ue094", "\u182c\u1821");
        mapper.put("\ue095", "\u182c\u1821");
        mapper.put("\ue096", "\u182c\u1821");
        mapper.put("\ue097", "\u182c\u1822");
        mapper.put("\ue098", "\u182c\u1822");
        mapper.put("\ue099", "\u182c\u1822");
        mapper.put("\ue09a", "\u182c\u1825");
        mapper.put("\ue09b", "\u182c\u1825");
        mapper.put("\ue09c", "\u182c\u1825");
        mapper.put("\ue09d", "\u182d\u180e\u1820");
        mapper.put("\ue0cf", "\u182c\u1825\u180b");
        //m
        mapper.put("\ue036", "\u182E");
        mapper.put("\ue037", "\u182E");
        mapper.put("\ue038", "\u182E");
        mapper.put("\ue038\ue00d", "\u182e\u180e\u1820");
        //l
        mapper.put("\ue039", "\u182f");
        mapper.put("\ue03a", "\u182f");
        mapper.put("\ue03b", "\u182f");
        mapper.put("\ue03b\ue00d", "\u182f\u180e\u1820");
        //s
        mapper.put("\ue03c", "\u1830");
        mapper.put("\ue03d", "\u1830");
        mapper.put("\ue03e", "\u1830");
        //sh
        mapper.put("\ue03f", "\u1831");
        mapper.put("\ue040", "\u1831");
        mapper.put("\ue041", "\u1831");
        //t,d
        mapper.put("\ue042", "\u1832");
        mapper.put("\ue043", "\u1832\u180b");
        mapper.put("\ue044", "\u1832");
        mapper.put("\ue045", "\u1833");
        mapper.put("\ue046", "\u1833\u180b");
        mapper.put("\ue049", "\u1833\u180b");
        //ch
        mapper.put("\ue04a", "\u1834");
        mapper.put("\ue04b", "\u1834");
        mapper.put("\ue04c", "\u1834");
        //j
        mapper.put("\ue04d", "\u1835");
        mapper.put("\ue04e", "\u1835");
        mapper.put("\ue04f", "\u1835");
        //y
        mapper.put("\ue050", "\u1836");
        mapper.put("\ue051", "\u1836");
        //r
        mapper.put("\ue053", "\u1837");
        mapper.put("\ue054", "\u1837");
        mapper.put("\ue055", "\u1837");
        //w
        mapper.put("\ue056", "\u1838");
        mapper.put("\ue057", "\u1838");
        mapper.put("\ue058", "\u1838");
        //f
        mapper.put("\ue059", "\u1839");
        mapper.put("\ue05a", "\u1839");
        mapper.put("\ue05b", "\u1839");

        mapper.put("\ue09e", "\u1839\u1820");
        mapper.put("\ue09f", "\u1839\u1822");
        mapper.put("\ue0a0", "\u1839\u1823");
        mapper.put("\ue0a1", "\u1839\u1825");
        mapper.put("\ue0a2", "\u1839\u1820");
        mapper.put("\ue0a3", "\u1839\u1820");
        mapper.put("\ue0a4", "\u1839\u1820");
        mapper.put("\ue0a5", "\u1839\u1822");
        mapper.put("\ue0a6", "\u1839\u1822");
        mapper.put("\ue0a7", "\u1839\u1822");
        mapper.put("\ue0a8", "\u1839\u1823");
        mapper.put("\ue0a9", "\u1839\u1823");
        mapper.put("\ue0aa", "\u1839\u1823");

        mapper.put("\ue0c9", "\u1839\u1827");
        mapper.put("\ue0ca", "\u1839\u1827");
        mapper.put("\ue0cb", "\u1839\u1827");
        mapper.put("\ue0cc", "\u1839\u1827");
        mapper.put("\ue0d0", "\u1839\u1825\u180b");
        //k
        mapper.put("\ue05c", "\u183a");
        mapper.put("\ue05d", "\u183a");
        mapper.put("\ue05e", "\u183a");

        mapper.put("\ue0ab", "\u183a\u1820");
        mapper.put("\ue0ac", "\u183a\u1827");
        mapper.put("\ue0ad", "\u183a\u1822");
        mapper.put("\ue0ae", "\u183a\u1823");
        mapper.put("\ue0af", "\u183a\u1825");
        mapper.put("\ue0b0", "\u183a\u1820");
        mapper.put("\ue0b1", "\u183a\u1820");
        mapper.put("\ue0b2", "\u183a\u1820");
        mapper.put("\ue0b3", "\u183a\u1827");
        mapper.put("\ue0b4", "\u183a\u1827");
        mapper.put("\ue0b5", "\u183a\u1827");
        mapper.put("\ue0b6", "\u183a\u1822");
        mapper.put("\ue0b7", "\u183a\u1822");
        mapper.put("\ue0b8", "\u183a\u1822");
        mapper.put("\ue0b9", "\u183a\u1823");
        mapper.put("\ue0ba", "\u183a\u1823");
        mapper.put("\ue0bb", "\u183a\u1823");
        mapper.put("\ue0bc", "\u183a\u1825");
        //ts
        mapper.put("\ue05f", "\u183c");
        mapper.put("\ue060", "\u183c");
        mapper.put("\ue061", "\u183c");
        //z
        mapper.put("\ue062", "\u183d");
        mapper.put("\ue063", "\u183d");
        mapper.put("\ue064", "\u183d");
        //hh
        mapper.put("\ue065", "\u183e");
        mapper.put("\ue066", "\u183e");
        mapper.put("\ue067", "\u183e");
        //rh
        mapper.put("\ue068", "\u183f");
        //others
        mapper.put("\ue140", "\u180B");
        mapper.put("\ue141", "\u180C");
        mapper.put("\ue142", "\u180D");
        mapper.put("\ue143", "\u180E");
    }
}
