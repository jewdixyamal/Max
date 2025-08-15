package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: weg  reason: default package */
public final class weg extends n3 {
    public static final Parcelable.Creator<weg> CREATOR = new vqf(12);
    public final boolean X;
    public final int a;
    public final IBinder b;
    public final ph3 c;
    public final boolean o;

    public weg(int i, IBinder iBinder, ph3 ph3, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = ph3;
        this.o = z;
        this.X = z2;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof weg)) {
            return false;
        }
        weg weg = (weg) obj;
        if (this.c.equals(weg.c)) {
            Object obj3 = null;
            IBinder iBinder = this.b;
            if (iBinder == null) {
                obj2 = null;
            } else {
                int i = w4.d;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj2 = queryLocalInterface instanceof dr6 ? (dr6) queryLocalInterface : new cdg(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            IBinder iBinder2 = weg.b;
            if (iBinder2 != null) {
                int i2 = w4.d;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj3 = queryLocalInterface2 instanceof dr6 ? (dr6) queryLocalInterface2 : new cdg(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            if (s36.l(obj2, obj3)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.O(parcel, 2, this.b);
        ay7.P(parcel, 3, this.c, i);
        ay7.X(parcel, 4, 4);
        parcel.writeInt(this.o ? 1 : 0);
        ay7.X(parcel, 5, 4);
        parcel.writeInt(this.X ? 1 : 0);
        ay7.W(parcel, T);
    }
}
