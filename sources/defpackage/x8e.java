package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x8e  reason: default package */
public final class x8e implements Comparable, Parcelable {
    public static final Parcelable.Creator<x8e> CREATOR = new etd(13);
    public static final String X = Integer.toString(1, 36);
    public static final String Y = Integer.toString(2, 36);
    public static final String o = Integer.toString(0, 36);
    public final int a;
    public final int b;
    public final int c;

    static {
        int i = oaf.a;
    }

    public x8e(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int compareTo(Object obj) {
        x8e x8e = (x8e) obj;
        int i = this.a - x8e.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - x8e.b;
        return i2 == 0 ? this.c - x8e.c : i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x8e.class != obj.getClass()) {
            return false;
        }
        x8e x8e = (x8e) obj;
        return this.a == x8e.a && this.b == x8e.b && this.c == x8e.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return this.a + "." + this.b + "." + this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public x8e(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }
}
