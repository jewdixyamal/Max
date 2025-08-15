package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: wy7  reason: default package */
public final class wy7 extends n3 {
    public static final Parcelable.Creator<wy7> CREATOR = new ufg(17);
    public final String a;

    public wy7(String str) {
        fp3.o(str, "json must not be null");
        this.a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.Q(parcel, 2, this.a);
        ay7.W(parcel, T);
    }
}
