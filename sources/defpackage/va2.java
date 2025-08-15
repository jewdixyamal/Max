package defpackage;

/* renamed from: va2  reason: default package */
public final class va2 {
    public final /* synthetic */ zb2 a;

    public va2(zb2 zb2) {
        this.a = zb2;
    }

    @uae
    public final void onEvent(ut7 ut7) {
        String str = zb2.K0;
        hm9.m(str + "/bus", "LoginEvent", new Object[0]);
        zb2 zb2 = this.a;
        vxd vxd = zb2.y0;
        if (vxd != null && vxd.isCancelled()) {
            zb2.i();
        }
        sd7 sd7 = zb2.A0;
        if (sd7 != null && sd7.h()) {
            zb2.h();
        }
    }
}
