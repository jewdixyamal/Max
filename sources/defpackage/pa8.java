package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: pa8  reason: default package */
public final class pa8 extends ffe implements a66 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ MediaGalleryWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pa8(MediaGalleryWidget mediaGalleryWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = mediaGalleryWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        e5f e5f = e5f.a;
        ((pa8) n(bool, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pa8 pa8 = new pa8(this.Y, continuation);
        pa8.X = ((Boolean) obj).booleanValue();
        return pa8;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean z = this.X;
        bc7[] bc7Arr = MediaGalleryWidget.Z;
        this.Y.m0().setRefreshingNext(z);
        return e5f.a;
    }
}
