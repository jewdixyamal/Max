package defpackage;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: pb  reason: default package */
public final class pb {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final ContextScope f;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final q0e h;
    public final q0e i;
    public final w7c j;
    public final kld k;
    public final v7c l;

    public pb(kke kke, je7 je7, je7 je72, je7 je73, je7 je74, je7 je75) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
        this.e = je75;
        this.f = j1e.a(((w9a) kke).b());
        nz4 nz4 = nz4.a;
        this.h = r0e.a(nz4);
        q0e a2 = r0e.a(nz4);
        this.i = a2;
        this.j = new w7c(a2);
        kld b2 = lld.b(0, 0, 0, 7);
        this.k = b2;
        this.l = new v7c(b2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.pb r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof defpackage.nb
            if (r0 == 0) goto L_0x0016
            r0 = r6
            nb r0 = (defpackage.nb) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x001b
        L_0x0016:
            nb r0 = new nb
            r0.<init>(r5, r6)
        L_0x001b:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.X
            pb r1 = r0.o
            defpackage.od2.a0(r6)
            goto L_0x006c
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            pb r5 = r0.o
            defpackage.od2.a0(r6)
            goto L_0x0057
        L_0x003f:
            defpackage.od2.a0(r6)
            je7 r6 = r5.a
            java.lang.Object r6 = r6.getValue()
            ds3 r6 = (defpackage.ds3) r6
            r0.o = r5
            r0.s0 = r4
            el3 r6 = r6.a
            java.util.List r6 = r6.k()
            if (r6 != r1) goto L_0x0057
            goto L_0x008f
        L_0x0057:
            r2 = r6
            java.util.List r2 = (java.util.List) r2
            q0e r4 = r5.h
            r0.o = r5
            r0.X = r6
            r0.s0 = r3
            r4.setValue(r2)
            e5f r2 = defpackage.e5f.a
            if (r2 != r1) goto L_0x006a
            goto L_0x008f
        L_0x006a:
            r1 = r5
            r5 = r6
        L_0x006c:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            at r6 = new at
            r2 = 2
            r6.<init>(r2, r5)
            k8 r5 = new k8
            r2 = 7
            r5.<init>(r2)
            qk5 r5 = defpackage.l6d.a0(r6, r5)
            lx3 r6 = r0.b
            kotlinx.coroutines.internal.ContextScope r0 = defpackage.j1e.a(r6)
            mb r2 = new mb
            r3 = 0
            r2.<init>(r0, r6, r1, r3)
            r1f r1 = new r1f
            r1.<init>(r5, r2)
        L_0x008f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb.a(pb, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ba b(uj3 uj3) {
        String uri;
        Uri parse;
        String q = uj3.q(((hyc) ((q33) this.c.getValue())).q(), kk0.c);
        jqe eqe = uj3.t() ? new eqe(jpc.p) : new iqe(((w7b) this.d.getValue()).b(uj3));
        long n = uj3.n();
        String d2 = uj3.d();
        if (d2 != null) {
            if (q == null || (parse = Uri.parse(q)) == null || (uri = parse.toString()) == null) {
                uri = Uri.EMPTY.toString();
            }
            return new ba(n, d2, eqe, uri, uj3.m(), uj3.u());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
