package defpackage;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: k63  reason: default package */
public abstract class k63 {
    public static final Pattern a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    public static final HashMap d;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        ms2.i(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        ms2.l(hashMap, "aqua", -16711681, -8388652, "aquamarine");
        ms2.i(-983041, hashMap, "azure", -657956, "beige");
        ms2.i(-6972, hashMap, "bisque", -16777216, "black");
        ms2.i(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        ms2.i(-7722014, hashMap, "blueviolet", -5952982, "brown");
        ms2.i(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        ms2.i(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        ms2.i(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        ms2.i(-1828, hashMap, "cornsilk", -2354116, "crimson");
        ms2.l(hashMap, "cyan", -16711681, -16777077, "darkblue");
        ms2.i(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        ms2.l(hashMap, "darkgray", -5658199, -16751616, "darkgreen");
        ms2.l(hashMap, "darkgrey", -5658199, -4343957, "darkkhaki");
        ms2.i(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        ms2.i(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        ms2.i(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        ms2.i(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        hashMap.put("darkslategray", -13676721);
        hashMap.put("darkslategrey", -13676721);
        ms2.l(hashMap, "darkturquoise", -16724271, -7077677, "darkviolet");
        ms2.i(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        hashMap.put("dimgray", -9868951);
        hashMap.put("dimgrey", -9868951);
        ms2.l(hashMap, "dodgerblue", -14774017, -5103070, "firebrick");
        ms2.i(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        ms2.l(hashMap, "fuchsia", -65281, -2302756, "gainsboro");
        ms2.i(-460545, hashMap, "ghostwhite", -10496, "gold");
        hashMap.put("goldenrod", -2448096);
        hashMap.put("gray", -8355712);
        ms2.i(-16744448, hashMap, "green", -5374161, "greenyellow");
        ms2.l(hashMap, "grey", -8355712, -983056, "honeydew");
        ms2.i(-38476, hashMap, "hotpink", -3318692, "indianred");
        ms2.i(-11861886, hashMap, "indigo", -16, "ivory");
        ms2.i(-989556, hashMap, "khaki", -1644806, "lavender");
        ms2.i(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        ms2.i(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        ms2.i(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        hashMap.put("lightgoldenrodyellow", -329006);
        hashMap.put("lightgray", -2894893);
        hashMap.put("lightgreen", -7278960);
        hashMap.put("lightgrey", -2894893);
        ms2.i(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        ms2.i(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        hashMap.put("lightslategray", -8943463);
        hashMap.put("lightslategrey", -8943463);
        ms2.l(hashMap, "lightsteelblue", -5192482, -32, "lightyellow");
        ms2.i(-16711936, hashMap, "lime", -13447886, "limegreen");
        hashMap.put("linen", -331546);
        hashMap.put("magenta", -65281);
        ms2.i(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        ms2.i(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        ms2.i(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        ms2.i(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        ms2.i(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        ms2.i(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        ms2.i(-6943, hashMap, "mistyrose", -6987, "moccasin");
        ms2.i(-8531, hashMap, "navajowhite", -16777088, "navy");
        ms2.i(-133658, hashMap, "oldlace", -8355840, "olive");
        ms2.i(-9728477, hashMap, "olivedrab", -23296, "orange");
        ms2.i(-47872, hashMap, "orangered", -2461482, "orchid");
        ms2.i(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        ms2.i(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        ms2.i(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        ms2.i(-3308225, hashMap, "peru", -16181, "pink");
        ms2.i(-2252579, hashMap, "plum", -5185306, "powderblue");
        ms2.i(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        ms2.i(-65536, hashMap, "red", -4419697, "rosybrown");
        ms2.i(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        ms2.i(-360334, hashMap, "salmon", -744352, "sandybrown");
        ms2.i(-13726889, hashMap, "seagreen", -2578, "seashell");
        ms2.i(-6270419, hashMap, "sienna", -4144960, "silver");
        ms2.i(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        hashMap.put("slategray", -9404272);
        hashMap.put("slategrey", -9404272);
        ms2.l(hashMap, "snow", -1286, -16711809, "springgreen");
        ms2.i(-12156236, hashMap, "steelblue", -2968436, "tan");
        ms2.i(-16744320, hashMap, "teal", -2572328, "thistle");
        ms2.i(-40121, hashMap, "tomato", 0, "transparent");
        ms2.i(-12525360, hashMap, "turquoise", -1146130, "violet");
        ms2.i(-663885, hashMap, "wheat", -1, "white");
        ms2.i(-657931, hashMap, "whitesmoke", -256, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z) {
        int i;
        fm9.f(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return -16777216 | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & 255) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith("rgba")) {
            Matcher matcher = (z ? c : b).matcher(replace);
            if (matcher.matches()) {
                if (z) {
                    String group = matcher.group(4);
                    group.getClass();
                    i = (int) (Float.parseFloat(group) * 255.0f);
                } else {
                    String group2 = matcher.group(4);
                    group2.getClass();
                    i = Integer.parseInt(group2, 10);
                }
                String group3 = matcher.group(1);
                group3.getClass();
                int parseInt = Integer.parseInt(group3, 10);
                String group4 = matcher.group(2);
                group4.getClass();
                int parseInt2 = Integer.parseInt(group4, 10);
                String group5 = matcher.group(3);
                group5.getClass();
                return Color.argb(i, parseInt, parseInt2, Integer.parseInt(group5, 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = a.matcher(replace);
            if (matcher2.matches()) {
                String group6 = matcher2.group(1);
                group6.getClass();
                int parseInt3 = Integer.parseInt(group6, 10);
                String group7 = matcher2.group(2);
                group7.getClass();
                int parseInt4 = Integer.parseInt(group7, 10);
                String group8 = matcher2.group(3);
                group8.getClass();
                return Color.rgb(parseInt3, parseInt4, Integer.parseInt(group8, 10));
            }
        } else {
            Integer num = (Integer) d.get(lz7.T(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
