package defpackage;

import android.content.Context;
import android.view.View;
import ru.ok.messages.video.widgets.doubleTap.DoubleTapVideoViewWrapper;

/* renamed from: sk9  reason: default package */
public final class sk9 extends v2 implements an4 {
    public vm4 X;
    public vm4 Y;
    public final tg o;

    public sk9(Context context, DoubleTapVideoViewWrapper doubleTapVideoViewWrapper, tg tgVar) {
        super(context);
        this.o = tgVar;
        this.c = doubleTapVideoViewWrapper;
        m();
        doubleTapVideoViewWrapper.setTouchEventListener(this);
    }

    public final void A(rk9 rk9) {
        if (!rk9.c) {
            this.X.a();
            this.Y.a();
            return;
        }
        boolean z = rk9.b;
        int i = rk9.a;
        if (z) {
            this.X.a();
            this.Y.b();
            this.Y.c(i);
            return;
        }
        this.X.b();
        this.X.c(i);
        this.Y.a();
    }

    public final void m() {
        this.X = (vm4) ((View) this.c).findViewById(xxb.double_tap_video_view_wrapper__arrows_view_left);
        this.Y = (vm4) ((View) this.c).findViewById(xxb.double_tap_video_view_wrapper__arrows_view_right);
        vm4 vm4 = this.X;
        tg tgVar = this.o;
        vm4.setAnimations(tgVar);
        this.Y.setAnimations(tgVar);
    }
}
