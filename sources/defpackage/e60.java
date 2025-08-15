package defpackage;

import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: e60  reason: default package */
public final class e60 implements y3b {
    public static final /* synthetic */ bc7[] u0;
    public final kld X;
    public final v7c Y;
    public final w7c Z;
    public final kke a;
    public final t50 b;
    public final ch9 c;
    public final sx3 o;
    public final w4d s0 = mqd.D();
    public final bkg t0 = new bkg(3, new x5(17, this));

    static {
        oi9 oi9 = new oi9(e60.class, "updatePlayerJob", "getUpdatePlayerJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        u0 = new bc7[]{oi9};
    }

    public e60(kke kke, t50 t50, ch9 ch9, sx3 sx3) {
        this.a = kke;
        this.b = t50;
        this.c = ch9;
        this.o = sx3;
        kld b2 = lld.b(1, 0, 0, 6);
        this.X = b2;
        this.Y = new v7c(b2);
        this.Z = ((uh9) ch9).H;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r3.intValue() != 3) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r3.intValue() != 2) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(defpackage.e60 r12, kotlin.coroutines.Continuation r13) {
        /*
            ch9 r0 = r12.c
            r1 = r0
            uh9 r1 = (defpackage.uh9) r1
            bh9 r2 = r1.n()
            tb8 r3 = r1.B
            e5f r4 = defpackage.e5f.a
            tx3 r5 = defpackage.tx3.a
            kld r12 = r12.X
            if (r3 == 0) goto L_0x0027
            gd8 r3 = r3.d
            if (r3 == 0) goto L_0x0027
            kj6 r6 = defpackage.ub8.a
            java.lang.Integer r3 = r3.H
            if (r3 != 0) goto L_0x001e
            goto L_0x0027
        L_0x001e:
            int r3 = r3.intValue()
            r6 = 2
            if (r3 != r6) goto L_0x0027
            goto L_0x008f
        L_0x0027:
            tb8 r3 = r1.B
            if (r3 == 0) goto L_0x003e
            gd8 r3 = r3.d
            if (r3 == 0) goto L_0x003e
            kj6 r6 = defpackage.ub8.a
            java.lang.Integer r3 = r3.H
            if (r3 != 0) goto L_0x0036
            goto L_0x003e
        L_0x0036:
            int r3 = r3.intValue()
            r6 = 3
            if (r3 != r6) goto L_0x003e
            goto L_0x008f
        L_0x003e:
            int r1 = r1.v
            r3 = 1
            if (r1 != r3) goto L_0x0044
            goto L_0x008f
        L_0x0044:
            if (r2 == 0) goto L_0x008f
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x004d
            goto L_0x008f
        L_0x004d:
            java.lang.CharSequence r1 = r2.a
            if (r1 != 0) goto L_0x0053
            java.lang.String r1 = ""
        L_0x0053:
            iqe r7 = new iqe
            r7.<init>(r1)
            iqe r8 = new iqe
            java.lang.CharSequence r1 = r2.b
            r8.<init>(r1)
            uh9 r0 = (defpackage.uh9) r0
            boolean r10 = r0.x
            xxc r1 = defpackage.d3b.b
            float r0 = r0.F
            r1.getClass()
            r1 = 1071644672(0x3fe00000, float:1.75)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0074
            d3b r0 = defpackage.d3b.X
        L_0x0072:
            r9 = r0
            goto L_0x0080
        L_0x0074:
            r1 = 1067450368(0x3fa00000, float:1.25)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x007d
            d3b r0 = defpackage.d3b.o
            goto L_0x0072
        L_0x007d:
            d3b r0 = defpackage.d3b.c
            goto L_0x0072
        L_0x0080:
            ab9 r0 = new ab9
            r11 = 1
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r12 = r12.a(r0, r13)
            if (r12 != r5) goto L_0x0098
        L_0x008d:
            r4 = r12
            goto L_0x0098
        L_0x008f:
            za9 r0 = defpackage.za9.a
            java.lang.Object r12 = r12.a(r0, r13)
            if (r12 != r5) goto L_0x0098
            goto L_0x008d
        L_0x0098:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e60.e(e60, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a() {
        ch9 ch9 = this.c;
        boolean z = ((uh9) ch9).x;
        t50 t50 = this.b;
        if (z) {
            ((uh9) t50.a).q();
        } else if (((uh9) ch9).w) {
            ((uh9) t50.a).r();
        }
    }

    public final void b() {
        ((uh9) this.c).t();
        j47.T(this.o, ((w9a) this.a).a(), (vx3) null, new b60(this, (Continuation) null), 2);
    }

    public final void c(d3b d3b) {
        v25 v25 = d3b.Z;
        float f = ((d3b) v25.get((d3b.ordinal() + 1) % v25.getSize())).a;
        uh9 uh9 = (uh9) this.c;
        uh9.getClass();
        j47.T(uh9.h, (lx3) null, (vx3) null, new rh9(uh9, f, (Continuation) null), 3);
    }

    public final c64 d(Long l, boolean z) {
        Map map;
        bh9 n = ((uh9) this.c).n();
        if (!(n == null || (map = n.c) == null)) {
            Object obj = map.get("MediaMetadata.Extra.MESSAGE_ID");
            Long l2 = obj instanceof Long ? (Long) obj : null;
            if (l2 != null) {
                long longValue = l2.longValue();
                if (l == null) {
                    Object obj2 = map.get("MediaMetadata.Extra.CHAT_ID");
                    Long l3 = obj2 instanceof Long ? (Long) obj2 : null;
                    if (l3 == null) {
                        return null;
                    }
                    long longValue2 = l3.longValue();
                    n0b.c.getClass();
                    return n0b.Z1(longValue2, longValue, z);
                }
                n0b n0b = n0b.c;
                long longValue3 = l.longValue();
                n0b.getClass();
                return n0b.Z1(longValue3, longValue, z);
            }
        }
        return null;
    }
}
