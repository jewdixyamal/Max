package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.stickerspreview.set.StickerSetBottomSheet;

/* renamed from: t9  reason: default package */
public class t9 extends z5b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public t9(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    public int a() {
        switch (this.a) {
            case 0:
                return c();
            case 1:
                return c();
            case 2:
                return 0;
            case 3:
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) this.b;
                u6c u6c = messageContextMenuBottomSheet.P0;
                if (u6c != null && u6c.c.j() > 8) {
                    return c();
                }
                if (messageContextMenuBottomSheet.D0()) {
                    return 0;
                }
                return c();
            case 4:
                return 0;
            case 5:
                return StickerSetBottomSheet.x0((StickerSetBottomSheet) this.b);
            default:
                return 0;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v4, types: [dec] */
    /* JADX WARNING: type inference failed for: r1v12, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r1v22 */
    /* JADX WARNING: type inference failed for: r1v23 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b6, code lost:
        r1 = r1.a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            one.me.sdk.arch.Widget r2 = r6.b
            int r3 = r6.a
            switch(r3) {
                case 0: goto L_0x0158;
                case 1: goto L_0x0142;
                case 2: goto L_0x0124;
                case 3: goto L_0x008e;
                case 4: goto L_0x008d;
                case 5: goto L_0x0088;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r6 = r6.e()
            int r0 = r6 / 2
            bc7[] r3 = one.me.sdk.messagewrite.mention.SuggestionsWidget.B0
            one.me.sdk.messagewrite.mention.SuggestionsWidget r2 = (one.me.sdk.messagewrite.mention.SuggestionsWidget) r2
            yce r3 = r2.B0()
            w7c r3 = r3.D0
            j0e r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            kce r3 = (defpackage.kce) r3
            yce r4 = r2.B0()
            q0e r5 = r4.G0
            java.lang.Object r5 = r5.getValue()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            q0e r4 = r4.H0
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            r4.intValue()
            if (r5 == 0) goto L_0x0087
            boolean r4 = defpackage.w9e.C0(r5)
            if (r4 == 0) goto L_0x0041
            goto L_0x0087
        L_0x0041:
            if (r3 == 0) goto L_0x0045
            java.util.List r1 = r3.b
        L_0x0045:
            if (r1 == 0) goto L_0x006d
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x004e
            goto L_0x006d
        L_0x004e:
            r1 = 20
            float r1 = (float) r1
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            int r6 = defpackage.rh4.q(r1, r3, r6)
            z15 r1 = r2.A0()
            int r1 = r1.getMeasuredHeight()
            int r6 = r6 - r1
            int r6 = java.lang.Math.max(r6, r0)
            goto L_0x0087
        L_0x006d:
            androidx.appcompat.widget.AppCompatTextView r0 = r2.z0()
            int r0 = r0.getMeasuredHeight()
            int r6 = r6 - r0
            r0 = 48
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            int r6 = defpackage.rh4.q(r0, r1, r6)
        L_0x0087:
            return r6
        L_0x0088:
            int r6 = r6.e()
            return r6
        L_0x008d:
            return r0
        L_0x008e:
            bc7[] r3 = one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet.Z0
            one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet r2 = (one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet) r2
            boolean r3 = r2.D0()
            if (r3 == 0) goto L_0x00df
            r6 = 350(0x15e, float:4.9E-43)
            float r6 = (float) r6
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r6 = r6 * r3
            int r6 = defpackage.tu0.G(r6)
            androidx.recyclerview.widget.RecyclerView r3 = r2.O0
            if (r3 == 0) goto L_0x00b4
            r4 = -9223372036854775808
            dec r1 = r3.N(r4)
        L_0x00b4:
            if (r1 == 0) goto L_0x00bf
            android.view.View r1 = r1.a
            if (r1 == 0) goto L_0x00bf
            int r1 = r1.getMeasuredHeight()
            goto L_0x00c0
        L_0x00bf:
            r1 = r0
        L_0x00c0:
            r3 = 120(0x78, float:1.68E-43)
            float r3 = (float) r3
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            int r1 = defpackage.rh4.c(r3, r4, r1)
            androidx.recyclerview.widget.RecyclerView r3 = r2.O0
            if (r3 == 0) goto L_0x00d9
            int r0 = r3.getPaddingBottom()
        L_0x00d9:
            int r1 = r1 + r0
            if (r1 >= r6) goto L_0x00dd
            goto L_0x00fc
        L_0x00dd:
            r6 = r1
            goto L_0x00fc
        L_0x00df:
            android.view.ViewGroup r0 = r2.N0
            if (r0 == 0) goto L_0x00e8
            int r6 = r0.getMeasuredHeight()
            goto L_0x00f0
        L_0x00e8:
            android.view.View r6 = r6.f()
            int r6 = r6.getMeasuredHeight()
        L_0x00f0:
            int r0 = r2.Y0
            int r6 = r6 + r0
            android.view.ViewGroup r0 = r2.B0()
            int r0 = r0.getPaddingBottom()
            int r6 = r6 + r0
        L_0x00fc:
            int r0 = defpackage.vc7.a
            int r0 = defpackage.vc7.c
            boolean r0 = defpackage.vc7.b(r0)
            if (r0 == 0) goto L_0x0119
            android.view.View r0 = r2.requireView()
            int r0 = r0.getMeasuredHeight()
            int r0 = r0 - r6
            android.content.Context r6 = r2.getContext()
            int r6 = defpackage.vc7.a(r6)
            int r6 = r6 + r0
            goto L_0x0123
        L_0x0119:
            android.view.View r0 = r2.requireView()
            int r0 = r0.getMeasuredHeight()
            int r6 = r0 - r6
        L_0x0123:
            return r6
        L_0x0124:
            bc7[] r6 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            one.me.chatscreen.mediabar.MediaBarWidget r2 = (one.me.chatscreen.mediabar.MediaBarWidget) r2
            android.widget.LinearLayout r6 = r2.t0()
            int r6 = r6.getMeasuredHeight()
            r0 = 405(0x195, float:5.68E-43)
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            int r6 = defpackage.rh4.q(r0, r1, r6)
            return r6
        L_0x0142:
            nd2 r6 = one.me.sdk.bottomsheet.BaseBottomSheetWidget.X
            one.me.sdk.bottomsheet.BaseBottomSheetWidget r2 = (one.me.sdk.bottomsheet.BaseBottomSheetWidget) r2
            android.view.View r6 = r2.requireView()
            int r6 = r6.getMeasuredHeight()
            android.view.View r0 = r2.p0()
            int r0 = r0.getMeasuredHeight()
            int r6 = r6 - r0
            return r6
        L_0x0158:
            bc7[] r0 = one.me.sdk.messagewrite.markdown.AddLinkBottomSheet.x0
            one.me.sdk.messagewrite.markdown.AddLinkBottomSheet r2 = (one.me.sdk.messagewrite.markdown.AddLinkBottomSheet) r2
            android.view.View r0 = r2.requireView()
            int r0 = r0.getMeasuredHeight()
            android.view.View r6 = r6.f()
            int r6 = r6.getMeasuredHeight()
            int r0 = r0 - r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t9.c():int");
    }

    public View d() {
        switch (this.a) {
            case 2:
                bc7[] bc7Arr = MediaBarWidget.d1;
                return ((MediaBarWidget) this.b).r0();
            default:
                return super.d();
        }
    }

    public final int e() {
        int i = 0;
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                View view = ((AddLinkBottomSheet) widget).getView();
                if (view != null) {
                    return view.getMeasuredHeight();
                }
                return 0;
            case 1:
                View view2 = ((BaseBottomSheetWidget) widget).getView();
                if (view2 != null) {
                    return view2.getMeasuredHeight();
                }
                return 0;
            case 2:
                bc7[] bc7Arr = MediaBarWidget.d1;
                return ((MediaBarWidget) widget).t0().getMeasuredHeight();
            case 3:
                View view3 = ((MessageContextMenuBottomSheet) widget).getView();
                if (view3 != null) {
                    return view3.getMeasuredHeight();
                }
                return 0;
            case 4:
                bc7[] bc7Arr2 = SelectAlbumWidget.Y;
                return -((SelectAlbumWidget) widget).m0().getMeasuredHeight();
            case 5:
                StickerSetBottomSheet stickerSetBottomSheet = (StickerSetBottomSheet) widget;
                View view4 = stickerSetBottomSheet.getView();
                if (view4 != null) {
                    i = view4.getMeasuredHeight();
                }
                return i - stickerSetBottomSheet.y0;
            default:
                bc7[] bc7Arr3 = SuggestionsWidget.B0;
                return ((SuggestionsWidget) widget).p0().getMeasuredHeight();
        }
    }

    public final View f() {
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = AddLinkBottomSheet.x0;
                return ((AddLinkBottomSheet) widget).p0();
            case 1:
                return ((BaseBottomSheetWidget) widget).p0();
            case 2:
                bc7[] bc7Arr2 = MediaBarWidget.d1;
                return ((MediaBarWidget) widget).t0();
            case 3:
                bc7[] bc7Arr3 = MessageContextMenuBottomSheet.Z0;
                return ((MessageContextMenuBottomSheet) widget).p0();
            case 4:
                bc7[] bc7Arr4 = SelectAlbumWidget.Y;
                return ((SelectAlbumWidget) widget).m0();
            case 5:
                bc7[] bc7Arr5 = StickerSetBottomSheet.A0;
                return ((StickerSetBottomSheet) widget).p0();
            default:
                bc7[] bc7Arr6 = SuggestionsWidget.B0;
                return ((SuggestionsWidget) widget).p0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r0.B0().A0.a.getValue() == defpackage.v8b.b) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        if (r0.v0().n() != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
        if (r0.B0().u() != false) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.d6b g(defpackage.d6b r4, defpackage.d6b r5) {
        /*
            r3 = this;
            one.me.sdk.arch.Widget r0 = r3.b
            int r3 = r3.a
            switch(r3) {
                case 1: goto L_0x0081;
                case 2: goto L_0x0024;
                case 3: goto L_0x0018;
                case 4: goto L_0x0007;
                case 5: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return r5
        L_0x0008:
            d6b r3 = defpackage.d6b.a
            if (r5 != r3) goto L_0x0013
            d6b r0 = defpackage.d6b.c
            if (r4 != r0) goto L_0x0013
            d6b r4 = defpackage.d6b.b
            goto L_0x0017
        L_0x0013:
            if (r5 != r3) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r4 = r5
        L_0x0017:
            return r4
        L_0x0018:
            d6b r3 = defpackage.d6b.a
            if (r5 != r3) goto L_0x0023
            bc7[] r3 = one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet.Z0
            one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet r0 = (one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet) r0
            r0.getClass()
        L_0x0023:
            return r5
        L_0x0024:
            d6b r3 = defpackage.d6b.c
            one.me.chatscreen.mediabar.MediaBarWidget r0 = (one.me.chatscreen.mediabar.MediaBarWidget) r0
            if (r5 != r3) goto L_0x003d
            bc7[] r1 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            p58 r1 = r0.B0()
            w7c r1 = r1.A0
            j0e r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            v8b r2 = defpackage.v8b.b
            if (r1 != r2) goto L_0x003d
            goto L_0x006f
        L_0x003d:
            if (r4 != r3) goto L_0x005a
            d6b r3 = defpackage.d6b.b
            if (r5 != r3) goto L_0x005a
            int r3 = defpackage.vc7.a
            int r3 = defpackage.vc7.c
            boolean r3 = defpackage.vc7.b(r3)
            if (r3 != 0) goto L_0x006f
            bc7[] r3 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            znc r3 = r0.v0()
            boolean r3 = r3.n()
            if (r3 == 0) goto L_0x005a
            goto L_0x006f
        L_0x005a:
            r5.getClass()
            d6b r3 = defpackage.d6b.a
            if (r5 == r3) goto L_0x0062
            goto L_0x006e
        L_0x0062:
            bc7[] r3 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            p58 r3 = r0.B0()
            boolean r3 = r3.u()
            if (r3 == 0) goto L_0x006f
        L_0x006e:
            r4 = r5
        L_0x006f:
            d6b r3 = defpackage.d6b.a
            if (r4 != r3) goto L_0x0080
            bc7[] r3 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            p58 r3 = r0.B0()
            x48 r5 = defpackage.x48.a
            s35 r3 = r3.w0
            defpackage.pnf.o(r3, r5)
        L_0x0080:
            return r4
        L_0x0081:
            d6b r3 = defpackage.d6b.a
            if (r5 != r3) goto L_0x008d
            one.me.sdk.bottomsheet.BaseBottomSheetWidget r0 = (one.me.sdk.bottomsheet.BaseBottomSheetWidget) r0
            boolean r3 = r0.r0()
            if (r3 == 0) goto L_0x008e
        L_0x008d:
            r4 = r5
        L_0x008e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t9.g(d6b, d6b):d6b");
    }

    public void h() {
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = AddLinkBottomSheet.x0;
                ((AddLinkBottomSheet) widget).t0();
                return;
            case 1:
                ((BaseBottomSheetWidget) widget).t0();
                return;
            case 2:
                bc7[] bc7Arr2 = MediaBarWidget.d1;
                MediaBarWidget mediaBarWidget = (MediaBarWidget) widget;
                mediaBarWidget.p0();
                p58 B0 = mediaBarWidget.B0();
                B0.t0.n(z38.a);
                pnf.o(B0.w0, w48.a);
                t58 t58 = mediaBarWidget.c1;
                if (t58 != null) {
                    ((ChatScreen) t58).o.a();
                    return;
                }
                return;
            case 3:
                bc7[] bc7Arr3 = MessageContextMenuBottomSheet.Z0;
                ((MessageContextMenuBottomSheet) widget).t0();
                return;
            case 4:
                bc7[] bc7Arr4 = SelectAlbumWidget.Y;
                q3d o0 = ((SelectAlbumWidget) widget).o0();
                pnf.o(o0.o, h3d.a);
                return;
            case 6:
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) widget;
                suggestionsWidget.getRouter().B(suggestionsWidget);
                return;
            default:
                return;
        }
    }

    public void i() {
        switch (this.a) {
            case 2:
                bc7[] bc7Arr = MediaBarWidget.d1;
                p58 B0 = ((MediaBarWidget) this.b).B0();
                pnf.o(B0.w0, x48.a);
                return;
            default:
                return;
        }
    }

    public boolean j() {
        switch (this.a) {
            case 2:
                bc7[] bc7Arr = MediaBarWidget.d1;
                return ((MediaBarWidget) this.b).B0().u();
            default:
                return super.j();
        }
    }

    public void k() {
        switch (this.a) {
            case 2:
                bc7[] bc7Arr = MediaBarWidget.d1;
                ((MediaBarWidget) this.b).q0();
                return;
            default:
                return;
        }
    }

    public void l(d6b d6b) {
        switch (this.a) {
            case 6:
                boolean z = d6b == d6b.c;
                bc7[] bc7Arr = SuggestionsWidget.B0;
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) this.b;
                suggestionsWidget.x0().setVisibility(z ? 0 : 8);
                suggestionsWidget.y0().setVisibility(z ^ true ? 0 : 8);
                z15 A0 = suggestionsWidget.A0();
                ViewGroup.LayoutParams layoutParams = A0.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = tu0.G((z ? (float) 0 : (float) 20) * fk4.d().getDisplayMetrics().density);
                    A0.setLayoutParams(marginLayoutParams);
                    AppCompatTextView z0 = suggestionsWidget.z0();
                    ViewGroup.LayoutParams layoutParams2 = z0.getLayoutParams();
                    if (layoutParams2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.topMargin = tu0.G((z ? (float) 0 : (float) 8) * fk4.d().getDisplayMetrics().density);
                        z0.setLayoutParams(marginLayoutParams2);
                        q7c q7c = suggestionsWidget.t0;
                        if (z) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) q7c.T0(suggestionsWidget, SuggestionsWidget.B0[1]);
                            constraintLayout.setClipToOutline(true);
                            constraintLayout.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 0.0f));
                            return;
                        }
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) q7c.T0(suggestionsWidget, SuggestionsWidget.B0[1]);
                        constraintLayout2.setClipToOutline(true);
                        constraintLayout2.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 20.0f));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            default:
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(int r12) {
        /*
            r11 = this;
            r0 = 1
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 4
            r3 = 0
            r4 = 0
            one.me.sdk.arch.Widget r5 = r11.b
            int r6 = r11.a
            switch(r6) {
                case 2: goto L_0x010a;
                case 3: goto L_0x0066;
                case 4: goto L_0x0047;
                case 5: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            return
        L_0x000e:
            bc7[] r11 = one.me.stickerspreview.set.StickerSetBottomSheet.A0
            one.me.stickerspreview.set.StickerSetBottomSheet r5 = (one.me.stickerspreview.set.StickerSetBottomSheet) r5
            uu3 r11 = r5.getParentController()
            boolean r0 = r11 instanceof defpackage.p3e
            if (r0 == 0) goto L_0x001d
            p3e r11 = (defpackage.p3e) r11
            goto L_0x001e
        L_0x001d:
            r11 = r3
        L_0x001e:
            if (r11 == 0) goto L_0x002f
            one.me.stickerspreview.StickerPreviewScreen r11 = (one.me.stickerspreview.StickerPreviewScreen) r11
            bc7[] r0 = one.me.stickerspreview.StickerPreviewScreen.A0
            r0 = r0[r2]
            q7c r1 = r11.t0
            java.lang.Object r11 = r1.T0(r11, r0)
            r3 = r11
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x002f:
            if (r3 != 0) goto L_0x0032
            goto L_0x0046
        L_0x0032:
            int r11 = r3.getBottom()
            if (r12 > r11) goto L_0x0043
            float r11 = (float) r12
            int r12 = r3.getBottom()
            float r12 = (float) r12
            float r11 = r11 - r12
            r3.setTranslationY(r11)
            goto L_0x0046
        L_0x0043:
            r3.setTranslationY(r4)
        L_0x0046:
            return
        L_0x0047:
            bc7[] r0 = one.me.sdk.gallery.selectalbum.SelectAlbumWidget.Y
            one.me.sdk.gallery.selectalbum.SelectAlbumWidget r5 = (one.me.sdk.gallery.selectalbum.SelectAlbumWidget) r5
            q3d r0 = r5.o0()
            android.view.View r11 = r11.f()
            int r11 = r11.getMeasuredHeight()
            int r11 = r11 + r12
            r0.getClass()
            f3d r12 = new f3d
            r12.<init>(r11)
            s35 r11 = r0.o
            defpackage.pnf.o(r11, r12)
            return
        L_0x0066:
            bc7[] r11 = one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet.Z0
            one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet r5 = (one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet) r5
            boolean r11 = r5.isAttached()
            if (r11 == 0) goto L_0x0109
            boolean r11 = r5.D0()
            if (r11 != 0) goto L_0x0078
            goto L_0x0109
        L_0x0078:
            float r11 = (float) r12
            r12 = 76
            float r12 = (float) r12
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r12 = r12 * r2
            int r12 = defpackage.tu0.G(r12)
            float r12 = (float) r12
            float r11 = r11 / r12
            float r11 = defpackage.ote.d(r11, r4, r1)
            int r12 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r12 != 0) goto L_0x009c
            android.view.ViewGroup r12 = r5.B0()
            r12.getMeasuredHeight()
        L_0x009c:
            int r12 = defpackage.ufa.c
            android.view.View r12 = r5.findViewById(r12)
            cla r12 = (defpackage.cla) r12
            if (r12 == 0) goto L_0x00e9
            float r0 = (float) r0
            float r0 = r0 - r11
            r12.setAlpha(r0)
            int r12 = r12.getMeasuredHeight()
            float r12 = (float) r12
            float r0 = r0 * r12
            int r12 = (int) r0
            androidx.recyclerview.widget.RecyclerView r0 = r5.O0
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            if (r0 == 0) goto L_0x00cc
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            if (r2 == 0) goto L_0x00c6
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r2.topMargin = r12
            r0.setLayoutParams(r2)
            goto L_0x00cc
        L_0x00c6:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            r11.<init>(r1)
            throw r11
        L_0x00cc:
            android.view.ViewGroup r12 = r5.B0()
            android.view.ViewGroup$LayoutParams r0 = r12.getLayoutParams()
            if (r0 == 0) goto L_0x00e3
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r5.Y0
            float r1 = (float) r1
            float r1 = r1 * r11
            int r1 = (int) r1
            r0.topMargin = r1
            r12.setLayoutParams(r0)
            goto L_0x00e9
        L_0x00e3:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            r11.<init>(r1)
            throw r11
        L_0x00e9:
            r12 = 1101004800(0x41a00000, float:20.0)
            float r12 = r12 * r11
            android.content.res.Resources r0 = defpackage.fk4.d()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r12 = r12 * r0
            xq0 r0 = r5.X0
            r0.b = r12
            android.view.ViewGroup r12 = r5.B0()
            r12.invalidateOutline()
            yp4 r12 = r5.t0
            if (r12 == 0) goto L_0x0109
            r12.setAlpha(r11)
        L_0x0109:
            return
        L_0x010a:
            bc7[] r11 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            one.me.chatscreen.mediabar.MediaBarWidget r5 = (one.me.chatscreen.mediabar.MediaBarWidget) r5
            r5.getClass()
            float r11 = (float) r12
            r6 = 48
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r6 = r6 * r7
            int r6 = defpackage.tu0.G(r6)
            float r6 = (float) r6
            float r6 = r11 / r6
            float r1 = defpackage.ote.d(r6, r4, r1)
            android.view.View r4 = r5.requireView()
            android.view.WindowInsets r4 = r4.getRootWindowInsets()
            r6 = 0
            if (r4 == 0) goto L_0x0144
            x6g r3 = defpackage.x6g.f(r3, r4)
            v6g r3 = r3.a
            r4 = 7
            v27 r3 = r3.f(r4)
            int r3 = r3.b
            goto L_0x0145
        L_0x0144:
            r3 = r6
        L_0x0145:
            bc7[] r4 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            r7 = 5
            r7 = r4[r7]
            qm0 r7 = r5.w0
            java.lang.Object r7 = r7.getValue()
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 - r7
            int r3 = r3 - r12
            if (r3 >= 0) goto L_0x015b
            r3 = r6
        L_0x015b:
            android.widget.LinearLayout r7 = r5.t0()
            int r8 = r7.getPaddingLeft()
            int r9 = r7.getPaddingRight()
            int r10 = r7.getPaddingBottom()
            r7.setPadding(r8, r3, r9, r10)
            r3 = 1094713344(0x41400000, float:12.0)
            float r3 = r3 * r1
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r3 = r3 * r7
            xq0 r7 = r5.L0
            r7.b = r3
            android.widget.LinearLayout r3 = r5.t0()
            r3.invalidateOutline()
            r2 = r4[r2]
            qm0 r2 = r5.v0
            java.lang.Object r2 = r2.getValue()
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2.setAlpha(r1)
            cla r1 = r5.A0()
            if (r12 > 0) goto L_0x019b
            goto L_0x019c
        L_0x019b:
            r0 = r6
        L_0x019c:
            r1.setShowDropdown(r0)
            r5.F0 = r11
            one.me.chatscreen.mediabar.MediaBarWidget.o0(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t9.m(int):void");
    }

    public boolean n(float f, float f2) {
        boolean z;
        uge uge;
        RecyclerView recyclerView;
        Widget widget = this.b;
        switch (this.a) {
            case 2:
                bc7[] bc7Arr = MediaBarWidget.d1;
                MediaBarWidget mediaBarWidget = (MediaBarWidget) widget;
                if (mediaBarWidget.s0().z0) {
                    return false;
                }
                vha vha = mediaBarWidget.u0;
                if (vha == null || (uge = (uge) vha.a.X) == null) {
                    z = false;
                } else {
                    Rect rect = mpf.a;
                    mpf.d(rect, uge);
                    z = rect.contains((int) f, (int) f2);
                }
                if (z) {
                    return false;
                }
                if (mediaBarWidget.z0().getVisibility() == 0) {
                    return false;
                }
                uu3 b2 = mediaBarWidget.y0().b();
                MediaGalleryWidget mediaGalleryWidget = b2 instanceof MediaGalleryWidget ? (MediaGalleryWidget) b2 : null;
                return !(mediaGalleryWidget != null ? mediaGalleryWidget.m0().canScrollVertically(-1) : false);
            case 3:
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) widget;
                u6c u6c = messageContextMenuBottomSheet.P0;
                boolean canScrollVertically = (u6c == null || (recyclerView = u6c.d) == null) ? false : recyclerView.canScrollVertically(-1);
                RecyclerView recyclerView2 = messageContextMenuBottomSheet.O0;
                return !(recyclerView2 != null ? recyclerView2.canScrollVertically(-1) : false) && !canScrollVertically;
            case 4:
                bc7[] bc7Arr2 = SelectAlbumWidget.Y;
                return !((SelectAlbumWidget) widget).m0().canScrollVertically(1);
            case 5:
                bc7[] bc7Arr3 = StickerSetBottomSheet.A0;
                StickerSetBottomSheet stickerSetBottomSheet = (StickerSetBottomSheet) widget;
                stickerSetBottomSheet.getClass();
                return ((RecyclerView) stickerSetBottomSheet.w0.T0(stickerSetBottomSheet, StickerSetBottomSheet.A0[2])).computeVerticalScrollOffset() == 0;
            case 6:
                bc7[] bc7Arr4 = SuggestionsWidget.B0;
                return ((LinearLayoutManager) ((SuggestionsWidget) widget).A0().getLayoutManager()).T0() == 0;
            default:
                return super.n(f, f2);
        }
    }
}
