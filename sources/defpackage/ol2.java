package defpackage;

/* renamed from: ol2  reason: default package */
public final class ol2 implements efb {
    public final String a;
    public final jqe b;
    public final a73 c;
    public final int o;

    public ol2(String str, eqe eqe, a73 a73, int i) {
        this.a = str;
        this.b = eqe;
        this.c = a73;
        this.o = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol2)) {
            return false;
        }
        ol2 ol2 = (ol2) obj;
        return tpa.f(this.a, ol2.a) && tpa.f(this.b, ol2.b) && tpa.f(this.c, ol2.c) && this.o == ol2.o;
    }

    public final long getItemId() {
        return (long) 131072;
    }

    public final boolean h(ol7 ol7) {
        return ((long) 131072) == ol7.getItemId();
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int f = k7d.f((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        a73 a73 = this.c;
        if (a73 != null) {
            i = a73.a.hashCode();
        }
        return Integer.hashCode(this.o) + ((f + i) * 31);
    }

    public final int l() {
        return 131072;
    }

    public final Object n(Object obj) {
        ol7 ol7 = (ol7) obj;
        if (!(ol7 instanceof ol2)) {
            return null;
        }
        return new tfb(((ol2) ol7).c);
    }

    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        return "ChatNameItem(text=" + this.a + ", hintText=" + this.b + ", errorText=" + this.c + ", limitCharacters=" + this.o + ")";
    }
}
