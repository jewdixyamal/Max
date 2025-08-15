package defpackage;

import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.ShortcutBadger;

/* renamed from: yf0  reason: default package */
public final class yf0 extends ffe implements a66 {
    public /* synthetic */ int X;
    public final /* synthetic */ zf0 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yf0(zf0 zf0, Continuation continuation) {
        super(2, continuation);
        this.Y = zf0;
    }

    public final Object invoke(Object obj, Object obj2) {
        Integer valueOf = Integer.valueOf(((Number) obj).intValue());
        e5f e5f = e5f.a;
        ((yf0) n(valueOf, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yf0 yf0 = new yf0(this.Y, continuation);
        yf0.X = ((Number) obj).intValue();
        return yf0;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        int i = this.X;
        if (i >= 0) {
            ShortcutBadger.applyCount(this.Y.a, i);
        }
        return e5f.a;
    }
}
