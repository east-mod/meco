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
        mapper = new CodeMapper(2048);
        buildMapper1();
    }

    private static void buildMapper1() {
        mapper.put("\ue000", "\ue271");
        mapper.put("\ue001", "\ue291");
        mapper.put("\ue002", "\ue27e");
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

        mapper.put("\ue015", "\ue2bd");
        mapper.put("\ue016", "\ue2bb");

        mapper.put("\ue01a", "\ue282");
        mapper.put("\ue01b", "\ue285");

        mapper.put("\ue027", "\ue2b1");
        mapper.put("\ue028", "\ue2b7");

        mapper.put("\ue029", "\ue2c7");
        mapper.put("\ue02a", "\ue2c7");
        mapper.put("\ue02b", "\ue2c3");

        mapper.put("\ue02c", "\ue2cd");
        mapper.put("\ue02d", "\ue2cd");
        mapper.put("\ue02e", "\ue2ca");

        mapper.put("\ue02f", "\ue2ce");
        mapper.put("\ue030", "\ue2da");
        mapper.put("\ue031", "\ue2df");
        mapper.put("\ue032", "\ue2e7");
        mapper.put("\ue033", "\ue2e8");
        mapper.put("\ue034", "\ue2cf");
        mapper.put("\ue035", "\ue2d9");

        mapper.put("\ue036", "\ue2f1");
        mapper.put("\ue037", "\ue2f4");
        mapper.put("\ue038", "\ue2f3");

        mapper.put("\ue039", "\ue2f7");
        mapper.put("\ue03a", "\ue2fa");
        mapper.put("\ue03b", "\ue2f9");

        mapper.put("\ue03c", "\ue2fd");
        mapper.put("\ue03d", "\ue301");
        mapper.put("\ue03e", "\ue2ff");

        mapper.put("\ue03f", "\ue303");
        mapper.put("\ue040", "\ue306");
        mapper.put("\ue041", "\ue305");

        mapper.put("\ue042", "\ue308");
        mapper.put("\ue043", "\ue30c");
        mapper.put("\ue044", "\ue30a");

        mapper.put("\ue045", "\ue30b");
        mapper.put("\ue046", "\ue30b");
        mapper.put("\ue049", "\ue312");

        mapper.put("\ue04a", "\ue315");
        mapper.put("\ue04b", "\ue317");
        mapper.put("\ue04c", "\ue316");

        mapper.put("\ue04d", "\ue318");
        mapper.put("\ue04e", "\ue31d");
        mapper.put("\ue04f", "\ue31b");

        mapper.put("\ue050", "\ue31e");
        mapper.put("\ue051", "\ue320");

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

        mapper.put("\ue065", "\ue345");
        mapper.put("\ue066", "\ue347");
        mapper.put("\ue067", "\ue346");

        mapper.put("\ue068", "\ue348");
    }

    private static void buildMapper2() {
        mapper.put("", "");
    }
}
