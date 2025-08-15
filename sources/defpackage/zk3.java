package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: zk3  reason: default package */
public final class zk3 extends z12 {
    public final je7 j;
    public final je7 k;
    public final je7 l;
    public final mn5 m;
    public final kld n;
    public final v7c o;
    public final AtomicLong p = new AtomicLong();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zk3(long j2, sx3 sx3) {
        super(j2, sx3);
        sx3 sx32 = sx3;
        neb neb = neb.a;
        je7 d = neb.d();
        khe d2 = neb.getAccessor().d(ds3.class);
        khe khe = new khe(new zf3(2));
        je7 b = neb.b();
        khe khe2 = new khe(new zf3(3));
        khe d3 = neb.getAccessor().d(rh0.class);
        this.j = d;
        this.k = khe;
        this.l = b;
        khe khe3 = (khe) d;
        this.m = od2.F(new j31(new t03(this.c, 11), this.d, uk3.s0, 4), ((w9a) ((kke) khe3.getValue())).a());
        kld b2 = lld.b(0, 0, 0, 7);
        this.n = b2;
        this.o = new v7c(b2);
        od2.L(od2.F(new zn5(this.i, new mk3(this, (Continuation) null), 5), ((w9a) ((kke) khe3.getValue())).a()), sx32);
        od2.L(od2.F(new zn5(new qk3(new mqc(new tk3(new t03(((ds3) d2.getValue()).c(j2), 11), (Continuation) null, this)), this, 0), new lq0(2, this, zk3.class, "emitState", "emitState(Lone/me/profileedit/screens/changelink/ChangeLink$State;)V", 4, 12), 5), ((w9a) ((kke) khe3.getValue())).b()), sx32);
        od2.L(new zn5(new qk3(((rh0) d3.getValue()).b, this, 1), new vw(2, this, zk3.class, "handleError", "handleError(Lone/me/profileedit/screens/changelink/ChangeLinkErrors;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 16), 5), sx32);
        od2.L(new zn5(new v7c(((dfb) khe2.getValue()).a), new nk3(this, (Continuation) null), 5), sx32);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r7 = android.net.Uri.parse(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.p22 m(defpackage.zk3 r6, defpackage.uj3 r7) {
        /*
            r6.getClass()
            p22 r6 = new p22
            ql3 r7 = r7.a
            pl3 r7 = r7.c
            java.lang.String r7 = r7.p
            if (r7 == 0) goto L_0x0019
            android.net.Uri r7 = android.net.Uri.parse(r7)
            if (r7 == 0) goto L_0x0019
            java.lang.String r7 = r7.getLastPathSegment()
        L_0x0017:
            r2 = r7
            goto L_0x001b
        L_0x0019:
            r7 = 0
            goto L_0x0017
        L_0x001b:
            int r1 = defpackage.vea.f2
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk3.m(zk3, uj3):p22");
    }

    public final void b() {
    }

    public final mn5 f() {
        return this.m;
    }

    public final Object j(Continuation continuation) {
        p22 p22 = (p22) this.i.getValue();
        e5f e5f = e5f.a;
        if (p22 == null) {
            return e5f;
        }
        tx3 tx3 = tx3.a;
        if (p22.e) {
            Object a = this.f.a(new ucb(p22.c, (Integer) null, 14), continuation);
            return a == tx3 ? a : e5f;
        }
        String str = p22.b;
        String obj = str != null ? w9e.b1(str).toString() : null;
        if (obj == null || obj.length() == 0) {
            str = "$REMOVE$";
        }
        Object t0 = j47.t0(((w9a) ((kke) this.j.getValue())).b(), new vk3(this, str, (Continuation) null), continuation);
        return t0 == tx3 ? t0 : e5f;
    }

    public final void k(String str) {
        j47.T(this.b, ((w9a) ((kke) this.j.getValue())).c().getImmediate(), (vx3) null, new yk3(this, str, (Continuation) null), 2);
    }

    public final Object n(e22 e22, Continuation continuation) {
        boolean f = tpa.f(e22, b22.a);
        e5f e5f = e5f.a;
        tx3 tx3 = tx3.a;
        kld kld = this.f;
        if (f) {
            Object a = kld.a(new ucb(new eqe(vea.i2), new eqe(vea.g2), true, new Integer(woc.I)), continuation);
            return a == tx3 ? a : e5f;
        } else if (tpa.f(e22, c22.a)) {
            Object a2 = kld.a(new ucb(new eqe(vea.j2), new eqe(vea.h2), true, new Integer(woc.I)), continuation);
            return a2 == tx3 ? a2 : e5f;
        } else if (e22 instanceof a22) {
            Object a3 = kld.a(new ucb(((a22) e22).a, (Integer) null, 14), continuation);
            return a3 == tx3 ? a3 : e5f;
        } else if (e22 instanceof d22) {
            Object a4 = kld.a(new ucb(((d22) e22).a, (Integer) null, 14), continuation);
            return a4 == tx3 ? a4 : e5f;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
