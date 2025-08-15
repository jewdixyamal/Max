package one.me.mediapicker;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/mediapicker/MediaPickerScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Ld86;", "galleryMode", "(Ld86;)V", "media-picker_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class MediaPickerScreen extends Widget {
    public static final /* synthetic */ bc7[] B0;
    public final qm0 A0;
    public final glc X;
    public final je7 Y;
    public final je7 Z;
    public final x27 a;
    public final q7c b;
    public final String c;
    public final fs o;
    public final je7 s0;
    public final q7c t0;
    public final qm0 u0;
    public final fs v0;
    public final qm0 w0;
    public final qm0 x0;
    public final qm0 y0;
    public final q7c z0;

    static {
        Class<MediaPickerScreen> cls = MediaPickerScreen.class;
        B0 = new bc7[]{new hob(cls, "primaryRouter", "getPrimaryRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), z7b.g(nec.a, cls, "galleryMode", "getGalleryMode()Lone/me/sdk/gallery/GalleryMode;", 0), new hob(cls, "selectedAlbumRouter", "getSelectedAlbumRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new hob(cls, "selectedAlbumContainer", "getSelectedAlbumContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new oi9(cls, "maxHeightAlbumsContent", "getMaxHeightAlbumsContent()I"), new hob(cls, "mediaPickerContainer", "getMediaPickerContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new hob(cls, "divider", "getDivider()Landroid/view/View;", 0), new hob(cls, "contentContainer", "getContentContainer()Landroid/widget/FrameLayout;", 0)};
    }

    public MediaPickerScreen(d86 d86) {
        this(dy7.g(new kpa("gallery_mode_args", d86)));
    }

    public static final void m0(MediaPickerScreen mediaPickerScreen, boolean z) {
        qm0 qm0 = mediaPickerScreen.A0;
        int i = 8;
        if (z) {
            ((View) qm0.getValue()).setVisibility(0);
        } else if (qm0.a()) {
            ((TextView) qm0.getValue()).setVisibility(8);
        }
        bc7 bc7 = B0[5];
        w12 w12 = (w12) mediaPickerScreen.w0.getValue();
        if (!z) {
            i = 0;
        }
        w12.setVisibility(i);
    }

    public final x27 getInsetsConfig() {
        return this.a;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m65getScopeIdIluPPks() {
        return this.c;
    }

    public final bvc getScreenDelegate() {
        return this.X;
    }

    public final d86 n0() {
        bc7 bc7 = B0[1];
        return (d86) this.o.a(this);
    }

    public final cla o0() {
        bc7 bc7 = B0[6];
        return (cla) this.x0.getValue();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Rect rect;
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 666 && i2 == -1 && (!n0().c)) {
            uu3 uu3 = null;
            if (intent == null) {
                hm9.p(MediaPickerScreen.class.getName(), "ActAvatarCrop sent empty data", (Throwable) null);
                return;
            }
            RectF rectF = (RectF) ((Parcelable) fm9.D(intent, "ru.ok.tamtam.extra.CROPPED_RECT", RectF.class));
            if (rectF != null && (rect = (Rect) ((Parcelable) fm9.D(intent, "ru.ok.tamtam.extra.CROPPED_ABSOLUTE", Rect.class))) != null && (stringExtra = intent.getStringExtra("ru.ok.tamtam.extra.FILE_PATH")) != null) {
                znc router = getRouter();
                hs hsVar = new hs();
                hsVar.b(router);
                loop0:
                while (true) {
                    if (!(!hsVar.isEmpty())) {
                        break;
                    }
                    znc znc = (znc) hsVar.k();
                    int L = y53.L(znc.e());
                    while (true) {
                        if (-1 < L) {
                            uu3 uu32 = ((coc) znc.e().get(L)).a;
                            if (uu32 instanceof ad0) {
                                uu3 = uu32;
                                break loop0;
                            }
                            Iterator it = new gkc(uu32.getChildRouters()).iterator();
                            while (true) {
                                ListIterator listIterator = ((fkc) it).b;
                                if (!listIterator.hasPrevious()) {
                                    break;
                                }
                                hsVar.b((znc) listIterator.previous());
                            }
                            L--;
                        }
                    }
                }
                ad0 ad0 = (ad0) uu3;
                if (ad0 != null) {
                    ad0.a(stringExtra, rectF, rect);
                }
                getRouter().C();
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(o0());
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setId(cda.c);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setGravity(17);
        bc7[] bc7Arr = B0;
        bc7 bc7 = bc7Arr[5];
        frameLayout.addView((w12) this.w0.getValue());
        bc7 bc72 = bc7Arr[3];
        frameLayout.addView((w12) this.u0.getValue());
        bc7 bc73 = bc7Arr[7];
        frameLayout.addView((View) this.y0.getValue());
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    public final void onViewCreated(View view) {
        je7 je7 = this.s0;
        w7c w7c = ((te8) je7.getValue()).w0;
        fg7 fg7 = fg7.o;
        od2.L(new zn5(tu0.g(w7c, getViewLifecycleOwner().Q(), fg7), new me8((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((s86) this.Y.getValue()).c, getViewLifecycleOwner().Q(), fg7), new ne8((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((te8) je7.getValue()).v0, getViewLifecycleOwner().Q(), fg7), new oe8((Continuation) null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((q3d) this.Z.getValue()).o, getViewLifecycleOwner().Q(), fg7), new pe8((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public MediaPickerScreen(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = x27.d;
        this.b = childSlotRouter(cda.b);
        this.c = "MediaPickerScreenScopeId";
        this.o = new fs(d86.class, "gallery_mode_args");
        this.X = new glc(new j78(2), (k56) null, 6);
        this.Y = createViewModelLazy(s86.class, new nj4(26, new j78(3)));
        this.Z = createViewModelLazy(q3d.class, new nj4(27, new le8(this, 1)));
        this.s0 = createViewModelLazy(te8.class, new nj4(28, new le8(this, 2)));
        this.t0 = childSlotRouter(cda.a);
        this.u0 = binding(new le8(this, 3));
        this.v0 = new fs(Integer.class, 0, "max_height_albums_content");
        this.w0 = binding(new le8(this, 4));
        this.x0 = binding(new le8(this, 5));
        this.y0 = binding(new le8(this, 6));
        this.z0 = viewBinding(cda.c);
        this.A0 = binding(new le8(this, 7));
    }
}
