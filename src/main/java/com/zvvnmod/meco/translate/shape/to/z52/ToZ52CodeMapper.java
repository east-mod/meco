package com.zvvnmod.meco.translate.shape.to.z52;

import com.zvvnmod.meco.translate.word.CodeMapper;

/**
 * AUTHOR: zorigt
 * DATE  : 2020/9/17
 * WEEK  : 周四
 * TIME  : 14:27
 */
public class ToZ52CodeMapper {
    public static final CodeMapper codeMapper = new CodeMapper(1024);
    private static final String shud = "\u186a";
    private static final String shelb = "\u186c";
    private static final String gedes = "\u186d";
    private static final String orogshilga = "\u1868";
    private static final String ohorCuul = "\u1866";

    static {
        build1();
        buildPunctuations();
    }

    private static void build1() {
        codeMapper.put("\ue000", "\u1865");
        codeMapper.put("\ue001", "\u186d");

        codeMapper.put("\ue005", "\u186a");
        codeMapper.put("\ue006", "\u186c");

        codeMapper.put("\ue008", "\u186d");

        codeMapper.put("\ue00c", "\u1867");
        codeMapper.put("\ue00d", orogshilga);
        codeMapper.put("\ue00e", "\u186b");
        codeMapper.put("\ue00f", "\u186d");
        codeMapper.put("\ue010", "\u186d\u1866");
        codeMapper.put("\ue011", "\u1873");

        codeMapper.put("\ue01a", "\u186b");
        codeMapper.put("\ue01b", "\u1873");

        codeMapper.put("\ue027", "\u186f");
        codeMapper.put("\ue028", "\u1871");
        codeMapper.put("\ue029", "\u1873");
        codeMapper.put("\ue02a", "\u1873");
        codeMapper.put("\ue02b", "\u1872");
        codeMapper.put("\ue02c", "\u1876");
        codeMapper.put("\ue02d", "\u1876");
        codeMapper.put("\ue02e", "\u1875");
        codeMapper.put("\ue02f", "\u1878");
        codeMapper.put("\ue030", "\u188a");
        codeMapper.put("\ue031", "\u188a");
        codeMapper.put("\ue032", "\u1887");
        codeMapper.put("\ue034", "\u1888");
        codeMapper.put("\ue036", "\u188c");
        codeMapper.put("\ue037", "\u188e");
        codeMapper.put("\ue038", "\u188d");
        codeMapper.put("\ue039", "\u188f");
        codeMapper.put("\ue03a", "\u1891");
        codeMapper.put("\ue03b", "\u1890");
        codeMapper.put("\ue03c", "\u1894");
        codeMapper.put("\ue03d", "\u1894");
        codeMapper.put("\ue03e", "\u1893");
        codeMapper.put("\ue03f", "\u1897");
        codeMapper.put("\ue040", "\u1897");
        codeMapper.put("\ue041", "\u1896");
        codeMapper.put("\ue042", "\u1898");
        codeMapper.put("\ue043", "\u1898");
        codeMapper.put("\ue044", "\u1898\u1866");
        codeMapper.put("\ue045", "\u1899");
        codeMapper.put("\ue046", "\u1899");

        codeMapper.put("\ue049", "\u1899\u1866");
        codeMapper.put("\ue04a", "\u189a");
        codeMapper.put("\ue04b", "\u189a");
        codeMapper.put("\ue04c", "\u189a\u1866");
        codeMapper.put("\ue04d", "\u186c");
        codeMapper.put("\ue04e", "\u189b");
        codeMapper.put("\ue04f", "\u189b\u1866");
        codeMapper.put("\ue050", "\u189c");
        codeMapper.put("\ue051", "\u189c");

        codeMapper.put("\ue053", "\u189e");
        codeMapper.put("\ue054", "\u189e");
        codeMapper.put("\ue055", "\u189d");
        codeMapper.put("\ue056", "\u189f");
        codeMapper.put("\ue057", "\u189f");
        codeMapper.put("\ue058", "\u189f\u1866");
        codeMapper.put("\ue059", "\u18a1");
        codeMapper.put("\ue05a", "\u18a1");
        codeMapper.put("\ue05b", "\u18a0");
        codeMapper.put("\ue05c", "\u18a4");
        codeMapper.put("\ue05d", "\u18a4");
        codeMapper.put("\ue05e", "\u18a3");
        codeMapper.put("\ue05f", "\u18a6");
        codeMapper.put("\ue060", "\u18a6");
        codeMapper.put("\ue061", "\u18a6\u1866");
        codeMapper.put("\ue062", "\u18a7");
        codeMapper.put("\ue063", "\u18a7");
        codeMapper.put("\ue064", "\u18a7\u1866");

        codeMapper.put("\ue066", "\u18a8");
        codeMapper.put("\ue067", "\u18a8\u1866");
        codeMapper.put("\ue068", "\u18aa");
        codeMapper.put("\ue069", "\u18aa");
        codeMapper.put("\ue06a", "\u18aa\u1866");

        codeMapper.put("\ue077", "\u1870" + orogshilga);

        String b1 = "\u1873";
        String b2 = "\u1874";
        codeMapper.put("\ue079", b1 + shelb + ohorCuul);
        codeMapper.put("\ue07a", b2 + gedes);
        codeMapper.put("\ue07b", b2 + gedes + ohorCuul);
        codeMapper.put("\ue07c", b1 + shud);
        codeMapper.put("\ue07d", b1 + shud);

        codeMapper.put("\ue07f", b1 + shelb);
        codeMapper.put("\ue080", b1 + shelb);
        codeMapper.put("\ue081", b1 + shelb + ohorCuul);
        codeMapper.put("\ue082", b2 + gedes);
        codeMapper.put("\ue083", b2 + gedes);
        codeMapper.put("\ue084", b2 + gedes);

        String p1 = "\u1876";
        String p2 = "\u1877";
        codeMapper.put("\ue086", p1 + shelb + ohorCuul);
        codeMapper.put("\ue087", p2 + gedes);
        codeMapper.put("\ue088", p2 + gedes + ohorCuul);
        codeMapper.put("\ue089", p1 + shud);
        codeMapper.put("\ue08a", p1 + shud);

        codeMapper.put("\ue08c", p1 + shelb);
        codeMapper.put("\ue08d", p1 + shelb);
        codeMapper.put("\ue08e", p1 + shelb + ohorCuul);
        codeMapper.put("\ue08f", p2 + gedes);
        codeMapper.put("\ue090", p2 + gedes);
        codeMapper.put("\ue091", p2 + gedes);

        String hg1 = "\u188a";
        String hg2 = "\u188b";
        codeMapper.put("\ue092", hg1 + shelb + ohorCuul);
        codeMapper.put("\ue093", hg2 + gedes + ohorCuul);
        codeMapper.put("\ue094", hg1 + shud);
        codeMapper.put("\ue095", hg1 + shud);

        codeMapper.put("\ue097", hg1 + shelb);
        codeMapper.put("\ue098", hg1 + shelb);
        codeMapper.put("\ue099", hg1 + shelb + ohorCuul);
        codeMapper.put("\ue09a", hg2 + gedes + shelb);
        codeMapper.put("\ue09b", hg2 + gedes);
        codeMapper.put("\ue09c", hg2 + gedes);
        codeMapper.put("\ue09d", "\u1889" + orogshilga);

        String f1 = "\u18a1";
        String f2 = "\u18a2";
        codeMapper.put("\ue09f", f1 + shelb + ohorCuul);
        codeMapper.put("\ue0a0", f2 + gedes);
        codeMapper.put("\ue0a1", f2 + gedes + ohorCuul);
        codeMapper.put("\ue0a2", f1 + shud);
        codeMapper.put("\ue0a3", f1 + shud);

        codeMapper.put("\ue0a5", f1 + shelb);
        codeMapper.put("\ue0a6", f1 + shelb);
        codeMapper.put("\ue0a7", f1 + shelb + ohorCuul);
        codeMapper.put("\ue0a8", f2 + gedes);
        codeMapper.put("\ue0a9", f2 + gedes);
        codeMapper.put("\ue0aa", f2 + gedes);

        String k1 = "\u18a4";
        String k2 = "\u18a5";
        codeMapper.put("\ue0ad", k1 + shelb + ohorCuul);
        codeMapper.put("\ue0ae", k2 + gedes);
        codeMapper.put("\ue0af", k2 + gedes + ohorCuul);
        codeMapper.put("\ue0b0", k1 + shud);
        codeMapper.put("\ue0b1", k1 + shud);

        codeMapper.put("\ue0b6", k1 + shelb);
        codeMapper.put("\ue0b7", k1 + shelb);
        codeMapper.put("\ue0b8", k1 + shelb + ohorCuul);
        codeMapper.put("\ue0b9", k2 + gedes);
        codeMapper.put("\ue0ba", k2 + gedes);
        codeMapper.put("\ue0bb", k2 + gedes);
        codeMapper.put("\ue0bc", k2 + gedes + ohorCuul);

        codeMapper.put("\ue0cd", b2 + gedes + ohorCuul);
        codeMapper.put("\ue0ce", p2 + gedes + ohorCuul);
        codeMapper.put("\ue0cf", hg2 + gedes + ohorCuul);
        codeMapper.put("\ue0d0", f2 + gedes + ohorCuul);

    }

    private static void buildPunctuations() {
        codeMapper.put("\u00b7", "\u184f");
        codeMapper.put("\u2048", "\u1850");
        codeMapper.put("\u2049", "\u1851");
        codeMapper.put("\u0021", "\u1852");
        codeMapper.put("\u003f", "\u1853");
        codeMapper.put("\u003b", "\u1854");
        codeMapper.put("\u0028", "\u1855");
        codeMapper.put("\u0029", "\u1856");
        codeMapper.put("\u3008", "\u1857");
        codeMapper.put("\u3009", "\u1858");
        codeMapper.put("\u3014", "\u1859");
        codeMapper.put("\u3015", "\u185a");
        codeMapper.put("\u300a", "\u185b");
        codeMapper.put("\u300b", "\u185c");
        codeMapper.put("\u300e", "\u185d");
        codeMapper.put("\u300f", "\u185e");
        codeMapper.put("\u002c", "\u185f");
        codeMapper.put("\u00d7", "\u1860");
        codeMapper.put("\u203b", "\u1861");
        codeMapper.put("\u002d", "\u1862");
        codeMapper.put("\u007c", "\u1863");
    }
}
