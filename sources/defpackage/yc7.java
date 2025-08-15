package defpackage;

import android.view.View;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import one.me.stickerssearch.StickersSearchScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* renamed from: yc7  reason: default package */
public final class yc7 implements qdc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yc7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(View view) {
    }

    private final void c(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }

    private final void h(View view) {
    }

    public final void b(View view) {
        int i = this.a;
    }

    public final void d(View view) {
        gw7 gw7;
        switch (this.a) {
            case 0:
                gw7 gw72 = ((KeyboardStickersWidget) this.b).c;
                if (gw72 != null) {
                    a4g a4g = null;
                    iw7 iw7 = view instanceof iw7 ? (iw7) view : null;
                    if (iw7 != null) {
                        iw7.b(gw72);
                    }
                    if (view instanceof a4g) {
                        a4g = (a4g) view;
                    }
                    if (a4g != null) {
                        a4g.b(gw72);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                View view2 = null;
                zs8 zs8 = view instanceof zs8 ? (zs8) view : null;
                if (zs8 != null) {
                    view2 = zs8.getContentView$message_list_release();
                }
                if ((view2 instanceof x2e) && (gw7 = ((MessagesListWidget) this.b).I0) != null) {
                    ((x2e) view2).b(gw7);
                    return;
                }
                return;
            case 2:
                gw7 gw73 = ((StickerSetBottomSheet) this.b).u0;
                if (gw73 != null) {
                    a4g a4g2 = null;
                    iw7 iw72 = view instanceof iw7 ? (iw7) view : null;
                    if (iw72 != null) {
                        iw72.b(gw73);
                    }
                    if (view instanceof a4g) {
                        a4g2 = (a4g) view;
                    }
                    if (a4g2 != null) {
                        a4g2.b(gw73);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                a4g a4g3 = null;
                iw7 iw73 = view instanceof iw7 ? (iw7) view : null;
                StickersScreen stickersScreen = (StickersScreen) this.b;
                if (iw73 != null) {
                    iw73.b(stickersScreen.t0);
                }
                if (view instanceof a4g) {
                    a4g3 = (a4g) view;
                }
                if (a4g3 != null) {
                    a4g3.b(stickersScreen.t0);
                    return;
                }
                return;
            case 4:
                a4g a4g4 = null;
                iw7 iw74 = view instanceof iw7 ? (iw7) view : null;
                StickersSearchScreen stickersSearchScreen = (StickersSearchScreen) this.b;
                if (iw74 != null) {
                    iw74.b(stickersSearchScreen.o);
                }
                if (view instanceof a4g) {
                    a4g4 = (a4g) view;
                }
                if (a4g4 != null) {
                    a4g4.b(stickersSearchScreen.o);
                    return;
                }
                return;
            default:
                a4g a4g5 = null;
                iw7 iw75 = view instanceof iw7 ? (iw7) view : null;
                gw7 gw74 = (gw7) this.b;
                if (iw75 != null) {
                    iw75.b(gw74);
                }
                if (view instanceof a4g) {
                    a4g5 = (a4g) view;
                }
                if (a4g5 != null) {
                    a4g5.b(gw74);
                    return;
                }
                return;
        }
    }
}
