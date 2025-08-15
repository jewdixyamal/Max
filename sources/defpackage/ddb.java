package defpackage;

import one.me.profile.ProfileScreen;

/* renamed from: ddb  reason: default package */
public final /* synthetic */ class ddb implements k64 {
    public final /* synthetic */ long a;
    public final /* synthetic */ hdb b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ddb(long j, hdb hdb, boolean z) {
        this.a = j;
        this.b = hdb;
        this.c = z;
    }

    public final Object a() {
        return new ProfileScreen(this.a, this.b, this.c);
    }
}
