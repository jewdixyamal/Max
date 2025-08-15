package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.profile.ProfileScreen;
import ru.ok.messages.media.attaches.MessageAttachmentsLayout;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;
import ru.ok.tamtam.nano.Protos;

/* renamed from: zl0  reason: default package */
public final /* synthetic */ class zl0 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zl0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean onLongClick(View view) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                return ((am0) obj).performLongClick();
            case 1:
                b46 b46 = CallLinkInfoScreen.B0;
                dd1 n0 = ((CallLinkInfoScreen) obj).n0();
                CharSequence charSequence = ((rc1) n0.u0.a.getValue()).c;
                if (charSequence != null) {
                    pnf.o(n0.v0, new fa1(charSequence));
                }
                return true;
            case 2:
                fk3 fk3 = (fk3) obj;
                o9g o9g = fk3.P0;
                if (o9g != null) {
                    long j = fk3.R0;
                    buc buc = CallHistoryPageScreen.u0;
                    CallHistoryPageScreen callHistoryPageScreen = (CallHistoryPageScreen) o9g.b;
                    if (!((s81) callHistoryPageScreen.o0().s0.getValue()).a) {
                        callHistoryPageScreen.p0().y0 = Long.valueOf(j);
                        dy7.c(2).I((List) callHistoryPageScreen.s0.getValue()).Y(fk3).R(fk4.d().getDisplayMetrics().density * 12.0f).build().q(callHistoryPageScreen);
                    }
                }
                return fk3.P0 != null;
            case 3:
                ((MediaBarPreviewLayout) obj).T0.getClass();
                return true;
            case 4:
                ts8 ts8 = ((MessageAttachmentsLayout) obj).a;
                ps8 ps8 = ts8.z0;
                ts8.w0.h(0);
                ps8.getClass();
                return true;
            case 5:
                ((mk9) obj).n(new fj0(19));
                return true;
            case 6:
                ((fl9) obj).n(new fj0(19));
                return true;
            case 7:
                ((kl9) obj).n(new fj0(19));
                return true;
            case 8:
                cnb r0 = ((ProfileScreen) ((qlb) obj).X).r0();
                pnf.o(r0.z0, new ylb((List) ((zcb) r0.F0.getValue()).l.getValue()));
                return true;
            case 9:
                return ((xkd) obj).performLongClick();
            case 10:
                return ((ppe) obj).performLongClick();
            case 11:
                zef zef = (zef) obj;
                Long l = zef.Z;
                if (l != null) {
                    long longValue = l.longValue();
                    a66 a66 = zef.X;
                    if (a66 != null) {
                        Long valueOf = Long.valueOf(longValue);
                        ViewGroup viewGroup = (ViewGroup) zef.b;
                        if (viewGroup == null) {
                            viewGroup = null;
                        }
                        a66.invoke(valueOf, viewGroup);
                    }
                }
                return true;
            case Protos.Attaches.Attach.PRESENT:
                return ((dif) obj).performLongClick();
            default:
                return ((ohf) obj).performLongClick();
        }
    }
}
