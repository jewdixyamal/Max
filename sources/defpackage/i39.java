package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* renamed from: i39  reason: default package */
public final /* synthetic */ class i39 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n59 b;

    public /* synthetic */ i39(n59 n59, int i) {
        this.a = i;
        this.b = n59;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                n59 n59 = this.b;
                return new w5f(n59.o1, n59.q1, n59.a, n59.Y);
            default:
                n59 n592 = this.b;
                ContextScope contextScope = n592.a;
                return new l89(n592.b, n592.B0, contextScope, n592.o1, n592.q1, new vw(2, n592, n59.class, "processReactionEffect", "processReactionEffect(Ljava/util/Set;J)V", 0, 29), new wz7(8, n592));
        }
    }
}
