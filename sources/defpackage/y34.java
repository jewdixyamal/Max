package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: y34  reason: default package */
public final class y34 extends ema {
    public static final y34 e = new y34(0);
    public static final y34 f = new y34(1);
    public static final y34 g = new y34(2);
    public static final y34 h = new y34(3);
    public final /* synthetic */ int d;

    public /* synthetic */ y34(int i) {
        this.d = i;
    }

    public final boolean d(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((x34) obj).equals((x34) obj2);
            case 1:
                return ((v86) obj).equals((v86) obj2);
            case 2:
                return ((qte) obj).equals((qte) obj2);
            case 3:
                return ((q4d) obj).equals((q4d) obj2);
            case 4:
                return ((sb8) obj).equals((sb8) obj2);
            case 5:
                return ((yq3) obj).equals((yq3) obj2);
            case 6:
                y5a y5a = (y5a) obj;
                y5a y5a2 = (y5a) obj2;
                return tpa.f(y5a.a, y5a2.a) && tpa.f(y5a.d, y5a2.d) && eae.h0(y5a.b, y5a2.b);
            case 7:
                List list = (List) obj;
                List list2 = (List) obj2;
                return false;
            case 8:
                izc izc = (izc) obj;
                izc izc2 = (izc) obj2;
                if (!new xs((Collection) izc.b).equals(new xs((Collection) izc2.b))) {
                    return false;
                }
                return izc.k(izc2);
            default:
                return ((ol7) obj).t((ol7) obj2);
        }
    }

    public final boolean e(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((x34) obj).a == ((x34) obj2).a;
            case 1:
                return tpa.f(((v86) obj).a(), ((v86) obj2).a());
            case 2:
                return ((qte) obj).a == ((qte) obj2).a;
            case 3:
                return ((q4d) obj).a.a == ((q4d) obj2).a.a;
            case 4:
                return ((sb8) obj).h((sb8) obj2);
            case 5:
                return ((yq3) obj).a == ((yq3) obj2).a;
            case 6:
                return tpa.f(((y5a) obj).a, ((y5a) obj2).a);
            case 7:
                List list = (List) obj;
                List list2 = (List) obj2;
                return false;
            case 8:
                izc izc = (izc) obj;
                izc izc2 = (izc) obj2;
                if (izc.a != izc2.a) {
                    return false;
                }
                return izc.m(izc2);
            default:
                return ((ol7) obj).h((ol7) obj2);
        }
    }

    public Object r(Object obj, Object obj2) {
        switch (this.d) {
            case 9:
                return ((ol7) obj).n((ol7) obj2);
            default:
                return super.r(obj, obj2);
        }
    }
}
