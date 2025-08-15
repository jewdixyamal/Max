package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: xqb  reason: default package */
public final class xqb extends mue {
    public static final xqb g = new xqb(ffc.X, (wqb) null);
    public static final Object h = new Object();
    public final zw6 e;
    public final wqb f;

    static {
        ls5 ls5 = zw6.b;
    }

    public xqb(zw6 zw6, wqb wqb) {
        this.e = zw6;
        this.f = wqb;
    }

    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqb)) {
            return false;
        }
        xqb xqb = (xqb) obj;
        return f46.B(this.e, xqb.e) && f46.B(this.f, xqb.f);
    }

    public final hue g(int i, hue hue, boolean z) {
        wqb v = v(i);
        Long valueOf = Long.valueOf(v.b);
        long S = oaf.S(v.c);
        hue.getClass();
        hue.j(valueOf, (Object) null, i, S, 0, s8.g, false);
        return hue;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.f});
    }

    public final int i() {
        return p();
    }

    public final Object m(int i) {
        throw new UnsupportedOperationException();
    }

    public final kue n(int i, kue kue, long j) {
        wqb v = v(i);
        kue.b(h, v.a, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, true, false, (hb8) null, 0, oaf.S(v.c), i, i, 0);
        return kue;
    }

    public final int p() {
        return this.e.size() + (this.f == null ? 0 : 1);
    }

    public final boolean r(tb8 tb8) {
        wqb wqb = this.f;
        if (wqb != null && tb8.equals(wqb.a)) {
            return true;
        }
        int i = 0;
        while (true) {
            zw6 zw6 = this.e;
            if (i >= zw6.size()) {
                return false;
            }
            if (tb8.equals(((wqb) zw6.get(i)).a)) {
                return true;
            }
            i++;
        }
    }

    public final xqb s(int i, tb8 tb8, long j) {
        zw6 zw6 = this.e;
        int size = zw6.size();
        wqb wqb = this.f;
        fm9.f(i < size || (i == zw6.size() && wqb != null));
        if (i == zw6.size()) {
            return new xqb(zw6, new wqb(tb8, -1, j));
        }
        long j2 = ((wqb) zw6.get(i)).b;
        ww6 ww6 = new ww6();
        ww6.f(zw6.subList(0, i));
        ww6.d(new wqb(tb8, j2, j));
        ww6.f(zw6.subList(i + 1, zw6.size()));
        return new xqb(ww6.j(), wqb);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ww6, pw6] */
    public final xqb t(int i, List list) {
        ? pw6 = new pw6(4);
        zw6 zw6 = this.e;
        pw6.e(zw6.subList(0, i));
        for (int i2 = 0; i2 < list.size(); i2++) {
            pw6.a(new wqb((tb8) list.get(i2), -1, -9223372036854775807L));
        }
        pw6.e(zw6.subList(i, zw6.size()));
        return new xqb(pw6.j(), this.f);
    }

    public final long u(int i) {
        if (i >= 0) {
            zw6 zw6 = this.e;
            if (i < zw6.size()) {
                return ((wqb) zw6.get(i)).b;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r2 = r2.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.wqb v(int r3) {
        /*
            r2 = this;
            zw6 r0 = r2.e
            int r1 = r0.size()
            if (r3 != r1) goto L_0x000d
            wqb r2 = r2.f
            if (r2 == 0) goto L_0x000d
            goto L_0x0013
        L_0x000d:
            java.lang.Object r2 = r0.get(r3)
            wqb r2 = (defpackage.wqb) r2
        L_0x0013:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xqb.v(int):wqb");
    }
}
