package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bqb  reason: default package */
public final class bqb implements Parcelable {
    public static final Parcelable.Creator<bqb> CREATOR = new e9b(8);
    public final long X;
    public final String Y;
    public final long Z;
    public final long a;
    public final String b;
    public final long c;
    public final Long o;
    public final rl2 s0;

    public bqb(long j, String str, long j2, Long l, long j3, String str2, long j4, rl2 rl2) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.o = l;
        this.X = j3;
        this.Y = str2;
        this.Z = j4;
        this.s0 = rl2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqb)) {
            return false;
        }
        bqb bqb = (bqb) obj;
        return this.a == bqb.a && tpa.f(this.b, bqb.b) && this.c == bqb.c && tpa.f(this.o, bqb.o) && this.X == bqb.X && tpa.f(this.Y, bqb.Y) && this.Z == bqb.Z && this.s0 == bqb.s0;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int m = h4f.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Long l = this.o;
        int m2 = h4f.m((m + (l == null ? 0 : l.hashCode())) * 31, 31, this.X);
        String str2 = this.Y;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.s0.hashCode() + h4f.m((m2 + i) * 31, 31, this.Z);
    }

    public final String toString() {
        return "PushInfo(pushId=" + this.a + ", eventKey=" + this.b + ", chatServerId=" + this.c + ", chatId=" + this.o + ", messageServerId=" + this.X + ", pushType=" + this.Y + ", createdTime=" + this.Z + ", chatType=" + this.s0 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        Long l = this.o;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeLong(this.X);
        parcel.writeString(this.Y);
        parcel.writeLong(this.Z);
        this.s0.writeToParcel(parcel, i);
    }
}
