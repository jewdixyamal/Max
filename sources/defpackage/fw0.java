package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: fw0  reason: default package */
public final class fw0 implements f05 {
    public static final String c;
    public static final Set d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new i15[]{new i15("proto"), new i15("json")})));
    public static final fw0 e;
    public static final fw0 f;
    public final String a;
    public final String b;

    static {
        String R = z04.R("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = R;
        String R2 = z04.R("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String R3 = z04.R("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        e = new fw0(R, (String) null);
        f = new fw0(R2, R3);
    }

    public fw0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static fw0 a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new fw0(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }
}
