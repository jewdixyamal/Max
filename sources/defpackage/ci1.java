package defpackage;

import android.util.AttributeSet;
import android.view.ViewStub;
import androidx.recyclerview.widget.b;
import androidx.viewpager2.widget.ViewPager2;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ci1  reason: default package */
public final /* synthetic */ class ci1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallScreen b;

    public /* synthetic */ ci1(CallScreen callScreen, int i) {
        this.a = i;
        this.b = callScreen;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, ty2] */
    public final Object invoke() {
        CallScreen callScreen = this.b;
        switch (this.a) {
            case 0:
                yxc yxc = CallScreen.R0;
                return new ji1(callScreen);
            case 1:
                yxc yxc2 = CallScreen.R0;
                return tpa.u(callScreen.getContext());
            case 2:
                yxc yxc3 = CallScreen.R0;
                return new z21(callScreen.getContext());
            case 3:
                yxc yxc4 = CallScreen.R0;
                je7 c = yi1.c();
                zi1 zi1 = zi1.a;
                ir1 b2 = zi1.b();
                je7 je7 = iyc.l;
                je7 b3 = yi1.b();
                khe khe = callScreen.c;
                c11 c11 = new c11(b3, (ivc) khe.getValue());
                khe khe2 = callScreen.o;
                ? obj = new Object();
                obj.a = (tta) callScreen.X.getValue();
                obj.b = (z21) khe2.getValue();
                obj.c = d04.k;
                obj.o = new pqa(fqa.c);
                obj.X = y21.h;
                obj.Z = aa.h;
                bn1 bn1 = new bn1(callScreen.getContext());
                zi1.getAccessor().d(q33.class);
                je7 d = yi1.d();
                ir1 b4 = zi1.b();
                je7 a2 = yi1.a();
                je7 je72 = iyc.b;
                eo1 eo1 = new eo1(new ci1(callScreen, 10), b4, je7, yi1.c(), je72, a2, iyc.a());
                return new el1(c, (tta) callScreen.X.getValue(), b2, c11, obj, bn1, eo1, (z21) khe2.getValue(), (ivc) khe.getValue(), d);
            case 4:
                yxc yxc5 = CallScreen.R0;
                uv3 uv3 = new uv3();
                uv3.h = new di1(callScreen, 1);
                uv3.i = new di1(callScreen, 2);
                return uv3;
            case 5:
                yxc yxc6 = CallScreen.R0;
                ViewStub viewStub = new ViewStub(callScreen.getContext());
                viewStub.setId(rvb.call_bottom_unavailable_control);
                return viewStub;
            case 6:
                yxc yxc7 = CallScreen.R0;
                return new ki1(callScreen);
            case 7:
                yxc yxc8 = CallScreen.R0;
                q21 q21 = new q21(callScreen.getContext(), (AttributeSet) null);
                q21.setLayoutParams(new ti3(-1, 0));
                q21.setVisibility(8);
                return q21;
            case 8:
                yxc yxc9 = CallScreen.R0;
                return new ui1(callScreen);
            case 9:
                yxc yxc10 = CallScreen.R0;
                return Integer.valueOf(((ivc) callScreen.c.getValue()).a);
            case 10:
                yxc yxc11 = CallScreen.R0;
                return callScreen.getViewLifecycleScope();
            case 11:
                yxc yxc12 = CallScreen.R0;
                CallEventsWidget callEventsWidget = new CallEventsWidget(callScreen.s0, (z84) null);
                callScreen.z0().b(callEventsWidget);
                callEventsWidget.o.add(new fi1(callScreen));
                callEventsWidget.a = new f9(callScreen, 9, callEventsWidget);
                return callEventsWidget;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                yxc yxc13 = CallScreen.R0;
                return new ti1(callScreen);
            case 13:
                yxc yxc14 = CallScreen.R0;
                return new ei1(0, callScreen);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                je7 je73 = callScreen.G0;
                je7 je74 = callScreen.A0;
                return new wd1(callScreen.z0, (ui1) callScreen.D0.getValue(), (ki1) callScreen.E0.getValue(), (ti1) callScreen.F0.getValue(), (fm1) callScreen.Y.getValue(), je73, je74, (en1) callScreen.D0().Q0.getValue(), (ugf) callScreen.D0().L0.getValue(), (b) callScreen.D0().P0.getValue());
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                yxc yxc15 = CallScreen.R0;
                ViewPager2 viewPager2 = new ViewPager2(callScreen.getContext());
                viewPager2.setId(rvb.call_modes_view_pager);
                viewPager2.setAdapter((wd1) callScreen.H0.getValue());
                viewPager2.setLayoutParams(new ti3(-1, -1));
                viewPager2.setOrientation(1);
                return viewPager2;
            case 16:
                yxc yxc16 = CallScreen.R0;
                ViewStub viewStub2 = new ViewStub(callScreen.getContext());
                viewStub2.setId(rvb.call_user_talking_view_label);
                return viewStub2;
            case LangUtils.HASH_SEED /*17*/:
                yxc yxc17 = CallScreen.R0;
                dm1 dm1 = new dm1(callScreen.getContext(), (AttributeSet) null);
                dm1.setLayoutParams(new ti3(-1, -2));
                dm1.setVisibility(8);
                boolean isLaidOut = dm1.isLaidOut();
                i1b i1b = callScreen.z0;
                if (!isLaidOut || dm1.isLayoutRequested()) {
                    dm1.addOnLayoutChangeListener(new ii1(callScreen, 0));
                } else {
                    i1b.c();
                }
                dm1.setControlsMediator(callScreen.z0());
                dm1.setCallSpeakerMediator((fm1) callScreen.Y.getValue());
                dm1.setPipBoundariesController(i1b);
                callScreen.z0().b(dm1);
                i1b.a(dm1, h1b.a);
                return dm1;
            case 18:
                yxc yxc18 = CallScreen.R0;
                ViewStub viewStub3 = new ViewStub(callScreen.getContext());
                viewStub3.setId(rvb.call_change_mode_tip_view);
                return viewStub3;
            default:
                yxc yxc19 = CallScreen.R0;
                u21 u21 = new u21(callScreen.getContext());
                u21.setVisibility(8);
                u21.setTranslationY(fk4.d().getDisplayMetrics().density * -50.0f);
                return u21;
        }
    }
}
