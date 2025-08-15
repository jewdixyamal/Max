package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.photo.PhotoViewerWidget;

/* renamed from: kwa  reason: default package */
public final class kwa extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PhotoViewerWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kwa(Continuation continuation, PhotoViewerWidget photoViewerWidget) {
        super(2, continuation);
        this.Y = photoViewerWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((kwa) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kwa kwa = new kwa(continuation, this.Y);
        kwa.X = obj;
        return kwa;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        q35 q35 = (q35) this.X;
        bc7[] bc7Arr = PhotoViewerWidget.X;
        PhotoViewerWidget photoViewerWidget = this.Y;
        photoViewerWidget.getClass();
        if (q35 instanceof k35) {
            k35 k35 = (k35) q35;
            if (tpa.f(k35.a.x(), photoViewerWidget.m0()) && k35.a.j() == photoViewerWidget.n0()) {
                sb8 y = photoViewerWidget.p0().y(photoViewerWidget.n0(), photoViewerWidget.m0());
                jb8 jb8 = y instanceof jb8 ? (jb8) y : null;
                if (jb8 != null) {
                    if (photoViewerWidget.o0().getFailure()) {
                        photoViewerWidget.p0().A(photoViewerWidget.n0(), photoViewerWidget.m0());
                        photoViewerWidget.o0().r(jb8.o, photoViewerWidget.o0().getFailure());
                    } else {
                        photoViewerWidget.p0().B(photoViewerWidget.n0(), photoViewerWidget.m0());
                    }
                }
            }
        } else if (q35 instanceof m35) {
            m35 m35 = (m35) q35;
            if (tpa.f(m35.a.Y, photoViewerWidget.m0())) {
                jb8 jb82 = m35.a;
                if (jb82.a == photoViewerWidget.n0()) {
                    photoViewerWidget.o0().r(jb82.o, true);
                }
            }
        }
        return e5f.a;
    }
}
