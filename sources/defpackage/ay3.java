package defpackage;

import java.util.Set;

/* renamed from: ay3  reason: default package */
public final class ay3 extends s47 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ay3(String[] strArr, Object obj, int i) {
        super(strArr);
        this.b = i;
        this.c = obj;
    }

    public final void a(Set set) {
        switch (this.b) {
            case 0:
                ((e32) this.c).n(e5f.a);
                return;
            case 1:
                ds g0 = ds.g0();
                kmc kmc = ((lmc) this.c).u;
                if (g0.h0()) {
                    kmc.run();
                    return;
                } else {
                    g0.i0(kmc);
                    return;
                }
            default:
                ((ez9) ((uz9) this.c)).d(ngg.c);
                return;
        }
    }
}
