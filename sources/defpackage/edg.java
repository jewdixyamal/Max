package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: edg  reason: default package */
public final class edg extends n3 implements rjc {
    public static final Parcelable.Creator<edg> CREATOR = new vqf(5);
    public final int a;
    public final int b;
    public final Intent c;

    public edg(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public final Status a() {
        return this.b == 0 ? Status.X : Status.t0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(this.b);
        ay7.P(parcel, 3, this.c, i);
        ay7.W(parcel, T);
    }
}
