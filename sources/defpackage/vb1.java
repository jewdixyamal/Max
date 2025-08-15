package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: vb1  reason: default package */
public final class vb1 extends pnf {
    public static final /* synthetic */ bc7[] B0;
    public static final kpa C0 = new kpa(oag.a("", Long.MIN_VALUE), e9f.c(x7a.J0).toString());
    public final s35 A0;
    public final tta X;
    public final je7 Y;
    public final je7 Z;
    public final String b;
    public final wva c;
    public final l5g o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0 = tu0.r(3, new x5(29, this));
    public final q0e w0;
    public final q0e x0;
    public final w4d y0;
    public volatile Long z0;

    static {
        oi9 oi9 = new oi9(vb1.class, "requestParticipantsJob", "getRequestParticipantsJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        B0 = new bc7[]{oi9};
    }

    public vb1(String str, wva wva, l5g l5g, tta tta, je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76) {
        this.b = str;
        this.c = wva;
        this.o = l5g;
        this.X = tta;
        this.Y = je7;
        this.Z = je74;
        this.s0 = je75;
        this.t0 = je76;
        this.u0 = je73;
        m38 m38 = m38.a;
        q0e a = r0e.a(new nb1((md0) null, m38, m38, true, new iqe(""), (List) null, (jqe) null));
        this.w0 = a;
        this.x0 = a;
        this.y0 = mqd.D();
        this.A0 = new s35(0);
        j47.T(this.a, ((w9a) ((kke) je73.getValue())).b(), (vx3) null, new lb1(this, (Continuation) null), 2);
        od2.L(new zn5(new qw(new v7c(((cs1) je72.getValue()).a), 21), new mb1(this, (Continuation) null), 5), this.a);
        if (this.z0 == null) {
            j47.T(this.a, (lx3) null, (vx3) null, new ob1(this, (Continuation) null), 3);
        }
    }

    public static final jqe q(vb1 vb1, List list, int i) {
        List i2;
        jl3 jl3;
        vb1.getClass();
        if (i == 0) {
            return new eqe(b8a.j2);
        }
        String str = null;
        if (i == 1) {
            uj3 uj3 = (uj3) x53.i0(list);
            if (!(uj3 == null || (i2 = uj3.i()) == null || (jl3 = (jl3) x53.i0(i2)) == null)) {
                str = jl3.a();
            }
            if (str == null) {
                str = "";
            }
            return new iqe(str);
        } else if (i != 2) {
            return new aqe(a8a.b, i);
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jl3 jl32 = (jl3) x53.i0(((uj3) it.next()).i());
                String str2 = jl32 != null ? jl32.a : null;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            return new iqe(x53.n0(arrayList, (String) null, (String) null, (String) null, (m56) null, 63));
        }
    }

    public final void r(boolean z) {
        q0e q0e;
        Object value;
        tta tta = this.X;
        eua a = tta.a();
        String[] strArr = eua.h;
        if (!a.b(strArr)) {
            eua a2 = tta.a();
            int i = b8a.E;
            a2.getClass();
            int i2 = j1c.permissions_audio_title;
            int i3 = oga.g;
            l5g l5g = this.o;
            if (eua.i(l5g, strArr)) {
                l5g.c(strArr, 160, i2, i, i3);
            } else {
                a2.f(l5g, strArr, 160);
            }
        } else {
            bt1 bt1 = (bt1) this.Z.getValue();
            long j = z ? 1 : 0;
            bt1.getClass();
            bt1.c(bt1, "AUDIO_ENABLED", (String) null, (String) null, Long.valueOf(j), (String) null, (String) null, true, 52);
            do {
                q0e = this.w0;
                value = q0e.getValue();
            } while (!q0e.c(value, nb1.a((nb1) value, (md0) null, !tta.a().b(eua.h) ? m38.X : z ? m38.b : m38.a, (m38) null, false, (jqe) null, (ArrayList) null, (jqe) null, 125)));
        }
    }

    public final void s(boolean z) {
        q0e q0e;
        Object value;
        tta tta = this.X;
        if (!tta.a().b(eua.l)) {
            tta.a().h(this.o);
            return;
        }
        bt1 bt1 = (bt1) this.Z.getValue();
        long j = z ? 1 : 0;
        bt1.getClass();
        bt1.c(bt1, "VIDEO_ENABLED", (String) null, (String) null, Long.valueOf(j), (String) null, (String) null, true, 52);
        do {
            q0e = this.w0;
            value = q0e.getValue();
        } while (!q0e.c(value, nb1.a((nb1) value, (md0) null, (m38) null, !tta.a().b(eua.l) ? m38.X : z ? m38.b : m38.a, false, (jqe) null, (ArrayList) null, (jqe) null, 123)));
    }
}
