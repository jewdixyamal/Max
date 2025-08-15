package defpackage;

import android.net.Uri;
import java.util.Collections;

/* renamed from: rb8  reason: default package */
public final class rb8 implements su0 {
    public static final wa8 Y = new wa8(0);
    public final cb8 X;
    public final String a;
    public final kb8 b;
    public final gb8 c;
    public final fd8 o;

    static {
        za8 za8 = new za8();
        ls5 ls5 = zw6.b;
        ffc ffc = ffc.X;
        Collections.emptyList();
        ffc ffc2 = ffc.X;
        za8.b();
        fd8 fd8 = fd8.S0;
    }

    public rb8(String str, cb8 cb8, kb8 kb8, gb8 gb8, fd8 fd8) {
        this.a = str;
        this.b = kb8;
        this.c = gb8;
        this.o = fd8;
        this.X = cb8;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [ab8, cb8] */
    public static rb8 a(Uri uri) {
        Uri uri2 = uri;
        za8 za8 = new za8();
        ls5 ls5 = zw6.b;
        ffc ffc = ffc.X;
        return new rb8("", new ab8(za8), uri2 != null ? new kb8(uri2, (br7) null, Collections.emptyList(), ffc.X) : null, new gb8(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), fd8.S0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb8)) {
            return false;
        }
        rb8 rb8 = (rb8) obj;
        return maf.a(this.a, rb8.a) && this.X.equals(rb8.X) && maf.a(this.b, rb8.b) && maf.a(this.c, rb8.c) && maf.a(this.o, rb8.o);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kb8 kb8 = this.b;
        int hashCode2 = kb8 != null ? kb8.hashCode() : 0;
        int hashCode3 = this.c.hashCode();
        return this.o.hashCode() + ((this.X.hashCode() + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31);
    }
}
