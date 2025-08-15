package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: l10  reason: default package */
public final class l10 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final List f;

    static {
        k10 k10 = new k10();
        if (k10.e == null) {
            k10.e = Collections.emptyList();
        }
        new l10(k10);
    }

    public l10(k10 k10) {
        this.a = k10.a;
        this.b = k10.c;
        this.c = k10.d;
        this.d = k10.f;
        this.e = k10.b;
        this.f = k10.e;
    }

    public final boolean a() {
        return this.d == 3;
    }

    public final boolean b() {
        return c() || a() || this.d == 4;
    }

    public final boolean c() {
        return this.d == 5;
    }

    public final boolean d() {
        return this.c == 2;
    }
}
