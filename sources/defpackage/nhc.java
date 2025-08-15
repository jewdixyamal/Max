package defpackage;

import java.util.Objects;

/* renamed from: nhc  reason: default package */
public final class nhc implements hoc {
    public final boolean a;

    public nhc(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nhc.class != obj.getClass()) {
            return false;
        }
        return this.a == ((nhc) obj).a;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return "RequestAsr{isEnabled=" + this.a + '}';
    }
}
