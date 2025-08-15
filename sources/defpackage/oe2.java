package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.UnaryOperator;

/* renamed from: oe2  reason: default package */
public final /* synthetic */ class oe2 implements UnaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ oe2(int i) {
        this.a = i;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                ne2 ne2 = (ne2) obj;
                return null;
            case 1:
                ne2 ne22 = (ne2) obj;
                if (ne22 == null) {
                    return null;
                }
                return new ne2(ne22.a, ne22.b, ne22.c, ne22.d, true);
            case 2:
                Set set = (Set) obj;
                return new LinkedHashSet();
            case 3:
                Set set2 = (Set) obj;
                return new LinkedHashSet();
            case 4:
                gi9 gi9 = (gi9) obj;
                return vv7.a();
            case 5:
                Set set3 = (Set) obj;
                return new LinkedHashSet();
            case 6:
                gi9 gi92 = (gi9) obj;
                return vv7.a();
            case 7:
                y79 y79 = (y79) obj;
                bc7[] bc7Arr = l89.p;
                return null;
            case 8:
                y79 y792 = (y79) obj;
                return null;
            case 9:
                String str = (String) obj;
                return String.valueOf(System.currentTimeMillis());
            case 10:
                Set set4 = (Set) obj;
                return wz4.a;
            case 11:
                l5e l5e = (l5e) obj;
                return new l5e((String) null, 3);
            default:
                x9d x9d = (x9d) obj;
                if (x9d != null) {
                    x9d.f(true);
                }
                return null;
        }
    }
}
