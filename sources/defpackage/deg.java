package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* renamed from: deg  reason: default package */
public final class deg extends peg {
    public final qjg b;

    public deg(qjg qjg) {
        super(1);
        this.b = qjg;
    }

    public final void a(Status status) {
        try {
            this.b.U(status);
        } catch (IllegalStateException unused) {
        }
    }

    public final void b(RuntimeException runtimeException) {
        try {
            this.b.U(new Status(10, rh4.j(runtimeException.getClass().getSimpleName(), ": ", runtimeException.getLocalizedMessage()), (PendingIntent) null, (ph3) null));
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.kdg r6) {
        /*
            r5 = this;
            qjg r0 = r5.b     // Catch:{ RuntimeException -> 0x002a }
            ok r6 = r6.d     // Catch:{ RuntimeException -> 0x002a }
            r0.getClass()     // Catch:{ RuntimeException -> 0x002a }
            r1 = 0
            r2 = 8
            r0.T(r6)     // Catch:{ DeadObjectException -> 0x001c, RemoteException -> 0x000e }
            goto L_0x001b
        L_0x000e:
            r6 = move-exception
            com.google.android.gms.common.api.Status r3 = new com.google.android.gms.common.api.Status     // Catch:{ RuntimeException -> 0x002a }
            java.lang.String r6 = r6.getLocalizedMessage()     // Catch:{ RuntimeException -> 0x002a }
            r3.<init>(r2, r6, r1, r1)     // Catch:{ RuntimeException -> 0x002a }
            r0.U(r3)     // Catch:{ RuntimeException -> 0x002a }
        L_0x001b:
            return
        L_0x001c:
            r6 = move-exception
            com.google.android.gms.common.api.Status r3 = new com.google.android.gms.common.api.Status     // Catch:{ RuntimeException -> 0x002a }
            java.lang.String r4 = r6.getLocalizedMessage()     // Catch:{ RuntimeException -> 0x002a }
            r3.<init>(r2, r4, r1, r1)     // Catch:{ RuntimeException -> 0x002a }
            r0.U(r3)     // Catch:{ RuntimeException -> 0x002a }
            throw r6     // Catch:{ RuntimeException -> 0x002a }
        L_0x002a:
            r6 = move-exception
            r5.b(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deg.c(kdg):void");
    }

    public final void d(aab aab, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        qjg qjg = this.b;
        ((Map) aab.a).put(qjg, valueOf);
        qjg.O(new fdg(aab, qjg));
    }
}
