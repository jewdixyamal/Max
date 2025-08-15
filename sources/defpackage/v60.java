package defpackage;

import java.util.List;

/* renamed from: v60  reason: default package */
public final /* synthetic */ class v60 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;

    public /* synthetic */ v60(Object obj, Object obj2, long j, long j2, int i) {
        this.a = i;
        this.X = obj;
        this.b = obj2;
        this.c = j;
        this.o = j2;
    }

    public final void run() {
        Object obj = this.b;
        Object obj2 = this.X;
        switch (this.a) {
            case 0:
                ph4 ph4 = (ph4) obj2;
                ph4.getClass();
                int i = maf.a;
                h74 h74 = ((n75) ph4.b).a.C0;
                ed P = h74.P();
                h74.Q(P, 1008, new yv3(P, (String) obj, this.o, this.c));
                return;
            case 1:
                qz7 qz7 = (qz7) obj2;
                qz7.getClass();
                int i2 = oaf.a;
                i74 i74 = ((o75) qz7.c).a.D0;
                fd F = i74.F();
                i74.I(F, 1008, new r64(F, (String) obj, this.o, this.c, 0));
                return;
            case 2:
                for (fs8 f : (List) obj2) {
                    ((vlc) obj).f(this.c, this.o, f, false);
                }
                return;
            case 3:
                aab aab = (aab) obj2;
                aab.getClass();
                int i3 = oaf.a;
                i74 i742 = ((o75) aab.b).a.D0;
                fd F2 = i742.F();
                i742.I(F2, 1016, new r64(F2, (String) obj, this.o, this.c, 2));
                return;
            default:
                wva wva = (wva) obj2;
                wva.getClass();
                int i4 = maf.a;
                h74 h742 = ((n75) wva.c).a.C0;
                ed P2 = h742.P();
                h742.Q(P2, 1016, new m82(P2, (String) obj, this.o, this.c));
                return;
        }
    }
}
