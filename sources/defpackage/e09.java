package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chats.search.views.ClearRecentSearchBottomSheet;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.webapp.rootscreen.WebAppRootScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: e09  reason: default package */
public final /* synthetic */ class e09 extends p66 implements k56 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e09(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    public final Object invoke() {
        uj3 l;
        mv8 mv8 = mv8.a;
        nv8 nv8 = nv8.a;
        znc znc = null;
        e5f e5f = e5f.a;
        switch (this.a) {
            case 0:
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) this.receiver;
                if (!br7.H(messageWriteWidget.x0) || (!tpa.f(messageWriteWidget.q0().getSendActionState(), nv8) && !tpa.f(messageWriteWidget.q0().getSendActionState(), mv8))) {
                    CharSequence text = messageWriteWidget.q0().getText();
                    if ((text == null || text.length() == 0) && messageWriteWidget.q0().getEmojiExpandableState() != iv8.a) {
                        xz8.z(messageWriteWidget.v0(), 0, 3);
                    } else {
                        messageWriteWidget.A0();
                    }
                } else {
                    messageWriteWidget.y0();
                }
                return e5f;
            case 1:
                MessageWriteWidget messageWriteWidget2 = (MessageWriteWidget) this.receiver;
                bc7[] bc7Arr = MessageWriteWidget.F0;
                CharSequence text2 = messageWriteWidget2.q0().getText();
                if ((text2 != null && !w9e.C0(text2)) || messageWriteWidget2.v0().t()) {
                    if (!br7.H(messageWriteWidget2.x0) || (!tpa.f(messageWriteWidget2.q0().getSendActionState(), nv8) && !tpa.f(messageWriteWidget2.q0().getSendActionState(), mv8))) {
                        messageWriteWidget2.v0().B(text2, true);
                        messageWriteWidget2.q0().setText((CharSequence) null);
                    } else {
                        messageWriteWidget2.y0();
                    }
                }
                return e5f;
            case 2:
                e52 e52 = (e52) ((xz8) this.receiver).b.getValue();
                if (!(e52 == null || (l = e52.l()) == null)) {
                    long n = l.n();
                    wy8 wy8 = wy8.c;
                    Long valueOf = Long.valueOf(e52.a);
                    f64 P1 = wy8.P1();
                    y7g y7g = new y7g(13);
                    y7g.b = ":webapp:root";
                    y7g.D(Long.valueOf(n), "bot_id");
                    y7g.D("start_button", "entry_point");
                    y7g.D(valueOf, "chat_id");
                    P1.c(y7g.r(), (Bundle) null);
                }
                return e5f;
            case 3:
                ((i3a) this.receiver).f();
                return e5f;
            case 4:
                ((i3a) this.receiver).f();
                return e5f;
            case 5:
                return Boolean.valueOf(((t33) ((q33) this.receiver)).g.getBoolean("app.debug.profile.info.enabled", false));
            case 6:
                ChatsListSearchScreen chatsListSearchScreen = ((jv2) this.receiver).a;
                mr0.G(chatsListSearchScreen);
                bc7[] bc7Arr2 = BottomSheetWidget.x0;
                ClearRecentSearchBottomSheet clearRecentSearchBottomSheet = new ClearRecentSearchBottomSheet();
                clearRecentSearchBottomSheet.setTargetController(chatsListSearchScreen);
                uu3 uu3 = chatsListSearchScreen;
                while (uu3.getParentController() != null) {
                    uu3 = uu3.getParentController();
                }
                foc foc = uu3 instanceof foc ? (foc) uu3 : null;
                if (foc != null) {
                    znc = foc.T();
                }
                clearRecentSearchBottomSheet.z0(chatsListSearchScreen);
                if (znc != null) {
                    coc coc = new coc(clearRecentSearchBottomSheet, (String) null, (zu3) null, (zu3) null, false, -1);
                    wg0.l(false, coc, true, "BottomSheetWidget");
                    znc.G(coc);
                }
                return e5f;
            case 7:
                add add = (add) this.receiver;
                String str = ((did) add.B0.getValue()).b;
                s35 s35 = add.z0;
                if (str == null) {
                    pnf.o(s35, tgd.b);
                } else {
                    Long t = add.t();
                    if (t != null) {
                        pnf.o(s35, new xgd(t.longValue()));
                    }
                }
                return e5f;
            case 8:
                add add2 = (add) this.receiver;
                j47.T(add2.a, ((w9a) add2.r()).a(), (vx3) null, new qcd(add2, (Continuation) null), 2);
                return e5f;
            case 9:
                add add3 = (add) this.receiver;
                j47.T(add3.a, ((w9a) add3.r()).a(), (vx3) null, new rcd(add3, (Continuation) null), 2);
                return e5f;
            case 10:
                ad7 ad7 = (ad7) this.receiver;
                ad7.getClass();
                sc7 sc7 = sc7.c;
                long j = ad7.b.getLong("arg_key_chat_id");
                f64 P12 = sc7.P1();
                P12.b(":stickers/search?chat_id=" + j, (Bundle) null);
                return e5f;
            case 11:
                ad7 ad72 = (ad7) this.receiver;
                ad72.getClass();
                bc7[] bc7Arr3 = KeyboardStickersWidget.t0;
                KeyboardStickersWidget keyboardStickersWidget = ad72.a;
                keyboardStickersWidget.getClass();
                bc7[] bc7Arr4 = BottomSheetWidget.x0;
                lg3 e = wg0.e(kca.o, 6, (Bundle) null);
                e.a(new mg3(jca.g, new eqe(kca.m), 1, false), new mg3(jca.h, new eqe(kca.n), 2, false));
                ConfirmationBottomSheet e2 = e.e();
                e2.setTargetController(keyboardStickersWidget);
                uu3 uu32 = keyboardStickersWidget;
                while (uu32.getParentController() != null) {
                    uu32 = uu32.getParentController();
                }
                foc foc2 = uu32 instanceof foc ? (foc) uu32 : null;
                if (foc2 != null) {
                    znc = foc2.T();
                }
                e2.z0(keyboardStickersWidget);
                if (znc != null) {
                    coc coc2 = new coc(e2, (String) null, (zu3) null, (zu3) null, false, -1);
                    wg0.l(false, coc2, true, "BottomSheetWidget");
                    znc.G(coc2);
                }
                return e5f;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                rge rge = (rge) this.receiver;
                rge.f = false;
                rge.g = -1.0f;
                rge.h = -1.0f;
                return e5f;
            case 13:
                ((kee) this.receiver).close();
                return e5f;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return Boolean.valueOf(((t33) ((q33) this.receiver)).g.getBoolean("app.toggle.webapp_fullscreen", false));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ouf s = ((zzf) this.receiver).s();
                j47.T(s.c, ((w9a) s.e()).a(), (vx3) null, new ttf(s, (Continuation) null), 2);
                return e5f;
            case 16:
                ouf s2 = ((zzf) this.receiver).s();
                s2.getClass();
                j47.T(s2.c, (lx3) null, (vx3) null, new stf(s2, (Continuation) null), 3);
                return e5f;
            case LangUtils.HASH_SEED /*17*/:
                WebAppRootScreen webAppRootScreen = (WebAppRootScreen) this.receiver;
                bc7[] bc7Arr5 = WebAppRootScreen.G0;
                webAppRootScreen.getClass();
                zud zud = zud.WEBAPP_ID;
                bc7 bc7 = WebAppRootScreen.G0[1];
                return new spa((b2b) null, 0, zud, Long.valueOf(((Number) webAppRootScreen.t0.a(webAppRootScreen)).longValue()), (us) null, 19);
            case 18:
                p0g p0g = (p0g) this.receiver;
                j47.T(p0g.a, ((w9a) ((kke) p0g.s0.getValue())).b(), (vx3) null, new n0g(p0g, (Continuation) null), 2);
                return e5f;
            case 19:
                ((p0g) this.receiver).getClass();
                return e5f;
            default:
                ((Runnable) this.receiver).run();
                return e5f;
        }
    }
}
