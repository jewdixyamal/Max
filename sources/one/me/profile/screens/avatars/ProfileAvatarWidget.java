package one.me.profile.screens.avatars;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.zoom.ZoomableDraweeView;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0004\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\u000e¨\u0006\u0010"}, d2 = {"Lone/me/profile/screens/avatars/ProfileAvatarWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "", "", "urls", "(JLjava/util/List;)V", "Luab;", "model", "(Luab;)V", "wab", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ProfileAvatarWidget extends Widget {
    public static final /* synthetic */ bc7[] X;
    public final khe a;
    public final fs b;
    public final fs c;
    public final q7c o;

    static {
        Class<ProfileAvatarWidget> cls = ProfileAvatarWidget.class;
        hob hob = new hob(cls, "imageId", "getImageId()J", 0);
        oec oec = nec.a;
        X = new bc7[]{hob, zr6.e(oec, cls, "imageUrls", "getImageUrls()Ljava/util/List;", 0), zr6.f(cls, "imageView", "getImageView()Lone/me/sdk/zoom/ZoomableDraweeView;", 0, oec)};
    }

    public ProfileAvatarWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = new khe(new lwa(4, this));
        this.b = new fs(Long.class, 0L, "extra.id");
        this.c = new fs(List.class, nz4.a, "extra.urls");
        this.o = viewBinding(qwb.profile_contact_avatars_image_view);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        int i = qwb.profile_contact_avatars_image_view;
        ZoomableDraweeView zoomableDraweeView = new ZoomableDraweeView(frameLayout.getContext());
        zoomableDraweeView.setId(i);
        zoomableDraweeView.setAdjustViewBounds(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        zoomableDraweeView.setLayoutParams(layoutParams);
        frameLayout.addView(zoomableDraweeView);
        return frameLayout;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        uu3 parentController = getParentController();
        wab wab = parentController instanceof wab ? (wab) parentController : null;
        bc7[] bc7Arr = X;
        ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) this.o.T0(this, bc7Arr[2]);
        bs6 icon = ((fka) this.a.getValue()).getIcon();
        ma6 ma6 = new ma6(zoomableDraweeView.getResources());
        ma6.l = ssc.o;
        ma6.j = new r20(zoomableDraweeView.getContext(), 0);
        Context context = zoomableDraweeView.getContext();
        int i = gpc.w;
        int i2 = icon.f;
        ma6.f = ngg.u(i, i2, context);
        ma6.h = ngg.u(i, i2, zoomableDraweeView.getContext());
        ma6.b = 0;
        zoomableDraweeView.setHierarchy(ma6.a());
        zoomableDraweeView.setZoomEnabled(true);
        zoomableDraweeView.setOnTouchListener(new q46(new GestureDetector(zoomableDraweeView.getContext(), new p63(wab, 3, this)), 6));
        bc7 bc7 = bc7Arr[1];
        List<String> list = (List) this.c.a(this);
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (String str : list) {
            wv6 b2 = wv6.b(str);
            if (b2 != null) {
                iv6 o2 = s36.o();
                o2.getClass();
                arrayList.add(new hv6(o2, b2, str));
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        if (!arrayList.isEmpty()) {
            e2b a2 = s36.a.get();
            a2.g = new rz6(arrayList, false);
            a2.i = true;
            a2.l = zoomableDraweeView.getController();
            zoomableDraweeView.setController(a2.a());
        }
    }

    public ProfileAvatarWidget(long j, List<String> list) {
        this(dy7.g(new kpa("extra.id", Long.valueOf(j)), new kpa("extra.urls", list)));
    }

    public ProfileAvatarWidget(uab uab) {
        this(uab.a, uab.b);
    }
}
