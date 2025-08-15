package defpackage;

import java.util.List;

/* renamed from: xd7  reason: default package */
public final class xd7 {
    public final String a;
    public final List b;

    public xd7(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd7)) {
            return false;
        }
        xd7 xd7 = (xd7) obj;
        return tpa.f(this.a, xd7.a) && tpa.f(this.b, xd7.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "LastInputText(text=" + this.a + ", messageElementsData=" + this.b + ")";
    }
}
