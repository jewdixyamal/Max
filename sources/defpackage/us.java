package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: us  reason: default package */
public final class us extends qpd implements Map {
    public rs X;
    public ts Y;
    public ps o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public us(qpd qpd) {
        super(0);
        int i = qpd.c;
        b(this.c + i);
        if (this.c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(qpd.f(i2), qpd.i(i2));
            }
        } else if (i > 0) {
            ys.V(0, 0, i, qpd.a, this.a);
            ys.W(0, 0, i << 1, qpd.b, this.b);
            this.c = i;
        }
    }

    public final Set entrySet() {
        ps psVar = this.o;
        if (psVar != null) {
            return psVar;
        }
        ps psVar2 = new ps(this);
        this.o = psVar2;
        return psVar2;
    }

    public final boolean j(Collection collection) {
        for (Object containsKey : collection) {
            if (!super.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.c;
        for (Object remove : collection) {
            super.remove(remove);
        }
        return i != this.c;
    }

    public final Set keySet() {
        rs rsVar = this.X;
        if (rsVar != null) {
            return rsVar;
        }
        rs rsVar2 = new rs(this);
        this.X = rsVar2;
        return rsVar2;
    }

    public final boolean l(Collection collection) {
        int i = this.c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(f(i2))) {
                g(i2);
            }
        }
        return i != this.c;
    }

    public final void putAll(Map map) {
        b(map.size() + this.c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Collection values() {
        ts tsVar = this.Y;
        if (tsVar != null) {
            return tsVar;
        }
        ts tsVar2 = new ts(this);
        this.Y = tsVar2;
        return tsVar2;
    }
}
