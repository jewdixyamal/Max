package defpackage;

/* renamed from: qg6  reason: default package */
public final class qg6 {
    public int a;
    public int b;
    public float c;
    public int d;
    public boolean e;
    public int f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg6)) {
            return false;
        }
        qg6 qg6 = (qg6) obj;
        return this.a == qg6.a && this.b == qg6.b && Float.compare(this.c, qg6.c) == 0 && this.d == qg6.d && this.e == qg6.e && this.f == qg6.f;
    }

    public final int hashCode() {
        return au1.s(this.f) + ms2.d(k7d.e(this.d, ms2.c(k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31), 31), 31, this.e);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        float f2 = this.c;
        int i3 = this.d;
        boolean z = this.e;
        int i4 = this.f;
        StringBuilder j = wg0.j("PageState(pagesNumber=", i, ", selectedPageIndex=", i2, ", pageOffsetFraction=");
        j.append(f2);
        j.append(", selectedBigDotIndex=");
        j.append(i3);
        j.append(", wasShiftedFromZeroToZero=");
        j.append(z);
        j.append(", dotsAnimationType=");
        j.append(i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "null" : "ALL_DOTS_TO_RIGHT" : "ALL_DOTS_TO_LEFT" : "BIG_DOTS_CHANGE" : "NONE");
        j.append(")");
        return j.toString();
    }
}
