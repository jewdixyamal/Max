package defpackage;

import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: s98  reason: default package */
public final /* synthetic */ class s98 implements km7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m4b b;

    public /* synthetic */ s98(m4b m4b, int i) {
        this.a = i;
        this.b = m4b;
    }

    public final void invoke(Object obj) {
        n3b n3b = (n3b) obj;
        switch (this.a) {
            case 0:
                n3b.a(this.b.x);
                return;
            case 1:
                n3b.n(this.b.v);
                return;
            case 2:
                n3b.p0(this.b.g);
                return;
            case 3:
                n3b.onRepeatModeChanged(this.b.h);
                return;
            case 4:
                n3b.O(this.b.i);
                return;
            case 5:
                n3b.c0(this.b.m);
                return;
            case 6:
                n3b.f(this.b.n);
                return;
            case 7:
                n3b.u(this.b.o);
                return;
            case 8:
                n3b.k(this.b.p.a);
                return;
            case 9:
                n3b.S(this.b.p);
                return;
            case 10:
                n3b.t0(this.b.q);
                return;
            case 11:
                m4b m4b = this.b;
                n3b.i(m4b.r, m4b.s);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                n3b.v(this.b.l);
                return;
            case 13:
                n3b.a0(this.b.A);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                n3b.d0(this.b.B);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                n3b.u0(this.b.C);
                return;
            case 16:
                n3b.y(this.b.E);
                return;
            case LangUtils.HASH_SEED /*17*/:
                n3b.X(this.b.D);
                return;
            case 18:
                n3b.b0(this.b.z);
                return;
            case 19:
                n3b.c(this.b.w);
                return;
            default:
                n3b.h(this.b.y);
                return;
        }
    }
}
