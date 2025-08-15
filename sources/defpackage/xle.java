package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: xle  reason: default package */
public final /* synthetic */ class xle implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ yle b;

    public /* synthetic */ xle(yle yle, int i) {
        this.a = i;
        this.b = yle;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                x9d x9d = (x9d) obj;
                if (x9d != null) {
                    x9d.f(false);
                }
                return this.b.g();
            default:
                return yle.d(this.b, (x9d) obj);
        }
    }
}
