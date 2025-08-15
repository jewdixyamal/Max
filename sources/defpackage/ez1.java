package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: ez1  reason: default package */
public class ez1 extends n3 {
    public static final Parcelable.Creator<ez1> CREATOR = new vqf(28);
    public final int a;
    public final rxd b;
    public final Float c;

    public ez1(int i, rxd rxd, Float f) {
        boolean z = true;
        boolean z2 = f != null && f.floatValue() > 0.0f;
        if (i == 3) {
            z = (rxd == null || !z2) ? false : z;
            i = 3;
        }
        fp3.g("Invalid Cap: type=" + i + " bitmapDescriptor=" + rxd + " bitmapRefWidth=" + f, z);
        this.a = i;
        this.b = rxd;
        this.c = f;
    }

    public final ez1 b() {
        int i = this.a;
        if (i == 0) {
            return new bv0();
        }
        boolean z = true;
        if (i == 1) {
            return new bv0(1, (rxd) null, (Float) null, 2);
        }
        if (i == 2) {
            return new bv0(2, (rxd) null, (Float) null, 1);
        }
        if (i != 3) {
            return this;
        }
        rxd rxd = this.b;
        fp3.p("bitmapDescriptor must not be null", rxd != null);
        Float f = this.c;
        if (f == null) {
            z = false;
        }
        fp3.p("bitmapRefWidth must not be null", z);
        return new k04(rxd, f.floatValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.ez1) r5;
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
            boolean r1 = r5 instanceof defpackage.ez1
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ez1 r5 = (defpackage.ez1) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 != r1) goto L_0x0027
            rxd r1 = r4.b
            rxd r3 = r5.b
            boolean r1 = defpackage.s36.l(r1, r3)
            if (r1 == 0) goto L_0x0027
            java.lang.Float r4 = r4.c
            java.lang.Float r5 = r5.c
            boolean r4 = defpackage.s36.l(r4, r5)
            if (r4 == 0) goto L_0x0027
            return r0
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    public String toString() {
        return zr6.j(new StringBuilder("[Cap: type="), this.a, "]");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(this.a);
        rxd rxd = this.b;
        ay7.O(parcel, 3, rxd == null ? null : ((xr6) rxd.b).asBinder());
        ay7.N(parcel, 4, this.c);
        ay7.W(parcel, T);
    }
}
