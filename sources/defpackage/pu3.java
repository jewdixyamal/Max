package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: pu3  reason: default package */
public final /* synthetic */ class pu3 implements aoc {
    public final /* synthetic */ uu3 a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Bundle d;

    public /* synthetic */ pu3(uu3 uu3, Intent intent, int i, Bundle bundle) {
        this.a = uu3;
        this.b = intent;
        this.c = i;
        this.d = bundle;
    }

    public final void a() {
        uu3 uu3 = this.a;
        uu3.router.V(uu3.instanceId, this.b, this.c, this.d);
    }
}
