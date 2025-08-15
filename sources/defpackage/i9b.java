package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: i9b  reason: default package */
public final class i9b extends tvd {
    public static final Parcelable.Creator<i9b> CREATOR = new e9b(2);
    public final long a;
    public final long b;
    public final byte[] c;

    public i9b(long j, byte[] bArr, long j2) {
        this.a = j2;
        this.b = j;
        this.c = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeByteArray(this.c);
    }

    public i9b(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i = maf.a;
        this.c = createByteArray;
    }
}
