package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: vo  reason: default package */
public final class vo implements d99 {
    public static final Parcelable.Creator<vo> CREATOR = new d6(7);
    public final int a;
    public final String b;

    public vo(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.a);
        sb.append(",url=");
        return zr6.l(sb, this.b, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.a);
    }
}
