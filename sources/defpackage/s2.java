package defpackage;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* renamed from: s2  reason: default package */
public abstract class s2 extends AbstractMap implements Map, ub7 {
    public final Set entrySet() {
        return new xd3((yd3) this, new ai0(10));
    }

    public final Set keySet() {
        return new xd3((yd3) this, new ai0(9));
    }

    public final int size() {
        return yd3.b.get((yd3) this);
    }
}
