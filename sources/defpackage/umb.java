package defpackage;

import android.content.Intent;
import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* renamed from: umb  reason: default package */
public final class umb extends ffe implements a66 {
    public final /* synthetic */ Intent X;
    public final /* synthetic */ cnb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public umb(Intent intent, cnb cnb, Continuation continuation) {
        super(2, continuation);
        this.X = intent;
        this.Y = cnb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((umb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new umb(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        RectF rectF = (RectF) this.X.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_RECT");
        e5f e5f = e5f.a;
        if (rectF == null) {
            return e5f;
        }
        bc7[] bc7Arr = cnb.S0;
        cnb cnb = this.Y;
        String absolutePath = ((kk5) cnb.v0.getValue()).q((String) cnb.P0.get()).getAbsolutePath();
        j47.T(cnb.a, ((w9a) cnb.u()).b(), (vx3) null, new tmb(cnb, absolutePath, rectF, (Continuation) null), 2);
        return e5f;
    }
}
