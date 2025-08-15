package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: phe  reason: default package */
public final class phe implements w45 {
    public static final String u0 = a14.O("SystemAlarmDispatcher");
    public final s7g X;
    public final d73 Y;
    public final ArrayList Z = new ArrayList();
    public final Context a;
    public final wne b;
    public final n8g c;
    public final y9b o;
    public Intent s0 = null;
    public ohe t0;

    public phe(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.Y = new d73(applicationContext, new bdb(6));
        s7g d = s7g.d(context);
        this.X = d;
        this.c = new n8g(d.b.e);
        y9b y9b = d.f;
        this.o = y9b;
        this.b = d.d;
        y9b.a(this);
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(Intent intent, int i) {
        a14 u = a14.u();
        String str = u0;
        u.n(str, "Adding command " + intent + " (" + i + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            a14.u().R(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.Z) {
                try {
                    Iterator it = this.Z.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.Z) {
            try {
                boolean z = !this.Z.isEmpty();
                this.Z.add(intent);
                if (!z) {
                    d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(l7g l7g, boolean z) {
        String str = d73.X;
        Intent intent = new Intent(this.a, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        d73.d(intent, l7g);
        ((k40) ((bkb) this.b).c).execute(new eo((Object) this, (Object) intent, 0, 4));
    }

    public final void d() {
        c();
        PowerManager.WakeLock a2 = qrf.a(this.a, "ProcessCommand");
        try {
            a2.acquire();
            this.X.d.l(new nhe(this, 0));
        } finally {
            a2.release();
        }
    }
}
