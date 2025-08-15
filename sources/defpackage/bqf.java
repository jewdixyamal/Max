package defpackage;

import java.util.UUID;

/* renamed from: bqf  reason: default package */
public final class bqf extends e06 {
    public final String b;
    public int c;

    public bqf(yw1 yw1) {
        super(yw1);
        this.b = "virtual-" + yw1.d() + "-" + UUID.randomUUID().toString();
    }

    public final int b() {
        return l(0);
    }

    public final String d() {
        return this.b;
    }

    public final int l(int i) {
        return e1f.i(this.a.l(i) - this.c);
    }
}
