package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: m06  reason: default package */
public abstract class m06 extends j47 implements Map {
    public final void clear() {
        u0().clear();
    }

    public boolean containsKey(Object obj) {
        return u0().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return v0(obj);
    }

    public Set entrySet() {
        return u0().entrySet();
    }

    public Object get(Object obj) {
        return u0().get(obj);
    }

    public boolean isEmpty() {
        return u0().isEmpty();
    }

    public Set keySet() {
        return u0().keySet();
    }

    public final Object put(Object obj, Object obj2) {
        return u0().put(obj, obj2);
    }

    public final void putAll(Map map) {
        u0().putAll(map);
    }

    public final Object remove(Object obj) {
        return u0().remove(obj);
    }

    public int size() {
        return u0().size();
    }

    public abstract Map u0();

    public final boolean v0(Object obj) {
        g1f g1f = new g1f(entrySet().iterator());
        if (obj == null) {
            while (g1f.hasNext()) {
                if (g1f.next() == null) {
                    return true;
                }
            }
        } else {
            while (g1f.hasNext()) {
                if (obj.equals(g1f.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Collection values() {
        return u0().values();
    }
}
