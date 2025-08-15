package defpackage;

import java.util.Map;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: wd3  reason: default package */
public final class wd3 implements Map.Entry, tb7 {
    public final Object a;
    public final Object b;

    public wd3(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        return this.b;
    }

    public final Object setValue(Object obj) {
        Symbol symbol = zd3.a;
        throw new UnsupportedOperationException("not implemented");
    }
}
