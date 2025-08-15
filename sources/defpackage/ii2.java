package defpackage;

import android.content.Context;
import androidx.viewpager2.widget.ViewPager2;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: ii2  reason: default package */
public final /* synthetic */ class ii2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMediaViewerScreen b;

    public /* synthetic */ ii2(ChatMediaViewerScreen chatMediaViewerScreen, int i) {
        this.a = i;
        this.b = chatMediaViewerScreen;
    }

    public final Object invoke() {
        ChatMediaViewerScreen chatMediaViewerScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ChatMediaViewerScreen.K0;
                ee2 ee2 = ee2.a;
                khe d = ee2.getAccessor().d(iy2.class);
                khe d2 = ee2.getAccessor().d(vd2.class);
                khe d3 = ee2.getAccessor().d(u9a.class);
                khe d4 = ee2.getAccessor().d(ds3.class);
                khe d5 = ee2.getAccessor().d(ida.class);
                khe d6 = ee2.getAccessor().d(rff.class);
                khe d7 = ee2.getAccessor().d(wrc.class);
                khe d8 = ee2.getAccessor().d(p26.class);
                khe d9 = ee2.getAccessor().d(qe5.class);
                chatMediaViewerScreen.getClass();
                bc7[] bc7Arr2 = ChatMediaViewerScreen.K0;
                bc7 bc7 = bc7Arr2[0];
                fs fsVar = chatMediaViewerScreen.o;
                long longValue = ((Number) fsVar.a(chatMediaViewerScreen)).longValue();
                bc7 bc72 = bc7Arr2[1];
                bc7 bc73 = bc7Arr2[2];
                Class<kke> cls = kke.class;
                bc7 bc74 = bc7Arr2[3];
                boolean booleanValue = ((Boolean) chatMediaViewerScreen.Z.a(chatMediaViewerScreen)).booleanValue();
                bc7 bc75 = bc7Arr2[4];
                boolean booleanValue2 = ((Boolean) chatMediaViewerScreen.s0.a(chatMediaViewerScreen)).booleanValue();
                pk pkVar = (pk) ee2.getAccessor().c(pk.class);
                bc7 bc76 = bc7Arr2[0];
                return new ck2(d, d2, d3, d4, d5, d6, d7, d8, d9, longValue, (String) chatMediaViewerScreen.X.a(chatMediaViewerScreen), ((Number) chatMediaViewerScreen.Y.a(chatMediaViewerScreen)).longValue(), booleanValue, booleanValue2, (Context) ee2.getAccessor().c(Context.class), (r79) ee2.getAccessor().c(r79.class), (kke) ee2.getAccessor().c(cls), pkVar, new v19(((Number) fsVar.a(chatMediaViewerScreen)).longValue(), (av0) ee2.getAccessor().c(av0.class), (kke) ee2.getAccessor().c(cls)));
            default:
                bc7[] bc7Arr3 = ChatMediaViewerScreen.K0;
                dkf dkf = ((jrd) ee2.a.getAccessor().d(jrd.class).getValue()).get();
                if (chatMediaViewerScreen.getView() != null) {
                    sb8 sb8 = (sb8) x53.j0(((ViewPager2) chatMediaViewerScreen.x0.T0(chatMediaViewerScreen, ChatMediaViewerScreen.K0[5])).getCurrentItem(), chatMediaViewerScreen.D0.y0.f);
                    jb8 jb8 = sb8 instanceof jb8 ? (jb8) sb8 : null;
                    if (jb8 != null && jb8.X) {
                        dkf.g(0.0f);
                        dkf.L0(false);
                        dkf.Y = new fd7(chatMediaViewerScreen);
                        return dkf;
                    }
                }
                if (chatMediaViewerScreen.G0 < 0.0f && dkf.e() == 0.0f) {
                    dkf.g(1.0f);
                }
                dkf.L0(false);
                dkf.Y = new fd7(chatMediaViewerScreen);
                return dkf;
        }
    }
}
