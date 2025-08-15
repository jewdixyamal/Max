package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: txd  reason: default package */
public final class txd extends n3 {
    public static final Parcelable.Creator<txd> CREATOR = new ufg(21);
    public final rxd a;

    public txd(IBinder iBinder) {
        this.a = new rxd(oy9.K0(iBinder));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.O(parcel, 2, ((xr6) this.a.b).asBinder());
        ay7.W(parcel, T);
    }
}
