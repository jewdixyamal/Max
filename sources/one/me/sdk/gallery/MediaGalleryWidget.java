package one.me.sdk.gallery;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/sdk/gallery/MediaGalleryWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "Ld86;", "galleryMode", "(Ljava/lang/String;Ld86;Lz84;)V", "media-gallery-widget_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class MediaGalleryWidget extends Widget {
    public static final /* synthetic */ bc7[] Z;
    public final qm0 X;
    public final j81 Y;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final khe o;

    static {
        hob hob = new hob(MediaGalleryWidget.class, "galleryRecyclerView", "getGalleryRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView;", 0);
        nec.a.getClass();
        Z = new bc7[]{hob};
    }

    public MediaGalleryWidget(String str, d86 d86, z84 z84) {
        this(dy7.g(new kpa("arg_scope_id", new suc(str)), new kpa("arg_gallery_mode", d86)));
    }

    public final z15 m0() {
        bc7 bc7 = Z[0];
        return (z15) this.X.getValue();
    }

    public final s86 n0() {
        return (s86) this.b.getValue();
    }

    public final z96 o0() {
        return (z96) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(m0());
        return frameLayout;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        z96 o0 = o0();
        w86 a2 = tpa.a(o0.c);
        o0.y0 = a2;
        hm9.m("z96", "did recalculate uiOptions: " + a2, new Object[0]);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new hp1(this, 1, view));
        } else {
            int i = o0().y0.c;
            int width = view.getWidth() / i;
            s86 n0 = n0();
            n0.getClass();
            pnf.o(n0.c, new p86(width - (o0().y0.d - (o0().y0.d / i))));
        }
        z15 m0 = m0();
        m0.setPager(this.Y);
        m0.setProgressView(gga.a);
        m0.setHasFixedSize(true);
        m0.setThreshold(o0().y0.b);
        m0.setAdapter((p76) this.o.getValue());
        m0.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(o0().y0.c);
        gridLayoutManager.C = o0().y0.c * 4;
        m0.setLayoutManager(gridLayoutManager);
        m0.j(new sc1(o0().y0.c, o0().y0.d, 4));
        m0.setItemAnimator(o0().y0.g ? new yb4() : null);
        m0.m(new s15(3, this));
        od2.L(new zn5(o0().x0, new na8(this, (Continuation) null), 5), getViewLifecycleScope());
        od2.L(new zn5(o0().E0, new oa8(this, (Continuation) null), 5), getViewLifecycleScope());
        od2.L(new zn5(o0().A0, new pa8(this, (Continuation) null), 5), getViewLifecycleScope());
        i24.s(new zn5(n0().o, new qa8(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public MediaGalleryWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = fua.a.b();
        Class<suc> cls = suc.class;
        Object v = ay7.v(bundle, "arg_scope_id", cls);
        if (v != null) {
            this.b = m82getSharedViewModelcp94BC8(((suc) ((Parcelable) v)).a, s86.class, (k56) null);
            this.c = createViewModelLazy(z96.class, new nj4(25, new yf3(bundle, 15, this)));
            this.o = new khe(new ma8(this, 0));
            this.X = binding(new ma8(this, 1));
            this.Y = new j81(this, 4);
            return;
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MediaGalleryWidget(java.lang.String r1, defpackage.d86 r2, int r3, defpackage.z84 r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0008
            android.os.Parcelable$Creator<d86> r2 = defpackage.d86.CREATOR
            d86 r2 = defpackage.d86.t0
        L_0x0008:
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.gallery.MediaGalleryWidget.<init>(java.lang.String, d86, int, z84):void");
    }
}
