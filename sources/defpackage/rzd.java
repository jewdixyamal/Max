package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;
import one.me.login.welcome.WelcomeScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import one.me.sdk.uikit.qr.QrCodeGenerator;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: rzd  reason: default package */
public final /* synthetic */ class rzd implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rzd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object invoke() {
        Object obj;
        Integer num = null;
        switch (this.a) {
            case 0:
                return kt3.b(((uzd) this.b).getContext(), woc.U1);
            case 1:
                return new xzd((el1) ((StartRecordBottomSheet) this.b).y0.getValue());
            case 2:
                return (wuc) this.b;
            case 3:
                bc7[] bc7Arr = StickerSetBottomSheet.A0;
                nfa nfa = new nfa(((StickerSetBottomSheet) this.b).getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 1;
                nfa.setLayoutParams(layoutParams);
                nfa.setAppearance(ffa.a);
                nfa.setSize(ifa.a);
                return nfa;
            case 4:
                a8e a8e = (a8e) this.b;
                return new dg9(a8e.a, a8e.X, new bk(20, a8e));
            case 5:
                pte pte = (pte) this.b;
                try {
                    obj = QrCodeGenerator.nativeRenderSvg(pte.a, pte.b, pte.c);
                } catch (Throwable th) {
                    obj = new njc(th);
                }
                if (obj instanceof njc) {
                    obj = null;
                }
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return null;
                }
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                int i = pte.b;
                int i2 = pte.c;
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
                createBitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
                Paint paint = pte.g;
                Shader.TileMode tileMode = pte.i;
                paint.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                pte.j = true;
                return e5f.a;
            case 6:
                ViewConfiguration viewConfiguration = ViewConfiguration.get(((rge) this.b).b.getContext());
                int max = Math.max(viewConfiguration.getScaledTouchSlop(), viewConfiguration.getScaledPagingTouchSlop()) * 2;
                Integer valueOf = Integer.valueOf(max);
                if (max > 0) {
                    num = valueOf;
                }
                return Integer.valueOf(num != null ? num.intValue() : tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density));
            case 7:
                int i3 = SwipeWidget.c;
                return Boolean.valueOf(((SwipeWidget) this.b).S());
            case 8:
                return ((iba) ((tle) this.b).u0.getValue()).g();
            case 9:
                return new cbf(((rre) this.b).a);
            case 10:
                bc7[] bc7Arr2 = ThreadsStateViewerScreen.X;
                ThreadsStateViewerScreen threadsStateViewerScreen = (ThreadsStateViewerScreen) this.b;
                cla cla = new cla(threadsStateViewerScreen.getContext(), 6);
                cla.setId(yvb.threads_state_toolbar);
                cla.setTitle((CharSequence) "Состояние потоков");
                cla.setForm(uka.a);
                cla.setLeftActions(new kka(new ete(threadsStateViewerScreen, 0)));
                cla.setRightActions(new pka((yka) null, new wka(woc.O1, wfa.Q, new ete(threadsStateViewerScreen, 1), 6)));
                return cla;
            case 11:
                float intValue = (float) ((Number) ((xcf) this.b).c.getValue()).intValue();
                return Integer.valueOf((int) (intValue - (0.4f * intValue)));
            case Protos.Attaches.Attach.PRESENT:
                sif sif = (sif) this.b;
                sif.v0 = true;
                sif.f();
                return e5f.a;
            case 13:
                return new bkf((yjf) this.b);
            case Protos.Attaches.Attach.LOCATION:
                bc7[] bc7Arr3 = VideoViewerWidget.u0;
                dmf o0 = ((VideoViewerWidget) this.b).o0();
                if (o0 != null) {
                    return ((ChatMediaViewerScreen) o0).B0();
                }
                return null;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return ((zzf) this.b).s().k;
            case 16:
                bc7[] bc7Arr4 = WelcomeScreen.s0;
                return new x37(((WelcomeScreen) this.b).getRouter());
            case LangUtils.HASH_SEED:
                return Widget.childWidgetContainer_delegate$lambda$13((Widget) this.b);
            case 18:
                return new l5g(((l5g) this.b).b, 1);
            case 19:
                ho9 ho9 = new ho9();
                q7g q7g = (q7g) this.b;
                ho9.c = q7g.a;
                ho9.a = Math.min(100, 50);
                je7 je7 = q7g.c;
                ho9.d = ((iba) je7.getValue()).c();
                ho9.b = ((iba) je7.getValue()).a();
                return new me3(ho9);
            default:
                hm9.m("v7g", "start init property workManager", new Object[0]);
                v7g v7g = (v7g) this.b;
                s7g d = s7g.d(new u7g(v7g, v7g.a));
                hm9.m("v7g", "workManager property inited!", new Object[0]);
                et7 et7 = new et7(1, (byte) 0);
                synchronized (a14.e) {
                    a14.f = et7;
                }
                return d;
        }
    }
}
