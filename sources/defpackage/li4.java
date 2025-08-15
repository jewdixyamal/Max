package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.devmenu.DevMenuScreen;

/* renamed from: li4  reason: default package */
public final class li4 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ DevMenuScreen Y;
    public final /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public li4(DevMenuScreen devMenuScreen, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.Y = devMenuScreen;
        this.Z = arrayList;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((li4) n((List) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        li4 li4 = new li4(this.Y, (ArrayList) this.Z, continuation);
        li4.X = obj;
        return li4;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        mfd mfd = this.Y.X;
        kl7 l = j1e.l();
        l.addAll(this.Z);
        l.addAll((List) this.X);
        mfd.E(j1e.d(l));
        return e5f.a;
    }
}
