package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import java.util.Objects;

/* renamed from: v98  reason: default package */
public final class v98 implements ServiceConnection {
    public final Bundle a;
    public final /* synthetic */ w98 b;

    public v98(w98 w98, Bundle bundle) {
        this.b = w98;
        this.a = bundle;
    }

    public final void onBindingDied(ComponentName componentName) {
        a98 a98 = this.b.a;
        Objects.requireNonNull(a98);
        a98.G(new nn6(9, a98));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|(4:5|6|7|8)(3:10|11|(3:13|14|15)(2:16|17))|18|19|20|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
        r6 = r0.a;
        java.util.Objects.requireNonNull(r6);
        r6.G(new defpackage.nn6(9, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b0, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x007d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r6, android.os.IBinder r7) {
        /*
            r5 = this;
            w98 r0 = r5.b
            java.lang.String r1 = "Service "
            java.lang.String r2 = "Expected connection to "
            obd r3 = r0.e     // Catch:{ RemoteException -> 0x007d }
            nbd r3 = r3.a     // Catch:{ RemoteException -> 0x007d }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ RemoteException -> 0x007d }
            java.lang.String r4 = r6.getPackageName()     // Catch:{ RemoteException -> 0x007d }
            boolean r3 = r3.equals(r4)     // Catch:{ RemoteException -> 0x007d }
            a98 r4 = r0.a
            if (r3 != 0) goto L_0x0049
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x007d }
            r5.<init>(r2)     // Catch:{ RemoteException -> 0x007d }
            obd r7 = r0.e     // Catch:{ RemoteException -> 0x007d }
            nbd r7 = r7.a     // Catch:{ RemoteException -> 0x007d }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ RemoteException -> 0x007d }
            r5.append(r7)     // Catch:{ RemoteException -> 0x007d }
            java.lang.String r7 = " but is connected to "
            r5.append(r7)     // Catch:{ RemoteException -> 0x007d }
            r5.append(r6)     // Catch:{ RemoteException -> 0x007d }
            java.lang.String r5 = r5.toString()     // Catch:{ RemoteException -> 0x007d }
            defpackage.z04.u(r5)     // Catch:{ RemoteException -> 0x007d }
            java.util.Objects.requireNonNull(r4)
            nn6 r5 = new nn6
            r6 = 9
            r5.<init>(r6, r4)
            r4.G(r5)
            return
        L_0x0047:
            r5 = move-exception
            goto L_0x00a1
        L_0x0049:
            sr6 r7 = defpackage.aj8.k(r7)     // Catch:{ RemoteException -> 0x007d }
            if (r7 != 0) goto L_0x0062
            java.lang.String r5 = "Service interface is missing."
            defpackage.z04.u(r5)     // Catch:{ RemoteException -> 0x007d }
            java.util.Objects.requireNonNull(r4)
            nn6 r5 = new nn6
            r6 = 9
            r5.<init>(r6, r4)
            r4.G(r5)
            return
        L_0x0062:
            oh3 r2 = new oh3     // Catch:{ RemoteException -> 0x007d }
            android.content.Context r3 = r0.d     // Catch:{ RemoteException -> 0x007d }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ RemoteException -> 0x007d }
            int r4 = android.os.Process.myPid()     // Catch:{ RemoteException -> 0x007d }
            android.os.Bundle r5 = r5.a     // Catch:{ RemoteException -> 0x007d }
            r2.<init>(r3, r4, r5)     // Catch:{ RemoteException -> 0x007d }
            ga8 r5 = r0.c     // Catch:{ RemoteException -> 0x007d }
            android.os.Bundle r2 = r2.b()     // Catch:{ RemoteException -> 0x007d }
            r7.f0(r5, r2)     // Catch:{ RemoteException -> 0x007d }
            goto L_0x00a0
        L_0x007d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0047 }
            r5.<init>(r1)     // Catch:{ all -> 0x0047 }
            r5.append(r6)     // Catch:{ all -> 0x0047 }
            java.lang.String r6 = " has died prematurely"
            r5.append(r6)     // Catch:{ all -> 0x0047 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0047 }
            defpackage.z04.c0(r5)     // Catch:{ all -> 0x0047 }
            a98 r5 = r0.a
            java.util.Objects.requireNonNull(r5)
            nn6 r6 = new nn6
            r7 = 9
            r6.<init>(r7, r5)
            r5.G(r6)
        L_0x00a0:
            return
        L_0x00a1:
            a98 r6 = r0.a
            java.util.Objects.requireNonNull(r6)
            nn6 r7 = new nn6
            r0 = 9
            r7.<init>(r0, r6)
            r6.G(r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v98.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        a98 a98 = this.b.a;
        Objects.requireNonNull(a98);
        a98.G(new nn6(9, a98));
    }
}
