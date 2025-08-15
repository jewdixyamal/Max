package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: m5e  reason: default package */
public final /* synthetic */ class m5e implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ t4e b;

    public /* synthetic */ m5e(t4e t4e, int i) {
        this.a = i;
        this.b = t4e;
    }

    public final Object apply(Object obj) {
        l5e l5e = (l5e) obj;
        switch (this.a) {
            case 0:
                return new l5e(l5e.a, this.b.b);
            default:
                return new l5e(l5e.a, this.b.b);
        }
    }
}
