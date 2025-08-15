package defpackage;

import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: kwf  reason: default package */
public final /* synthetic */ class kwf implements k64 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ long a;
    public final /* synthetic */ osf b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ String o;

    public /* synthetic */ kwf(long j, osf osf, Long l, String str, boolean z, int i) {
        this.a = j;
        this.b = osf;
        this.c = l;
        this.o = str;
        this.X = z;
        this.Y = i;
    }

    public final Object a() {
        return new WebAppRootScreen(this.a, this.b, this.c, this.o, this.X, this.Y);
    }
}
