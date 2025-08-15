package defpackage;

import android.view.View;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.media.ChatMediaListWidget;

/* renamed from: sf2  reason: default package */
public final class sf2 extends ffe implements a66 {
    public final /* synthetic */ ChatMediaListWidget X;
    public final /* synthetic */ xm8 Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sf2(ChatMediaListWidget chatMediaListWidget, xm8 xm8, View view, Continuation continuation) {
        super(2, continuation);
        this.X = chatMediaListWidget;
        this.Y = xm8;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((sf2) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sf2(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Collection collection;
        int i;
        od2.a0(obj);
        ChatMediaListWidget chatMediaListWidget = this.X;
        xm8 xm8 = this.Y;
        chatMediaListWidget.a = xm8;
        qt3 Y2 = dy7.c(1).r().Y(this.Z);
        gi2 n0 = chatMediaListWidget.n0();
        n0.getClass();
        boolean z = xm8 instanceof um8;
        khe khe = n0.G0;
        if (z) {
            fe2 fe2 = (fe2) khe.getValue();
            fe2.getClass();
            kl7 l = j1e.l();
            l.add((tt3) fe2.b.getValue());
            l.add(fe2.a(yea.x1));
            l.add((tt3) fe2.a.getValue());
            collection = j1e.d(l);
        } else if (xm8 instanceof vm8) {
            fe2 fe22 = (fe2) khe.getValue();
            fe22.getClass();
            kl7 l2 = j1e.l();
            l2.add(new tt3(wea.V, (jqe) new eqe(yea.u1), Integer.valueOf(yfa.d), (Integer) null, 20));
            l2.add(new tt3(wea.c0, (jqe) new eqe(yea.F1), Integer.valueOf(yfa.y), (Integer) null, 20));
            l2.add((tt3) fe22.b.getValue());
            l2.add(fe2.a(yea.z1));
            l2.add((tt3) fe22.a.getValue());
            collection = j1e.d(l2);
        } else {
            boolean z2 = xm8 instanceof wm8;
            if (z2) {
                fe2 fe23 = (fe2) khe.getValue();
                fe23.getClass();
                if (z2) {
                    wm8 wm8 = (wm8) xm8;
                    int s = au1.s(wm8.X);
                    if (s == 0) {
                        i = yea.A1;
                    } else if (s == 1) {
                        i = yea.B1;
                    } else if (s == 2) {
                        i = yea.y1;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    kl7 l3 = j1e.l();
                    l3.add(new tt3(wea.b0, (jqe) new eqe(yea.E1), Integer.valueOf(yfa.e), (Integer) null, 20));
                    l3.add((tt3) fe23.b.getValue());
                    l3.add(fe2.a(i));
                    if (!wm8.s0) {
                        l3.add((tt3) fe23.a.getValue());
                    }
                    collection = j1e.d(l3);
                } else {
                    collection = nz4.a;
                }
            } else if (xm8 instanceof qm8) {
                fe2 fe24 = (fe2) khe.getValue();
                fe24.getClass();
                kl7 l4 = j1e.l();
                l4.add((tt3) fe24.b.getValue());
                l4.add(fe2.a(yea.w1));
                l4.add((tt3) fe24.a.getValue());
                collection = j1e.d(l4);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        Y2.I(collection).build().q(chatMediaListWidget);
        return e5f.a;
    }
}
