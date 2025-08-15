package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qeg  reason: default package */
public final class qeg extends n3 {
    public static final Parcelable.Creator<qeg> CREATOR = new vqf(9);
    public final int a;
    public final ph3 b;
    public final weg c;

    public qeg(int i, ph3 ph3, weg weg) {
        this.a = i;
        this.b = ph3;
        this.c = weg;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.P(parcel, 2, this.b, i);
        ay7.P(parcel, 3, this.c, i);
        ay7.W(parcel, T);
    }
}
