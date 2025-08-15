package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* renamed from: i21  reason: default package */
public final class i21 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallBottomPanelWidget Y;
    public final /* synthetic */ r11 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i21(CallBottomPanelWidget callBottomPanelWidget, r11 r11, Continuation continuation) {
        super(2, continuation);
        this.Y = callBottomPanelWidget;
        this.Z = r11;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((i21) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        i21 i21 = new i21(this.Y, this.Z, continuation);
        i21.X = obj;
        return i21;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = CallBottomPanelWidget.s0;
        od2.L(new zn5(this.Y.n0().x0, new lq0(2, this.Z, r11.class, "setVolumeMicrophone", "setVolumeMicrophone(F)V", 4, 3), 5), (sx3) this.X);
        return e5f.a;
    }
}
