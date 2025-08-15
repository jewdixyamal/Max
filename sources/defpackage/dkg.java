package defpackage;

import android.os.Parcel;

/* renamed from: dkg  reason: default package */
public final class dkg extends cdg {
    public final xr6 I0(oy9 oy9, String str, int i, oy9 oy92) {
        Parcel G0 = G0();
        kgg.c(G0, oy9);
        G0.writeString(str);
        G0.writeInt(i);
        kgg.c(G0, oy92);
        Parcel k = k(G0, 2);
        xr6 K0 = oy9.K0(k.readStrongBinder());
        k.recycle();
        return K0;
    }

    public final xr6 J0(oy9 oy9, String str, int i, oy9 oy92) {
        Parcel G0 = G0();
        kgg.c(G0, oy9);
        G0.writeString(str);
        G0.writeInt(i);
        kgg.c(G0, oy92);
        Parcel k = k(G0, 3);
        xr6 K0 = oy9.K0(k.readStrongBinder());
        k.recycle();
        return K0;
    }
}
