package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

/* renamed from: ukc  reason: default package */
public final /* synthetic */ class ukc implements m56 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ukc(alc alc, String str, int i) {
        this.c = alc;
        this.o = str;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                alc alc = (alc) this.c;
                alc.getClass();
                return alc.g(alc, (String) this.o, this.b, (Continuation) obj);
            default:
                return Widget.childRouter$lambda$10((Widget) this.c, this.b, (m56) this.o, (znc) obj);
        }
    }

    public /* synthetic */ ukc(Widget widget, int i, m56 m56) {
        this.c = widget;
        this.b = i;
        this.o = m56;
    }
}
