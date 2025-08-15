package defpackage;

import android.content.Intent;
import android.graphics.Point;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* renamed from: el1  reason: default package */
public final class el1 extends pnf {
    public final khe A0 = new khe(new ck1(this, 2));
    public final khe B0 = new khe(new ck1(this, 3));
    public final w7c C0;
    public final q0e D0;
    public final q0e E0;
    public final q0e F0;
    public final w7c G0;
    public final q0e H0;
    public final q0e I0;
    public final q0e J0;
    public final w7c K0;
    public final khe L0;
    public final s35 M0;
    public final w7c N0;
    public final w7c O0;
    public final je7 P0;
    public final je7 Q0;
    public final ty2 X;
    public final bn1 Y;
    public final eo1 Z;
    public final tta b;
    public final ir1 c;
    public final c11 o;
    public final z21 s0;
    public final ivc t0;
    public final je7 u0;
    public final je7 v0;
    public final w7c w0;
    public final q0e x0;
    public final khe y0 = new khe(new ck1(this, 0));
    public final khe z0 = new khe(new ck1(this, 1));

    /* JADX WARNING: type inference failed for: r14v14, types: [ffe, g66] */
    /* JADX WARNING: type inference failed for: r4v9, types: [a66, ffe] */
    public el1(je7 je7, tta tta, ir1 ir1, c11 c11, ty2 ty2, bn1 bn1, eo1 eo1, z21 z21, ivc ivc, je7 je72) {
        ir1 ir12 = ir1;
        eo1 eo12 = eo1;
        je7 je73 = iyc.l;
        this.b = tta;
        this.c = ir12;
        this.o = c11;
        this.X = ty2;
        this.Y = bn1;
        this.Z = eo12;
        this.s0 = z21;
        this.t0 = ivc;
        this.u0 = je72;
        this.v0 = je7;
        w7c w7c = ir12.o;
        this.w0 = w7c;
        q0e a = r0e.a(new la1());
        this.x0 = a;
        w7c w7c2 = new w7c(a);
        this.C0 = w7c2;
        this.D0 = r0e.a(oz4.a);
        nnf nnf = nnf.a;
        jp1 jp1 = r14;
        jp1 jp12 = new jp1(nnf, nz4.a, (w4f) null, (qd7) null, false, (md0) null, false);
        q0e a2 = r0e.a(new h41(jp1));
        this.E0 = a2;
        this.F0 = a2;
        j31 j31 = new j31(w7c, a, new c3(this, (Continuation) null, 5), 4);
        u9f u9f = u9f.o;
        c32 c32 = wld.a;
        this.G0 = od2.X(j31, this.a, c32, u9f);
        Boolean bool = Boolean.FALSE;
        this.H0 = r0e.a(bool);
        this.I0 = r0e.a(bool);
        q0e a3 = r0e.a(cn1.d);
        this.J0 = a3;
        this.K0 = new w7c(a3);
        khe khe = new khe(new dk1(0));
        this.L0 = khe;
        this.M0 = new s35(0);
        this.N0 = od2.X(new xk1(w7c, 0), this.a, c32, nnf);
        xk1 xk1 = new xk1(w7c, 1);
        ez0 ez0 = ir12.l;
        this.O0 = od2.X(od2.s(xk1, new xk1(((yz0) ez0).F0, 2), new xk1(ir1.b(), 3), ((yz0) ez0).t0, new ffe(5, (Continuation) null)), this.a, c32, bool);
        this.P0 = tu0.r(3, new ck1(this, 4));
        this.Q0 = tu0.r(3, new dk1(1));
        od2.L(new zn5(((ugf) khe.getValue()).d, new ffe(2, (Continuation) null), 5), this.a);
        od2.L(new zn5(eo12.j, new hk1(this, (Continuation) null), 5), this.a);
        od2.L(od2.s(ir12.c.e, w7c2, new xk1(ir1.e(), 4), new ac(ir1.e(), 9, this), new ik1(this, (Continuation) null, 0)), this.a);
        od2.L(new zn5(new xk1(ir1.f(), 5), new jk1(this, (Continuation) null), 5), this.a);
        j47.T(this.a, ((w9a) ((kke) je73.getValue())).a(), (vx3) null, new lk1(this, (Continuation) null), 2);
        j47.T(this.a, ((w9a) ((kke) je73.getValue())).a(), (vx3) null, new nk1(this, (Continuation) null), 2);
        mn5 e = ir1.e();
        mn5 qwVar = new qw(w7c, 26);
        mn5 qwVar2 = new qw(w7c2, 27);
        mn5 qwVar3 = new qw(w7c2, 28);
        mn5 qwVar4 = new qw(w7c2, 29);
        mn5[] mn5Arr = {e, qwVar, qwVar2, qwVar3, qwVar4};
        od2.L(new ac(mn5Arr, 22, new uk1(this, (Continuation) null)), this.a);
        od2.L(new zn5(((yz0) ez0).D0, new ok1(this, (Continuation) null), 5), this.a);
    }

    public final boolean q(boolean z) {
        return (!s().g && !z) || s().g || s().t;
    }

    public final void r() {
        Object value;
        q0e q0e = this.c.n;
        do {
            value = q0e.getValue();
        } while (!q0e.c(value, to1.a((to1) value, (gg1) null, (gg1) null, (gg1) null, (nnf) null, false, (u9f) null, 0, 247)));
    }

    public final la1 s() {
        return (la1) this.C0.a.getValue();
    }

    public final void t(boolean z) {
        q0e q0e;
        Object value;
        do {
            q0e = this.H0;
            value = q0e.getValue();
            ((Boolean) value).getClass();
        } while (!q0e.c(value, Boolean.valueOf(z)));
    }

    public final boolean u() {
        return ((Boolean) this.y0.getValue()).booleanValue();
    }

    public final void v(gg1 gg1) {
        fqa d = this.c.d();
        if (gg1.equals(d.a.getId()) || d.a.m()) {
            pnf.o(this.M0, new lj1(gg1));
        }
    }

    public final void w(boolean z, Intent intent) {
        Conversation a;
        ir1 ir1 = this.c;
        xuc xuc = ir1.h;
        if (!z || !xuc.c()) {
            if (z && (a = ((fw3) xuc.a.getValue()).a()) != null && !a.isDestroyed() && intent != null) {
                CameraManager a2 = ir1.e.a();
                if (a2 != null) {
                    a2.setCameraEnabled(false);
                }
                ir1.g.a = intent;
                xuc.b(true);
            } else if (!z && xuc.c()) {
                xuc.b(false);
            }
        }
        bt1 bt1 = (bt1) this.v0.getValue();
        boolean z2 = ((la1) this.C0.a.getValue()).g;
        bt1.getClass();
        bt1.c(bt1, "SCREEN_SHARE", (String) null, (String) null, Long.valueOf(z ? 1 : 0), (String) null, (String) null, z2, 54);
    }

    public final void x(gg1 gg1, Point point) {
        v31 a = this.Z.a(gg1, point);
        if (a != null) {
            ((bt1) this.v0.getValue()).a(gg1.a, (LinkedHashMap) a.c);
            pnf.o(this.M0, new tj1(a));
        }
    }
}
