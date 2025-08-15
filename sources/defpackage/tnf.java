package defpackage;

import one.me.sdk.arch.Widget;

/* renamed from: tnf  reason: default package */
public final class tnf implements je7 {
    public final Object X;
    public Object Y;
    public final /* synthetic */ int a = 0;
    public final k56 b;
    public Object c;
    public final Object o;

    public tnf(h23 h23, rtc rtc, k56 k56, rtc rtc2) {
        this.c = h23;
        this.b = rtc;
        this.o = k56;
        this.X = rtc2;
    }

    public final boolean a() {
        switch (this.a) {
            case 0:
                return ((qnf) this.Y) != null;
            default:
                return ((pnf) this.c) != null;
        }
    }

    public final Object getValue() {
        switch (this.a) {
            case 0:
                qnf qnf = (qnf) this.Y;
                if (qnf != null) {
                    return qnf;
                }
                qnf b2 = new xje((xnf) this.b.invoke(), (vnf) ((k56) this.o).invoke(), (lz3) ((k56) this.X).invoke()).b((h23) ((nb7) this.c));
                this.Y = b2;
                return b2;
            default:
                pnf pnf = (pnf) this.c;
                if (pnf == null) {
                    Widget r0 = ((Widget) this.o).m78findWidgetByScopeIdiP7A0G4((String) this.X);
                    if (r0 != null) {
                        String access$getTag$p = ((Widget) this.o).tag;
                        Class cls = (Class) this.Y;
                        ir6 ir6 = hm9.m;
                        if (ir6 != null && ir6.c()) {
                            ir6.d(us7.X, access$getTag$p, zr6.i("Found vm=", cls.getCanonicalName(), " in parent scope, trying to access it"), (Throwable) null);
                        }
                        pnf = r0.getViewModelStore$arch_release().a((Class) this.Y);
                    } else {
                        String access$getTag$p2 = ((Widget) this.o).tag;
                        Class cls2 = (Class) this.Y;
                        k56 k56 = this.b;
                        ir6 ir62 = hm9.m;
                        if (ir62 != null && ir62.c()) {
                            us7 us7 = us7.X;
                            String canonicalName = cls2.getCanonicalName();
                            ir62.d(us7, access$getTag$p2, "Not found vm=" + canonicalName + " in parent scope, trying to create it via fabric=" + k56, (Throwable) null);
                        }
                        k56 k562 = this.b;
                        pnf = k562 != null ? (pnf) k562.invoke() : null;
                    }
                    String str = (String) this.X;
                    if (pnf != null) {
                        this.c = pnf;
                    } else {
                        String i = zr6.i("ScopeId(value=", str, ")");
                        throw new IllegalArgumentException(x9e.b0("\n                    Cant find widget by given scopeId=" + i + "!\n                    \n                    Please, either register such widget in hierarchy before lookup, or provide default factory for such VM\n                    ").toString());
                    }
                }
                return pnf;
        }
    }

    public tnf(Widget widget, String str, Class cls, k56 k56) {
        this.o = widget;
        this.X = str;
        this.Y = cls;
        this.b = k56;
    }
}
