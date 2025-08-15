package defpackage;

/* renamed from: zd7  reason: default package */
public final class zd7 implements efb {
    public final String a;
    public final a73 b;

    public zd7(String str, a73 a73) {
        this.a = str;
        this.b = a73;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd7)) {
            return false;
        }
        zd7 zd7 = (zd7) obj;
        return tpa.f(this.a, zd7.a) && tpa.f(this.b, zd7.b);
    }

    public final long getItemId() {
        return (long) 2;
    }

    public final boolean h(ol7 ol7) {
        return ((long) 2) == ol7.getItemId();
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
        return 2;
    }

    public final Object n(Object obj) {
        ol7 ol7 = (ol7) obj;
        if (!(ol7 instanceof zd7)) {
            return null;
        }
        return new vfb(((zd7) ol7).b);
    }

    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        return "LastNameItem(text=" + this.a + ", errorText=" + this.b + ")";
    }
}
