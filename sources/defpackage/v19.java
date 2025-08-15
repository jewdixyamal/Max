package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: v19  reason: default package */
public final class v19 {
    public final av0 a;
    public final long b;
    public final kld c;
    public final ContextScope d;
    public final v7c e;

    public v19(long j, av0 av0, kke kke) {
        this.a = av0;
        this.b = j;
        kld b2 = lld.b(0, 0, 0, 7);
        this.c = b2;
        this.d = j1e.a(((w9a) kke).c().getImmediate());
        av0.d(this);
        this.e = new v7c(b2);
    }

    @uae
    public final void onEvent(mna mna) {
        if (mna.b == this.b) {
            j47.T(this.d, (lx3) null, (vx3) null, new u19(this, new su8(Collections.singleton(Long.valueOf(mna.o)), true), (Continuation) null), 3);
        }
    }

    @uae
    public final void onEvent(kz6 kz6) {
        if (kz6.b == this.b) {
            j47.T(this.d, (lx3) null, (vx3) null, new u19(this, new su8(Collections.singleton(Long.valueOf(kz6.c)), false), (Continuation) null), 3);
        }
    }

    @uae
    public final void onEvent(l6f l6f) {
        if (l6f.b == this.b) {
            j47.T(this.d, (lx3) null, (vx3) null, new u19(this, new xu8(Collections.singleton(Long.valueOf(l6f.c))), (Continuation) null), 3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @defpackage.uae
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onEvent(defpackage.re9 r7) {
        /*
            r6 = this;
            long r0 = r7.b
            long r2 = r6.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            long r0 = r7.c
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            if (r2 < 0) goto L_0x001e
            long r4 = r7.o
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x001e
            wu8 r7 = new wu8
            r7.<init>(r0, r4)
            goto L_0x0030
        L_0x001e:
            java.util.List r7 = r7.X
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002f
            vu8 r0 = new vu8
            r0.<init>(r7)
            r7 = r0
            goto L_0x0030
        L_0x002f:
            r7 = r3
        L_0x0030:
            if (r7 == 0) goto L_0x003d
            u19 r0 = new u19
            r0.<init>(r6, r7, r3)
            r7 = 3
            kotlinx.coroutines.internal.ContextScope r6 = r6.d
            defpackage.j47.T(r6, r3, r3, r0, r7)
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v19.onEvent(re9):void");
    }

    @uae
    public final void onEvent(ut7 ut7) {
        if (ut7.X.d(this.b)) {
            j47.T(this.d, (lx3) null, (vx3) null, new u19(this, uu8.a, (Continuation) null), 3);
        }
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, yu8] */
    @uae
    public final void onEvent(vz2 vz2) {
        if (vz2.b.contains(Long.valueOf(this.b))) {
            j47.T(this.d, (lx3) null, (vx3) null, new u19(this, new Object(), (Continuation) null), 3);
        }
    }
}
