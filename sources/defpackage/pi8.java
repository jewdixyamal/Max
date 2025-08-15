package defpackage;

import java.util.Objects;

/* renamed from: pi8  reason: default package */
public final class pi8 implements nh8 {
    public final vi8 a;

    public pi8(vi8 vi8) {
        this.a = vi8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != pi8.class) {
            return false;
        }
        return oaf.a(this.a, ((pi8) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }
}
