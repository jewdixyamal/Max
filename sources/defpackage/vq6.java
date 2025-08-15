package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: vq6  reason: default package */
public final class vq6 {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final List g;
    public final String h;
    public final String i;

    public vq6(String str, String str2, String str3, String str4, int i2, ArrayList arrayList, String str5, String str6) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = arrayList;
        this.h = str5;
        this.i = str6;
        this.a = tpa.f(str, "https");
    }

    public final String a() {
        if (this.d.length() == 0) {
            return "";
        }
        String str = this.i;
        int z0 = w9e.z0(str, ':', this.b.length() + 3, false, 4) + 1;
        int z02 = w9e.z0(str, '@', 0, false, 6);
        if (str != null) {
            return str.substring(z0, z02);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final String b() {
        String str = this.i;
        int z0 = w9e.z0(str, '/', this.b.length() + 3, false, 4);
        return str.substring(z0, naf.f(str, z0, str.length(), "?#"));
    }

    public final ArrayList c() {
        String str = this.i;
        int z0 = w9e.z0(str, '/', this.b.length() + 3, false, 4);
        int f2 = naf.f(str, z0, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (z0 < f2) {
            int i2 = z0 + 1;
            int e2 = naf.e('/', i2, f2, str);
            arrayList.add(str.substring(i2, e2));
            z0 = e2;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int z0 = w9e.z0(str, '?', 0, false, 6) + 1;
        return str.substring(z0, naf.e('#', z0, str.length(), str));
    }

    public final String e() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.b.length() + 3;
        String str = this.i;
        int f2 = naf.f(str, length, str.length(), ":@");
        if (str != null) {
            return str.substring(length, f2);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vq6) && tpa.f(((vq6) obj).i, this.i);
    }

    public final od3 f() {
        od3 od3 = new od3();
        String str = this.b;
        od3.e = str;
        od3.f = e();
        od3.g = a();
        od3.h = this.e;
        int t = buc.t(str);
        int i2 = this.f;
        if (i2 == t) {
            i2 = -1;
        }
        od3.b = i2;
        ArrayList arrayList = od3.c;
        arrayList.clear();
        arrayList.addAll(c());
        String d2 = d();
        String str2 = null;
        od3.d = d2 != null ? buc.A(buc.e(d2, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
        if (this.h != null) {
            String str3 = this.i;
            int z0 = w9e.z0(str3, '#', 0, false, 6) + 1;
            if (str3 != null) {
                str2 = str3.substring(z0);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        od3.i = str2;
        return od3;
    }

    public final String g() {
        od3 od3;
        try {
            od3 = new od3();
            od3.j(this, "/...");
        } catch (IllegalArgumentException unused) {
            od3 = null;
        }
        od3.getClass();
        od3.f = buc.e("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        od3.g = buc.e("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return od3.b().i;
    }

    public final URI h() {
        od3 f2 = f();
        String str = (String) f2.h;
        String str2 = null;
        f2.h = str != null ? Pattern.compile("[\"<>^`{|}]").matcher(str).replaceAll("") : null;
        ArrayList arrayList = f2.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.set(i2, buc.e((String) arrayList.get(i2), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = f2.d;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str3 = (String) arrayList2.get(i3);
                arrayList2.set(i3, str3 != null ? buc.e(str3, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str4 = (String) f2.i;
        if (str4 != null) {
            str2 = buc.e(str4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163);
        }
        f2.i = str2;
        String od3 = f2.toString();
        try {
            return new URI(od3);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").matcher(od3).replaceAll(""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String toString() {
        return this.i;
    }
}
