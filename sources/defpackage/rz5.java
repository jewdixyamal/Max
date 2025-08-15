package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.sdk.arch.Widget;
import one.me.stickersshowcase.StickersShowcaseScreen;

/* renamed from: rz5  reason: default package */
public final class rz5 implements bha {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ rz5(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    public final void I(CharSequence charSequence) {
        vxd vxd;
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ForwardPickerScreen.I0;
                txa v0 = ((ForwardPickerScreen) widget).v0();
                String obj = charSequence != null ? charSequence.toString() : null;
                v0.getClass();
                if (obj == null) {
                    obj = "";
                }
                v0.t0.m((Object) null, obj);
                return;
            default:
                bc7[] bc7Arr2 = StickersShowcaseScreen.v0;
                i7e n0 = ((StickersShowcaseScreen) widget).n0();
                g6e g6e = n0.X;
                if (!g6e.a() && (vxd = n0.c.g) != null) {
                    vxd.cancel((CancellationException) null);
                }
                String valueOf = String.valueOf(charSequence);
                AtomicReference atomicReference = g6e.g;
                if (!valueOf.equals(((c6e) atomicReference.get()).b)) {
                    vxd vxd2 = g6e.h;
                    if (vxd2 != null) {
                        vxd2.cancel((CancellationException) null);
                    }
                    int length = valueOf.length();
                    q0e q0e = g6e.d;
                    q0e q0e2 = g6e.f;
                    if (length == 0) {
                        x77 x77 = (x77) g6e.i.T0(g6e, g6e.j[0]);
                        if (x77 != null) {
                            x77.cancel((CancellationException) null);
                        }
                        q0e.setValue(g6e.k);
                        atomicReference.set(new c6e((String) null, 3));
                        q0e2.setValue((Object) null);
                        return;
                    }
                    q0e.m((Object) null, new d6e(1, true, (List) null));
                    q0e2.m((Object) null, valueOf);
                    return;
                }
                return;
        }
    }
}
