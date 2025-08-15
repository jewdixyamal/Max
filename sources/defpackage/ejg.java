package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: ejg  reason: default package */
public final class ejg extends n3 implements rjc {
    public static final Parcelable.Creator<ejg> CREATOR = new ufg(13);
    public final Status a;

    public ejg(Status status) {
        this.a = status;
    }

    public final Status a() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.P(parcel, 1, this.a, i);
        ay7.W(parcel, T);
    }
}
