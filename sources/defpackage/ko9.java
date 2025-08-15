package defpackage;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* renamed from: ko9  reason: default package */
public final class ko9 extends ffe implements a66 {
    public final /* synthetic */ Intent X;
    public final /* synthetic */ mo9 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ko9(Intent intent, mo9 mo9, Continuation continuation) {
        super(2, continuation);
        this.X = intent;
        this.Y = mo9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ko9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ko9(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        Rect rect;
        od2.a0(obj);
        RectF rectF = (RectF) this.X.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_RECT");
        e5f e5f = e5f.a;
        if (rectF == null || (rect = (Rect) this.X.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_ABSOLUTE")) == null) {
            return e5f;
        }
        String absolutePath = ((kk5) this.Y.b.getValue()).q(this.Y.k).getAbsolutePath();
        mo9 mo9 = this.Y;
        mo9.getClass();
        j47.T(mo9.f, (lx3) null, (vx3) null, new jo9(absolutePath, rect, mo9, rectF, 1, (Continuation) null), 3);
        return e5f;
    }
}
