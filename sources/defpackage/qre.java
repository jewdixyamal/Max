package defpackage;

import java.util.List;

/* renamed from: qre  reason: default package */
public final class qre {
    public final pre a;
    public final nre b;
    public final List c;
    public final List d;
    public final Integer e;

    public qre(pre pre, nre nre, List list, List list2, Integer num) {
        this.a = pre;
        this.b = nre;
        this.c = list;
        this.d = list2;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qre)) {
            return false;
        }
        qre qre = (qre) obj;
        return tpa.f(this.a, qre.a) && tpa.f(this.b, qre.b) && tpa.f(this.c, qre.c) && tpa.f(this.d, qre.d) && tpa.f(this.e, qre.e);
    }

    public final int hashCode() {
        int i = 0;
        pre pre = this.a;
        int hashCode = (pre == null ? 0 : pre.a.hashCode()) * 31;
        nre nre = this.b;
        int hashCode2 = (hashCode + (nre == null ? 0 : nre.hashCode())) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.e;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "ThemeBackgroundDrawModel(pattern=" + this.a + ", gradient=" + this.b + ", gradientEllipse=" + this.c + ", patternGradientEllipse=" + this.d + ", fillColor=" + this.e + ")";
    }
}
