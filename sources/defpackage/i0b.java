package defpackage;

import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* renamed from: i0b  reason: default package */
public final class i0b extends ffe implements a66 {
    public /* synthetic */ float X;
    public final /* synthetic */ PinBarsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i0b(Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.Y = pinBarsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i0b) n(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        i0b i0b = new i0b(continuation, this.Y);
        i0b.X = ((Number) obj).floatValue();
        return i0b;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        float f = this.X;
        eb9 eb9 = this.Y.X;
        e5f e5f = e5f.a;
        if (eb9 == null) {
            return e5f;
        }
        eb9.setProgress(f);
        return e5f;
    }
}
