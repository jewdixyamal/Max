package defpackage;

import android.media.MediaRouter;

/* renamed from: kie  reason: default package */
public final class kie extends tg8 {
    public final Object a;

    public kie(Object obj) {
        this.a = obj;
    }

    public final void f(int i) {
        ((MediaRouter.RouteInfo) this.a).requestSetVolume(i);
    }

    public final void i(int i) {
        ((MediaRouter.RouteInfo) this.a).requestUpdateVolume(i);
    }
}
