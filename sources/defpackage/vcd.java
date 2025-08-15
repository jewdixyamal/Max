package defpackage;

import android.content.Intent;
import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* renamed from: vcd  reason: default package */
public final class vcd extends ffe implements a66 {
    public final /* synthetic */ Intent X;
    public final /* synthetic */ add Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vcd(Intent intent, add add, Continuation continuation) {
        super(2, continuation);
        this.X = intent;
        this.Y = add;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vcd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vcd(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        RectF rectF = (RectF) this.X.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_RECT");
        e5f e5f = e5f.a;
        if (rectF == null) {
            return e5f;
        }
        bc7[] bc7Arr = add.K0;
        add add = this.Y;
        String absolutePath = ((kk5) add.u0.getValue()).q((String) add.F0.get()).getAbsolutePath();
        j47.T(add.a, ((w9a) add.r()).b(), (vx3) null, new ucd(rectF, add, absolutePath, (Continuation) null), 2);
        return e5f;
    }
}
