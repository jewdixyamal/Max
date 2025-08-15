package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: z58  reason: default package */
public final class z58 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z58(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((z58) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        z58 z58 = new z58(continuation, this.Y);
        z58.X = obj;
        return z58;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        lrb lrb = (lrb) this.X;
        boolean z = lrb instanceof irb;
        MediaBarWidget mediaBarWidget = this.Y;
        if (z) {
            irb irb = (irb) lrb;
            up7 up7 = irb.a;
            bc7[] bc7Arr = MediaBarWidget.d1;
            mediaBarWidget.C0(up7, irb.b, "SELECTED_MEDIA_ALBUM");
        } else if (lrb instanceof krb) {
            bc7[] bc7Arr2 = MediaBarWidget.d1;
            ((eua) mediaBarWidget.c.getValue()).h(new l5g(mediaBarWidget, 1));
        } else if (lrb instanceof jrb) {
            bc7[] bc7Arr3 = MediaBarWidget.d1;
            eua eua = (eua) mediaBarWidget.c.getValue();
            l5g l5g = new l5g(mediaBarWidget, 1);
            eua.getClass();
            String[] strArr = eua.h;
            int i = j1c.permissions_audio_for_video_request;
            int i2 = oga.a;
            int i3 = oga.g;
            if (eua.i(l5g, strArr)) {
                l5g.c(strArr, 171, i2, i, i3);
            } else {
                eua.f(l5g, strArr, 171);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
