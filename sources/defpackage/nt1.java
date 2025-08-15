package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: nt1  reason: default package */
public final /* synthetic */ class nt1 implements wu {
    public final /* synthetic */ int X;
    public final /* synthetic */ st1 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;

    public /* synthetic */ nt1(st1 st1, ArrayList arrayList, int i, int i2, int i3) {
        this.a = st1;
        this.b = arrayList;
        this.c = i;
        this.o = i2;
        this.X = i3;
    }

    public final bm7 apply(Object obj) {
        Void voidR = (Void) obj;
        u40 u40 = this.a.n;
        int i = this.X;
        int i2 = this.c;
        int i3 = this.o;
        su1 e = u40.e(i2, i3, i);
        b76 a2 = b76.a(e.a(i3));
        ui0 ui0 = new ui0((Object) e, (Object) (ArrayList) this.b, i3, 1);
        a2.getClass();
        Executor executor = e.b;
        k12 K = kq0.K(a2, ui0, executor);
        K.d(new cu1(1, e), executor);
        return kq0.w(K);
    }
}
