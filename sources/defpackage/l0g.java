package defpackage;

import java.util.List;

/* renamed from: l0g  reason: default package */
public final class l0g {
    public final String a;
    public final List b;

    public l0g(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0g)) {
            return false;
        }
        l0g l0g = (l0g) obj;
        return tpa.f(this.a, l0g.a) && tpa.f(this.b, l0g.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppSettingsState(title=" + this.a + ", sections=" + this.b + ")";
    }
}
