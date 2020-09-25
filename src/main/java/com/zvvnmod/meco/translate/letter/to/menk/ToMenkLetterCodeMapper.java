package com.zvvnmod.meco.translate.letter.to.menk;

import com.zvvnmod.meco.translate.word.CodeMapper;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/8/17
 * WEEK  : 周一
 * TIME  : 10:54
 */
public class ToMenkLetterCodeMapper {
    public static CodeMapper mapper = new CodeMapper(1024);
    public static CodeMapper hundiiMapper = new CodeMapper(128);
    public static CodeMapper chaghMapper = new CodeMapper(128);

    static {
        buildMapper1();
        buildMapper2();
        buildMapper3();
        buildChaghMapper();
        buildHundiiMapper();
    }

    private static void buildMapper1() {
        mapper.put("\ue000", "\u1821");
        mapper.put("\ue000\ue006", "\u1822");
        mapper.put("\ue000\ue00c", "\u1820");
        mapper.put("\ue000\ue00d", "\u1821");
        mapper.put("\ue000\ue00e", "\u1822");
        mapper.put("\ue000\ue00f", "\u1823");
        mapper.put("\ue000\ue010", "\u1826");
        mapper.put("\ue000\ue011", "\u1826\u180b");


        mapper.put("\ue001", "\u1823\u180b");
        mapper.put("\ue001\ue008", "\u1823\u180b\u1823");
        mapper.put("\ue001\ue008\ue00c", "\u202f\u1824\u1833");
        mapper.put("\ue001\ue00c", "\u202f\u1826\u1828");
        mapper.put("\ue001\ue011", "\u202f\u1824\u1824");

        mapper.put("\ue04d\ue006", "\u202f\u1836\u180b\u1822");

        mapper.put("\ue006", "\u180d\u1822");
        mapper.put("\uE006\uE006", "\u180d\u1822\u180d\u1822");
        mapper.put("\uE006\uE006\uE00D", "\u1822\u182d");

        mapper.put("\ue000\ue008", "\u1823");
        mapper.put("\ue027\ue008", "\u1828\u1823");
        mapper.put("\ue036\ue008", "\u182E\u1823");
        mapper.put("\ue039\ue008", "\u182f\u1823");
        mapper.put("\ue03c\ue008", "\u1830\u1823");
        mapper.put("\ue03f\ue008", "\u1831\u1823");
        mapper.put("\ue042\ue008", "\u1832\u1823");
        mapper.put("\ue045\ue008", "\u1833\u180b\u1823");
        mapper.put("\ue04a\ue008", "\u1834\u1823");
        mapper.put("\ue04d\ue008", "\u1835\u1823");
        mapper.put("\ue050\ue008", "\u1836\u1823");
        mapper.put("\ue053\ue008", "\u1837\u1823");
        mapper.put("\ue056\ue008", "\u1838\u1823");
        mapper.put("\ue05f\ue008", "\u183C\u1823");
        mapper.put("\ue062\ue008", "\u183D\u1823");
        mapper.put("\ue000\ue066\ue008", "\u183E\u1823");
        mapper.put("\ue068\ue008", "\u183F\u1823");

        mapper.put("\ue000\ue008\ue006", "\u1826");
        mapper.put("\ue027\ue008\ue006", "\u1828\u1826");
        mapper.put("\ue036\ue008\ue006", "\u182E\u1826");
        mapper.put("\ue039\ue008\ue006", "\u182f\u1826");
        mapper.put("\ue03c\ue008\ue006", "\u1830\u1826");
        mapper.put("\ue03f\ue008\ue006", "\u1831\u1826");
        mapper.put("\ue042\ue008\ue006", "\u1832\u1826");
        mapper.put("\ue045\ue008\ue006", "\u1833\u180b\u1826");
        mapper.put("\ue04a\ue008\ue006", "\u1834\u1826");
        mapper.put("\ue04d\ue008\ue006", "\u1835\u1826");
        mapper.put("\ue050\ue008\ue006", "\u1836\u1826");
        mapper.put("\ue053\ue008\ue006", "\u1837\u1826");
        mapper.put("\ue056\ue008\ue006", "\u1838\u1826");
        mapper.put("\ue05f\ue008\ue006", "\u183C\u1826");
        mapper.put("\ue062\ue008\ue006", "\u183D\u1826");
        mapper.put("\ue000\ue066\ue008\ue006", "\u183E\u1826");
        mapper.put("\ue068\ue008\ue006", "\u183F\u1826");

        mapper.put("\ue00e", "\u1822");

        mapper.put("\ue00f", "\u1823\u180b");

        mapper.put("\ue010", "\u1826\u180b");

        mapper.put("\ue005\ue031", "\u1829");

        mapper.put("\ue005\ue006\ue00d", "\u1829");

        mapper.put("\ue01a", "\u1835\u180e");

        mapper.put("\ue01b", "\u202f\u1824");
    }

    private static void buildMapper2() {
        //n
        mapper.put("\ue027", "\u1828");
        mapper.put("\ue028", "\u1828\u180b");
        mapper.put("\ue028\ue006", "\u1828\u1822");
        mapper.put("\ue028\ue00e", "\u1828\u1822");
        mapper.put("\ue028\ue057", "\u1828\u1827");
        mapper.put("\ue028\ue058", "\u1828\u1827");

        //b
        mapper.put("\ue029", "\u182a");
        mapper.put("\ue02a", "\u182a");
        mapper.put("\ue02b", "\u182a");

        mapper.put("\ue079", "\u182a\u1822");
        mapper.put("\ue07a", "\u182a\u1823");
        mapper.put("\ue07b", "\u182a\u1825");
        mapper.put("\ue07f", "\u182a\u1822");
        mapper.put("\ue080", "\u182a\u1822");
        mapper.put("\ue081", "\u182a\u1822");
        mapper.put("\ue082", "\u182a\u1823");
        mapper.put("\ue082\ue006", "\u182a\u1826");

        mapper.put("\ue029\ue058", "\u182a\u1827");
        mapper.put("\ue029\ue057", "\u182a\u1827");
        mapper.put("\ue02a\ue057", "\u182a\u1827");
        mapper.put("\ue02a\ue058", "\u182a\u1827");

        mapper.put("\ue0cd", "\u182a\u1825\u180b");
        //p
        mapper.put("\ue02c", "\u182b");
        mapper.put("\ue02d", "\u182b");
        mapper.put("\ue02e", "\u182b");

        mapper.put("\ue086", "\u182b\u1822");
        mapper.put("\ue087", "\u182b\u1823");
        mapper.put("\ue088", "\u182b\u1825");
        mapper.put("\ue08c", "\u182b\u1822");
        mapper.put("\ue08d", "\u182b\u1822");
        mapper.put("\ue08e", "\u182b\u1822");
        mapper.put("\ue08f", "\u182b\u1823");
        mapper.put("\ue08f\ue006", "\u182b\u1826");

        mapper.put("\ue02c\ue058", "\u182b\u1827");
        mapper.put("\ue02c\ue057", "\u182b\u1827");
        mapper.put("\ue02d\ue057", "\u182b\u1827");
        mapper.put("\ue02d\ue058", "\u182b\u1827");
        mapper.put("\ue0ce", "\u182b\u1825\u180b");
        //h
        mapper.put("\ue02f", "\u182c");
        mapper.put("\ue02f\ue008", "\u182c\u1823");
        mapper.put("\ue030", "\u182c");
        mapper.put("\ue031", "\u182d");
        mapper.put("\ue032", "\u182c\u180d");
        mapper.put("\ue032\ue00d", "\u182c\u180e\u1820");
        mapper.put("\ue006\ue00d", "\u182d");

        mapper.put("\ue030\ue058", "\u182c\u1827");
        mapper.put("\ue030\ue057", "\u182c\u1827");
        mapper.put("\ue031\ue057", "\u182c\u1827");
        mapper.put("\ue031\ue058", "\u182c\u1827");
        //g
        mapper.put("\ue034", "\u182d");
        mapper.put("\ue028\ue028", "\u182d");
        mapper.put("\ue028\ue028\ue008", "\u182d\u1823");
        //h,g
        mapper.put("\ue092", "\u182c\u1822");
        mapper.put("\ue093", "\u182c\u1825");
        mapper.put("\ue094", "\u182c\u1821");
        mapper.put("\uE094\uE00d", "\u182c\u1821");
        mapper.put("\ue095", "\u182c\u1821");
        mapper.put("\ue095\ue00d", "\u182c\u1821");
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
        //l
        mapper.put("\ue039", "\u182f");
        mapper.put("\ue03a", "\u182f");
        mapper.put("\ue03b", "\u182f");
        //s
        mapper.put("\ue03c", "\u1830");
        mapper.put("\ue03d", "\u1830");
        mapper.put("\ue03e", "\u1830");
        //就这个东西很奇葩
        mapper.put("\ue03c\ue010", "\u1830\u1826");
        //sh
        mapper.put("\ue03f", "\u1831");
        mapper.put("\ue040", "\u1831");
        mapper.put("\ue041", "\u1831");
        //t,d
        mapper.put("\ue042", "\u1832");
        mapper.put("\ue043", "\u1832\u180b");
        mapper.put("\ue044", "\u1832");
        mapper.put("\ue045", "\u1833\u180b");
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
        mapper.put("\ue051", "\u1836\u180b");
        mapper.put("\ue050\ue006", "\u1836\u180b\u1822");
        mapper.put("\ue051\ue00e", "\u1836\u180b\u1822");
        mapper.put("\ue051\ue00f", "\u1836\u1824");
        mapper.put("\ue051\ue010", "\u1836\u1826\u180b");
        mapper.put("\ue051\ue057", "\u1836\ue027");
        mapper.put("\ue051\ue058", "\u1836\ue027");
        //r
        mapper.put("\ue053", "\u1837");
        mapper.put("\ue054", "\u1837");
        mapper.put("\ue055", "\u1837");
        //w
        mapper.put("\ue056", "\u1838");
        mapper.put("\ue057", "\u1827");
        mapper.put("\ue058", "\u1827");
        //f
        mapper.put("\ue059", "\u1839");
        mapper.put("\ue05a", "\u1839");
        mapper.put("\ue05b", "\u1839");

        mapper.put("\ue09f", "\u1839\u1822");
        mapper.put("\ue0a0", "\u1839\u1823");
        mapper.put("\ue0a1", "\u1839\u1825");
        mapper.put("\ue0a5", "\u1839\u1822");
        mapper.put("\ue0a6", "\u1839\u1822");
        mapper.put("\ue0a7", "\u1839\u1822");
        mapper.put("\ue0a8", "\u1839\u1823");
        mapper.put("\ue0a8\ue006", "\u1839\u1826");

        mapper.put("\ue059\ue058", "\u1839\u1827");
        mapper.put("\ue059\ue057", "\u1839\u1827");
        mapper.put("\ue05a\ue057", "\u1839\u1827");
        mapper.put("\ue05a\ue058", "\u1839\u1827");
        mapper.put("\ue0d0", "\u1839\u1825\u180b");
        //k
        mapper.put("\ue05c", "\u183a");
        mapper.put("\ue05d", "\u183a");
        mapper.put("\ue05e", "\u183a");


        mapper.put("\ue05c\ue058", "\u183a\u1827");
        mapper.put("\ue0ad", "\u183a\u1822");
        mapper.put("\ue0ae", "\u183a\u1823");
        mapper.put("\ue0af", "\u183a\u1825");
        mapper.put("\ue05c\ue057", "\u183a\u1827");
        mapper.put("\ue05d\ue057", "\u183a\u1827");
        mapper.put("\ue05d\ue058", "\u183a\u1827");
        mapper.put("\ue0b6", "\u183a\u1822");
        mapper.put("\ue0b7", "\u183a\u1822");
        mapper.put("\ue0b8", "\u183a\u1822");
        mapper.put("\ue0b9", "\u183a\u1823");
        mapper.put("\ue0b9\ue006", "\u183a\u1826");
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
        mapper.put("\ue000\ue066", "\u183e");
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

    private static void buildMapper3() {
        mapper.put("\ue027\ue00f", "\u1828\u1824");
        mapper.put("\ue02f\ue00f", "\u182c\u1824");
        mapper.put("\ue034\ue00f", "\u182d\u1824");
        mapper.put("\ue036\ue00f", "\u182e\u1824");
        mapper.put("\ue039\ue00f", "\u182f\u1824");
        mapper.put("\ue03c\ue00f", "\u1830\u1824");
        mapper.put("\ue03f\ue00f", "\u1831\u1824");
        mapper.put("\ue042\ue00f", "\u1832\u1824\u180b");
        mapper.put("\ue04a\ue00f", "\u1834\u1824\u180b");
        mapper.put("\ue04d\ue00f", "\u1835\u1824");
        mapper.put("\ue050\ue00f", "\u1836\u1823");
        mapper.put("\ue053\ue00f", "\u1837\u1824");
        mapper.put("\ue056\ue00f", "\u1838\u1824");
        mapper.put("\ue05f\ue00f", "\u183c\u1824");
        mapper.put("\ue062\ue00f", "\u183d\u1824");
        mapper.put("\ue000\ue066\ue00f", "\u183e\u1824");
        mapper.put("\ue068\ue00f", "\u183f\u1824");
    }

    private static void buildChaghMapper() {
        chaghMapper.put("\ue005", "\u1820");
        chaghMapper.put("\ue000\ue005", "\u1820");
        chaghMapper.put("\ue011", "\u1824");
        chaghMapper.put("\ue005\ue006", "\u1820\u180d\u1822");
        chaghMapper.put("\ue00c", "\u1820");
        chaghMapper.put("\ue00d", "\u180e\u1820");
        chaghMapper.put("\ue00e\ue00d", "\u1836\u180e\u1820");
        chaghMapper.put("\ue01a\ue00d", "\u1835\u180e\u1820");
        chaghMapper.put("\ue028\ue005", "\u1828\u1820");
        chaghMapper.put("\ue028\ue00c", "\u1828\u1820");
        chaghMapper.put("\ue077", "\u1828\u180e\u1820");
        chaghMapper.put("\ue07c\ue00d", "\u182a\u1820");
        chaghMapper.put("\ue07c", "\u182a\u1820");
        chaghMapper.put("\ue07d", "\u182a\u1820");
        chaghMapper.put("\ue07d\ue00d", "\u182a\u1820");
        chaghMapper.put("\ue089\ue00d", "\u182b\u1820");
        chaghMapper.put("\ue089", "\u182b\u1820");
        chaghMapper.put("\ue08a", "\u182b\u1820");
        chaghMapper.put("\ue08a\ue00d", "\u182b\u1820");
        chaghMapper.put("\ue038\ue00d", "\u182e\u180e\u1820");
        chaghMapper.put("\ue03b\ue00d", "\u182f\u180e\u1820");
        chaghMapper.put("\ue0a2\ue00d", "\u1839\u1820");
        chaghMapper.put("\ue0a2", "\u1839\u1820");
        chaghMapper.put("\ue0a3", "\u1839\u1820");
        chaghMapper.put("\ue0a3\ue00d", "\u1839\u1820");
        chaghMapper.put("\ue0b0\ue00d", "\u183a\u1820");
        chaghMapper.put("\ue0b0", "\u183a\u1820");
        chaghMapper.put("\ue0b1", "\u183a\u1820");
        chaghMapper.put("\ue0b1\ue00d", "\u183a\u1820");
        chaghMapper.put("\ue028\ue008", "\u1828\u1823");
        chaghMapper.put("\ue028\ue011", "\u1828\u1823");
        chaghMapper.put("\ue083", "\u182a\u1823");
        chaghMapper.put("\ue084", "\u182a\u1823");
        chaghMapper.put("\ue090", "\u182b\u1823");
        chaghMapper.put("\ue091", "\u182b\u1823");
        chaghMapper.put("\ue0a9", "\u1839\u1823");
        chaghMapper.put("\ue0aa", "\u1839\u1823");
        chaghMapper.put("\ue0ba", "\u183a\u1823");
        chaghMapper.put("\ue0bb", "\u183a\u1823");
        chaghMapper.put("\ue008", "\u1823");

        chaghMapper.put("\ue051\ue005", "\u1836\u1820");
        chaghMapper.put("\ue051\ue008", "\u1836\u1823");
        chaghMapper.put("\ue051\ue00c", "\u1836\u1820");
        chaghMapper.put("\ue051\ue011", "\u1836\u1824");
    }

    private static void buildHundiiMapper() {
        hundiiMapper.put("\ue005", "\u1821");
        hundiiMapper.put("\ue000\ue005", "\u1821\u1821");
        hundiiMapper.put("\ue011", "\u1826");
        hundiiMapper.put("\ue005\ue006", "\u1821\u180d\u1822");
        hundiiMapper.put("\ue00c", "\u1821");
        hundiiMapper.put("\ue00d", "\u180e\u1821");
        hundiiMapper.put("\ue00e\ue00d", "\u1836\u180e\u1821");
        hundiiMapper.put("\ue01a\ue00d", "\u1835\u180e\u1821");
        hundiiMapper.put("\ue028\ue005", "\u1828\u1821");
        hundiiMapper.put("\ue028\ue00c", "\u1828\u1821");
        hundiiMapper.put("\ue077", "\u1828\u180e\u1821");
        hundiiMapper.put("\ue07c\ue00d", "\u182a\u1821");
        hundiiMapper.put("\ue07c", "\u182a\u1821");
        hundiiMapper.put("\ue07d", "\u182a\u1821");
        hundiiMapper.put("\ue07d\ue00d", "\u182a\u1821");
        hundiiMapper.put("\ue089\ue00d", "\u182b\u1821");
        hundiiMapper.put("\ue089", "\u182b\u1821");
        hundiiMapper.put("\ue08a", "\u182b\u1821");
        hundiiMapper.put("\ue08a\ue00d", "\u182b\u1821");
        hundiiMapper.put("\ue038\ue00d", "\u182e\u180e\u1821");
        hundiiMapper.put("\ue03b\ue00d", "\u182f\u180e\u1821");
        hundiiMapper.put("\ue0a2\ue00d", "\u1839\u1821");
        hundiiMapper.put("\ue0a2", "\u1839\u1821");
        hundiiMapper.put("\ue0a3", "\u1839\u1821");
        hundiiMapper.put("\ue0a3\ue00d", "\u1839\u1821");
        hundiiMapper.put("\ue0b0\ue00d", "\u183a\u1821");
        hundiiMapper.put("\ue0b0", "\u183a\u1821");
        hundiiMapper.put("\ue0b1", "\u183a\u1821");
        hundiiMapper.put("\ue0b1\ue00d", "\u183a\u1821");
        hundiiMapper.put("\ue028\ue008", "\u1828\u1826");
        hundiiMapper.put("\ue028\ue011", "\u1828\u1826");
        hundiiMapper.put("\ue083", "\u182a\u1826");
        hundiiMapper.put("\ue084", "\u182a\u1826");
        hundiiMapper.put("\ue090", "\u182b\u1826");
        hundiiMapper.put("\ue091", "\u182b\u1826");
        hundiiMapper.put("\ue0a9", "\u1839\u1826");
        hundiiMapper.put("\ue0aa", "\u1839\u1826");
        hundiiMapper.put("\ue0ba", "\u183a\u1826");
        hundiiMapper.put("\ue0bb", "\u183a\u1826");
        hundiiMapper.put("\ue008", "\u1826");

        hundiiMapper.put("\ue051\ue005", "\u1836\u1821");
        hundiiMapper.put("\ue051\ue008", "\u1836\u1826");
        hundiiMapper.put("\ue051\ue00c", "\u1836\u1821");
        hundiiMapper.put("\ue051\ue011", "\u1836\u1826");
    }

}
