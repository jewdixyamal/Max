package defpackage;

import android.net.Uri;
import android.view.View;
import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;
import one.me.contactlist.ContactListWidget;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.MultiEventListener;
import ru.ok.android.externcalls.sdk.factory.JoinAnonByLinkParams;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater;

/* renamed from: v02  reason: default package */
public final /* synthetic */ class v02 implements dk7, xha, qj3, lde, o1d, sv5, cc3, in3, grd, bce, rl, ParticipantsUpdater.MeChanger, ExternalIdsResolver.ExtraResolver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v02(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void I(yha yha) {
        io8 io8 = io8.a;
        yha yha2 = yha.X;
        Object obj = this.b;
        switch (this.a) {
            case 3:
                bc7[] bc7Arr = ChatAdminsScreen.w0;
                ChatAdminsScreen chatAdminsScreen = (ChatAdminsScreen) obj;
                if (yha == yha2) {
                    pnf.o(chatAdminsScreen.o0().Y, io8);
                    u52 m0 = chatAdminsScreen.m0();
                    ArrayList arrayList = m0.v0;
                    int size = arrayList.size();
                    arrayList.clear();
                    pnf.o(m0.w0, new hjb(new gqe(yea.t2, ys.m0(new Object[]{Integer.valueOf(size)}))));
                    return;
                }
                chatAdminsScreen.m0().r();
                return;
            case 10:
                bc7[] bc7Arr2 = ChatMembersCompactWidget.Z;
                ChatMembersCompactWidget chatMembersCompactWidget = (ChatMembersCompactWidget) obj;
                if (yha == yha2) {
                    pnf.o(chatMembersCompactWidget.o0().Y, io8);
                    chatMembersCompactWidget.n0().v();
                    return;
                }
                chatMembersCompactWidget.n0().w();
                return;
            case 11:
                bc7[] bc7Arr3 = ChatMembersScreen.u0;
                ChatMembersScreen chatMembersScreen = (ChatMembersScreen) obj;
                if (yha == yha2) {
                    pnf.o(chatMembersScreen.o0().Y, io8);
                    chatMembersScreen.n0().v();
                    return;
                }
                chatMembersScreen.n0().w();
                return;
            default:
                if (ul3.$EnumSwitchMapping$0[yha.ordinal()] == 1) {
                    jm3 jm3 = (jm3) obj;
                    j47.T(jm3.a, ((w9a) jm3.q()).b().plus(xq9.a), (vx3) null, new tl3(jm3, (Continuation) null), 2);
                    return;
                }
                return;
        }
    }

    public List a() {
        return (List) ((ns3) this.b).d.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: ml3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: l20} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            java.lang.Object r3 = r10.b
            int r10 = r10.a
            switch(r10) {
                case 4: goto L_0x017c;
                case 6: goto L_0x0169;
                case 7: goto L_0x0157;
                case 8: goto L_0x00ff;
                case 13: goto L_0x00ab;
                case 16: goto L_0x007e;
                case 18: goto L_0x0077;
                case 19: goto L_0x002a;
                case 23: goto L_0x0022;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            java.lang.String r10 = r11.getMessage()
            java.lang.String r0 = "rr3"
            defpackage.hm9.o(r0, r10)
            ru.ok.tamtam.util.HandledException r10 = new ru.ok.tamtam.util.HandledException
            r10.<init>(r11)
            o45 r3 = (defpackage.o45) r3
            cba r3 = (defpackage.cba) r3
            r3.c(r10, r2)
            return
        L_0x0022:
            java.lang.Integer r11 = (java.lang.Integer) r11
            rr3 r3 = (defpackage.rr3) r3
            r3.b()
            return
        L_0x002a:
            hl3 r11 = (defpackage.hl3) r11
            int r10 = defpackage.s36.f
            wua r3 = (defpackage.wua) r3
            java.lang.String r10 = r3.u0
            boolean r10 = defpackage.oag.t(r10)
            java.lang.String r0 = ""
            if (r10 != 0) goto L_0x003f
            java.lang.String r10 = r3.u0
            r11.d = r10
            goto L_0x0041
        L_0x003f:
            r11.d = r0
        L_0x0041:
            java.util.List r10 = r11.f
            java.util.Iterator r2 = r10.iterator()
        L_0x0047:
            boolean r4 = r2.hasNext()
            il3 r5 = defpackage.il3.b
            if (r4 == 0) goto L_0x005a
            java.lang.Object r4 = r2.next()
            jl3 r4 = (defpackage.jl3) r4
            il3 r6 = r4.c
            if (r6 != r5) goto L_0x0047
            r1 = r4
        L_0x005a:
            if (r1 == 0) goto L_0x005f
            r10.remove(r1)
        L_0x005f:
            java.lang.String r1 = r3.s0
            boolean r2 = defpackage.oag.t(r1)
            if (r2 != 0) goto L_0x0074
            java.lang.String r2 = r3.t0
            if (r2 == 0) goto L_0x006c
            r0 = r2
        L_0x006c:
            jl3 r2 = new jl3
            r2.<init>(r1, r5, r0)
            r10.add(r2)
        L_0x0074:
            r11.f = r10
            return
        L_0x0077:
            hl3 r11 = (defpackage.hl3) r11
            nl3 r3 = (defpackage.nl3) r3
            r11.i = r3
            return
        L_0x007e:
            hl3 r11 = (defpackage.hl3) r11
            qzd r3 = (defpackage.qzd) r3
            if (r3 != 0) goto L_0x0085
            goto L_0x00a8
        L_0x0085:
            bz r4 = r3.a
            if (r4 == 0) goto L_0x0098
            b10 r10 = defpackage.b10.PHOTO
            b10 r0 = r4.a
            if (r0 != r10) goto L_0x0098
            r8 = 0
            r5 = 0
            r6 = 0
            l20 r1 = defpackage.iz7.e(r4, r5, r6, r8)
        L_0x0098:
            d5g r10 = r3.b
            java.lang.String r0 = r10.a
            java.util.List r10 = r10.b
            java.util.ArrayList r10 = defpackage.iz7.u(r10)
            ml3 r2 = new ml3
            r2.<init>(r1, r0, r10)
            r1 = r2
        L_0x00a8:
            r11.w = r1
            return
        L_0x00ab:
            e52 r11 = (defpackage.e52) r11
            ks2 r3 = (defpackage.ks2) r3
            je7 r10 = r3.Z
            java.lang.Object r10 = r10.getValue()
            kke r10 = (defpackage.kke) r10
            w9a r10 = (defpackage.w9a) r10
            nx3 r10 = r10.b()
            js2 r0 = new js2
            r0.<init>(r3, r11, r1)
            r4 = 2
            defpackage.pnf.n(r3, r10, r1, r0, r4)
            rr2 r10 = new rr2
            long r0 = r11.a
            r10.<init>(r0)
            s35 r11 = r3.A0
            defpackage.pnf.o(r11, r10)
            je7 r10 = r3.v0
            java.lang.Object r10 = r10.getValue()
            av0 r10 = (defpackage.av0) r10
            yxc r11 = new yxc
            r0 = 11
            r11.<init>(r0)
            r10.c(r11)
            je7 r10 = r3.u0
            java.lang.Object r10 = r10.getValue()
            xx6 r10 = (defpackage.xx6) r10
            if (r10 == 0) goto L_0x00fe
            wx6 r11 = new wx6
            ux6 r0 = defpackage.ux6.CREATE_2_GROUP_CHATS
            r11.<init>(r0, r2)
            java.util.Set r11 = java.util.Collections.singleton(r11)
            wuc r0 = defpackage.wuc.CHAT
            r10.f(r11, r0)
        L_0x00fe:
            return
        L_0x00ff:
            es8 r11 = (defpackage.es8) r11
            zf2 r3 = (defpackage.zf2) r3
            r3.getClass()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = "onMessageUpdated: messageId = "
            r10.<init>(r1)
            cu8 r1 = r11.a
            long r4 = r1.b
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            java.lang.String r1 = "zf2"
            defpackage.hm9.m(r1, r10, new java.lang.Object[0])
        L_0x011d:
            java.util.ArrayList r10 = r3.d
            int r1 = r10.size()
            if (r0 >= r1) goto L_0x0156
            java.lang.Object r1 = r10.get(r0)
            es8 r1 = (defpackage.es8) r1
            cu8 r1 = r1.a
            long r4 = r1.b
            cu8 r1 = r11.a
            long r6 = r1.b
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0154
            r10.set(r0, r11)
            java.util.Set r10 = r3.o
            java.util.Iterator r10 = r10.iterator()
        L_0x0140:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0156
            java.lang.Object r0 = r10.next()
            yf2 r0 = (defpackage.yf2) r0
            if (r0 == 0) goto L_0x0140
            ru.ok.messages.media.attaches.ActAttachesView r0 = (ru.ok.messages.media.attaches.ActAttachesView) r0
            r0.n0(r11)
            goto L_0x0140
        L_0x0154:
            int r0 = r0 + r2
            goto L_0x011d
        L_0x0156:
            return
        L_0x0157:
            u82 r11 = (defpackage.u82) r11
            b92 r10 = r11.p
            if (r10 == 0) goto L_0x015e
            goto L_0x0160
        L_0x015e:
            b92 r10 = defpackage.b92.h
        L_0x0160:
            xq2 r3 = (defpackage.xq2) r3
            b92 r10 = defpackage.iz7.i(r3, r10)
            r11.p = r10
            return
        L_0x0169:
            u82 r11 = (defpackage.u82) r11
            i92 r3 = (defpackage.i92) r3
            r11.c = r3
            i92 r10 = defpackage.i92.o
            if (r3 == r10) goto L_0x0177
            i92 r10 = defpackage.i92.b
            if (r3 != r10) goto L_0x017b
        L_0x0177:
            r0 = 0
            r11.x = r0
        L_0x017b:
            return
        L_0x017c:
            u82 r11 = (defpackage.u82) r11
            sj3[] r3 = (defpackage.sj3[]) r3
            int r10 = r3.length
        L_0x0181:
            if (r0 >= r10) goto L_0x018c
            r1 = r3[r0]
            if (r1 == 0) goto L_0x018a
            r1.accept(r11)
        L_0x018a:
            int r0 = r0 + r2
            goto L_0x0181
        L_0x018c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v02.accept(java.lang.Object):void");
    }

    public void b(View view, String str) {
        int i = ChangeDisabledDialog.y0;
        ChangeDisabledDialog changeDisabledDialog = (ChangeDisabledDialog) this.b;
        c54.W(changeDisabledDialog, str, new bk(5, changeDisabledDialog));
    }

    public boolean c(int i) {
        CharSequence n0;
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        nd3 nd3 = contactListWidget.v0;
        int j = nd3.j();
        a3g a3g = contactListWidget.s0;
        if (!(i == j - a3g.j() && ((n0 = contactListWidget.n0()) == null || n0.length() == 0))) {
            return i == nd3.j() - (a3g.j() + contactListWidget.Y.j());
        }
    }

    public ql d() {
        return ConversationFactory.lambda$joinAnonByLink$14((JoinAnonByLinkParams) this.b);
    }

    public void e(ov5 ov5) {
        bc7[] bc7Arr = ChatsListWidget.M0;
        nx2 p0 = ((ChatsListWidget) this.b).p0();
        p0.getClass();
        String name = nx2.class.getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.Y;
            ir6.d(us7, name, "onFolderWidgetClicked " + ov5, (Throwable) null);
        }
        nv5 nv5 = ov5.Y;
        if (nv5 instanceof mv5) {
            String str = ((mv5) nv5).a;
            vj7 vj7 = (vj7) p0.C0.getValue();
            vj7.getClass();
            od2.L(od2.F(new zn5(vj7.e(Uri.parse(str)), new kw2(p0, (Continuation) null), 5), ((w9a) p0.Y).b()), p0.a);
        } else if (nv5 instanceof lv5) {
            lv5 lv5 = (lv5) nv5;
            pnf.o(p0.O0, gy2.c2(gy2.c, lv5.a, osf.FOLDER, lv5.b, 0, 8));
        } else if (nv5 != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public Object f(bg4 bg4) {
        return this.b;
    }

    public Object get() {
        ((Runnable) this.b).run();
        return null;
    }

    public int i(int i) {
        mfd mfd = ((ChatNotificationsSettingsScreen) this.b).c;
        kfd kfd = (kfd) ((ol7) mfd.C(i));
        if (kfd.u() == 0) {
            return 4;
        }
        if (i != mfd.j() - 1) {
            kfd kfd2 = (kfd) ((ol7) mfd.C(i + 1));
            if (kfd.u() != ((kfd) ((ol7) mfd.C(i - 1))).u()) {
                return 1;
            }
            if (kfd.u() == kfd2.u()) {
                return 2;
            }
        }
        return 3;
    }

    public void j(nqd nqd) {
        nqd.a(Collator.getInstance(((p7b) ((m7b) this.b)).a.v()));
    }

    public ParticipantId onExternalByInternalResolution(ConversationParticipant conversationParticipant) {
        return ((MultiEventListener) this.b).onExternalByInternalResolution(conversationParticipant);
    }

    public void updateMyExternalId(ParticipantId participantId) {
        ((ConversationParticipant) this.b).setExternalId(participantId);
    }
}
