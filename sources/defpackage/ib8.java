package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: ib8  reason: default package */
public final class ib8 {
    public static final String j = Integer.toString(0, 36);
    public static final String k = Integer.toString(1, 36);
    public static final String l = Integer.toString(2, 36);
    public static final String m = Integer.toString(3, 36);
    public static final String n = Integer.toString(4, 36);
    public static final String o = Integer.toString(5, 36);
    public static final String p = Integer.toString(6, 36);
    public static final String q = Integer.toString(7, 36);
    public final Uri a;
    public final String b;
    public final eb8 c;
    public final xa8 d;
    public final List e;
    public final String f;
    public final zw6 g;
    public final Object h;
    public final long i;

    static {
        int i2 = oaf.a;
    }

    public ib8(Uri uri, String str, eb8 eb8, xa8 xa8, List list, String str2, zw6 zw6, Object obj, long j2) {
        this.a = uri;
        this.b = ia9.l(str);
        this.c = eb8;
        this.d = xa8;
        this.e = list;
        this.f = str2;
        this.g = zw6;
        ww6 i2 = zw6.i();
        for (int i3 = 0; i3 < zw6.size(); i3++) {
            i2.d(new pb8(((pb8) zw6.get(i3)).a()));
        }
        i2.j();
        this.h = obj;
        this.i = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib8)) {
            return false;
        }
        ib8 ib8 = (ib8) obj;
        return this.a.equals(ib8.a) && oaf.a(this.b, ib8.b) && oaf.a(this.c, ib8.c) && oaf.a(this.d, ib8.d) && this.e.equals(ib8.e) && oaf.a(this.f, ib8.f) && this.g.equals(ib8.g) && oaf.a(this.h, ib8.h) && Long.valueOf(this.i).equals(Long.valueOf(ib8.i));
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i2 = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        eb8 eb8 = this.c;
        int hashCode3 = (hashCode2 + (eb8 == null ? 0 : eb8.hashCode())) * 31;
        xa8 xa8 = this.d;
        int hashCode4 = (this.e.hashCode() + ((hashCode3 + (xa8 == null ? 0 : xa8.hashCode())) * 31)) * 31;
        String str2 = this.f;
        int hashCode5 = (this.g.hashCode() + ((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Object obj = this.h;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return (int) ((((long) (hashCode5 + i2)) * 31) + this.i);
    }
}
