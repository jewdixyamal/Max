package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: i3e  reason: default package */
public final class i3e extends pnf {
    public static final /* synthetic */ bc7[] H0;
    public final w7c A0;
    public final q0e B0;
    public final w7c C0;
    public final w4d D0;
    public final w4d E0;
    public final w4d F0;
    public final w4d G0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final long b;
    public final kke c;
    public final je7 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final s35 v0 = new s35(0);
    public final s35 w0 = new s35(0);
    public final q0e x0;
    public final w7c y0;
    public final q0e z0;

    static {
        Class<i3e> cls = i3e.class;
        H0 = new bc7[]{new oi9(cls, "loadStickerJob", "getLoadStickerJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "loadChatTitleJob", "getLoadChatTitleJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "markFavoriteJob", "getMarkFavoriteJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "markStickerSetFavoriteJob", "getMarkStickerSetFavoriteJob()Lkotlinx/coroutines/Job;")};
    }

    public i3e(long j, kke kke, je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77) {
        this.b = j;
        this.c = kke;
        this.o = je7;
        this.X = je72;
        this.Y = je73;
        this.Z = je74;
        this.s0 = je75;
        this.t0 = je76;
        this.u0 = je77;
        q0e a = r0e.a((Object) null);
        this.x0 = a;
        this.y0 = new w7c(a);
        q0e a2 = r0e.a("");
        this.z0 = a2;
        this.A0 = new w7c(a2);
        q0e a3 = r0e.a((Object) null);
        this.B0 = a3;
        this.C0 = new w7c(a3);
        this.D0 = mqd.D();
        this.E0 = mqd.D();
        this.F0 = mqd.D();
        this.G0 = mqd.D();
    }

    public final void q(Long l) {
        z2e z2e = (z2e) this.x0.getValue();
        if (z2e != null) {
            long j = z2e.b;
            if (j != 0) {
                kq1 c2 = c37.c(((a4e) this.X.getValue()).b(j));
                sc5 sc5 = (sc5) this.Z.getValue();
                sc5.getClass();
                c10 c10 = new c10(j, 15);
                ml0 ml0 = sc5.s0;
                ml0.getClass();
                od2.L(od2.F(new zn5(new j31(c2, c37.c(new e0a(ml0, c10, 1)), d3e.s0, 4), new e3e(this, l, (Continuation) null), 5), ((w9a) this.c).b()), this.a);
                return;
            }
        }
        hm9.m(i3e.class.getName(), "Can't load sticker set because we haven't selected sticker or setId", new Object[0]);
    }

    public final z2e r(d2e d2e, boolean z, Long l) {
        d2e d2e2 = d2e;
        String str = d2e2.s0;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            str = d2e2.o;
        }
        String str2 = str;
        boolean z2 = l != null && l.longValue() == d2e2.a;
        String str3 = ((se5) ((qe5) this.u0.getValue())).w() ? d2e2.z0 : null;
        int i = d2e2.c;
        long j = d2e2.a;
        long j2 = d2e2.v0;
        return new z2e(j, j2, j2, str2, d2e2.w0, str3, d2e2.b, i, z, z2, 0, 4672);
    }

    public final void s(long j) {
        z2e z2e = (z2e) this.y0.a.getValue();
        if (z2e == null || z2e.a != j) {
            vxd S = j47.S(this.a, ((w9a) this.c).b(), vx3.b, new f3e(this, j, (Continuation) null));
            this.D0.o1(this, H0[0], S);
        }
    }
}
