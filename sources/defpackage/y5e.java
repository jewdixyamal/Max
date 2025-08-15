package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: y5e  reason: default package */
public final /* synthetic */ class y5e implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ u4e b;

    public /* synthetic */ y5e(u4e u4e, int i) {
        this.a = i;
        this.b = u4e;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                Long l = (Long) obj;
                return Long.valueOf(this.b.b);
            case 1:
                return new c6e(this.b.b, ((c6e) obj).b);
            default:
                return new c6e(this.b.b, ((c6e) obj).b);
        }
    }
}
