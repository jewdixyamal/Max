package defpackage;

import java.util.Map;

/* renamed from: hfc  reason: default package */
public final class hfc extends jx6 {
    public final transient Object[] X;
    public final transient int Y;
    public final transient int Z;
    public final transient cx6 o;

    public hfc(cx6 cx6, Object[] objArr, int i, int i2) {
        this.o = cx6;
        this.X = objArr;
        this.Y = i;
        this.Z = i2;
    }

    public final int b(int i, Object[] objArr) {
        return a().b(i, objArr);
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.o.get(key));
    }

    public final boolean f() {
        return true;
    }

    public final m5f g() {
        return a().listIterator(0);
    }

    public final zw6 k() {
        return new gfc(this);
    }

    public final int size() {
        return this.Z;
    }
}
