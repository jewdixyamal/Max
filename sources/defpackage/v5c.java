package defpackage;

import java.io.Serializable;

/* renamed from: v5c  reason: default package */
public final class v5c implements Comparable, CharSequence, Serializable {
    public final CharSequence a;

    public v5c(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final char charAt(int i) {
        return this.a.charAt(i);
    }

    public final int compareTo(Object obj) {
        return this.a.toString().compareTo(((v5c) obj).a.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5c)) {
            return false;
        }
        return tpa.f(this.a.toString(), ((v5c) obj).a.toString());
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + v5c.class.hashCode();
    }

    public final int length() {
        return this.a.length();
    }

    public final CharSequence subSequence(int i, int i2) {
        return this.a.subSequence(i, i2);
    }

    public final String toString() {
        return this.a.toString();
    }
}
