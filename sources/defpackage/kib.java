package defpackage;

import java.util.List;

/* renamed from: kib  reason: default package */
public final class kib extends cjb {
    public final List a;
    public final List b;
    public final boolean c;

    public kib(List list, List list2, boolean z) {
        this.a = list;
        this.b = list2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kib)) {
            return false;
        }
        kib kib = (kib) obj;
        return tpa.f(this.a, kib.a) && tpa.f(this.b, kib.b) && this.c == kib.c;
    }

    public final long getItemId() {
        return (long) 1;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k7d.g(this.b, this.a.hashCode() * 31, 31);
    }

    public final int l() {
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonsStack(buttons=");
        sb.append(this.a);
        sb.append(", contextMenuButtons=");
        sb.append(this.b);
        sb.append(", isMoreButtonEnabled=");
        return au1.j(sb, this.c, ")");
    }
}
