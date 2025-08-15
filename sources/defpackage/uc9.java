package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: uc9  reason: default package */
public final class uc9 implements c99 {
    public static final Parcelable.Creator<uc9> CREATOR = new uk7(25);
    public final long X;
    public final long a;
    public final long b;
    public final long c;
    public final long o;

    public uc9(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = j4;
        this.X = j5;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uc9.class != obj.getClass()) {
            return false;
        }
        uc9 uc9 = (uc9) obj;
        return this.a == uc9.a && this.b == uc9.b && this.c == uc9.c && this.o == uc9.o && this.X == uc9.X;
    }

    public final int hashCode() {
        int p = pag.p(this.b);
        int p2 = pag.p(this.c);
        int p3 = pag.p(this.o);
        return pag.p(this.X) + ((p3 + ((p2 + ((p + ((pag.p(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(218);
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(this.a);
        sb.append(", photoSize=");
        sb.append(this.b);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(this.c);
        sb.append(", videoStartPosition=");
        sb.append(this.o);
        sb.append(", videoSize=");
        sb.append(this.X);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.o);
        parcel.writeLong(this.X);
    }

    public uc9(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.o = parcel.readLong();
        this.X = parcel.readLong();
    }
}
