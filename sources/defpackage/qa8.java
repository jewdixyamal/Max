package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: qa8  reason: default package */
public final class qa8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaGalleryWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qa8(MediaGalleryWidget mediaGalleryWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = mediaGalleryWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((qa8) n((k86) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qa8 qa8 = new qa8(this.Y, continuation);
        qa8.X = obj;
        return qa8;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        k86 k86 = (k86) this.X;
        boolean z = k86 instanceof h86;
        MediaGalleryWidget mediaGalleryWidget = this.Y;
        if (z) {
            bc7[] bc7Arr = MediaGalleryWidget.Z;
            mediaGalleryWidget.m0().x0(0);
            z96.r(mediaGalleryWidget.o0(), true, 2);
        } else if (k86 instanceof j86) {
            bc7[] bc7Arr2 = MediaGalleryWidget.Z;
            z96 o0 = mediaGalleryWidget.o0();
            q4d q4d = ((j86) k86).a;
            o0.getClass();
            o0.u(q4d.a, true);
        } else if (k86 instanceof i86) {
            bc7[] bc7Arr3 = MediaGalleryWidget.Z;
            z96 o02 = mediaGalleryWidget.o0();
            b86 b86 = ((i86) k86).a;
            o02.getClass();
            hm9.m("z96", "selectAlbum " + b86, new Object[0]);
            ((ad) o02.J0.getValue()).f("MEDIA_SEND_ALBUM_CHANGED");
            q0e q0e = o02.B0;
            b86 b862 = (b86) q0e.getValue();
            if (!tpa.f(b862, b86)) {
                try {
                    x77 x77 = o02.H0;
                    if (x77 != null) {
                        x77.cancel((CancellationException) null);
                    }
                    vxd vxd = o02.I0;
                    if (vxd != null) {
                        vxd.cancel((CancellationException) null);
                    }
                } catch (Throwable unused) {
                }
                o02.z0.m((Object) null, Boolean.FALSE);
                q0e.m((Object) null, b86);
                o02.w0.m((Object) null, nz4.a);
                o02.I0 = pnf.n(o02, o02.o, (vx3) null, new u96(b862, o02, b86, (Continuation) null), 2);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
