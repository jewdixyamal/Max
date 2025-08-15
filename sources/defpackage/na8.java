package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: na8  reason: default package */
public final class na8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaGalleryWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public na8(MediaGalleryWidget mediaGalleryWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = mediaGalleryWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((na8) n((List) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        na8 na8 = new na8(this.Y, continuation);
        na8.X = obj;
        return na8;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        List list = (List) this.X;
        list.size();
        bc7[] bc7Arr = MediaGalleryWidget.Z;
        MediaGalleryWidget mediaGalleryWidget = this.Y;
        mediaGalleryWidget.m0().setVisibility(list.isEmpty() ^ true ? 0 : 8);
        ((p76) mediaGalleryWidget.o.getValue()).E(list);
        mediaGalleryWidget.n0().X.m((Object) null, Integer.valueOf(list.size()));
        return e5f.a;
    }
}
