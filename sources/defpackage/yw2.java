package defpackage;

import java.util.Comparator;

/* renamed from: yw2  reason: default package */
public final class yw2 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Comparator b;

    public /* synthetic */ yw2(Comparator comparator, int i) {
        this.a = i;
        this.b = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int compare = this.b.compare(obj, obj2);
                return compare != 0 ? compare : xfg.f(Integer.valueOf(((nn3) obj2).z0), Integer.valueOf(((nn3) obj).z0));
            case 1:
                int compare2 = this.b.compare(obj, obj2);
                if (compare2 != 0) {
                    return compare2;
                }
                Thread thread = (Thread) obj;
                Thread thread2 = (Thread) obj2;
                return xfg.f(thread != null ? Long.valueOf(thread.getId()) : 0, thread2 != null ? Long.valueOf(thread2.getId()) : 0);
            case 2:
                int compare3 = this.b.compare(obj, obj2);
                return compare3 != 0 ? compare3 : xfg.f(Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(System.identityHashCode(obj2)));
            default:
                int compare4 = this.b.compare(obj, obj2);
                return compare4 != 0 ? compare4 : xfg.f(Integer.valueOf(((nn3) obj2).z0), Integer.valueOf(((nn3) obj).z0));
        }
    }
}
