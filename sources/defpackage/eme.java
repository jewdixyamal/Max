package defpackage;

import java.util.Comparator;

/* renamed from: eme  reason: default package */
public final /* synthetic */ class eme implements Comparator {
    public final /* synthetic */ Iterable a;
    public final /* synthetic */ b66 b;

    public /* synthetic */ eme(Iterable iterable, b66 b66) {
        this.a = iterable;
        this.b = b66;
    }

    public final int compare(Object obj, Object obj2) {
        b66 b66 = this.b;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        for (Long l : this.a) {
            try {
                if (l.equals(b66.apply(obj))) {
                    i2 = i;
                } else if (l.equals(b66.apply(obj2))) {
                    i3 = i;
                }
                if (i2 != -1 && i3 != -1) {
                    break;
                }
                i++;
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }
}
