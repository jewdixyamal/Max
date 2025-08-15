package one.me.sdk.gallery.selectalbum;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/sdk/gallery/selectalbum/SelectAlbumWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "parentScope", "(Ljava/lang/String;Lz84;)V", "t9", "media-gallery-widget_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class SelectAlbumWidget extends Widget {
    public static final /* synthetic */ bc7[] Y;
    public final qm0 X;
    public final je7 a;
    public final je7 b;
    public final qm0 c;
    public final qm0 o;

    static {
        Class<SelectAlbumWidget> cls = SelectAlbumWidget.class;
        hob hob = new hob(cls, "parentScope", "getParentScope-IluPPks()Ljava/lang/String;", 0);
        oec oec = nec.a;
        Y = new bc7[]{hob, zr6.e(oec, cls, "albumAdapter", "getAlbumAdapter()Lone/me/sdk/gallery/selectalbum/SelectedAlbumAdapter;", 0), zr6.f(cls, "contentContainer", "getContentContainer()Lone/me/sdk/gallery/selectalbum/SelectedAlbumRecyclerView;", 0, oec), zr6.f(cls, "popupLayout", "getPopupLayout()Lone/me/sdk/uikit/common/views/PopupLayout;", 0, oec)};
    }

    public SelectAlbumWidget(String str, z84 z84) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    public final g4d m0() {
        bc7 bc7 = Y[2];
        return (g4d) this.o.getValue();
    }

    public final f6b n0() {
        bc7 bc7 = Y[3];
        return (f6b) this.X.getValue();
    }

    public final q3d o0() {
        return (q3d) this.a.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return n0();
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(o0().X, getViewLifecycleOwner().Q(), fg7.o), new t3d((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void p0() {
        View f;
        if (n0().getScrollState() == d6b.a) {
            z5b callback = n0().getCallback();
            if (callback == null || (f = callback.f()) == null || f.getHeight() != 0) {
                n0().k();
            } else {
                n0().post(new u3c(11, this));
            }
        } else {
            n0().j(true);
        }
    }

    public SelectAlbumWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        fs fsVar = new fs(suc.class, Widget.ARG_SCOPE_ID);
        bc7 bc7 = Y[0];
        this.a = m82getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, q3d.class, (k56) null);
        this.b = la8.a.getAccessor().d(iba.class);
        this.c = binding(new r3d(this, 0));
        this.o = binding(new r3d(this, 1));
        this.X = binding(new r3d(this, 2));
    }
}
