package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: vid  reason: default package */
public final class vid extends pnf {
    public static final /* synthetic */ bc7[] w0;
    public final je7 X;
    public final je7 Y;
    public final q0e Z;
    public final Context b;
    public final je7 c;
    public final je7 o;
    public final w7c s0;
    public final w4d t0 = mqd.D();
    public final w4d u0 = mqd.D();
    public final s35 v0 = new s35(0);

    static {
        Class<vid> cls = vid.class;
        w0 = new bc7[]{new oi9(cls, "mediaCachingTimeJob", "getMediaCachingTimeJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "clearCacheJob", "getClearCacheJob()Lkotlinx/coroutines/Job;")};
    }

    public vid(je7 je7, je7 je72, je7 je73, je7 je74, Context context) {
        this.b = context;
        this.c = je7;
        this.o = je72;
        this.X = je73;
        this.Y = je74;
        q0e a = r0e.a((Object) null);
        this.Z = a;
        mn5 F = od2.F(new ap8(new t03(a, 11), this, 9), ((w9a) ((kke) je7.getValue())).a());
        ArrayList s = s();
        this.s0 = od2.X(F, this.a, wld.a, s);
        pnf.n(this, (lx3) null, (vx3) null, new pid(this, (Continuation) null), 3);
    }

    public static final void q(vid vid, long j) {
        pnf.o(vid.v0, new nid(new gqe(oha.r, ys.m0(new Object[]{are.w(j, false, vid.b)}))));
    }

    public static final Object r(vid vid, Continuation continuation) {
        Object t02 = j47.t0(((w9a) ((kke) vid.c.getValue())).b(), new sid(vid, (Continuation) null), continuation);
        return t02 == tx3.a ? t02 : e5f.a;
    }

    public final ArrayList s() {
        Object obj;
        dp3 dp3 = e78.o;
        int i = ((jp) this.o.getValue()).g.getInt("app.media.caching.time", 0);
        dp3.getClass();
        Iterator it = e78.Z.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (i == ((e78) obj).a) {
                break;
            }
        }
        e78 e78 = (e78) obj;
        return y53.N(new k1d(4, new eqe(oha.y), 0, (long) nha.E, new eqe(oha.x), new dfd(e78 != null ? new eqe(e78.c) : new iqe(""), (Integer) null), 16));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: uw0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: uw0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: uw0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: uw0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(int r12) {
        /*
            r11 = this;
            int r0 = defpackage.nha.E
            r1 = 0
            s35 r2 = r11.v0
            r3 = 0
            if (r12 != r0) goto L_0x004b
            int r11 = defpackage.oha.y
            eqe r12 = new eqe
            r12.<init>(r11)
            v25 r11 = defpackage.e78.Z
            java.util.ArrayList r0 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.z53.S(r11, r4)
            r0.<init>(r4)
            java.util.Iterator r11 = r11.iterator()
        L_0x0020:
            r4 = r11
            u1 r4 = (defpackage.u1) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0041
            java.lang.Object r4 = r4.next()
            e78 r4 = (defpackage.e78) r4
            lid r5 = new lid
            int r6 = r4.b
            eqe r7 = new eqe
            int r4 = r4.c
            r7.<init>(r4)
            r5.<init>(r6, r7, r1)
            r0.add(r5)
            goto L_0x0020
        L_0x0041:
            mid r11 = new mid
            r11.<init>(r12, r3, r0)
            defpackage.pnf.o(r2, r11)
            goto L_0x01ff
        L_0x004b:
            dp3 r0 = defpackage.e78.o
            r0.getClass()
            java.util.ArrayList r0 = defpackage.e78.X
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            boolean r0 = r0.contains(r4)
            bc7[] r4 = w0
            if (r0 == 0) goto L_0x0094
            v25 r0 = defpackage.e78.Z
            java.util.Iterator r0 = r0.iterator()
        L_0x0064:
            r2 = r0
            u1 r2 = (defpackage.u1) r2
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0079
            java.lang.Object r2 = r2.next()
            r5 = r2
            e78 r5 = (defpackage.e78) r5
            int r5 = r5.b
            if (r12 != r5) goto L_0x0064
            goto L_0x007a
        L_0x0079:
            r2 = r3
        L_0x007a:
            e78 r2 = (defpackage.e78) r2
            if (r2 != 0) goto L_0x007f
            return
        L_0x007f:
            uid r12 = new uid
            int r0 = r2.a
            r12.<init>(r11, r0, r3)
            r0 = 3
            vxd r12 = defpackage.pnf.n(r11, r3, r3, r12, r0)
            w4d r0 = r11.t0
            r1 = r4[r1]
            r0.o1(r11, r1, r12)
            goto L_0x01ff
        L_0x0094:
            qq9 r0 = defpackage.vw0.Y
            r0.getClass()
            java.util.ArrayList r0 = defpackage.vw0.Z
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            boolean r0 = r0.contains(r5)
            r5 = 1
            android.content.Context r6 = r11.b
            q0e r7 = r11.Z
            if (r0 == 0) goto L_0x013c
            v25 r11 = defpackage.vw0.w0
            java.util.Iterator r11 = r11.iterator()
        L_0x00b0:
            r0 = r11
            u1 r0 = (defpackage.u1) r0
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00c5
            java.lang.Object r0 = r0.next()
            r4 = r0
            vw0 r4 = (defpackage.vw0) r4
            int r4 = r4.a
            if (r12 != r4) goto L_0x00b0
            goto L_0x00c6
        L_0x00c5:
            r0 = r3
        L_0x00c6:
            vw0 r0 = (defpackage.vw0) r0
            if (r0 != 0) goto L_0x00cb
            return
        L_0x00cb:
            java.lang.Object r11 = r7.getValue()
            fx0 r11 = (defpackage.fx0) r11
            if (r11 == 0) goto L_0x013b
            java.util.List r11 = r11.b
            if (r11 == 0) goto L_0x013b
            java.util.Iterator r11 = r11.iterator()
        L_0x00db:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00ed
            java.lang.Object r12 = r11.next()
            r4 = r12
            uw0 r4 = (defpackage.uw0) r4
            vw0 r4 = r4.a
            if (r4 != r0) goto L_0x00db
            r3 = r12
        L_0x00ed:
            uw0 r3 = (defpackage.uw0) r3
            if (r3 == 0) goto L_0x013b
            long r11 = r3.b
            java.lang.String r11 = defpackage.are.w(r11, r1, r6)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            gqe r12 = new gqe
            java.util.List r11 = defpackage.ys.m0(r11)
            int r3 = r0.X
            r12.<init>(r3, r11)
            int r11 = defpackage.oha.k
            eqe r3 = new eqe
            r3.<init>(r11)
            lid r11 = new lid
            int r4 = defpackage.oha.h
            eqe r6 = new eqe
            r6.<init>(r4)
            int r4 = r0.b
            r11.<init>(r4, r6, r5)
            lid r4 = new lid
            int r5 = defpackage.oha.g
            eqe r6 = new eqe
            r6.<init>(r5)
            int r0 = r0.c
            r4.<init>(r0, r6, r1)
            lid[] r11 = new defpackage.lid[]{r11, r4}
            java.util.List r11 = defpackage.y53.M(r11)
            mid r0 = new mid
            r0.<init>(r12, r3, r11)
            defpackage.pnf.o(r2, r0)
            goto L_0x01ff
        L_0x013b:
            return
        L_0x013c:
            java.util.ArrayList r0 = defpackage.vw0.s0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            boolean r0 = r0.contains(r8)
            w4d r8 = r11.u0
            r9 = 2
            je7 r10 = r11.c
            if (r0 == 0) goto L_0x018b
            v25 r0 = defpackage.vw0.w0
            r0.getClass()
            u1 r1 = new u1
            r2 = 0
            r1.<init>(r2, r0)
        L_0x0158:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x016a
            java.lang.Object r0 = r1.next()
            r2 = r0
            vw0 r2 = (defpackage.vw0) r2
            int r2 = r2.b
            if (r12 != r2) goto L_0x0158
            goto L_0x016b
        L_0x016a:
            r0 = r3
        L_0x016b:
            vw0 r0 = (defpackage.vw0) r0
            if (r0 != 0) goto L_0x0170
            return
        L_0x0170:
            java.lang.Object r12 = r10.getValue()
            kke r12 = (defpackage.kke) r12
            w9a r12 = (defpackage.w9a) r12
            nx3 r12 = r12.b()
            rid r1 = new rid
            r1.<init>(r0, r11, r3)
            vxd r12 = defpackage.pnf.n(r11, r12, r3, r1, r9)
            r0 = r4[r5]
            r8.o1(r11, r0, r12)
            goto L_0x01ff
        L_0x018b:
            int r0 = defpackage.nha.r
            if (r12 != r0) goto L_0x01e1
            java.lang.Object r11 = r7.getValue()
            fx0 r11 = (defpackage.fx0) r11
            if (r11 == 0) goto L_0x01e0
            long r11 = r11.a
            java.lang.String r11 = defpackage.are.w(r11, r1, r6)
            int r12 = defpackage.oha.i
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            gqe r0 = new gqe
            java.util.List r11 = defpackage.ys.m0(r11)
            r0.<init>(r12, r11)
            int r11 = defpackage.oha.k
            eqe r12 = new eqe
            r12.<init>(r11)
            lid r11 = new lid
            int r3 = defpackage.nha.b
            int r4 = defpackage.oha.h
            eqe r6 = new eqe
            r6.<init>(r4)
            r11.<init>(r3, r6, r5)
            lid r3 = new lid
            int r4 = defpackage.nha.a
            int r5 = defpackage.oha.g
            eqe r6 = new eqe
            r6.<init>(r5)
            r3.<init>(r4, r6, r1)
            lid[] r11 = new defpackage.lid[]{r11, r3}
            java.util.List r11 = defpackage.y53.M(r11)
            mid r1 = new mid
            r1.<init>(r0, r12, r11)
            defpackage.pnf.o(r2, r1)
            goto L_0x01ff
        L_0x01e0:
            return
        L_0x01e1:
            int r0 = defpackage.nha.b
            if (r12 != r0) goto L_0x01ff
            java.lang.Object r12 = r10.getValue()
            kke r12 = (defpackage.kke) r12
            w9a r12 = (defpackage.w9a) r12
            nx3 r12 = r12.b()
            qid r0 = new qid
            r0.<init>(r11, r3)
            vxd r12 = defpackage.pnf.n(r11, r12, r3, r0, r9)
            r0 = r4[r5]
            r8.o1(r11, r0, r12)
        L_0x01ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vid.t(int):void");
    }
}
