package defpackage;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.HTTP;

/* renamed from: bre  reason: default package */
public abstract class bre {
    public static final Pattern a;
    public static final Pattern b = Pattern.compile("@([A-Za-z0-9_-]+)\\s/");
    public static final Pattern c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static final Pattern g = Pattern.compile("[\n\r]");
    public static final Pattern h = Pattern.compile("\\s{2,}");
    public static final Pattern i = Pattern.compile("\\r|[\\r\\u2028\\u2029\\u0085]");
    public static final String[] j = {HTTP.CRLF, "\r", "\n", " ", " ", ""};
    public static final String[] k = {" ", "\\t", "\\n", "\\r", "\\t", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "​", "‌", "‍", " ", " ", "　"};
    public static final Pattern l = Pattern.compile("[^\\p{L}\\p{Nd} ]+");

    static {
        Pattern compile = Pattern.compile("@([A-Za-z0-9_-]+)");
        a = compile;
        Pattern.compile("@([A-Za-z0-9_-]+)\\s");
        Pattern compile2 = Pattern.compile("[\\p{Punct}\\p{L}\\p{N}\\p{Sm}]+");
        c = Pattern.compile("(" + compile + "\\s)?(?<=\\s|\\p{Zs}|^)\\/[﻿]?[\\p{L}\\p{N}_]+");
        d = Pattern.compile("(" + compile + "\\s)?(?<=\\s|\\p{Zs}|^)\\/[﻿]?[\\p{L}\\p{N}_]+\\s(" + compile2 + ")?");
        StringBuilder sb = new StringBuilder("(");
        sb.append(compile);
        sb.append("\\s)(?<=\\s|\\p{Zs}|^)\\/[﻿]?[\\p{L}\\p{N}_]+");
        e = Pattern.compile(sb.toString());
        f = Pattern.compile("(" + compile + "\\s)(?<=\\s|\\p{Zs}|^)\\/[﻿]?[\\p{L}\\p{N}_]+\\s(" + compile2 + ")?");
    }

    public static CharSequence a(CharSequence charSequence, ida ida) {
        if (oag.t(charSequence)) {
            return "";
        }
        if (ida.j.a(0, charSequence)) {
            List c2 = ida.j.c(charSequence);
            if (!c2.isEmpty()) {
                CharSequence charSequence2 = (CharSequence) c2.get(0);
                return charSequence2 == null ? "" : charSequence2;
            }
        }
        String replaceAll = l.matcher(charSequence).replaceAll("");
        if (!oag.t(replaceAll)) {
            charSequence = replaceAll;
        }
        String[] split = charSequence.toString().trim().split(" +");
        StringBuilder sb = new StringBuilder();
        int min = Math.min(split.length, 2);
        for (int i2 = 0; i2 < min; i2++) {
            String str = split[i2];
            if (!oag.t(str)) {
                sb.append(Character.isHighSurrogate(str.charAt(0)) ? str.substring(0, Math.min(str.length(), 2)) : str.substring(0, 1));
            }
        }
        return sb.toString().toUpperCase();
    }

    public static String b(String str) {
        String rawPath = oag.t(str) ? null : URI.create(str).getRawPath();
        return rawPath == null ? "" : rawPath.length() < 2 ? str : rawPath.substring(1);
    }

    public static String c(String str) {
        if (oag.t(str)) {
            return "";
        }
        return "@" + b(str);
    }

    public static String[] d(String str, ida ida) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str.length()) {
            if (!b0d.i(str.charAt(i2))) {
                int i3 = i2;
                while (i3 < str.length() && ida.j.a(i3, str)) {
                    i3++;
                }
                String substring = i3 > i2 ? str.substring(i2, i3) : null;
                if (!oag.t(substring)) {
                    arrayList.add(substring);
                    i2 += substring.length() - 1;
                } else {
                    int i4 = i2;
                    while (i4 < str.length()) {
                        ida.getClass();
                        if (b0d.i(str.charAt(i4)) || ida.j.a(i4, str)) {
                            break;
                        }
                        i4++;
                    }
                    if (i4 > i2) {
                        arrayList.add(str.substring(i2, i4));
                    }
                    i2 = i4;
                }
            }
            i2++;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String e(String str) {
        if (oag.t(str)) {
            return str;
        }
        return h.matcher(g.matcher(str).replaceAll(" ")).replaceAll(" ");
    }
}
