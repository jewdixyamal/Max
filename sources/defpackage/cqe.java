package defpackage;

import android.os.Parcel;
import java.util.List;

/* renamed from: cqe  reason: default package */
public final class cqe extends jqe {
    public static final bqe CREATOR = new Object();
    public final int b;
    public final int c;
    public final List o;

    public cqe(List list, int i, int i2) {
        this.b = i;
        this.c = i2;
        this.o = list;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.cqe) r5;
        r1 = r5.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.cqe
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            cqe r5 = (defpackage.cqe) r5
            int r1 = r5.b
            int r3 = r4.b
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            java.util.List r4 = r4.o
            java.util.List r5 = r5.o
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 != 0) goto L_0x0025
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqe.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.o.hashCode() + k7d.e(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PluralsParams(resId=");
        sb.append(this.b);
        sb.append(", quantity=");
        sb.append(this.c);
        sb.append(", args=");
        return au1.i(sb, this.o, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeList(this.o);
    }
}
