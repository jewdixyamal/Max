package defpackage;

/* renamed from: ql5  reason: default package */
public final class ql5 implements efb {
    public final String a;
    public final a73 b;

    public ql5(String str, a73 a73) {
        this.a = str;
        this.b = a73;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql5)) {
            return false;
        }
        ql5 ql5 = (ql5) obj;
        return tpa.f(this.a, ql5.a) && tpa.f(this.b, ql5.b);
    }

    public final long getItemId() {
        return (long) 1;
    }

    public final boolean h(ol7 ol7) {
        return ((long) 1) == ol7.getItemId();
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        a73 a73 = this.b;
        if (a73 != null) {
            i = a73.a.hashCode();
        }
        return hashCode + i;
    }

    public final int l() {
        return 1;
    }

    public final Object n(Object obj) {
        ol7 ol7 = (ol7) obj;
        if (!(ol7 instanceof ql5)) {
            return null;
        }
        return new ufb(((ql5) ol7).b);
    }

    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        return "FirstNameItem(text=" + this.a + ", errorText=" + this.b + ")";
    }
}
