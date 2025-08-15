package defpackage;

import java.util.EnumMap;

/* renamed from: nwc  reason: default package */
public final class nwc implements k56 {
    public final /* synthetic */ rwc a;
    public final /* synthetic */ lwc b;
    public final /* synthetic */ boolean c = true;

    public nwc(rwc rwc, lwc lwc) {
        this.a = rwc;
        this.b = lwc;
    }

    public final Object invoke() {
        rwc rwc = this.a;
        iwc d = rwc.d(this.b);
        if (this.c) {
            EnumMap enumMap = rwc.v0;
            EnumMap enumMap2 = rwc.u0;
            lwc lwc = this.b;
            rwc.a(lwc, enumMap, enumMap2, new qwc(d, rwc, lwc, rwc, d));
        } else {
            d.setVisibility(8);
            rwc.removeView(d);
        }
        return Boolean.TRUE;
    }
}
