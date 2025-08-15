package defpackage;

import java.util.Map;

/* renamed from: m2  reason: default package */
public abstract class m2 implements Map.Entry {
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return f46.B(getKey(), entry.getKey()) && f46.B(getValue(), entry.getValue());
    }

    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        int i = 0;
        int hashCode = key == null ? 0 : key.hashCode();
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
