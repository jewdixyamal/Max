package defpackage;

import java.util.List;

/* renamed from: uf2  reason: default package */
public final /* synthetic */ class uf2 implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zf2 b;
    public final /* synthetic */ gf2 c;

    public /* synthetic */ uf2(zf2 zf2, gf2 gf2, int i) {
        this.a = i;
        this.b = zf2;
        this.c = gf2;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                zf2 zf2 = this.b;
                zf2.getClass();
                gf2 gf2 = this.c;
                zf2.f(new wf2((List) obj, true, false, gf2.c, gf2.o, gf2.X));
                return;
            default:
                zf2 zf22 = this.b;
                zf22.getClass();
                gf2 gf22 = this.c;
                zf22.f(new wf2((List) obj, false, false, gf22.c, gf22.o, gf22.X));
                return;
        }
    }
}
