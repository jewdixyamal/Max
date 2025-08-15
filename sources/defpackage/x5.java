package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;
import one.me.profile.screens.addmembers.AddChatMembersScreen;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import org.apache.http.util.LangUtils;
import ru.ok.messages.media.attaches.AudioAttachView;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.photoeditor.ActPhotoEditor;
import ru.ok.tamtam.nano.Protos;

/* renamed from: x5  reason: default package */
public final /* synthetic */ class x5 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object invoke() {
        pq9 pq9 = qp4.u0;
        e5f e5f = e5f.a;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                int i = ActLocalMedias.s1;
                int intExtra = ((ActLocalMedias) obj).getIntent().getIntExtra("act:local_medias:chat_mode", 0);
                kl2.b.getClass();
                try {
                    return kl2.values()[intExtra];
                } catch (Throwable unused) {
                    return kl2.DEFAULT;
                }
            case 1:
                int i2 = ActPhotoEditor.Z0;
                return Boolean.valueOf(((ActPhotoEditor) obj).getIntent().getBooleanExtra("photo_editor:regular_sending", true));
            case 2:
                bc7[] bc7Arr = AddChatAdminsScreen.x0;
                k8 k8Var = new k8(5);
                long m0 = ((AddChatAdminsScreen) obj).m0();
                xcb xcb = xcb.a;
                return new ro8((m56) k8Var, new d9(m0, xcb.c(), xcb.getAccessor().d(u7b.class), xcb.d(), xcb.getAccessor().d(y7b.class), 0), 4);
            case 3:
                bc7[] bc7Arr2 = AddChatMembersScreen.x0;
                int i3 = vc7.a;
                if (vc7.b(vc7.c)) {
                    mr0.G((AddChatMembersScreen) obj);
                }
                return e5f;
            case 4:
                bc7[] bc7Arr3 = AddLinkBottomSheet.x0;
                khe d = f9g.a.getAccessor().d(pk7.class);
                String str = ((AddLinkBottomSheet) obj).s0.c;
                if (str == null) {
                    str = "";
                }
                return new rk7(d, str);
            case 5:
                bc7[] bc7Arr4 = AdminWaitingRoomScreen.s0;
                AdminWaitingRoomScreen adminWaitingRoomScreen = (AdminWaitingRoomScreen) obj;
                return new ja(new ma(adminWaitingRoomScreen), ((iba) zi1.a.getAccessor().c(iba.class)).a(), new lrf(adminWaitingRoomScreen.getContext()));
            case 6:
                bc7[] bc7Arr5 = AdminsFromContactsScreen.u0;
                bc7 bc7 = AdminsFromContactsScreen.u0[0];
                AdminsFromContactsScreen adminsFromContactsScreen = (AdminsFromContactsScreen) obj;
                long longValue = ((Number) adminsFromContactsScreen.a.a(adminsFromContactsScreen)).longValue();
                xcb xcb2 = xcb.a;
                return new bc(longValue, (pb) xcb2.getAccessor().c(pb.class), xcb2.c(), xcb2.f());
            case 7:
                return ((yd) obj).b.getContentResolver();
            case 8:
                jz4 jz4 = new jz4();
                jz4.setCallback(((zj) obj).t0);
                return jz4;
            case 9:
                return ((ep) obj).a();
            case 10:
                u82 u82 = new u82();
                u82.e = Collections.singletonMap(1L, 1L);
                kr krVar = (kr) obj;
                e52 a2 = ((ma2) krVar.X.getValue()).a(0, 2, u82.b(), (es8) null, (es8) null, (es8) null);
                a2.o0((el3) krVar.Z.getValue());
                return a2;
            case 11:
                u82 u822 = new u82();
                u822.e = Collections.singletonMap(1L, 1L);
                zr zrVar = (zr) obj;
                e52 a3 = ((ma2) zrVar.Y.getValue()).a(0, 0, u822.b(), (es8) null, (es8) null, (es8) null);
                a3.o0((el3) zrVar.s0.getValue());
                return a3;
            case Protos.Attaches.Attach.PRESENT:
                return ((bx) obj).i.i();
            case 13:
                ix ixVar = (ix) obj;
                return new saf((ol6) ixVar.e, (mg4) ixVar.d);
            case Protos.Attaches.Attach.LOCATION:
                HashMap hashMap = ((AudioAttachView) obj).v0;
                for (Map.Entry entry : hashMap.entrySet()) {
                    ViewGroup viewGroup = (ViewGroup) entry.getKey();
                    int intValue = ((Number) entry.getValue()).intValue();
                    viewGroup.setClipToPadding((intValue & 1) != 0);
                    viewGroup.setClipChildren((intValue & 2) != 0);
                }
                hashMap.clear();
                return e5f;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return p50.a((p50) obj);
            case 16:
                return new s50((t50) obj);
            case LangUtils.HASH_SEED:
                e60 e60 = (e60) obj;
                e60.s0.o1(e60, e60.u0[0], j47.S(e60.o, ((w9a) e60.a).a(), vx3.b, new d60(e60, (Continuation) null)));
                return e5f;
            case 18:
                k56 k56 = (k56) ((y7g) obj).b;
                return new od0(kt3.b((Context) k56.invoke(), yfa.b), j5a.a, (Context) k56.invoke(), new k8(15), new k8(16));
            case 19:
                return Integer.valueOf(pq9.j((fq0) obj).getText().j);
            case 20:
                bc7[] bc7Arr6 = CallBottomPanelWidget.s0;
                CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) obj;
                return new h21(new l5g(callBottomPanelWidget, 1), (el1) callBottomPanelWidget.c.getValue());
            case 21:
                return new s21(lnf.a((t21) obj));
            case 22:
                z21 z21 = (z21) obj;
                return new od0(kt3.b(z21.a, x7a.x), j5a.a, z21.a, new k8(18), new k8(19));
            case 23:
                hm9.p(((f81) obj).w0, "Didn't updated calls adapter after 5 times, too much computing!", (Throwable) null);
                return e5f;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                d81 d81 = (d81) obj;
                fk3 fk3 = (fk3) d81.a;
                return new od0(kt3.b(fk3.getContext(), ytb.ic_call_24), j5a.a, fk3.getContext(), new c81(d81, 0), new c81(d81, 1));
            case 25:
                return Boolean.valueOf(((se5) ((qe5) ((u81) obj).b.getValue())).s());
            case 26:
                crd crd = CallIncomingScreen.Z;
                return new l5g((CallIncomingScreen) obj, 1);
            case 27:
                Context context = ((u91) obj).a;
                kmd kmd = new kmd(context);
                kmd.c(true);
                kmd.b(hmd.b);
                bc7[] bc7Arr7 = kmd.A0;
                kmd.w0.o1(kmd, bc7Arr7[4], new float[]{0.9f, 1.1f, 0.9f});
                kmd.x0.o1(kmd, bc7Arr7[5], 8000L);
                kmd.t0.o1(kmd, bc7Arr7[1], new float[]{0.0f, 0.0f});
                kmd.v0.o1(kmd, bc7Arr7[3], 0L);
                kmd.a(pq9.o(context).c);
                return kmd;
            case 28:
                int i4 = q7a.g;
                Context context2 = (Context) ((h7b) obj).b;
                oo7 oo7 = new oo7(i4, pq9.o(context2).c.getIcon().k, context2);
                float f = (float) 12;
                oo7.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                return oo7;
            default:
                return Long.valueOf(((hyc) ((q33) ((je7) ((vb1) obj).c.b).getValue())).t());
        }
    }
}
