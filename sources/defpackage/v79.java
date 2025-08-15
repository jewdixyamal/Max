package defpackage;

import java.util.Set;
import java.util.function.UnaryOperator;

/* renamed from: v79  reason: default package */
public final /* synthetic */ class v79 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ v79(long j, int i) {
        this.a = i;
        this.b = j;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                y79 y79 = (y79) obj;
                return new y79(4, false, false, false, this.b, 0, 46);
            case 1:
                y79 y792 = (y79) obj;
                return new y79(3, false, false, true, this.b, 0, 38);
            case 2:
                y79 y793 = (y79) obj;
                return new y79(2, false, true, false, 0, this.b, 26);
            default:
                Set G0 = x53.G0((Set) obj);
                G0.removeIf(new au5(3, new jh2(this.b, 6)));
                return G0;
        }
    }
}
