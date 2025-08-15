package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: jvc  reason: default package */
public final class jvc extends BroadcastReceiver {
    public final HashSet a = new HashSet();

    public jvc(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                lqf lqf = (lqf) it.next();
                lqf.getClass();
                hm9.m("lqf", "onScreenOff", new Object[0]);
                if (lqf.l) {
                    lqf.l = false;
                    if (lqf.k) {
                        lqf.a();
                    }
                }
            }
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                lqf lqf2 = (lqf) it2.next();
                ir6 ir6 = hm9.m;
                if (ir6 != null) {
                    lqf2.getClass();
                    if (ir6.c()) {
                        us7 us7 = us7.X;
                        ir6.d(us7, "lqf", "onScreenOn, isAppVisible=" + lqf2.k + ", isScreenOn=" + lqf2.l, (Throwable) null);
                    }
                }
                if (!lqf2.l) {
                    lqf2.l = true;
                    if (lqf2.k) {
                        lqf2.b();
                    }
                }
            }
        }
    }
}
