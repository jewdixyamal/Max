package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.folders.picker.FolderMemberPickerScreen;
import one.me.profile.ProfileScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* renamed from: c01  reason: default package */
public final class c01 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c01(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        e5f e5f = e5f.a;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                ((CallAdminSettingsScreen) obj2).getRouter().C();
                return e5f;
            case 1:
                ConstraintLayout constraintLayout = (ConstraintLayout) obj;
                bc7[] bc7Arr = ChatTitleIconScreen.z0;
                ChatTitleIconScreen chatTitleIconScreen = (ChatTitleIconScreen) obj2;
                chatTitleIconScreen.getClass();
                bc7[] bc7Arr2 = ChatTitleIconScreen.z0;
                bc7 bc7 = bc7Arr2[3];
                qm0 qm0 = chatTitleIconScreen.u0;
                constraintLayout.addView((TextView) qm0.getValue());
                constraintLayout.addView(ChatTitleIconScreen.n0(chatTitleIconScreen));
                constraintLayout.addView(chatTitleIconScreen.o0());
                if (chatTitleIconScreen.q0() == pyd.CHANNEL) {
                    constraintLayout.addView(ChatTitleIconScreen.m0(chatTitleIconScreen));
                }
                constraintLayout.addView(chatTitleIconScreen.p0());
                dj3 q = fp3.q(constraintLayout);
                bc7 bc72 = bc7Arr2[3];
                int id = ((TextView) qm0.getValue()).getId();
                bc7 bc73 = bc7Arr2[2];
                q.d(id, 3, ((cla) chatTitleIconScreen.t0.getValue()).getId(), 4);
                au1.p((float) 16, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id, 4));
                q.d(id, 6, 0, 6);
                q.d(id, 7, 0, 7);
                int id2 = ChatTitleIconScreen.n0(chatTitleIconScreen).getId();
                bc7 bc74 = bc7Arr2[3];
                q.d(id2, 3, ((TextView) qm0.getValue()).getId(), 4);
                float f = (float) 24;
                au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id2, 4));
                q.d(id2, 6, 0, 6);
                q.d(id2, 7, 0, 7);
                int id3 = chatTitleIconScreen.o0().getId();
                q.d(id3, 3, ChatTitleIconScreen.n0(chatTitleIconScreen).getId(), 4);
                au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id3, 4));
                q.d(id3, 6, 0, 6);
                q.d(id3, 7, 0, 7);
                int id4 = ChatTitleIconScreen.m0(chatTitleIconScreen).getId();
                q.d(id4, 3, chatTitleIconScreen.o0().getId(), 4);
                float f2 = (float) 8;
                au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id4, 4));
                q.d(id4, 6, 0, 6);
                q.d(id4, 7, 0, 7);
                View m0 = ChatTitleIconScreen.m0(chatTitleIconScreen).getVisibility() == 0 ? ChatTitleIconScreen.m0(chatTitleIconScreen) : chatTitleIconScreen.o0();
                int id5 = chatTitleIconScreen.p0().getId();
                q.d(id5, 3, m0.getId(), 4);
                au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id5, 4));
                q.d(id5, 6, 0, 6);
                q.d(id5, 7, 0, 7);
                q.d(id5, 4, 0, 4);
                q.g(id5).d.x = 1.0f;
                q.a(constraintLayout);
                return e5f;
            case 2:
                nn3 nn3 = (nn3) obj;
                ((nx2) obj2).R0.g(nn3.a, nn3.w0);
                return e5f;
            case 3:
                View view2 = (View) obj;
                bc7[] bc7Arr3 = FolderMemberPickerScreen.y0;
                FolderMemberPickerScreen folderMemberPickerScreen = (FolderMemberPickerScreen) obj2;
                su5 su5 = (su5) folderMemberPickerScreen.v0().c;
                bc7 bc75 = FolderMemberPickerScreen.y0[0];
                String str = (String) folderMemberPickerScreen.w0.a(folderMemberPickerScreen);
                if (!su5.g) {
                    su5.g = true;
                    sx3 sx3 = su5.f;
                    if (sx3 != null) {
                        j47.S(sx3, xq9.a.plus(((w9a) ((kke) su5.c.getValue())).b()), vx3.c, new ru5(su5, str, (Continuation) null));
                    }
                }
                return e5f;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    lea lea = (lea) obj2;
                    EditText editText = lea.w0;
                    editText.requestFocus();
                    editText.post(new do9(lea, 3, editText));
                    lea.setOnWindowFocusChanged((m56) null);
                }
                return e5f;
            case 5:
                View view3 = (View) obj;
                bc7[] bc7Arr4 = MessageWriteWidget.F0;
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) obj2;
                xz8 v0 = messageWriteWidget.v0();
                v0.M0.setValue((Object) null);
                ((t33) ((q33) v0.c.getValue())).j("app.onboarding.author_visibility", true);
                messageWriteWidget.C0(new eqe(yoc.i0), true);
                return e5f;
            case 6:
                Throwable th = (Throwable) obj;
                try {
                    ((b8c) obj2).d();
                } catch (Throwable unused) {
                }
                return e5f;
            case 7:
                Throwable th2 = (Throwable) obj;
                bc7[] bc7Arr5 = eya.F0;
                ((eya) obj2).r().i = null;
                return e5f;
            case 8:
                Throwable th3 = (Throwable) obj;
                ((ry1) obj2).resumeWith(e5f);
                return e5f;
            case 9:
                View view4 = (View) obj;
                bc7[] bc7Arr6 = ProfileScreen.D0;
                cnb r0 = ((ProfileScreen) obj2).r0();
                ka1 e = r0.O0.e();
                if (e != null) {
                    pnf.o(r0.A0, e);
                }
                return e5f;
            default:
                Throwable th4 = (Throwable) obj;
                ((zl4) obj2).g();
                return e5f;
        }
    }
}
