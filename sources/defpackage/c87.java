package defpackage;

import android.content.Intent;

/* renamed from: c87  reason: default package */
public final class c87 implements d87 {
    public final Intent a;
    public final int b;
    public final /* synthetic */ i87 c;

    public c87(i87 i87, Intent intent, int i) {
        this.c = i87;
        this.a = intent;
        this.b = i;
    }

    public final void a() {
        this.c.stopSelf(this.b);
    }

    public final Intent getIntent() {
        return this.a;
    }
}
