package defpackage;

import java.util.List;

/* renamed from: m86  reason: default package */
public final class m86 implements r86 {
    public final List a;

    public m86(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m86) && tpa.f(this.a, ((m86) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnSelectionChanged(items=" + this.a + ")";
    }
}
