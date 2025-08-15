package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.mediapicker.MediaPickerScreen;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;

/* renamed from: le8  reason: default package */
public final /* synthetic */ class le8 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaPickerScreen b;

    public /* synthetic */ le8(MediaPickerScreen mediaPickerScreen, int i) {
        this.a = i;
        this.b = mediaPickerScreen;
    }

    public final Object invoke() {
        View findViewById;
        MediaPickerScreen mediaPickerScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = MediaPickerScreen.B0;
                if (!(((te8) mediaPickerScreen.s0.getValue()).w0.a.getValue() instanceof gt3)) {
                    bc7[] bc7Arr2 = MediaPickerScreen.B0;
                    bc7 bc7 = bc7Arr2[3];
                    ((w12) mediaPickerScreen.u0.getValue()).setVisibility(0);
                    bc7 bc72 = bc7Arr2[7];
                    ((View) mediaPickerScreen.y0.getValue()).setVisibility(0);
                    bc7 bc73 = bc7Arr2[2];
                    q7c q7c = mediaPickerScreen.t0;
                    j03 j03 = (j03) q7c.T0(mediaPickerScreen, bc73);
                    if (!tpa.f(j03.c(), "SELECT_ALBUM_WIDGET_TAG")) {
                        coc coc = new coc(new SelectAlbumWidget(mediaPickerScreen.c, (z84) null), (String) null, (zu3) null, (zu3) null, false, -1);
                        coc.d("SELECT_ALBUM_WIDGET_TAG");
                        j03.a.R(coc);
                    }
                    uu3 b2 = ((j03) q7c.T0(mediaPickerScreen, bc7Arr2[2])).b();
                    SelectAlbumWidget selectAlbumWidget = b2 instanceof SelectAlbumWidget ? (SelectAlbumWidget) b2 : null;
                    if (selectAlbumWidget != null) {
                        View view = selectAlbumWidget.getView();
                        if (!(view == null || (findViewById = view.findViewById(fga.d)) == null)) {
                            int height = findViewById.getHeight();
                            bc7 bc74 = bc7Arr2[4];
                            mediaPickerScreen.v0.b(mediaPickerScreen, Integer.valueOf(height));
                            v3c.y(new a3(3, (Continuation) null, 2), findViewById);
                        }
                        selectAlbumWidget.p0();
                    }
                }
                return e5f.a;
            case 1:
                bc7[] bc7Arr3 = MediaPickerScreen.B0;
                return new q3d((hq7) he8.a.getAccessor().c(hq7.class), new e3d(mediaPickerScreen.n0().s0, false));
            case 2:
                bc7[] bc7Arr4 = MediaPickerScreen.B0;
                return new te8(mediaPickerScreen.n0(), (q3d) mediaPickerScreen.Z.getValue(), (s86) mediaPickerScreen.Y.getValue());
            case 3:
                bc7[] bc7Arr5 = MediaPickerScreen.B0;
                FrameLayout frameLayout = new FrameLayout(mediaPickerScreen.getContext());
                frameLayout.setId(cda.a);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setVisibility(8);
                return frameLayout;
            case 4:
                bc7[] bc7Arr6 = MediaPickerScreen.B0;
                FrameLayout frameLayout2 = new FrameLayout(mediaPickerScreen.getContext());
                frameLayout2.setId(cda.b);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                frameLayout2.setLayoutParams(layoutParams);
                return frameLayout2;
            case 5:
                bc7[] bc7Arr7 = MediaPickerScreen.B0;
                cla cla = new cla(mediaPickerScreen.getContext(), 6);
                cla.setId(cda.e);
                cla.setTitle(dda.a);
                cla.setLeftActions(new kka(new wz7(2, mediaPickerScreen)));
                cla.setTitleClickListener(new le8(mediaPickerScreen, 0));
                cla.setShowDropdown(true);
                return cla;
            case 6:
                bc7[] bc7Arr8 = MediaPickerScreen.B0;
                View view2 = new View(mediaPickerScreen.getContext());
                view2.setId(cda.d);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, tu0.G(((float) 1) * fk4.d().getDisplayMetrics().density));
                layoutParams2.gravity = 48;
                view2.setLayoutParams(layoutParams2);
                v3c.y(new a3(3, (Continuation) null, 1), view2);
                view2.setVisibility(8);
                return view2;
            default:
                bc7[] bc7Arr9 = MediaPickerScreen.B0;
                TextView textView = new TextView(mediaPickerScreen.getContext());
                textView.setText(dda.c);
                i4f.s.b(textView, du4.b);
                textView.setGravity(17);
                v3c.y(new v9(3, (Continuation) null, 17), textView);
                ((FrameLayout) mediaPickerScreen.z0.T0(mediaPickerScreen, MediaPickerScreen.B0[8])).addView(textView);
                return textView;
        }
    }
}
