package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: lt2  reason: default package */
public final class lt2 implements sk6 {
    public static final List f = Collections.singletonList(new Object());
    public final khe b;
    public final khe c;
    public final v00 d = new v00(13);
    public final v00 e = new v00(14);

    public lt2(khe khe, je7 je7) {
        this.b = new khe(new dr(khe, je7, this, 3));
        this.c = new khe(new dr(khe, je7, this, 4));
    }

    public final boolean a() {
        return false;
    }

    public final Comparator c() {
        return this.d;
    }

    public final Comparator e() {
        return this.e;
    }

    public final long g() {
        return ((Number) this.b.getValue()).longValue();
    }

    public final long h() {
        return ((Number) this.c.getValue()).longValue();
    }

    public final List i() {
        return f;
    }
}
