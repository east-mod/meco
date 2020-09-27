package com.zvvnmod.meco.translate.shape.to.menk;

import com.zvvnmod.meco.translate.word.CodeMapper;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/9/7
 * WEEK  : 周一
 * TIME  : 09:45
 */
public class ToMenkShapeCodeMapper {
    public static CodeMapper mapper;

    static {
        mapper = new CodeMapper(1024);
        buildMapper1();
        buildMapper2();
        buildMapper3();
        buildPunctuations();
    }

    private static void buildMapper1() {
        mapper.put("\ue000", "\ue271");
        mapper.put("\ue001", "\ue291");
        mapper.put("\ue005", "\ue26c");
        mapper.put("\ue006", "\ue27e");
        mapper.put("\ue008", "\ue291");
        mapper.put("\ue00c", "\ue2b5");

        mapper.put("\ue00d", "\ue269");
        mapper.put("\ue07c\ue00d", "\ue2c1\ue26b");
        mapper.put("\ue07d\ue00d", "\ue2c1\ue26b");
        mapper.put("\ue089\ue00d", "\ue2c8\ue26b");
        mapper.put("\ue08a\ue00d", "\ue2c8\ue26b");
        mapper.put("\ue094\ue00d", "\ue2da\ue26b");
        mapper.put("\ue095\ue00d", "\ue2da\ue26b");
        mapper.put("\ue0a2\ue00d", "\ue32d\ue26b");
        mapper.put("\ue0a3\ue00d", "\ue32d\ue26b");
        mapper.put("\ue0b0\ue00d", "\ue333\ue26b");
        mapper.put("\ue0b1\ue00d", "\ue333\ue26b");

        mapper.put("\ue00e", "\ue27b");
        mapper.put("\ue00f", "\ue286");
        mapper.put("\ue010", "\ue297");
        mapper.put("\ue011", "\ue296");

        mapper.put("\ue005\ue031", "\ue2bd");
        mapper.put("\ue005\ue006", "\ue26c\ue27e");
        mapper.put("\ue005\ue006\ue00d", "\ue2bb");

        mapper.put("\ue01a", "\ue282");
        mapper.put("\ue01b", "\ue285");
        //n
        mapper.put("\ue027", "\ue2b1");
        mapper.put("\ue028", "\ue2b7");
        //b
        mapper.put("\ue029", "\ue2c7");
        mapper.put("\ue02a", "\ue2c7");
        mapper.put("\ue02b", "\ue2c3");
        //p
        mapper.put("\ue02c", "\ue2cd");
        mapper.put("\ue02d", "\ue2cd");
        mapper.put("\ue02e", "\ue2ca");
        //h,g
        mapper.put("\ue02f", "\ue2ce");
        mapper.put("\ue030", "\ue2da");
        mapper.put("\ue031", "\ue2df");
        mapper.put("\ue032", "\ue2e7");
        mapper.put("\ue006\ue00d", "\ue2e8");
        mapper.put("\ue034", "\ue2cf");
        mapper.put("\ue028\ue028", "\ue2d9");
        //m
        mapper.put("\ue036", "\ue2f1");
        mapper.put("\ue037", "\ue2f4");
        mapper.put("\ue038", "\ue2f3");
        //l
        mapper.put("\ue039", "\ue2f7");
        mapper.put("\ue03a", "\ue2fa");
        mapper.put("\ue03b", "\ue2f9");
        //s
        mapper.put("\ue03c", "\ue2fd");
        mapper.put("\ue03d", "\ue301");
        mapper.put("\ue03e", "\ue2ff");
        //sh
        mapper.put("\ue03f", "\ue303");
        mapper.put("\ue040", "\ue306");
        mapper.put("\ue041", "\ue305");
        //t
        mapper.put("\ue042", "\ue308");
        mapper.put("\ue043", "\ue30c");
        mapper.put("\ue044", "\ue30a");
        //d
        mapper.put("\ue045", "\ue30b");
        mapper.put("\ue046", "\ue30b");
        mapper.put("\ue049", "\ue312");
        //tr
        mapper.put("\ue04a", "\ue315");
        mapper.put("\ue04b", "\ue317");
        mapper.put("\ue04c", "\ue316");
        //j
        mapper.put("\ue04d", "\ue27e");
        mapper.put("\ue04e", "\ue31d");
        mapper.put("\ue04f", "\ue31b");
        //y
        mapper.put("\ue050", "\ue31e");
        mapper.put("\ue051", "\ue320");
        //r
        mapper.put("\ue053", "\ue322");
        mapper.put("\ue054", "\ue326");
        mapper.put("\ue055", "\ue325");
        //w
        mapper.put("\ue056", "\ue329");
        mapper.put("\ue057", "\ue32c");
        mapper.put("\ue058", "\ue32a");
        //f
        mapper.put("\ue059", "\ue32d");
        mapper.put("\ue05a", "\ue332");
        mapper.put("\ue05b", "\ue32f");
        //k
        mapper.put("\ue05c", "\ue333");
        mapper.put("\ue05d", "\ue338");
        mapper.put("\ue05e", "\ue335");
        //ts
        mapper.put("\ue05f", "\ue33f");
        mapper.put("\ue060", "\ue341");
        mapper.put("\ue061", "\ue340");
        //z
        mapper.put("\ue062", "\ue342");
        mapper.put("\ue063", "\ue344");
        mapper.put("\ue064", "\ue343");

        mapper.put("\ue000\ue066", "\ue345");
        mapper.put("\ue066", "\ue347");
        mapper.put("\ue067", "\ue346");

        mapper.put("\ue068", "\ue348");
        mapper.put("\ue069", "\ue349");
        mapper.put("\ue06a", "\ue34a");
    }

    private static void buildMapper2() {
        mapper.put("\ue077", "\ue2b6\ue26a");
        //b+ ...
        mapper.put("\ue079", "\ue2c1\ue27c");
        mapper.put("\ue07a", "\ue2c2\ue287");
        mapper.put("\ue07b", "\ue2c2\ue298");
        mapper.put("\ue07c", "\ue2c1\ue26d");
        mapper.put("\ue07d", "\ue2c1\ue26d");
        mapper.put("\ue07f", "\ue2c1\ue27f");
        mapper.put("\ue080", "\ue2c1\ue27f");
        mapper.put("\ue081", "\ue2c1\ue27c");
        mapper.put("\ue082", "\ue2c2\ue28a");
        mapper.put("\ue083", "\ue2c2\ue28a");
        mapper.put("\ue084", "\ue2c2\ue287");
        mapper.put("\ue029\ue058", "\ue2c7\ue32a");
        mapper.put("\ue029\ue057", "\ue2c7\ue32c");
        mapper.put("\ue02a\ue057", "\ue2c7\ue32c");
        mapper.put("\ue02a\ue058", "\ue2c7\ue32a");
        mapper.put("\ue0cd", "\ue2c2\ue298");

        //p+ ...
        mapper.put("\ue086", "\ue2c8\ue27c");
        mapper.put("\ue087", "\ue2c9\ue287");
        mapper.put("\ue088", "\ue2c9\ue298");
        mapper.put("\ue089", "\ue2c8\ue26d");
        mapper.put("\ue08a", "\ue2c8\ue26d");
        mapper.put("\ue08c", "\ue2c8\ue27f");
        mapper.put("\ue08d", "\ue2c8\ue27f");
        mapper.put("\ue08e", "\ue2c8\ue27c");
        mapper.put("\ue08f", "\ue2c9\ue28a");
        mapper.put("\ue090", "\ue2c9\ue28a");
        mapper.put("\ue091", "\ue2c9\ue287");

        mapper.put("\ue02c\ue058", "\ue2cd\ue32a");
        mapper.put("\ue02c\ue057", "\ue2cd\ue32c");
        mapper.put("\ue02d\ue057", "\ue2cd\ue32c");
        mapper.put("\ue02d\ue058", "\ue2cd\ue32a");

        mapper.put("\ue0ce", "\ue2c9\ue298");

        //h,g+ ...
        mapper.put("\ue092", "\ue2da\ue27c");
        mapper.put("\ue093", "\ue2dd\ue298");
        mapper.put("\ue094", "\ue2da\ue277");
        mapper.put("\ue095", "\ue2da\ue277");
        mapper.put("\ue097", "\ue2da\ue27f");
        mapper.put("\ue098", "\ue2da\ue27f");
        mapper.put("\ue099", "\ue2da\ue27c");
        mapper.put("\ue09a", "\ue2dd\ue29d");
        mapper.put("\ue09b", "\ue2dd\ue28a");
        mapper.put("\ue09c", "\ue2dd\ue287");

        mapper.put("\ue09d", "\ue2e9\ue26a");

        mapper.put("\ue030\ue058", "\ue2df\ue32a");
        mapper.put("\ue030\ue057", "\ue2df\ue32c");
        mapper.put("\ue031\ue057", "\ue2df\ue32c");
        mapper.put("\ue031\ue058", "\ue2df\ue32a");

        mapper.put("\ue0cf", "\ue2dd\ue298");

        //f+ ...
        mapper.put("\ue09f", "\ue32d\ue27c");
        mapper.put("\ue0a0", "\ue32e\ue287");
        mapper.put("\ue0a1", "\ue32e\ue298");
        mapper.put("\ue0a2", "\ue32d\ue26d");
        mapper.put("\ue0a3", "\ue32d\ue26d");
        mapper.put("\ue0a5", "\ue32d\ue27f");
        mapper.put("\ue0a6", "\ue32d\ue27f");
        mapper.put("\ue0a7", "\ue32d\ue27c");
        mapper.put("\ue0a8", "\ue32e\ue28a");
        mapper.put("\ue0a9", "\ue32e\ue28a");
        mapper.put("\ue0aa", "\ue32e\ue287");

        mapper.put("\ue059\ue058", "\ue332\ue32a");
        mapper.put("\ue059\ue057", "\ue332\ue32c");
        mapper.put("\ue05a\ue057", "\ue332\ue32c");
        mapper.put("\ue05a\ue058", "\ue332\ue32a");

        mapper.put("\ue0d0", "\ue32e\ue298");

        //k+ ...
        mapper.put("\ue05c\ue058", "\ue338\ue32a");
        mapper.put("\ue05c\ue057", "\ue338\ue32c");
        mapper.put("\ue05d\ue057", "\ue338\ue32c");
        mapper.put("\ue05d\ue058", "\ue338\ue32a");

        mapper.put("\ue0ad", "\ue333\ue27c");
        mapper.put("\ue0ae", "\ue334\ue287");
        mapper.put("\ue0af", "\ue334\ue298");
        mapper.put("\ue0b0", "\ue333\ue277");
        mapper.put("\ue0b1", "\ue333\ue277");

        mapper.put("\ue0b6", "\ue333\ue27f");
        mapper.put("\ue0b7", "\ue333\ue27f");
        mapper.put("\ue0b8", "\ue333\ue27c");
        mapper.put("\ue0b9", "\ue334\ue28a");
        mapper.put("\ue0ba", "\ue334\ue28a");
        mapper.put("\ue0bb", "\ue334\ue287");
        mapper.put("\ue0bc", "\ue334\ue298");
    }

    private static void buildMapper3() {
        mapper.put("\ue140", "\u180B");
        mapper.put("\ue141", "\u180c");
        mapper.put("\ue142", "\u180d");
        mapper.put("\ue143", "\u180e");
        mapper.put("\ue144", "\ue144");
    }

    private static void buildPunctuations() {
        mapper.put("\u1800", "\ue234");
        mapper.put("\u1801", "\ue235");
        mapper.put("\u1802", "\ue236");
        mapper.put("\u1803", "\ue237");
        mapper.put("\u1804", "\ue238");
        mapper.put("\u1805", "\ue239");
        mapper.put("\u1806", "\ue23a");
        mapper.put("\u1807", "\ue23b");
        mapper.put("\u1808", "\ue23c");
        mapper.put("\u1809", "\ue23d");
        mapper.put("\u180A", "\ue23e");

        //没有匹配
        mapper.put("\ue23f", "\ue23f");
        mapper.put("\ue240", "\ue240");
        mapper.put("\ue241", "\ue241");
        mapper.put("\ue242", "\ue242");


        mapper.put("\u00b7", "\ue243");

        mapper.put("\u1810", "\ue244");
        mapper.put("\u1811", "\ue245");
        mapper.put("\u1812", "\ue246");
        mapper.put("\u1813", "\ue247");
        mapper.put("\u1814", "\ue248");
        mapper.put("\u1815", "\ue249");
        mapper.put("\u1816", "\ue24a");
        mapper.put("\u1817", "\ue24b");
        mapper.put("\u1818", "\ue24c");
        mapper.put("\u1819", "\ue24d");


        mapper.put("\u2048", "\ue24e");
        mapper.put("\u2049", "\ue24f");
        mapper.put("\u0021", "\ue250");
        mapper.put("\u003f", "\ue251");
        mapper.put("\u003b", "\ue252");
        mapper.put("\u0028", "\ue253");
        mapper.put("\u0029", "\ue254");
        mapper.put("\u3008", "\ue255");
        mapper.put("\u3009", "\ue256");
        mapper.put("\u3014", "\ue257");
        mapper.put("\u3015", "\ue258");
        mapper.put("\u300a", "\ue259");
        mapper.put("\u300b", "\ue25a");
        mapper.put("\u300e", "\ue25b");
        mapper.put("\u300f", "\ue25c");
        mapper.put("\u002c", "\ue25d");
        mapper.put("\u00d7", "\ue25e");
        mapper.put("\u203b", "\ue25f");
        mapper.put("\u002d", "\ue260");
        mapper.put("\u007c", "\ue261");
    }

}
