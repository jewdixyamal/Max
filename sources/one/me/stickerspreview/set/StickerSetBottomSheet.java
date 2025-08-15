package one.me.stickerspreview.set;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.stickerspreview.StickerPreviewScreen;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/stickerspreview/set/StickerSetBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "p3e", "stickers-preview_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class StickerSetBottomSheet extends BaseBottomSheetWidget {
    public static final /* synthetic */ bc7[] A0;
    public final je7 s0;
    public final fs t0;
    public gw7 u0;
    public final q7c v0;
    public final q7c w0;
    public final a3g x0;
    public final int y0;
    public final qm0 z0;

    static {
        Class<StickerSetBottomSheet> cls = StickerSetBottomSheet.class;
        hob hob = new hob(cls, "stickerId", "getStickerId()J", 0);
        oec oec = nec.a;
        A0 = new bc7[]{hob, zr6.e(oec, cls, "headerView", "getHeaderView()Lone/me/sdk/stickers/set/StickersSetHeaderView;", 0), zr6.f(cls, "stickerSetRecycler", "getStickerSetRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0, oec), zr6.f(cls, "loadingView", "getLoadingView()Landroid/view/View;", 0, oec)};
    }

    public StickerSetBottomSheet(String str, z84 z84) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    public static final int x0(StickerSetBottomSheet stickerSetBottomSheet) {
        uu3 parentController = stickerSetBottomSheet.getParentController();
        p3e p3e = parentController instanceof p3e ? (p3e) parentController : null;
        if (p3e == null) {
            return 0;
        }
        StickerPreviewScreen stickerPreviewScreen = (StickerPreviewScreen) p3e;
        bc7[] bc7Arr = StickerPreviewScreen.A0;
        return ((ViewGroup) stickerPreviewScreen.t0.T0(stickerPreviewScreen, bc7Arr[4])).getMeasuredHeight() + ((cla) stickerPreviewScreen.s0.T0(stickerPreviewScreen, bc7Arr[3])).getBottom();
    }

    public final boolean handleBack() {
        return false;
    }

    public final z5b n0() {
        return new t9(this, 5);
    }

    public final x27 o0() {
        x27 x27 = x27.c;
        return x27.c;
    }

    public final void onAttach(View view) {
        bc7 bc7 = A0[0];
        ((i3e) this.s0.getValue()).q(Long.valueOf(((Number) this.t0.a(this)).longValue()));
    }

    public final void onViewCreated(View view) {
        tu0.K(view, 300, new o3e(this, 0));
        od2.L(new zn5(((i3e) this.s0.getValue()).C0, new shb(2, this, StickerSetBottomSheet.class, "handleStickerSet", "handleStickerSet(Lone/me/sdk/stickers/model/StickerSetModel;)V", 4, 11), 5), getViewLifecycleScope());
    }

    public final void t0() {
    }

    public final void w0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        float f = (float) 10;
        int G = tu0.G(fk4.d().getDisplayMetrics().density * f);
        float f2 = (float) 12;
        frameLayout.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), G, tu0.G(f2 * fk4.d().getDisplayMetrics().density), 0);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        v5e v5e = new v5e(linearLayout.getContext());
        v5e.setId(bja.j);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        float f3 = (float) 4;
        layoutParams.bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f3);
        v5e.setLayoutParams(layoutParams);
        tu0.K(v5e.getHeaderButton(), 300, new o3e(this, 1));
        linearLayout.addView(v5e);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(bja.i);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int A = z7.A(recyclerView.getContext());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(A));
        recyclerView.j(new ry0(A, tu0.G(f3 * fk4.d().getDisplayMetrics().density), 8));
        recyclerView.k(new yc7(2, this));
        recyclerView.setAdapter(this.x0);
        pla.a(recyclerView, new h76((ViewGroup) recyclerView, recyclerView, (Widget) this, 23));
        linearLayout.addView(recyclerView);
        bc7 bc7 = A0[3];
        linearLayout.addView((View) this.z0.getValue());
        frameLayout.addView(linearLayout, new ViewGroup.LayoutParams(-1, -1));
        yp4 yp4 = new yp4(frameLayout.getContext());
        yp4.setTranslationY((float) rh4.c((float) 6, fk4.d().getDisplayMetrics().density, -G));
        frameLayout.addView(yp4);
    }

    public StickerSetBottomSheet(Bundle bundle) {
        super(bundle);
        Class<suc> cls = suc.class;
        Object v = ay7.v(bundle, Widget.ARG_SCOPE_ID, cls);
        if (v != null) {
            this.s0 = m82getSharedViewModelcp94BC8(((suc) ((Parcelable) v)).a, i3e.class, (k56) null);
            this.t0 = new fs(Long.class, 0L, "arg_key_sticker_id");
            this.v0 = viewBinding(bja.j);
            this.w0 = viewBinding(bja.i);
            this.x0 = new a3g(((iba) p4e.a.getAccessor().c(iba.class)).a(), new qqd(25, (Object) this));
            this.y0 = tu0.G(((float) 183) * fk4.d().getDisplayMetrics().density);
            this.z0 = binding(new rzd(3, this));
            v0(false);
            return;
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key arg_key_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }
}
