package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: moe  reason: default package */
public final class moe extends n3 {
    public static final Parcelable.Creator<moe> CREATOR = new vqf(4);
    public final int a;
    public List b;

    public moe(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.S(parcel, this.b, 2);
        ay7.W(parcel, T);
    }
}
