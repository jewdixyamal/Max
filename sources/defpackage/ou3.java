package defpackage;

import android.content.Intent;

/* renamed from: ou3  reason: default package */
public final /* synthetic */ class ou3 implements aoc {
    public final /* synthetic */ int a;
    public final /* synthetic */ uu3 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Cloneable d;

    public /* synthetic */ ou3(uu3 uu3, Cloneable cloneable, int i, int i2) {
        this.a = i2;
        this.b = uu3;
        this.d = cloneable;
        this.c = i;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                uu3 uu3 = this.b;
                uu3.router.U(uu3.instanceId, (Intent) this.d, this.c);
                return;
            default:
                uu3 uu32 = this.b;
                uu32.router.M(uu32.instanceId, (String[]) this.d, this.c);
                return;
        }
    }
}
