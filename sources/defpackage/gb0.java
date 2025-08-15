package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gb0  reason: default package */
public final class gb0 {
    public Object a;
    public int b;
    public Object c;
    public Object d;
    public Object e = oaf.p((hl4) null);
    public Object f;
    public Object g;

    public gb0(Context context, q64 q64, zhc zhc) {
        this.a = context.getApplicationContext();
        this.c = q64;
        this.d = zhc;
    }

    public hb0 a() {
        String str = this.b == 0 ? " registrationStatus" : "";
        if (((Long) this.f) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.g) == null) {
            str = au1.g(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new hb0(this.b, ((Long) this.f).longValue(), ((Long) this.g).longValue(), (String) this.a, (String) this.c, (String) this.d, (String) this.e);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void b() {
        int a2 = ((zhc) this.d).a((Context) this.a);
        if (this.b != a2) {
            this.b = a2;
            ((so4) ((q64) this.c).b).b(this, a2);
        }
    }

    public boolean c() {
        return (this.b < ((List) this.a).size()) || (((ArrayList) this.d).isEmpty() ^ true);
    }

    public int d() {
        zhc zhc = (zhc) this.d;
        Context context = (Context) this.a;
        this.b = zhc.a(context);
        IntentFilter intentFilter = new IntentFilter();
        int i = zhc.a;
        if ((i & 1) != 0) {
            if (oaf.a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                connectivityManager.getClass();
                bic bic = new bic(this);
                this.g = bic;
                connectivityManager.registerDefaultNetworkCallback(bic);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if ((i & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((i & 4) != 0) {
            if (oaf.a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if ((i & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        an anVar = new an(11, this);
        this.f = anVar;
        context.registerReceiver(anVar, intentFilter, (String) null, (Handler) this.e);
        return this.b;
    }
}
