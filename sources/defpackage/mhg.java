package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mhg  reason: default package */
public final class mhg extends n3 {
    public static final Parcelable.Creator<mhg> CREATOR = new ufg(9);
    public final PendingIntent X;
    public final ekg Y;
    public final String Z;
    public final int a;
    public final lhg b;
    public final alg c;
    public final tkg o;

    /* JADX WARNING: type inference failed for: r5v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v2, types: [cdg] */
    /* JADX WARNING: type inference failed for: r6v5, types: [cdg] */
    /* JADX WARNING: type inference failed for: r1v3, types: [cdg] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public mhg(int r4, defpackage.lhg r5, android.os.IBinder r6, android.os.IBinder r7, android.app.PendingIntent r8, android.os.IBinder r9, java.lang.String r10) {
        /*
            r3 = this;
            r0 = 2
            r3.<init>()
            r3.a = r4
            r3.b = r5
            r4 = 0
            if (r6 == 0) goto L_0x0020
            int r5 = defpackage.zkg.d
            java.lang.String r5 = "com.google.android.gms.location.ILocationListener"
            android.os.IInterface r1 = r6.queryLocalInterface(r5)
            boolean r2 = r1 instanceof defpackage.alg
            if (r2 == 0) goto L_0x001a
            alg r1 = (defpackage.alg) r1
            goto L_0x0021
        L_0x001a:
            xkg r1 = new xkg
            r1.<init>(r6, r5, r0)
            goto L_0x0021
        L_0x0020:
            r1 = r4
        L_0x0021:
            r3.c = r1
            r3.X = r8
            if (r7 == 0) goto L_0x003c
            int r5 = defpackage.ahg.e
            java.lang.String r5 = "com.google.android.gms.location.ILocationCallback"
            android.os.IInterface r6 = r7.queryLocalInterface(r5)
            boolean r8 = r6 instanceof defpackage.tkg
            if (r8 == 0) goto L_0x0036
            tkg r6 = (defpackage.tkg) r6
            goto L_0x003d
        L_0x0036:
            okg r6 = new okg
            r6.<init>(r7, r5, r0)
            goto L_0x003d
        L_0x003c:
            r6 = r4
        L_0x003d:
            r3.o = r6
            if (r9 == 0) goto L_0x0055
            java.lang.String r4 = "com.google.android.gms.location.internal.IFusedLocationProviderCallback"
            android.os.IInterface r5 = r9.queryLocalInterface(r4)
            boolean r6 = r5 instanceof defpackage.ekg
            if (r6 == 0) goto L_0x004f
            r4 = r5
            ekg r4 = (defpackage.ekg) r4
            goto L_0x0055
        L_0x004f:
            ujg r5 = new ujg
            r5.<init>(r9, r4, r0)
            r4 = r5
        L_0x0055:
            r3.Y = r4
            r3.Z = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhg.<init>(int, lhg, android.os.IBinder, android.os.IBinder, android.app.PendingIntent, android.os.IBinder, java.lang.String):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.P(parcel, 2, this.b, i);
        IBinder iBinder = null;
        alg alg = this.c;
        ay7.O(parcel, 3, alg == null ? null : alg.asBinder());
        ay7.P(parcel, 4, this.X, i);
        tkg tkg = this.o;
        ay7.O(parcel, 5, tkg == null ? null : tkg.asBinder());
        ekg ekg = this.Y;
        if (ekg != null) {
            iBinder = ekg.asBinder();
        }
        ay7.O(parcel, 6, iBinder);
        ay7.Q(parcel, 8, this.Z);
        ay7.W(parcel, T);
    }
}
