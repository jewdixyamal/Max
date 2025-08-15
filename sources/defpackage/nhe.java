package defpackage;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: nhe  reason: default package */
public final class nhe implements Runnable {
    public final /* synthetic */ int a;
    public final phe b;

    public /* synthetic */ nhe(phe phe, int i) {
        this.a = i;
        this.b = phe;
    }

    public final void run() {
        k40 k40;
        nhe nhe;
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                synchronized (this.b.Z) {
                    phe phe = this.b;
                    phe.s0 = (Intent) phe.Z.get(0);
                }
                Intent intent = this.b.s0;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.b.s0.getIntExtra("KEY_START_ID", 0);
                    a14 u = a14.u();
                    String str = phe.u0;
                    u.n(str, "Processing command " + this.b.s0 + ", " + intExtra);
                    PowerManager.WakeLock a2 = qrf.a(this.b.a, action + " (" + intExtra + ")");
                    try {
                        a14.u().n(str, "Acquiring operation wake lock (" + action + ") " + a2);
                        a2.acquire();
                        phe phe2 = this.b;
                        phe2.Y.a(phe2.s0, intExtra, phe2);
                        a14.u().n(str, "Releasing operation wake lock (" + action + ") " + a2);
                        a2.release();
                        phe phe3 = this.b;
                        k40 = (k40) ((bkb) phe3.b).c;
                        nhe = new nhe(phe3, 1);
                    } catch (Throwable th) {
                        a14.u().n(phe.u0, "Releasing operation wake lock (" + action + ") " + a2);
                        a2.release();
                        phe phe4 = this.b;
                        ((k40) ((bkb) phe4.b).c).execute(new nhe(phe4, 1));
                        throw th;
                    }
                    k40.execute(nhe);
                    return;
                }
                return;
            default:
                phe phe5 = this.b;
                phe5.getClass();
                a14 u2 = a14.u();
                String str2 = phe.u0;
                u2.n(str2, "Checking if commands are complete.");
                phe.c();
                synchronized (phe5.Z) {
                    try {
                        if (phe5.s0 != null) {
                            a14.u().n(str2, "Removing command " + phe5.s0);
                            if (((Intent) phe5.Z.remove(0)).equals(phe5.s0)) {
                                phe5.s0 = null;
                            } else {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                        }
                        qm qmVar = (qm) ((bkb) phe5.b).a;
                        d73 d73 = phe5.Y;
                        synchronized (d73.c) {
                            z = !d73.b.isEmpty();
                        }
                        if (!z) {
                            if (phe5.Z.isEmpty()) {
                                synchronized (qmVar.X) {
                                    z2 = !qmVar.b.isEmpty();
                                }
                                if (!z2) {
                                    a14.u().n(str2, "No more commands & intents.");
                                    ohe ohe = phe5.t0;
                                    if (ohe != null) {
                                        ((SystemAlarmService) ohe).a();
                                    }
                                }
                            }
                        }
                        if (!phe5.Z.isEmpty()) {
                            phe5.d();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
