package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: cx6  reason: default package */
public abstract class cx6 implements Map, Serializable {
    public static final Map.Entry[] o = new Map.Entry[0];
    public transient jx6 a;
    public transient jx6 b;
    public transient qw6 c;

    public static jn a() {
        return new jn(4);
    }

    public static cx6 b(Map map) {
        if ((map instanceof cx6) && !(map instanceof SortedMap)) {
            cx6 cx6 = (cx6) map;
            if (!cx6.g()) {
                return cx6;
            }
        }
        Set entrySet = map.entrySet();
        jn jnVar = new jn(entrySet instanceof Collection ? entrySet.size() : 4);
        jnVar.L(entrySet);
        return jnVar.j();
    }

    public abstract jx6 c();

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract jx6 d();

    public abstract qw6 e();

    public final boolean equals(Object obj) {
        return ngg.q(this, obj);
    }

    /* renamed from: f */
    public jx6 entrySet() {
        jx6 jx6 = this.a;
        if (jx6 != null) {
            return jx6;
        }
        jx6 c2 = c();
        this.a = c2;
        return c2;
    }

    public abstract boolean g();

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* renamed from: h */
    public jx6 keySet() {
        jx6 jx6 = this.b;
        if (jx6 != null) {
            return jx6;
        }
        jx6 d = d();
        this.b = d;
        return d;
    }

    public final int hashCode() {
        return ngg.v(entrySet());
    }

    /* renamed from: i */
    public qw6 values() {
        qw6 qw6 = this.c;
        if (qw6 != null) {
            return qw6;
        }
        qw6 e = e();
        this.c = e;
        return e;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        wmd.i(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
