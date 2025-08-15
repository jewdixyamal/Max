package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.util.Iterator;
import java.util.Map;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.chatscreen.ChatScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.complaintbottomsheet.ComplaintBottomSheet;
import one.me.login.confirm.ConfirmPhoneScreen;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: hn2  reason: default package */
public final /* synthetic */ class hn2 implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ hn2(int i) {
        this.a = i;
    }

    public final Object invoke() {
        boolean z;
        Object obj;
        Class<xb6> cls = xb6.class;
        Class<x19> cls2 = x19.class;
        Class<s8g> cls3 = s8g.class;
        Class<Context> cls4 = Context.class;
        Class<y7d> cls5 = y7d.class;
        Class<q33> cls6 = q33.class;
        Class<iy2> cls7 = iy2.class;
        boolean z2 = false;
        Class<kke> cls8 = kke.class;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ChatScreen.k1;
                to2 to2 = to2.a;
                khe d = to2.getAccessor().d(hp.class);
                khe d2 = to2.getAccessor().d(are.class);
                khe d3 = to2.getAccessor().d(cls6);
                khe d4 = to2.getAccessor().d(cls8);
                khe d5 = to2.getAccessor().d(cls4);
                khe d6 = to2.getAccessor().d(zu8.class);
                to2.getAccessor().d(cls7);
                return new kz(d, d2, d3, d4, d5, d6, to2.getAccessor().d(ak3.class), to2.getAccessor().d(ida.class));
            case 1:
                bc7[] bc7Arr2 = ChatScreen.k1;
                return new jac();
            case 2:
                bc7[] bc7Arr3 = ChatScreen.k1;
                return (xx6) to2.a.getAccessor().e();
            case 3:
                to2 to22 = to2.a;
                return new p5d(to22.getAccessor().d(cls8), to22.getAccessor().d(cls3), to22.getAccessor().d(zm8.class), to22.getAccessor().d(cls), to22.getAccessor().d(cls2), to22.getAccessor().d(dc6.class));
            case 4:
                to2 to23 = to2.a;
                return new hjf(to23.getAccessor().d(cls8), to23.getAccessor().d(cls3), to23.getAccessor().d(cls2), to23.getAccessor().d(cls));
            case 5:
                bc7[] bc7Arr4 = ChatTitleIconScreen.z0;
                return nyd.a.b();
            case 6:
                bc7[] bc7Arr5 = ChatsListSearchScreen.J0;
                return new gw2();
            case 7:
                bc7[] bc7Arr6 = ChatsListSearchScreen.J0;
                return new bh0(dh0.a.getAccessor().d(os3.class), true, (po3) null, 46);
            case 8:
                bc7[] bc7Arr7 = ChatsListWidget.M0;
                p82 l = ((jz2) ((iy2) ys2.a.getAccessor().c(cls7))).l();
                l.e();
                Iterator it = l.f.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        e52 e52 = (e52) ((Map.Entry) it.next()).getValue();
                        try {
                            z = p82.N.test(e52);
                        } catch (Exception unused) {
                            z = true;
                        }
                        if (z && p82.m(e52, p82.L, false, ((p7b) l.n).e)) {
                            z2 = true;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 9:
                bc7[] bc7Arr8 = ChatsListWidget.M0;
                uo3 uo3 = uo3.b;
                hr3 hr3 = hr3.a;
                khe d7 = hr3.getAccessor().d(cls4);
                qn3.a.getClass();
                return new oo3(uo3, d7, pn3.b, hr3.getAccessor().d(yx7.class), (kke) hr3.getAccessor().c(cls8), hr3.getAccessor().d(b0d.class), hr3.getAccessor().d(xj3.class), hr3.getAccessor().d(ds3.class), hr3.getAccessor().d(cls7), hr3.getAccessor().d(ck3.class), hr3.getAccessor().d(qq3.class), hr3.getAccessor().d(yj3.class), hr3.getAccessor().d(gq3.class), hr3.getAccessor().d(afe.class), hr3.getAccessor().d(oc6.class), hr3.getAccessor().d(cls5), hr3.getAccessor().d(l67.class));
            case 10:
                bc7[] bc7Arr9 = ChatsListWidget.M0;
                return new cn3(ys2.a.getAccessor().d(cls5));
            case 11:
                return new mv2();
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new mv2();
            case 13:
                bc7[] bc7Arr10 = ChatsTabWidget.C0;
                return new jx5();
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new mib(yea.E, (kqe) null, 6);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                bc7[] bc7Arr11 = ComplaintBottomSheet.X;
                return new mg3(laa.a, new eqe(maa.d), 2, false);
            case 16:
                return new gqd(false);
            case LangUtils.HASH_SEED /*17*/:
                return new gqd(true);
            case 18:
                try {
                    Resources system = Resources.getSystem();
                    int identifier = system.getIdentifier("db_connection_pool_size", "integer", "android");
                    int integer = identifier != 0 ? system.getInteger(identifier) : -1;
                    if (integer <= 0) {
                        integer = 4;
                    }
                    obj = Integer.valueOf(integer);
                } catch (Throwable th) {
                    obj = new njc(th);
                }
                if (obj instanceof njc) {
                    obj = 4;
                }
                return Integer.valueOf(((Number) obj).intValue());
            case 19:
                return jyc.a.i();
            case 20:
                return new x45("io", ((Number) sd3.b.getValue()).intValue(), 1000, true, false, 0, 96);
            case 21:
                return new x45("net", 2, 60000, true, false, 0, 64);
            case 22:
                int i = ft4.o;
                kt4 kt4 = kt4.SECONDS;
                fh8 fh8 = new fh8(true, z7.R(1, kt4), z7.R(3, kt4), new pz2(3), new pz2(4));
                boolean z3 = mqd.a;
                fe feVar = fe.a;
                x45 x45 = sd3.a;
                return new iba(fh8, new rd3(0), z3 ? x45 : (x45) sd3.c.getValue(), z3 ? x45 : (x45) sd3.d.getValue(), z3 ? x45 : sd3.e);
            case 23:
                return new jle(sd3.f, new khe(new hn2(26)));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new qj(new khe(new hn2(19)));
            case 25:
                return new w9a(sd3.f);
            case 26:
                return ce.a();
            case 27:
                int i2 = ConfirmAddOpponentToCallBottomSheet.A0;
                b31 b = n31.a.b();
                je7 je7 = yi1.a;
                zi1 zi1 = zi1.a;
                return new ve3(b, zi1.getAccessor().d(cls6), zi1.getAccessor().d(cls8));
            case 28:
                bc7[] bc7Arr12 = ConfirmPhoneScreen.C0;
                int i3 = vc7.a;
                return Boolean.valueOf(vc7.b(vc7.c));
            default:
                bc7[] bc7Arr13 = ConfirmPhoneScreen.C0;
                return wuc.AUTH_OTP;
        }
    }
}
