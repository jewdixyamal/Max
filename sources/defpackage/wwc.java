package defpackage;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: wwc  reason: default package */
public final class wwc implements j0e {
    public final /* synthetic */ int a;
    public final Object b;

    public wwc(ate ate) {
        this.a = 1;
        this.b = ate;
    }

    public static void j(wwc wwc, long j, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        wwc.getClass();
        ((ti9) wwc.b).setValue(new twc(j, true, true, z, false, -1));
    }

    public final List b() {
        switch (this.a) {
            case 0:
                return ((ti9) this.b).b();
            default:
                return nz4.a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        if (defpackage.j47.x(ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.UPLOAD_NEXT_INTERVAL, r0) != r1) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(defpackage.on5 r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            int r0 = r8.a
            switch(r0) {
                case 0: goto L_0x0071;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r10 instanceof defpackage.yse
            if (r0 == 0) goto L_0x0018
            r0 = r10
            yse r0 = (defpackage.yse) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x001d
        L_0x0018:
            yse r0 = new yse
            r0.<init>(r8, r10)
        L_0x001d:
            java.lang.Object r10 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            on5 r8 = r0.X
            wwc r9 = r0.o
            defpackage.od2.a0(r10)
        L_0x0032:
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x0049
        L_0x0036:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003e:
            on5 r8 = r0.X
            wwc r9 = r0.o
            defpackage.od2.a0(r10)
            goto L_0x0062
        L_0x0046:
            defpackage.od2.a0(r10)
        L_0x0049:
            lx3 r10 = r0.b
            defpackage.pag.j(r10)
            java.util.List r10 = r8.h()
            r0.o = r8
            r0.X = r9
            r0.s0 = r4
            java.lang.Object r10 = r9.a(r10, r0)
            if (r10 != r1) goto L_0x005f
            goto L_0x0070
        L_0x005f:
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x0062:
            r0.o = r9
            r0.X = r8
            r0.s0 = r3
            r5 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r10 = defpackage.j47.x(r5, r0)
            if (r10 != r1) goto L_0x0032
        L_0x0070:
            return r1
        L_0x0071:
            java.lang.Object r8 = r8.b
            ti9 r8 = (defpackage.ti9) r8
            java.lang.Object r8 = r8.d(r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wwc.d(on5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object getValue() {
        switch (this.a) {
            case 0:
                return (twc) ((ti9) this.b).getValue();
            default:
                return h();
        }
    }

    public List h() {
        int i;
        ate ate = (ate) this.b;
        ate.getClass();
        ArrayList N = y53.N(new b54(ate.a, new eqe(m0c.oneme_settings_dump_threads), woc.r, (jqe) null, y44.e, 8));
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Map h = kp.h(allStackTraces);
        Iterator it = xse.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            i = 0;
            if (!u1Var.hasNext()) {
                break;
            }
            Thread.State state = (Thread.State) u1Var.next();
            long j = ((ei4) ate.e.computeIfAbsent(state, new di(20, new w8c(20)))).a;
            int i2 = m0c.oneme_settings_thread_state_count;
            String name = state.name();
            Integer num = (Integer) h.get(state);
            if (num != null) {
                i = num.intValue();
            }
            b54 b54 = r8;
            b54 b542 = new b54(j, new gqe(i2, ys.m0(new Object[]{name, Integer.valueOf(i)})), woc.c1, (jqe) null, (fp3) null, 24);
            N.add(b54);
        }
        int i3 = m0c.oneme_settings_thread_state_count;
        int i4 = 0;
        for (Number intValue : h.values()) {
            i4 += intValue.intValue();
        }
        N.add(new b54(ate.b, new gqe(i3, ys.m0(new Object[]{"Total", Integer.valueOf(i4)})), woc.c1, (jqe) null, (fp3) null, 24));
        if (!allStackTraces.isEmpty()) {
            int i5 = 0;
            for (Map.Entry<Thread, StackTraceElement[]> key : allStackTraces.entrySet()) {
                if (eae.o0(((Thread) key.getKey()).getName(), "tracer-", false)) {
                    i5++;
                }
            }
            i = i5;
        }
        N.add(new b54(ate.c, new gqe(m0c.oneme_settings_thread_tracer, ys.m0(new Object[]{Integer.valueOf(i)})), woc.V0, (jqe) null, (fp3) null, 24));
        N.add(new b54(ate.d, new gqe(m0c.oneme_settings_thread_viewer_state, ys.m0(new Object[]{Integer.valueOf(i)})), woc.U1, (jqe) null, (fp3) null, 24));
        return N;
    }

    public wwc() {
        this.a = 0;
        this.b = r0e.a((Object) null);
    }
}
