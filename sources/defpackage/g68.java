package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: g68  reason: default package */
public final class g68 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g68(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((g68) n((v8b) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        g68 g68 = new g68(continuation, this.Y);
        g68.X = obj;
        return g68;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        int ordinal = ((v8b) this.X).ordinal();
        MediaBarWidget mediaBarWidget = this.Y;
        if (ordinal == 0) {
            bc7[] bc7Arr = MediaBarWidget.d1;
            j03 y0 = mediaBarWidget.y0();
            if (!tpa.f(y0.c(), "media_gallery_widget")) {
                coc coc = new coc(new MediaGalleryWidget(mediaBarWidget.a, (d86) null, 2, (z84) null), (String) null, (zu3) null, (zu3) null, false, -1);
                coc.d("media_gallery_widget");
                y0.a.R(coc);
            }
            mediaBarWidget.A0().setVisibility(0);
        } else if (ordinal == 1) {
            bc7[] bc7Arr2 = MediaBarWidget.d1;
            j03 y02 = mediaBarWidget.y0();
            if (!tpa.f(y02.c(), "permissions_widget")) {
                coc coc2 = new coc(new MediaBarPermissionWidget(), (String) null, (zu3) null, (zu3) null, false, -1);
                coc2.d("permissions_widget");
                y02.a.R(coc2);
            }
            mediaBarWidget.A0().setVisibility(8);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
