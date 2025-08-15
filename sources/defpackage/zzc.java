package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: zzc  reason: default package */
public final /* synthetic */ class zzc implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Collection c;
    public final /* synthetic */ Collection d;

    public /* synthetic */ zzc(List list, Collection collection, Collection collection2, int i) {
        this.a = i;
        this.b = list;
        this.c = collection;
        this.d = collection2;
    }

    public final boolean test(Object obj) {
        boolean contains;
        switch (this.a) {
            case 0:
                kzc kzc = (kzc) obj;
                e52 e52 = kzc.o;
                if (e52 != null) {
                    contains = ((Set) this.c).contains(Long.valueOf(e52.a));
                } else {
                    uj3 uj3 = kzc.X;
                    if (uj3 == null) {
                        return true;
                    }
                    if (nd7.c(this.b, new c10(uj3.n(), 27))) {
                        return false;
                    }
                    contains = ((Set) this.d).contains(Long.valueOf(uj3.n()));
                }
                return true ^ contains;
            default:
                vpb vpb = (vpb) obj;
                f52 f52 = vpb.a;
                if (f52 != null) {
                    return ((List) this.c).contains(Long.valueOf(f52.a));
                }
                kq3 kq3 = vpb.c;
                if (kq3 == null) {
                    return false;
                }
                wm3 wm3 = kq3.a;
                if (nd7.c(this.b, new c10(wm3.a, 27))) {
                    return true;
                }
                return ((List) this.d).contains(Long.valueOf(wm3.a));
        }
    }
}
