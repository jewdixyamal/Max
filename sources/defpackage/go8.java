package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: go8  reason: default package */
public final class go8 implements Parcelable {
    public static final Parcelable.Creator<go8> CREATOR = new uk7(16);
    public final long a;
    public final ek2 b;
    public final boolean c;
    public final Integer o;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ go8(long j, ek2 ek2, Integer num, int i) {
        this(j, ek2, true, (i & 8) != 0 ? null : num);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go8)) {
            return false;
        }
        go8 go8 = (go8) obj;
        return this.a == go8.a && this.b == go8.b && this.c == go8.c && tpa.f(this.o, go8.o);
    }

    public final int hashCode() {
        int d = ms2.d((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c);
        Integer num = this.o;
        return d + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "MembersListArgs(chatId=" + this.a + ", chatMemberType=" + this.b + ", isLongClickEnabled=" + this.c + ", memberLimit=" + this.o + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int intValue;
        parcel.writeLong(this.a);
        parcel.writeString(this.b.name());
        parcel.writeInt(this.c ? 1 : 0);
        Integer num = this.o;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }

    public go8(long j, ek2 ek2, boolean z, Integer num) {
        this.a = j;
        this.b = ek2;
        this.c = z;
        this.o = num;
    }
}
