package defpackage;

import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* renamed from: qie  reason: default package */
public final /* synthetic */ class qie implements SystemServicesManager$PushTokenGeneratedListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ xie b;

    public /* synthetic */ qie(String str, xie xie) {
        this.a = str;
        this.b = xie;
    }

    public final void onPushTokenGenerated(String str) {
        if (!tpa.f(this.a, str)) {
            xie xie = this.b;
            hm9.m(xie.a, "checkTokenChanged: token changed", new Object[0]);
            ((SystemServicesManager$PushTokenGeneratedListener) xie.X.getValue()).onPushTokenGenerated(str);
        }
    }
}
