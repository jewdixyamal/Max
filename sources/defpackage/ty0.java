package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.MainActivity;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;

/* renamed from: ty0  reason: default package */
public final class ty0 {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public ty0(je7 je7, je7 je72, je7 je73) {
        this.a = je72;
        this.b = je73;
        this.c = je7;
    }

    public final boolean a(Context context, Intent intent, String str) {
        Context context2 = context;
        hm9.m("CallActionsProcessor", "handleCallNotificationActionIntent action=" + intent.getAction() + " from=" + str, new Object[0]);
        String action = intent.getAction();
        if (action == null) {
            return false;
        }
        z01 z01 = (z01) n31.a.getAccessor().c(z01.class);
        wa1 d = oz7.d(action);
        Class<MainActivity> cls = MainActivity.class;
        if (d.equals(sa1.a)) {
            Intent intent2 = new Intent(context2, cls);
            intent2.setAction("action-open-call");
            intent2.setFlags(268435456);
            context2.startActivity(intent2);
        } else {
            boolean equals = d.equals(na1.a);
            je7 je7 = this.c;
            if (equals) {
                if (((eua) this.a.getValue()).b(eua.h)) {
                    ((wr1) ((kr1) je7.getValue())).e();
                    Intent intent3 = new Intent(context2, cls);
                    intent3.setAction("action-open-call");
                    intent3.setFlags(268435456);
                    context2.startActivity(intent3);
                } else {
                    Bundle extras = intent.getExtras();
                    Intent intent4 = new Intent(context2, cls);
                    intent4.setAction("action-open-incoming");
                    if (extras != null) {
                        intent4.putExtras(extras);
                    }
                    intent4.setFlags(268435456);
                    context2.startActivity(intent4);
                }
            } else if (d.equals(qa1.a)) {
                ((wr1) ((kr1) je7.getValue())).v();
            } else if (d.equals(oa1.a)) {
                bt1 bt1 = (bt1) this.b.getValue();
                String str2 = ((wr1) ((kr1) je7.getValue())).k().c;
                a11 a11 = (a11) z01;
                long j = a11.d() ? 0 : 1;
                boolean z = ((wr1) ((kr1) je7.getValue())).k().h;
                bt1.getClass();
                bt1.c(bt1, "AUDIO_ENABLED", str2, (String) null, Long.valueOf(j), (String) null, (String) null, z, 52);
                boolean z2 = !a11.d();
                MicrophoneManager c2 = a11.c();
                if (c2 != null) {
                    c2.setMicEnabled(z2);
                }
            } else if (d.equals(pa1.a)) {
                ((wr1) ((kr1) je7.getValue())).w(ji6.c);
            } else if (d.equals(ta1.a)) {
                Bundle extras2 = intent.getExtras();
                Intent intent5 = new Intent(context2, cls);
                intent5.setAction("action-open-incoming");
                if (extras2 != null) {
                    intent5.putExtras(extras2);
                }
                intent5.setFlags(268435456);
                context2.startActivity(intent5);
            } else if (d.equals(ra1.a)) {
                Bundle extras3 = intent.getExtras();
                Intent intent6 = new Intent(context2, cls);
                intent6.setAction("action-join-link");
                if (extras3 != null) {
                    intent6.putExtras(extras3);
                }
                intent6.setFlags(268435456);
                context2.startActivity(intent6);
            } else if (d.equals(ua1.a)) {
                Bundle extras4 = intent.getExtras();
                Intent intent7 = new Intent(context2, cls);
                intent7.setAction("action-rate-call");
                if (extras4 != null) {
                    intent7.putExtras(extras4);
                }
                intent7.setFlags(268435456);
                context2.startActivity(intent7);
            } else if (d.equals(va1.a)) {
                return false;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }
}
