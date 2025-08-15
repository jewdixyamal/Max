package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.devmenu.ThemeRoomBottomSheet;
import one.me.sdk.arch.Widget;

/* renamed from: ese  reason: default package */
public final class ese extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ThemeRoomBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ese(Continuation continuation, ThemeRoomBottomSheet themeRoomBottomSheet) {
        super(2, continuation);
        this.Y = themeRoomBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ese) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ese ese = new ese(continuation, this.Y);
        ese.X = obj;
        return ese;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        jse jse = (jse) this.X;
        if (jse instanceof jse) {
            ThemeRoomBottomSheet themeRoomBottomSheet = this.Y;
            mr0.G(themeRoomBottomSheet);
            themeRoomBottomSheet.s0(true);
            wha wha = new wha((Widget) themeRoomBottomSheet);
            String str = jse.a;
            wha.h("Новая тема: " + str);
            wha.i();
            return e5f.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
