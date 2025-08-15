package defpackage;

import java.util.Collections;

/* renamed from: j9d  reason: default package */
public final class j9d extends g9d {
    public final l20 A0;
    public final boolean B0;
    public final String z0;

    public j9d(i9d i9d) {
        super(i9d);
        this.z0 = i9d.m;
        this.A0 = (l20) i9d.o;
        this.B0 = i9d.n;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, m20] */
    public final bu8 y() {
        boolean z = this.B0;
        l20 l20 = this.A0;
        if (z) {
            j10 j = l20.j();
            j.x = z10.b;
            l20 = j.a();
        }
        ? obj = new Object();
        obj.a = Collections.singletonList(l20);
        k8g c = obj.c();
        bu8 bu8 = new bu8();
        bu8.n = c;
        String str = this.z0;
        if (!oag.t(str)) {
            bu8.g = str;
        }
        bu8.F = null;
        return bu8;
    }

    public final long z(long j, e52 e52) {
        long z = super.z(j, e52);
        if (this.B0) {
            pk a = a();
            k4a k4a = (k4a) a;
            k4a.w(k4a, new pf9(((p7b) k4a.y()).a.o(), this.A0.g.b, j));
        }
        return z;
    }
}
