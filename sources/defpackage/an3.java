package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: an3  reason: default package */
public final class an3 implements Parcelable {
    public static final Parcelable.Creator<an3> CREATOR = new f73(2);
    public final wm3 a;

    public an3(wm3 wm3) {
        this.a = wm3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        wm3 wm3 = this.a;
        parcel.writeByte(wm3 == null ? (byte) 1 : 0);
        if (wm3 != null) {
            parcel.writeLong(wm3.a);
            parcel.writeLong(wm3.b);
            f8.H(parcel, wm3.c);
            f8.H(parcel, wm3.o);
            parcel.writeSerializable((Serializable) wm3.X);
            parcel.writeLong(wm3.Y);
            parcel.writeLong(wm3.Z);
            parcel.writeSerializable(wm3.s0);
            parcel.writeInt(au1.s(wm3.t0));
            parcel.writeSerializable((Serializable) wm3.u0);
        }
    }

    public an3(Parcel parcel) {
        if (!f8.w(parcel)) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            String x = f8.x(parcel);
            String x2 = f8.x(parcel);
            List list = (List) parcel.readSerializable();
            long readLong3 = parcel.readLong();
            long readLong4 = parcel.readLong();
            pq3 pq3 = (pq3) parcel.readSerializable();
            int readInt = parcel.readInt();
            int i = 1;
            if (readInt == 1) {
                i = 2;
            } else if (readInt == 2) {
                i = 3;
            }
            List list2 = (List) parcel.readSerializable();
            this.a = new wm3(readLong, readLong2, x, x2, list, readLong3, readLong4, pq3, i, list2 == null ? new ArrayList() : list2, (String) null, (String) null, (String) null, (jc7) null, (int[]) null);
            return;
        }
        this.a = null;
    }
}
