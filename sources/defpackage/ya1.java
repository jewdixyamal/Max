package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import one.me.android.calls.CallNotifierBroadcastReceiver;
import one.me.android.calls.CallNotifierFixActivity;

/* renamed from: ya1  reason: default package */
public final class ya1 {
    public final je7 a;

    public ya1(je7 je7) {
        this.a = je7;
    }

    public static void b(Intent intent, y21 y21, boolean z) {
        intent.setAction("action-open-incoming");
        CharSequence charSequence = y21.c;
        if (charSequence == null) {
            charSequence = "";
        }
        intent.putExtra("incoming_param_name", charSequence);
        String str = y21.d;
        intent.putExtra("incoming_param_avatar", str != null ? Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 0) : null);
        Long l = y21.a;
        intent.putExtra("incoming_param_chat_id", l != null ? l.longValue() : 0);
        intent.putExtra("incoming_param_is_video", z);
        intent.setFlags(268435456);
    }

    public final PendingIntent a(Application application, m56 m56) {
        if (gcf.a >= 31) {
            Intent intent = new Intent(application, CallNotifierFixActivity.class);
            m56.invoke(intent);
            return PendingIntent.getActivity(application, 0, intent, 201326592);
        }
        Intent intent2 = new Intent(application, CallNotifierBroadcastReceiver.class);
        m56.invoke(intent2);
        return PendingIntent.getBroadcast(application, 0, intent2, 201326592);
    }

    public final Application c() {
        return (Application) this.a.getValue();
    }

    public final PendingIntent d() {
        Application c = c();
        if (gcf.a >= 31) {
            Intent intent = new Intent(c, CallNotifierFixActivity.class);
            intent.setAction("action-microphone-state");
            return PendingIntent.getActivity(c, 0, intent, 201326592);
        }
        Intent intent2 = new Intent(c, CallNotifierBroadcastReceiver.class);
        intent2.setAction("action-microphone-state");
        return PendingIntent.getBroadcast(c, 0, intent2, 201326592);
    }
}
