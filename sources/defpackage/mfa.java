package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: mfa  reason: default package */
public final class mfa extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ nfa o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public mfa(defpackage.nfa r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 1: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            efa r2 = defpackage.efa.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x000f:
            kfa r2 = defpackage.kfa.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mfa.<init>(nfa, int):void");
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    gfa gfa = (gfa) obj;
                    pq9 pq9 = qp4.u0;
                    nfa nfa = this.o;
                    nfa.setIndicatorColor(nfa.d((gfa) obj2, pq9.j(nfa)));
                    return;
                }
                return;
            default:
                if (!tpa.f(obj, obj2)) {
                    lfa lfa = (lfa) obj2;
                    lfa lfa2 = (lfa) obj;
                    boolean f = tpa.f(lfa, hfa.a);
                    nfa nfa2 = this.o;
                    if (f) {
                        nfa2.setIndicatorSize(tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density));
                        nfa2.setTrackThickness(tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density));
                    } else if (tpa.f(lfa, ifa.a)) {
                        nfa2.setIndicatorSize(tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density));
                        nfa2.setTrackThickness(tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density));
                    } else if (tpa.f(lfa, jfa.a)) {
                        nfa2.setIndicatorSize(tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density));
                        nfa2.setTrackThickness(tu0.G(((float) 1) * fk4.d().getDisplayMetrics().density));
                    } else if (!tpa.f(lfa, kfa.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nfa2.requestLayout();
                    nfa2.invalidate();
                    return;
                }
                return;
        }
    }
}
