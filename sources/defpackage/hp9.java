package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: hp9  reason: default package */
public final class hp9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NeuroAvatarsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hp9(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.Y = neuroAvatarsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((hp9) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hp9 hp9 = new hp9(continuation, this.Y);
        hp9.X = obj;
        return hp9;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        List list = (List) this.X;
        bc7[] bc7Arr = NeuroAvatarsScreen.M0;
        NeuroAvatarsScreen neuroAvatarsScreen = this.Y;
        neuroAvatarsScreen.getClass();
        int i = 8;
        int i2 = 0;
        ((qp9) neuroAvatarsScreen.x0.T0(neuroAvatarsScreen, NeuroAvatarsScreen.M0[8])).setVisibility(list.isEmpty() ? 0 : 8);
        wja q0 = neuroAvatarsScreen.q0();
        if (!list.isEmpty()) {
            i = 0;
        }
        q0.setVisibility(i);
        wja q02 = neuroAvatarsScreen.q0();
        neuroAvatarsScreen.K0.getClass();
        q02.k();
        for (Object next : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                vja vja = new vja(q02.getContext());
                vja.setTabItem((y5a) next);
                eje i4 = q02.i();
                i4.e = vja;
                gje gje = i4.g;
                if (gje != null) {
                    gje.e();
                }
                ArrayList arrayList = q02.b;
                q02.b(i4, arrayList.size(), arrayList.isEmpty());
                i2 = i3;
            } else {
                y53.R();
                throw null;
            }
        }
        return e5f.a;
    }
}
