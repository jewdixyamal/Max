package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.UUID;

public class SystemForegroundService extends hh7 implements the {
    public static final String Y = a14.O("SystemFgService");
    public NotificationManager X;
    public Handler b;
    public boolean c;
    public uhe o;

    public final void a() {
        this.b = new Handler(Looper.getMainLooper());
        this.X = (NotificationManager) getApplicationContext().getSystemService("notification");
        uhe uhe = new uhe(getApplicationContext());
        this.o = uhe;
        if (uhe.t0 != null) {
            a14.u().q(uhe.u0, "A callback already exists.");
        } else {
            uhe.t0 = this;
        }
    }

    public final void onCreate() {
        super.onCreate();
        a();
    }

    public final void onDestroy() {
        super.onDestroy();
        this.o.g();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.c;
        String str = Y;
        if (z) {
            a14.u().x(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.o.g();
            a();
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        uhe uhe = this.o;
        uhe.getClass();
        String action = intent.getAction();
        boolean equals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = uhe.u0;
        if (equals) {
            a14 u = a14.u();
            u.x(str2, "Started foreground service " + intent);
            uhe.b.l(new h76((Object) uhe, (Object) intent.getStringExtra("KEY_WORKSPEC_ID"), false, 26));
            uhe.e(intent);
            return 3;
        } else if ("ACTION_NOTIFY".equals(action)) {
            uhe.e(intent);
            return 3;
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            a14 u2 = a14.u();
            u2.x(str2, "Stopping foreground work for " + intent);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            UUID fromString = UUID.fromString(stringExtra);
            s7g s7g = uhe.a;
            s7g.getClass();
            s7g.d.l(new ly1(s7g, fromString));
            return 3;
        } else if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        } else {
            a14.u().x(str2, "Stopping foreground service");
            the the = uhe.t0;
            if (the == null) {
                return 3;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) the;
            systemForegroundService.c = true;
            a14.u().n(str, "All commands completed.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
            return 3;
        }
    }
}
