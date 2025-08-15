package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ot1  reason: default package */
public final /* synthetic */ class ot1 implements wu, u98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ot1(Object obj, int i, int i2, int i3) {
        this.o = obj;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public bm7 apply(Object obj) {
        Void voidR = (Void) obj;
        u40 u40 = ((st1) this.o).n;
        int i = this.c;
        int i2 = this.a;
        int i3 = this.b;
        return kq0.r(new pu1(u40.e(i2, i3, i), (Executor) u40.g, i3));
    }

    public void c(qr6 qr6, int i) {
        qr6 qr62 = qr6;
        int i2 = i;
        qr62.A0(((w98) this.o).c, i2, this.a, this.b, this.c);
    }
}
