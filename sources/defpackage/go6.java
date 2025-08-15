package defpackage;

/* renamed from: go6  reason: default package */
public final class go6 implements ol7 {
    public final String a;
    public final Boolean b;

    public go6(String str, Boolean bool) {
        this.a = str;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go6)) {
            return false;
        }
        go6 go6 = (go6) obj;
        return tpa.f(this.a, go6.a) && tpa.f(this.b, go6.b);
    }

    public final long getItemId() {
        return (long) this.a.hashCode();
    }

    public final boolean h(ol7 ol7) {
        return getItemId() == ol7.getItemId();
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final int l() {
        return 0;
    }

    public final Object n(Object obj) {
        ol7 ol7 = (ol7) obj;
        go6 go6 = ol7 instanceof go6 ? (go6) ol7 : null;
        if (go6 == null) {
            return null;
        }
        Boolean bool = this.b;
        Boolean bool2 = go6.b;
        if (!tpa.f(bool, bool2)) {
            return new fo6(bool2);
        }
        return null;
    }

    public final String toString() {
        return "HostItem(host=" + this.a + ", isSelected=" + this.b + ")";
    }
}
