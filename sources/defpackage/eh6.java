package defpackage;

import java.io.Serializable;

/* renamed from: eh6  reason: default package */
public final class eh6 implements Serializable {
    public static final eh6 b = new eh6(false);
    public final boolean a;

    public eh6(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eh6) && this.a == ((eh6) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("GroupOptions(isPremium="), this.a, ")");
    }
}
