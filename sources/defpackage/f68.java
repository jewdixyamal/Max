package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.mediabar.partialmediaaccess.PartialMediaAccessWidget;

/* renamed from: f68  reason: default package */
public final class f68 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f68(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((f68) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        f68 f68 = new f68(continuation, this.Y);
        f68.X = obj;
        return f68;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        MediaBarWidget mediaBarWidget = this.Y;
        if (booleanValue) {
            bc7[] bc7Arr = MediaBarWidget.d1;
            mediaBarWidget.getClass();
            j03 j03 = (j03) mediaBarWidget.A0.T0(mediaBarWidget, MediaBarWidget.d1[8]);
            if (!tpa.f(j03.c(), "partial_media_access_widget")) {
                coc coc = new coc(new PartialMediaAccessWidget((Bundle) null, 1, (z84) null), (String) null, (zu3) null, (zu3) null, false, -1);
                coc.d("partial_media_access_widget");
                j03.a.R(coc);
            }
        } else {
            bc7[] bc7Arr2 = MediaBarWidget.d1;
            mediaBarWidget.getClass();
            ((j03) mediaBarWidget.A0.T0(mediaBarWidget, MediaBarWidget.d1[8])).a();
        }
        MediaBarWidget.o0(mediaBarWidget);
        return e5f.a;
    }
}
