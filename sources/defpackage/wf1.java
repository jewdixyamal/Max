package defpackage;

import java.util.List;

/* renamed from: wf1  reason: default package */
public final class wf1 {
    public static final wf1 g;
    public final List a;
    public final List b;
    public final List c;
    public final boolean d;
    public final CharSequence e;
    public final boolean f;

    static {
        nz4 nz4 = nz4.a;
        g = new wf1(nz4, nz4, nz4, true, "", false);
    }

    public wf1(List list, List list2, List list3, boolean z, CharSequence charSequence, boolean z2) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = z;
        this.e = charSequence;
        this.f = z2;
    }

    public static wf1 a(wf1 wf1, List list, kl7 kl7, List list2, boolean z, CharSequence charSequence, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = wf1.a;
        }
        List list3 = list;
        List list4 = kl7;
        if ((i & 2) != 0) {
            list4 = wf1.b;
        }
        List list5 = list4;
        if ((i & 4) != 0) {
            list2 = wf1.c;
        }
        List list6 = list2;
        if ((i & 8) != 0) {
            z = wf1.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            charSequence = wf1.e;
        }
        CharSequence charSequence2 = charSequence;
        if ((i & 32) != 0) {
            z2 = wf1.f;
        }
        wf1.getClass();
        return new wf1(list3, list5, list6, z3, charSequence2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf1)) {
            return false;
        }
        wf1 wf1 = (wf1) obj;
        return tpa.f(this.a, wf1.a) && tpa.f(this.b, wf1.b) && tpa.f(this.c, wf1.c) && this.d == wf1.d && tpa.f(this.e, wf1.e) && this.f == wf1.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + rh4.f(this.e, ms2.d(k7d.g(this.c, k7d.g(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31);
    }

    public final String toString() {
        return "CallOpponentsState(opponents=" + this.a + ", buttons=" + this.b + ", contextMenuButtons=" + this.c + ", isMoreButtonEnabled=" + this.d + ", title=" + this.e + ", canOpenSettings=" + this.f + ")";
    }
}
