package defpackage;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* renamed from: hs2  reason: default package */
public final class hs2 extends ffe implements a66 {
    public final /* synthetic */ Intent X;
    public final /* synthetic */ ks2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hs2(Intent intent, ks2 ks2, Continuation continuation) {
        super(2, continuation);
        this.X = intent;
        this.Y = ks2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hs2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hs2(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        Rect rect;
        od2.a0(obj);
        RectF rectF = (RectF) this.X.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_RECT");
        e5f e5f = e5f.a;
        if (rectF == null || (rect = (Rect) this.X.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_ABSOLUTE")) == null) {
            return e5f;
        }
        ks2 ks2 = this.Y;
        bc7[] bc7Arr = ks2.I0;
        this.Y.r(((kk5) ks2.s0.getValue()).q(this.Y.F0).getAbsolutePath(), rectF, rect);
        return e5f;
    }
}
