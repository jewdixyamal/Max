package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: rr7  reason: default package */
public final class rr7 extends n3 implements rjc {
    public static final Parcelable.Creator<rr7> CREATOR = new vqf(24);
    public final Status a;
    public final sr7 b;

    public rr7(Status status, sr7 sr7) {
        this.a = status;
        this.b = sr7;
    }

    public final Status a() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.P(parcel, 1, this.a, i);
        ay7.P(parcel, 2, this.b, i);
        ay7.W(parcel, T);
    }
}
