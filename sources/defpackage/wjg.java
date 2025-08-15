package defpackage;

import android.os.Parcel;

/* renamed from: wjg  reason: default package */
public final class wjg extends cdg {
    public final xr6 I0(oy9 oy9, String str, int i) {
        Parcel G0 = G0();
        kgg.c(G0, oy9);
        G0.writeString(str);
        G0.writeInt(i);
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
        Parcel k = k(G0, 8);
        xr6 K0 = oy9.K0(k.readStrongBinder());
        k.recycle();
        return K0;
    }

    public final xr6 K0(oy9 oy9, String str, int i) {
        Parcel G0 = G0();
        kgg.c(G0, oy9);
        G0.writeString(str);
        G0.writeInt(i);
        Parcel k = k(G0, 4);
        xr6 K0 = oy9.K0(k.readStrongBinder());
        k.recycle();
        return K0;
    }

    public final xr6 L0(oy9 oy9, String str, boolean z, long j) {
        Parcel G0 = G0();
        kgg.c(G0, oy9);
        G0.writeString(str);
        G0.writeInt(z ? 1 : 0);
        G0.writeLong(j);
        Parcel k = k(G0, 7);
        xr6 K0 = oy9.K0(k.readStrongBinder());
        k.recycle();
        return K0;
    }
}
