package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: wh3  reason: default package */
public final class wh3 extends n3 {
    public static final Parcelable.Creator<wh3> CREATOR = new ufg(12);
    public final int X;
    public final int[] Y;
    public final xmc a;
    public final boolean b;
    public final boolean c;
    public final int[] o;

    public wh3(xmc xmc, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = xmc;
        this.b = z;
        this.c = z2;
        this.o = iArr;
        this.X = i;
        this.Y = iArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.P(parcel, 1, this.a, i);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        ay7.X(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        int[] iArr = this.o;
        if (iArr != null) {
            int T2 = ay7.T(parcel, 4);
            parcel.writeIntArray(iArr);
            ay7.W(parcel, T2);
        }
        ay7.X(parcel, 5, 4);
        parcel.writeInt(this.X);
        int[] iArr2 = this.Y;
        if (iArr2 != null) {
            int T3 = ay7.T(parcel, 6);
            parcel.writeIntArray(iArr2);
            ay7.W(parcel, T3);
        }
        ay7.W(parcel, T);
    }
}
