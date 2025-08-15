package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: xte  reason: default package */
public final class xte extends tvd {
    public static final Parcelable.Creator<xte> CREATOR = new etd(18);
    public final long a;
    public final long b;

    public xte(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static long a(long j, yaf yaf) {
        long v = (long) yaf.v();
        if ((128 & v) != 0) {
            return 8589934591L & ((((v & 1) << 32) | yaf.w()) + j);
        }
        return -9223372036854775807L;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
