package defpackage;

import java.util.Objects;

/* renamed from: kr9  reason: default package */
public final class kr9 {
    public final long a;
    public final b10 b;

    public kr9(long j, b10 b10) {
        this.a = j;
        this.b = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr9)) {
            return false;
        }
        kr9 kr9 = (kr9) obj;
        return this.a == kr9.a && this.b == kr9.b;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
