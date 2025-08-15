package defpackage;

import one.me.sdk.arch.Widget;

/* renamed from: h5g  reason: default package */
public final class h5g implements je7 {
    public pnf a;
    public final /* synthetic */ Widget b;
    public final /* synthetic */ Class c;

    public h5g(Widget widget, Class cls) {
        this.b = widget;
        this.c = cls;
    }

    public final boolean a() {
        return this.a != null;
    }

    public final Object getValue() {
        pnf pnf = this.a;
        if (pnf != null) {
            return pnf;
        }
        pnf a2 = this.b.getViewModelStore$arch_release().a(this.c);
        this.a = a2;
        return a2;
    }
}
