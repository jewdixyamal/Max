package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mg3  reason: default package */
public final class mg3 implements Parcelable {
    public static final Parcelable.Creator<mg3> CREATOR = new f73(1);
    public final int a;
    public final jqe b;
    public final int c;
    public final boolean o;

    public mg3(int i, jqe jqe, int i2, boolean z) {
        this.a = i;
        this.b = jqe;
        this.c = i2;
        this.o = z;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.mg3) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.mg3
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            mg3 r5 = (defpackage.mg3) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            jqe r1 = r4.b
            jqe r3 = r5.b
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 == r3) goto L_0x0025
            return r2
        L_0x0025:
            boolean r4 = r4.o
            boolean r5 = r5.o
            if (r4 == r5) goto L_0x002c
            return r2
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mg3.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + ey8.g(this.c, k7d.f(Integer.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(id=");
        sb.append(this.a);
        sb.append(", caption=");
        sb.append(this.b);
        sb.append(", type=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "THEMED" : "PRIMARY" : "NEUTRAL" : "NEGATIVE");
        sb.append(", filledButton=");
        return au1.j(sb, this.o, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        int i2 = this.c;
        if (i2 == 1) {
            str = "NEGATIVE";
        } else if (i2 == 2) {
            str = "NEUTRAL";
        } else if (i2 == 3) {
            str = "PRIMARY";
        } else if (i2 == 4) {
            str = "THEMED";
        } else {
            throw null;
        }
        parcel.writeString(str);
        parcel.writeInt(this.o ? 1 : 0);
    }
}
