package defpackage;

import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* renamed from: zbf  reason: default package */
public final class zbf implements SystemServicesManager$PushTokenGeneratedListener {
    public final je7 a;
    public final je7 b;

    public zbf(v4 v4Var) {
        this.a = v4Var.d(f5a.class);
        this.b = v4Var.d(pk.class);
    }

    public final void onPushTokenGenerated(String str) {
        oq0 c = ((f5a) this.a.getValue()).c();
        if (c.a && !c.b) {
            ((k4a) ((pk) this.b.getValue())).s();
        }
    }
}
