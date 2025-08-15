package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: d0f  reason: default package */
public final class d0f implements su0 {
    public static final hme c = new hme(18);
    public final qze a;
    public final zw6 b;

    public d0f(qze qze) {
        this.a = qze;
        wmd.i(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        int i2 = 0;
        while (i < qze.a) {
            Integer valueOf = Integer.valueOf(i);
            int i3 = i2 + 1;
            if (objArr.length < i3) {
                objArr = Arrays.copyOf(objArr, pw6.h(objArr.length, i3));
            }
            objArr[i2] = valueOf;
            i++;
            i2 = i3;
        }
        this.b = zw6.h(i2, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0f.class != obj.getClass()) {
            return false;
        }
        d0f d0f = (d0f) obj;
        return this.a.equals(d0f.a) && this.b.equals(d0f.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public d0f(qze qze, List list) {
        if (list.isEmpty() || (((Integer) Collections.min(list)).intValue() >= 0 && ((Integer) Collections.max(list)).intValue() < qze.a)) {
            this.a = qze;
            this.b = zw6.j(list);
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
