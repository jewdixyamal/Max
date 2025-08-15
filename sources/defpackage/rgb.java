package defpackage;

import android.content.Intent;
import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* renamed from: rgb  reason: default package */
public final class rgb extends ffe implements a66 {
    public final /* synthetic */ Intent X;
    public final /* synthetic */ vgb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rgb(Intent intent, vgb vgb, Continuation continuation) {
        super(2, continuation);
        this.X = intent;
        this.Y = vgb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rgb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rgb(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        RectF rectF = (RectF) this.X.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_RECT");
        e5f e5f = e5f.a;
        if (rectF == null) {
            return e5f;
        }
        bc7[] bc7Arr = vgb.A0;
        vgb vgb = this.Y;
        String absolutePath = ((kk5) vgb.Y.getValue()).q((String) vgb.z0.get()).getAbsolutePath();
        j47.T(vgb.a, ((w9a) vgb.q()).b(), (vx3) null, new qgb(vgb, absolutePath, rectF, (Continuation) null), 2);
        return e5f;
    }
}
