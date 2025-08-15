package defpackage;

import java.util.Map;

/* renamed from: iy7  reason: default package */
public final class iy7 implements Map.Entry, tb7 {
    public final ky7 a;
    public final int b;

    public iy7(int i, ky7 ky7) {
        this.a = ky7;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return tpa.f(entry.getKey(), getKey()) && tpa.f(entry.getValue(), getValue());
        }
    }

    public final Object getKey() {
        return this.a.a[this.b];
    }

    public final Object getValue() {
        return this.a.b[this.b];
    }

    public final int hashCode() {
        Object key = getKey();
        int i = 0;
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        ky7 ky7 = this.a;
        ky7.c();
        Object[] objArr = ky7.b;
        if (objArr == null) {
            int length = ky7.a.length;
            if (length >= 0) {
                objArr = new Object[length];
                ky7.b = objArr;
            } else {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
        }
        int i = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
