package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.devmenu.ThemeRoomBottomSheet;

/* renamed from: dse  reason: default package */
public final class dse extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ThemeRoomBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dse(Continuation continuation, ThemeRoomBottomSheet themeRoomBottomSheet) {
        super(2, continuation);
        this.Y = themeRoomBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((dse) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dse dse = new dse(continuation, this.Y);
        dse.X = obj;
        return dse;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.z0.E((List) this.X);
        return e5f.a;
    }
}
