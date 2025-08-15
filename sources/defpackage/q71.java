package defpackage;

import android.os.Vibrator;

/* renamed from: q71  reason: default package */
public final class q71 {
    public final je7 a;
    public final je7 b;

    public q71(je7 je7, je7 je72) {
        this.a = je7;
        this.b = je72;
    }

    public final void a() {
        hm9.m("HandleSilenceMode", "try mute ringtones", new Object[0]);
        xh1 a2 = ((lkc) this.b.getValue()).a();
        if (a2.g == null && ((Vibrator) a2.e.getValue()) == null) {
            hm9.m("RingtoneManagerTag", " mute already set", new Object[0]);
            return;
        }
        hm9.m("RingtoneManagerTag", " set mute", new Object[0]);
        a2.c();
    }
}
