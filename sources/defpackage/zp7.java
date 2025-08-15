package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: zp7  reason: default package */
public final class zp7 implements Parcelable {
    public static final Parcelable.Creator<zp7> CREATOR = new uk7(3);
    public final long X;
    public final Integer Y;
    public final Long Z;
    public final long a;
    public final Uri b;
    public final String c;
    public final int o;
    public final int s0;
    public final int t0;
    public final long u0;
    public final Uri v0;
    public final int w0;

    public zp7(long j, Uri uri, String str, int i, long j2, Integer num, Long l, int i2, int i3, long j3, Uri uri2) {
        this.a = j;
        this.b = uri;
        this.c = str;
        this.o = i;
        this.X = j2;
        this.Y = num;
        this.Z = l;
        this.s0 = i2;
        this.t0 = i3;
        this.u0 = j3;
        this.v0 = uri2;
        int[] v = au1.v(11);
        int length = v.length;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            int i6 = v[i5];
            if (ey8.f(i6).equalsIgnoreCase(str)) {
                i4 = i6;
                break;
            }
            i5++;
        }
        int i7 = 1;
        switch (au1.s(i4 == 0 ? 1 : i4)) {
            case 1:
            case 2:
            case 5:
            case 6:
                i7 = 2;
                break;
            case 4:
                i7 = 3;
                break;
            case 7:
            case 8:
                i7 = 4;
                break;
        }
        this.w0 = i7;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp7)) {
            return false;
        }
        zp7 zp7 = (zp7) obj;
        return this.a == zp7.a && tpa.f(this.b, zp7.b) && tpa.f(this.c, zp7.c) && this.o == zp7.o && this.X == zp7.X && tpa.f(this.Y, zp7.Y) && tpa.f(this.Z, zp7.Z) && this.s0 == zp7.s0 && this.t0 == zp7.t0 && this.u0 == zp7.u0 && tpa.f(this.v0, zp7.v0);
    }

    public final int hashCode() {
        int m = h4f.m(k7d.e(this.o, rh4.d((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c), 31), 31, this.X);
        int i = 0;
        Integer num = this.Y;
        int hashCode = (m + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.Z;
        if (l != null) {
            i = l.hashCode();
        }
        return this.v0.hashCode() + h4f.m(k7d.e(this.t0, k7d.e(this.s0, (hashCode + i) * 31, 31), 31), 31, this.u0);
    }

    public final String toString() {
        return "LocalMediaItem(id=" + this.a + ", uri=" + this.b + ", mimeType=" + this.c + ", albumId=" + this.o + ", dateTaken=" + this.X + ", orientation=" + this.Y + ", duration=" + this.Z + ", width=" + this.s0 + ", height=" + this.t0 + ", size=" + this.u0 + ", thumbnailUri=" + this.v0 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.o);
        parcel.writeLong(this.X);
        Integer num = this.Y;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.Z;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.s0);
        parcel.writeInt(this.t0);
        parcel.writeLong(this.u0);
        parcel.writeParcelable(this.v0, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zp7(long j, Uri uri, String str, int i, long j2, Integer num, Long l, Uri uri2, int i2) {
        this(j, uri, str, i, j2, num, (i2 & 64) != 0 ? null : l, 0, 0, 0, uri2);
    }
}
