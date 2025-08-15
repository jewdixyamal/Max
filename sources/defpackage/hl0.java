package defpackage;

import android.os.Build;

/* renamed from: hl0  reason: default package */
public final class hl0 extends qi3 {
    public final /* synthetic */ int f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl0(ej3 ej3, int i) {
        super(ej3);
        this.f = i;
    }

    public final boolean a(h8g h8g) {
        switch (this.f) {
            case 0:
                return h8g.j.b;
            case 1:
                return h8g.j.d;
            case 2:
                return h8g.j.a == 2;
            case 3:
                int i = h8g.j.a;
                return i == 3 || (Build.VERSION.SDK_INT >= 30 && i == 6);
            default:
                return h8g.j.e;
        }
    }

    public final boolean b(Object obj) {
        switch (this.f) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                xn9 xn9 = (xn9) obj;
                return !xn9.a || !xn9.b;
            case 3:
                xn9 xn92 = (xn9) obj;
                return !xn92.a || xn92.c;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }
}
