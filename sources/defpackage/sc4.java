package defpackage;

import java.io.File;
import java.util.regex.Pattern;

/* renamed from: sc4  reason: default package */
public final class sc4 {
    public final gaa a;
    public final int b;

    public sc4(gaa gaa, int i) {
        this.a = gaa;
        this.b = i;
    }

    public final String a(String str) {
        String str2;
        int i = this.b;
        if (i == 1) {
            str2 = "lottie_cache";
        } else if (i == 2) {
            str2 = "webm_cache";
        } else {
            throw null;
        }
        return rh4.j(str2, "_", Pattern.compile("\\W+").matcher(str).replaceAll(""));
    }

    public final qm9 b(String str) {
        String str2;
        try {
            File u = this.a.u();
            String a2 = a(str);
            File[] listFiles = u.listFiles(new rc4(a2));
            if (listFiles == null) {
                return null;
            }
            if (listFiles.length == 0) {
                return null;
            }
            File file = listFiles[0];
            String name = file.getName();
            if (name != null) {
                if (name.length() != 0) {
                    String str3 = a2 + "_origname_";
                    int A0 = w9e.A0(name, str3, 0, false, 6);
                    if (A0 != -1) {
                        str2 = name.substring(A0 + str3.length());
                        return new qm9(file, str2);
                    }
                }
            }
            str2 = null;
            return new qm9(file, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public final File c(String str, String str2) {
        String str3;
        String str4;
        File u = this.a.u();
        String a2 = a(str);
        if (str2 == null || str2.length() == 0) {
            int i = this.b;
            if (i == 1) {
                str4 = "json";
            } else if (i == 2) {
                str4 = "webm";
            } else {
                throw null;
            }
            str3 = ".".concat(str4);
        } else {
            str3 = "_origname_".concat(str2);
        }
        return new File(u, au1.g(a2, str3));
    }
}
