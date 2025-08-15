package defpackage;

import java.util.function.Predicate;

/* renamed from: au5  reason: default package */
public final /* synthetic */ class au5 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ m56 b;

    public /* synthetic */ au5(int i, m56 m56) {
        this.a = i;
        this.b = m56;
    }

    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Boolean) this.b.invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) this.b.invoke(obj)).booleanValue();
            case 2:
                return ((Boolean) this.b.invoke(obj)).booleanValue();
            default:
                return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }
}
