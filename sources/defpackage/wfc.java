package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: wfc  reason: default package */
public final class wfc extends n3 {
    public static final Parcelable.Creator<wfc> CREATOR = new e9b(12);
    public final Bundle a;
    public us b;

    public wfc(Bundle bundle) {
        this.a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.M(parcel, 2, this.a);
        ay7.W(parcel, T);
    }
}
