package defpackage;

import android.animation.AnimatorSet;
import android.graphics.drawable.ColorDrawable;
import java.util.Collections;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: k11  reason: default package */
public final /* synthetic */ class k11 implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ k11(int i) {
        this.a = i;
    }

    public final Object invoke() {
        tnd tnd = tnd.a;
        Class<eua> cls = eua.class;
        switch (this.a) {
            case 0:
                float c = fk4.c() * 40.0f;
                return new float[]{c, c, c, c, c, c, c, c};
            case 1:
                int i = p11.Y0;
                return -231920335;
            case 2:
                return Boolean.valueOf(((se5) ((qe5) ((khe) yi1.d()).getValue())).s());
            case 3:
                float f = fk4.d().getDisplayMetrics().density * 32.0f;
                return new float[]{f, f, f, f, f, f, f, f};
            case 4:
                return new AnimatorSet();
            case 5:
                return n31.a.d();
            case 6:
                return new xa5(50);
            case 7:
                return new xa5(50);
            case 8:
                float f2 = fk4.d().getDisplayMetrics().density * 40.0f;
                return new float[]{f2, f2, f2, f2, f2, f2, f2, f2};
            case 9:
                int i2 = CallEventsWidget.Y;
                zi1 zi1 = zi1.a;
                return new h61(zi1.b(), yi1.b(), (kke) zi1.getAccessor().c(kke.class), n31.a.c());
            case 10:
                buc buc = CallHistoryPageScreen.u0;
                eqe eqe = new eqe(c0c.call_history_item_call_context_action_remove);
                int i3 = ytb.ic_delete_22;
                return Collections.singletonList(new tt3(0, (jqe) eqe, Integer.valueOf(wfa.U), Integer.valueOf(i3), Integer.valueOf(wfa.P)));
            case 11:
                z71.c.Z1((Long) null, (String) null, (CharSequence) null);
                return e5f.a;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                crd crd = CallIncomingScreen.Z;
                return (eua) n31.a.getAccessor().c(cls);
            case 13:
                return new xj1();
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new ColorDrawable(0);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                bc7[] bc7Arr = CallJoinLinkPreviewWidget.B0;
                return wuc.CALL_JOIN_LINK_PREVIEW;
            case 16:
                b46 b46 = CallLinkInfoScreen.B0;
                return wuc.CALL_CREATE_GROUP_LINK;
            case LangUtils.HASH_SEED /*17*/:
                bc7[] bc7Arr2 = CallMoreBottomSheet.x0;
                return new acc();
            case 18:
                return new fs4(11).thenComparingLong(new df1(new we1(2))).thenComparing(new fs4(12)).reversed();
            case 19:
                bc7[] bc7Arr3 = CallOpponentsListWidget.H0;
                return wuc.ADMIN_CALL_SETTINGS;
            case 20:
                bc7[] bc7Arr4 = CallOpponentsListWidget.H0;
                return tnd;
            case 21:
                bc7[] bc7Arr5 = CallOpponentsListWidget.H0;
                float f3 = fk4.d().getDisplayMetrics().density * 12.0f;
                return new float[]{f3, f3, f3, f3, f3, f3, f3, f3};
            case 22:
                return n31.a.d();
            case 23:
                bc7[] bc7Arr6 = xg1.x0;
                return 262952;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                bc7[] bc7Arr7 = xg1.x0;
                return null;
            case 25:
                yxc yxc = CallScreen.R0;
                return (hl1) n31.a.getAccessor().c(hl1.class);
            case 26:
                yxc yxc2 = CallScreen.R0;
                return tnd;
            case 27:
                yxc yxc3 = CallScreen.R0;
                return wuc.CALL;
            case 28:
                yxc yxc4 = CallScreen.R0;
                return new tta(n31.a.getAccessor().d(cls));
            default:
                yxc yxc5 = CallScreen.R0;
                return new gm1();
        }
    }
}
