package defpackage;

/* renamed from: pr3  reason: default package */
public final class pr3 implements ol7 {
    public final int a;
    public final Integer b;
    public final int c = z8a.o;

    public pr3(int i, int i2, int i3, Integer num) {
        this.a = i3;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr3)) {
            return false;
        }
        pr3 pr3 = (pr3) obj;
        pr3.getClass();
        int i = woc.a;
        int i2 = a9a.a;
        return this.a == pr3.a && tpa.f(this.b, pr3.b);
    }

    public final long getItemId() {
        return 0;
    }

    public final boolean h(ol7 ol7) {
        return ol7 instanceof pr3;
    }

    public final int hashCode() {
        int e = k7d.e(this.a, k7d.e(a9a.r, Integer.hashCode(woc.J0) * 31, 31), 31);
        Integer num = this.b;
        return e + (num == null ? 0 : num.hashCode());
    }

    public final int l() {
        return this.c;
    }

    public final Object n(Object obj) {
        ol7 ol7 = (ol7) obj;
        pr3 pr3 = ol7 instanceof pr3 ? (pr3) ol7 : null;
        if (pr3 == null) {
            return null;
        }
        Integer num = this.b;
        Integer num2 = pr3.b;
        if (!tpa.f(num2, num)) {
            return new or3(num2);
        }
        return null;
    }

    public final String toString() {
        return "ContactsEmptySearchResultItem(iconRes=" + woc.J0 + ", titleRes=" + a9a.r + ", descriptionRes=" + this.a + ", buttonTitleRes=" + this.b + ")";
    }
}
