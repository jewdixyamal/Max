package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: mif  reason: default package */
public final class mif implements y3b {
    public final je7 X;
    public final v7c Y;
    public final w7c Z;
    public final kke a;
    public final nif b;
    public final je7 c;
    public final je7 o;

    public mif(sx3 sx3, je7 je7, je7 je72, je7 je73, kke kke, nif nif) {
        this.a = kke;
        this.b = nif;
        this.c = je7;
        this.o = je72;
        this.X = je73;
        v7c v7c = nif.Z;
        ap8 ap8 = new ap8(v7c, this, 16);
        nd2 nd2 = wld.b;
        ty j = i24.j(ap8, 0);
        kld a2 = lld.a(0, j.a, j.b);
        Symbol symbol = lld.a;
        j47.S(sx3, (lx3) j.o, tpa.f(nd2, wld.a) ? vx3.a : vx3.o, new iq5(nd2, (mn5) j.c, a2, symbol, (Continuation) null));
        this.Y = new v7c(a2);
        this.Z = od2.X(new ovc(v7c, 8), sx3, nd2, Float.valueOf(0.0f));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(defpackage.mif r12, defpackage.ijf r13, kotlin.coroutines.Continuation r14) {
        /*
            r12.getClass()
            boolean r0 = r14 instanceof defpackage.jif
            if (r0 == 0) goto L_0x0016
            r0 = r14
            jif r0 = (defpackage.jif) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x001b
        L_0x0016:
            jif r0 = new jif
            r0.<init>(r12, r14)
        L_0x001b:
            java.lang.Object r14 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            za9 r3 = defpackage.za9.a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x003d
            if (r2 != r4) goto L_0x0035
            java.lang.Object r12 = r0.o
            ijf r12 = (defpackage.ijf) r12
            defpackage.od2.a0(r14)
            goto L_0x00aa
        L_0x0035:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003d:
            ijf r13 = r0.X
            java.lang.Object r12 = r0.o
            mif r12 = (defpackage.mif) r12
            defpackage.od2.a0(r14)
            goto L_0x006d
        L_0x0047:
            defpackage.od2.a0(r14)
            int r14 = r13.X
            r2 = 5
            if (r14 != r2) goto L_0x0052
        L_0x004f:
            r1 = r3
            goto L_0x00d6
        L_0x0052:
            kke r14 = r12.a
            w9a r14 = (defpackage.w9a) r14
            nx3 r14 = r14.b()
            kif r2 = new kif
            r2.<init>(r12, r13, r6)
            r0.o = r12
            r0.X = r13
            r0.s0 = r5
            java.lang.Object r14 = defpackage.j47.t0(r14, r2, r0)
            if (r14 != r1) goto L_0x006d
            goto L_0x00d6
        L_0x006d:
            cu8 r14 = (defpackage.cu8) r14
            if (r14 != 0) goto L_0x0072
            goto L_0x004f
        L_0x0072:
            je7 r2 = r12.X
            java.lang.Object r2 = r2.getValue()
            q33 r2 = (defpackage.q33) r2
            hyc r2 = (defpackage.hyc) r2
            long r2 = r2.t()
            long r7 = r14.Y
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x008f
            int r12 = defpackage.dpc.E
            eqe r14 = new eqe
            r14.<init>(r12)
        L_0x008d:
            r7 = r14
            goto L_0x00bd
        L_0x008f:
            kke r2 = r12.a
            w9a r2 = (defpackage.w9a) r2
            nx3 r2 = r2.b()
            lif r3 = new lif
            r3.<init>(r12, r14, r6)
            r0.o = r13
            r0.X = r6
            r0.s0 = r4
            java.lang.Object r14 = defpackage.j47.t0(r2, r3, r0)
            if (r14 != r1) goto L_0x00a9
            goto L_0x00d6
        L_0x00a9:
            r12 = r13
        L_0x00aa:
            uj3 r14 = (defpackage.uj3) r14
            if (r14 == 0) goto L_0x00b2
            java.lang.String r6 = r14.d()
        L_0x00b2:
            if (r6 != 0) goto L_0x00b6
            java.lang.String r6 = ""
        L_0x00b6:
            iqe r14 = new iqe
            r14.<init>(r6)
            r13 = r12
            goto L_0x008d
        L_0x00bd:
            int r12 = defpackage.b1c.videomsg_player_type
            eqe r8 = new eqe
            r8.<init>(r12)
            int r12 = r13.X
            if (r12 == r4) goto L_0x00cd
            r13 = 3
            if (r12 != r13) goto L_0x00cc
            goto L_0x00cd
        L_0x00cc:
            r5 = 0
        L_0x00cd:
            r10 = r5
            ab9 r1 = new ab9
            r9 = 0
            r11 = 2
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x00d6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mif.e(mif, ijf, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void a() {
        nif nif = this.b;
        dkf dkf = nif.X;
        if (dkf == null || !dkf.b()) {
            dkf dkf2 = nif.X;
            if (dkf2 != null) {
                dkf2.play();
                return;
            }
            return;
        }
        dkf dkf3 = nif.X;
        if (dkf3 != null) {
            dkf3.pause();
        }
    }

    public final void b() {
        dkf dkf = this.b.X;
        if (dkf != null) {
            dkf.N0();
        }
    }

    public final void c(d3b d3b) {
    }

    public final c64 d(Long l, boolean z) {
        ijf ijf;
        if (l == null || (ijf = (ijf) x53.i0(this.b.Z.a.b())) == null) {
            return null;
        }
        n0b n0b = n0b.c;
        long longValue = l.longValue();
        n0b.getClass();
        return n0b.Z1(longValue, ijf.a, z);
    }
}
