package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.mediapicker.MediaPickerScreen;
import one.me.mediapicker.permissions.MediaPickerPermissionWidget;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: me8  reason: default package */
public final class me8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public me8(Continuation continuation, MediaPickerScreen mediaPickerScreen) {
        super(2, continuation);
        this.Y = mediaPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((me8) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        me8 me8 = new me8(continuation, this.Y);
        me8.X = obj;
        return me8;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ht3 ht3 = (ht3) this.X;
        boolean z = ht3 instanceof et3;
        MediaPickerScreen mediaPickerScreen = this.Y;
        if (z) {
            MediaPickerScreen.m0(mediaPickerScreen, false);
            cla o0 = mediaPickerScreen.o0();
            CharSequence b = ((et3) ht3).a.b(mediaPickerScreen.getContext());
            if (b == null) {
                b = "";
            }
            o0.setTitle(b);
            j03 j03 = (j03) mediaPickerScreen.b.T0(mediaPickerScreen, MediaPickerScreen.B0[0]);
            if (!tpa.f(j03.c(), "MEDIA_GALLERY_WIDGET_TAG")) {
                coc coc = new coc(new MediaGalleryWidget(mediaPickerScreen.c, mediaPickerScreen.n0(), (z84) null), (String) null, (zu3) null, (zu3) null, false, -1);
                coc.d("MEDIA_GALLERY_WIDGET_TAG");
                j03.a.R(coc);
            }
        } else if (ht3 instanceof ft3) {
            MediaPickerScreen.m0(mediaPickerScreen, true);
        } else if (ht3 instanceof gt3) {
            MediaPickerScreen.m0(mediaPickerScreen, false);
            j03 j032 = (j03) mediaPickerScreen.b.T0(mediaPickerScreen, MediaPickerScreen.B0[0]);
            if (!tpa.f(j032.c(), "MEDIA_GALLERY_WIDGET_PERMISSION_TAG")) {
                coc coc2 = new coc(new MediaPickerPermissionWidget(mediaPickerScreen.c, (z84) null), (String) null, (zu3) null, (zu3) null, false, -1);
                coc2.d("MEDIA_GALLERY_WIDGET_PERMISSION_TAG");
                j032.a.R(coc2);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
