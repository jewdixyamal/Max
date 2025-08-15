package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: oa8  reason: default package */
public final class oa8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaGalleryWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oa8(MediaGalleryWidget mediaGalleryWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = mediaGalleryWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((oa8) n((g86) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        oa8 oa8 = new oa8(this.Y, continuation);
        oa8.X = obj;
        return oa8;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        g86 g86 = (g86) this.X;
        if (!(g86 instanceof e86)) {
            if (g86 instanceof f86) {
                MediaGalleryWidget mediaGalleryWidget = this.Y;
                ((eua) mediaGalleryWidget.a.getValue()).g(new l5g(mediaGalleryWidget, 1));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e5f.a;
    }
}
