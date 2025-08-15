package defpackage;

/* renamed from: vre  reason: default package */
public final class vre implements ol7 {
    public final String a;
    public final Boolean b;

    public vre(String str, Boolean bool) {
        this.a = str;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vre)) {
            return false;
        }
        vre vre = (vre) obj;
        return tpa.f(this.a, vre.a) && tpa.f(this.b, vre.b);
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
        vre vre = ol7 instanceof vre ? (vre) ol7 : null;
        if (vre == null) {
            return null;
        }
        Boolean bool = this.b;
        Boolean bool2 = vre.b;
        if (!tpa.f(bool, bool2)) {
            return new tre(bool2);
        }
        return null;
    }

    public final String toString() {
        return "ThemeItem(theme=" + this.a + ", isSelected=" + this.b + ")";
    }
}
