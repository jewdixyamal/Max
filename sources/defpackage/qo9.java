package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qo9  reason: default package */
public final class qo9 implements Parcelable, ol7 {
    public static final Parcelable.Creator<qo9> CREATOR = new fn9(1);
    public final long a;
    public final String b;
    public final int c;
    public final boolean o;

    public qo9(long j, String str, int i, boolean z) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.o = z;
    }

    public static qo9 y(qo9 qo9, boolean z) {
        long j = qo9.a;
        String str = qo9.b;
        int i = qo9.c;
        qo9.getClass();
        return new qo9(j, str, i, z);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo9)) {
            return false;
        }
        qo9 qo9 = (qo9) obj;
        return this.a == qo9.a && tpa.f(this.b, qo9.b) && this.c == qo9.c && this.o == qo9.o;
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + k7d.e(this.c, rh4.d(Long.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final int l() {
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeuroAvatarModel(id=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", categoryId=");
        sb.append(this.c);
        sb.append(", isSelected=");
        return au1.j(sb, this.o, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o ? 1 : 0);
    }
}
