package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.ref.WeakReference;

/* renamed from: ga8  reason: default package */
public final class ga8 extends Binder implements kr6 {
    public final WeakReference c;

    public ga8(w98 w98) {
        attachInterface(this, "androidx.media3.session.IMediaController");
        this.c = new WeakReference(w98);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, kr6, jr6] */
    public static kr6 k(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (queryLocalInterface != null && (queryLocalInterface instanceof kr6)) {
            return (kr6) queryLocalInterface;
        }
        ? obj = new Object();
        obj.c = iBinder;
        return obj;
    }

    public final void A(int i, Bundle bundle) {
        if (bundle != null) {
            try {
                R(new ea8(k3b.c(bundle)));
            } catch (RuntimeException e) {
                z04.d0("Ignoring malformed Bundle for Commands", e);
            }
        }
    }

    public final void D(int i, Bundle bundle) {
        if (bundle != null) {
            try {
                R(new z16(22, qad.b(bundle)));
            } catch (RuntimeException e) {
                z04.d0("Ignoring malformed Bundle for SessionPositionInfo", e);
            }
        }
    }

    public final void F0(int i, Bundle bundle) {
        if (bundle != null) {
            try {
                G0(i, sad.a(bundle));
            } catch (RuntimeException e) {
                z04.d0("Ignoring malformed Bundle for SessionResult", e);
            }
        }
    }

    public final void G0(int i, Object obj) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            w98 w98 = (w98) this.c.get();
            if (w98 != null) {
                w98.b.s(i, obj);
                w98.a.G(new l40(i, 11, w98));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f A[Catch:{ RuntimeException -> 0x0047 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020 A[Catch:{ RuntimeException -> 0x0047 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H(int r4, android.os.Bundle r5, android.os.Bundle r6) {
        /*
            r3 = this;
            if (r5 == 0) goto L_0x004d
            if (r6 != 0) goto L_0x0005
            goto L_0x004d
        L_0x0005:
            java.lang.ref.WeakReference r4 = r3.c     // Catch:{ RuntimeException -> 0x0047 }
            java.lang.Object r4 = r4.get()     // Catch:{ RuntimeException -> 0x0047 }
            w98 r4 = (defpackage.w98) r4     // Catch:{ RuntimeException -> 0x0047 }
            r0 = -1
            if (r4 != 0) goto L_0x0012
        L_0x0010:
            r4 = r0
            goto L_0x001d
        L_0x0012:
            obd r4 = r4.k     // Catch:{ RuntimeException -> 0x0047 }
            if (r4 != 0) goto L_0x0017
            goto L_0x0010
        L_0x0017:
            nbd r4 = r4.a     // Catch:{ RuntimeException -> 0x0047 }
            int r4 = r4.f()     // Catch:{ RuntimeException -> 0x0047 }
        L_0x001d:
            if (r4 != r0) goto L_0x0020
            return
        L_0x0020:
            m4b r4 = defpackage.m4b.r(r4, r5)     // Catch:{ RuntimeException -> 0x0047 }
            k4b r5 = new k4b     // Catch:{ RuntimeException -> 0x0040 }
            java.lang.String r0 = defpackage.k4b.d     // Catch:{ RuntimeException -> 0x0040 }
            r1 = 0
            boolean r0 = r6.getBoolean(r0, r1)     // Catch:{ RuntimeException -> 0x0040 }
            java.lang.String r2 = defpackage.k4b.e     // Catch:{ RuntimeException -> 0x0040 }
            boolean r6 = r6.getBoolean(r2, r1)     // Catch:{ RuntimeException -> 0x0040 }
            r5.<init>(r0, r6)     // Catch:{ RuntimeException -> 0x0040 }
            y98 r6 = new y98
            r0 = 1
            r6.<init>((java.lang.Object) r4, (int) r0, (java.lang.Object) r5)
            r3.R(r6)
            return
        L_0x0040:
            r3 = move-exception
            java.lang.String r4 = "Ignoring malformed Bundle for BundlingExclusions"
            defpackage.z04.d0(r4, r3)
            return
        L_0x0047:
            r3 = move-exception
            java.lang.String r4 = "Ignoring malformed Bundle for PlayerInfo"
            defpackage.z04.d0(r4, r3)
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ga8.H(int, android.os.Bundle, android.os.Bundle):void");
    }

    public final void M(int i, Bundle bundle) {
        if (bundle != null) {
            try {
                G0(i, wf7.a(bundle));
            } catch (RuntimeException e) {
                z04.d0("Ignoring malformed Bundle for LibraryResult", e);
            }
        }
    }

    public final void R(fa8 fa8) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            w98 w98 = (w98) this.c.get();
            if (w98 != null) {
                oaf.W(w98.a.X, new vs5(w98, 17, fa8));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final IBinder asBinder() {
        return this;
    }

    public final void b(int i) {
        R(new kp7(25));
    }

    public final void c(int i) {
        R(new kp7(26));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4, types: [int] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0180 A[Catch:{ RuntimeException -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0182 A[Catch:{ RuntimeException -> 0x019f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
        /*
            r3 = this;
            java.lang.String r0 = "androidx.media3.session.IMediaController"
            r1 = 1
            if (r4 < r1) goto L_0x000d
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r2) goto L_0x000d
            r5.enforceInterface(r0)
        L_0x000d:
            r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r4 == r2) goto L_0x0260
            r0 = 4001(0xfa1, float:5.607E-42)
            java.lang.String r2 = "Ignoring malformed Bundle for LibraryParams"
            if (r4 == r0) goto L_0x0226
            r0 = 4002(0xfa2, float:5.608E-42)
            if (r4 == r0) goto L_0x01e9
            r0 = 0
            switch(r4) {
                case 3001: goto L_0x01d8;
                case 3002: goto L_0x01c7;
                case 3003: goto L_0x01b6;
                case 3004: goto L_0x0158;
                case 3005: goto L_0x0124;
                case 3006: goto L_0x011b;
                case 3007: goto L_0x0103;
                case 3008: goto L_0x00f2;
                case 3009: goto L_0x00e1;
                case 3010: goto L_0x00a7;
                case 3011: goto L_0x009e;
                case 3012: goto L_0x007e;
                case 3013: goto L_0x0067;
                case 3014: goto L_0x0047;
                case 3015: goto L_0x0025;
                default: goto L_0x0020;
            }
        L_0x0020:
            boolean r3 = super.onTransact(r4, r5, r6, r7)
            return r3
        L_0x0025:
            r5.readInt()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            java.lang.Object r4 = defpackage.od2.b(r5, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            defpackage.iad.a(r4)     // Catch:{ RuntimeException -> 0x003f }
            kp7 r4 = new kp7
            r5 = 23
            r4.<init>(r5)
            r3.R(r4)
            goto L_0x025f
        L_0x003f:
            r3 = move-exception
            java.lang.String r4 = "Ignoring malformed Bundle for SessionError"
            defpackage.z04.d0(r4, r3)
            goto L_0x025f
        L_0x0047:
            r5.readInt()
            android.os.Parcelable$Creator r4 = android.app.PendingIntent.CREATOR
            java.lang.Object r4 = defpackage.od2.b(r5, r4)
            android.app.PendingIntent r4 = (android.app.PendingIntent) r4
            if (r4 != 0) goto L_0x005b
            java.lang.String r3 = "Ignoring null session activity intent"
            defpackage.z04.c0(r3)
            goto L_0x025f
        L_0x005b:
            kp7 r4 = new kp7
            r5 = 28
            r4.<init>(r5)
            r3.R(r4)
            goto L_0x025f
        L_0x0067:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r7 = defpackage.od2.b(r5, r6)
            android.os.Bundle r7 = (android.os.Bundle) r7
            java.lang.Object r5 = defpackage.od2.b(r5, r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r3.H(r4, r7, r5)
            goto L_0x025f
        L_0x007e:
            r5.readInt()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            java.lang.Object r4 = defpackage.od2.b(r5, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            if (r4 != 0) goto L_0x0092
            java.lang.String r3 = "Ignoring null Bundle for extras"
            defpackage.z04.c0(r3)
            goto L_0x025f
        L_0x0092:
            kp7 r4 = new kp7
            r5 = 29
            r4.<init>(r5)
            r3.R(r4)
            goto L_0x025f
        L_0x009e:
            int r4 = r5.readInt()
            r3.b(r4)
            goto L_0x025f
        L_0x00a7:
            r5.readInt()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            java.lang.Object r6 = defpackage.od2.b(r5, r4)
            android.os.Bundle r6 = (android.os.Bundle) r6
            java.lang.Object r4 = defpackage.od2.b(r5, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            if (r6 == 0) goto L_0x025f
            if (r4 != 0) goto L_0x00be
            goto L_0x025f
        L_0x00be:
            z9d r5 = defpackage.z9d.b(r6)     // Catch:{ RuntimeException -> 0x00d9 }
            k3b r4 = defpackage.k3b.c(r4)     // Catch:{ RuntimeException -> 0x00d1 }
            y98 r6 = new y98
            r7 = 2
            r6.<init>((java.lang.Object) r5, (int) r7, (java.lang.Object) r4)
            r3.R(r6)
            goto L_0x025f
        L_0x00d1:
            r3 = move-exception
            java.lang.String r4 = "Ignoring malformed Bundle for Commands"
            defpackage.z04.d0(r4, r3)
            goto L_0x025f
        L_0x00d9:
            r3 = move-exception
            java.lang.String r4 = "Ignoring malformed Bundle for SessionCommands"
            defpackage.z04.d0(r4, r3)
            goto L_0x025f
        L_0x00e1:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r5 = defpackage.od2.b(r5, r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r3.A(r4, r5)
            goto L_0x025f
        L_0x00f2:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r5 = defpackage.od2.b(r5, r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r3.D(r4, r5)
            goto L_0x025f
        L_0x0103:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r6 = defpackage.od2.b(r5, r6)
            android.os.Bundle r6 = (android.os.Bundle) r6
            int r5 = r5.readInt()
            if (r5 == 0) goto L_0x0116
            r0 = r1
        L_0x0116:
            r3.q0(r4, r6, r0)
            goto L_0x025f
        L_0x011b:
            int r4 = r5.readInt()
            r3.c(r4)
            goto L_0x025f
        L_0x0124:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r7 = defpackage.od2.b(r5, r6)
            android.os.Bundle r7 = (android.os.Bundle) r7
            java.lang.Object r5 = defpackage.od2.b(r5, r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
            if (r7 == 0) goto L_0x0151
            if (r5 != 0) goto L_0x013b
            goto L_0x0151
        L_0x013b:
            y9d r6 = defpackage.y9d.a(r7)     // Catch:{ RuntimeException -> 0x0149 }
            z64 r7 = new z64
            r7.<init>((int) r4, (defpackage.y9d) r6, (android.os.Bundle) r5)
            r3.R(r7)
            goto L_0x025f
        L_0x0149:
            r3 = move-exception
            java.lang.String r4 = "Ignoring malformed Bundle for SessionCommand"
            defpackage.z04.d0(r4, r3)
            goto L_0x025f
        L_0x0151:
            java.lang.String r3 = "Ignoring custom command with null args."
            defpackage.z04.c0(r3)
            goto L_0x025f
        L_0x0158:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.util.ArrayList r5 = r5.createTypedArrayList(r6)
            if (r5 != 0) goto L_0x0166
            goto L_0x025f
        L_0x0166:
            java.lang.ref.WeakReference r6 = r3.c     // Catch:{ RuntimeException -> 0x019f }
            java.lang.Object r6 = r6.get()     // Catch:{ RuntimeException -> 0x019f }
            w98 r6 = (defpackage.w98) r6     // Catch:{ RuntimeException -> 0x019f }
            r7 = -1
            if (r6 != 0) goto L_0x0173
        L_0x0171:
            r6 = r7
            goto L_0x017e
        L_0x0173:
            obd r6 = r6.k     // Catch:{ RuntimeException -> 0x019f }
            if (r6 != 0) goto L_0x0178
            goto L_0x0171
        L_0x0178:
            nbd r6 = r6.a     // Catch:{ RuntimeException -> 0x019f }
            int r6 = r6.f()     // Catch:{ RuntimeException -> 0x019f }
        L_0x017e:
            if (r6 != r7) goto L_0x0182
            goto L_0x025f
        L_0x0182:
            ww6 r7 = defpackage.zw6.i()     // Catch:{ RuntimeException -> 0x019f }
        L_0x0186:
            int r2 = r5.size()     // Catch:{ RuntimeException -> 0x019f }
            if (r0 >= r2) goto L_0x01a1
            java.lang.Object r2 = r5.get(r0)     // Catch:{ RuntimeException -> 0x019f }
            android.os.Bundle r2 = (android.os.Bundle) r2     // Catch:{ RuntimeException -> 0x019f }
            r2.getClass()     // Catch:{ RuntimeException -> 0x019f }
            c73 r2 = defpackage.c73.b(r6, r2)     // Catch:{ RuntimeException -> 0x019f }
            r7.a(r2)     // Catch:{ RuntimeException -> 0x019f }
            int r0 = r0 + 1
            goto L_0x0186
        L_0x019f:
            r3 = move-exception
            goto L_0x01af
        L_0x01a1:
            ffc r5 = r7.j()     // Catch:{ RuntimeException -> 0x019f }
            hd0 r6 = new hd0
            r6.<init>(r4, r5)
            r3.R(r6)
            goto L_0x025f
        L_0x01af:
            java.lang.String r4 = "Ignoring malformed Bundle for CommandButton"
            defpackage.z04.d0(r4, r3)
            goto L_0x025f
        L_0x01b6:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r5 = defpackage.od2.b(r5, r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r3.M(r4, r5)
            goto L_0x025f
        L_0x01c7:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r5 = defpackage.od2.b(r5, r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r3.F0(r4, r5)
            goto L_0x025f
        L_0x01d8:
            int r4 = r5.readInt()
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            java.lang.Object r5 = defpackage.od2.b(r5, r6)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r3.r(r4, r5)
            goto L_0x025f
        L_0x01e9:
            r5.readInt()
            java.lang.String r4 = r5.readString()
            int r6 = r5.readInt()
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            java.lang.Object r5 = defpackage.od2.b(r5, r7)
            android.os.Bundle r5 = (android.os.Bundle) r5
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0208
            java.lang.String r3 = "onSearchResultChanged(): Ignoring empty query"
            defpackage.z04.c0(r3)
            goto L_0x025f
        L_0x0208:
            if (r6 >= 0) goto L_0x0210
            java.lang.String r3 = "onSearchResultChanged(): Ignoring negative itemCount: "
        L_0x020c:
            defpackage.ey8.k(r6, r3)
            goto L_0x025f
        L_0x0210:
            if (r5 != 0) goto L_0x0213
            goto L_0x0216
        L_0x0213:
            defpackage.oc8.a(r5)     // Catch:{ RuntimeException -> 0x0221 }
        L_0x0216:
            kp7 r4 = new kp7
            r5 = 24
            r4.<init>(r5)
            r3.R(r4)
            goto L_0x025f
        L_0x0221:
            r3 = move-exception
            defpackage.z04.d0(r2, r3)
            goto L_0x025f
        L_0x0226:
            r5.readInt()
            java.lang.String r4 = r5.readString()
            int r6 = r5.readInt()
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            java.lang.Object r5 = defpackage.od2.b(r5, r7)
            android.os.Bundle r5 = (android.os.Bundle) r5
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0245
            java.lang.String r3 = "onChildrenChanged(): Ignoring empty parentId"
            defpackage.z04.c0(r3)
            goto L_0x025f
        L_0x0245:
            if (r6 >= 0) goto L_0x024a
            java.lang.String r3 = "onChildrenChanged(): Ignoring negative itemCount: "
            goto L_0x020c
        L_0x024a:
            if (r5 != 0) goto L_0x024d
            goto L_0x0250
        L_0x024d:
            defpackage.oc8.a(r5)     // Catch:{ RuntimeException -> 0x025b }
        L_0x0250:
            kp7 r4 = new kp7
            r5 = 27
            r4.<init>(r5)
            r3.R(r4)
            goto L_0x025f
        L_0x025b:
            r3 = move-exception
            defpackage.z04.d0(r2, r3)
        L_0x025f:
            return r1
        L_0x0260:
            r6.writeString(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ga8.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public final void q0(int i, Bundle bundle, boolean z) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(k4b.d, z);
        bundle2.putBoolean(k4b.e, true);
        H(i, bundle, bundle2);
    }

    public final void r(int i, Bundle bundle) {
        if (bundle != null) {
            try {
                R(new z16(21, uh3.a(bundle)));
            } catch (RuntimeException e) {
                z04.d0("Malformed Bundle for ConnectionResult. Disconnected from the session.", e);
                c(i);
            }
        }
    }
}
