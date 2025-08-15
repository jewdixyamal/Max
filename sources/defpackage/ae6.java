package defpackage;

import android.graphics.Picture;
import android.text.Layout;
import kotlin.coroutines.Continuation;

/* renamed from: ae6  reason: default package */
public final class ae6 extends ffe implements a66 {
    public final /* synthetic */ Layout X;
    public final /* synthetic */ be6 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ae6(Layout layout, be6 be6, Continuation continuation) {
        super(2, continuation);
        this.X = layout;
        this.Y = be6;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ae6) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ae6(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        Layout layout = this.X;
        od2.a0(obj);
        v5b v5b = be6.c;
        Picture picture = (Picture) v5b.f();
        if (picture == null) {
            picture = new Picture();
        }
        try {
            layout.draw(picture.beginRecording(layout.getWidth(), layout.getHeight()));
            picture.endRecording();
            v5b.e(picture);
        } catch (Throwable th) {
            hm9.p(this.Y.b, "fail to warm layout", th);
        }
        return e5f.a;
    }
}
