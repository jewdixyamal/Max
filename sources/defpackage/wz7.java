package defpackage;

import android.database.Cursor;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.mediapicker.MediaPickerScreen;
import one.me.members.list.MembersListWidget;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.pinbars.PinBarsWidget;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.arch.Widget;
import one.me.startconversation.chat.PickChatMembers;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: wz7  reason: default package */
public final /* synthetic */ class wz7 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wz7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        d3b d3b;
        xx6 xx6;
        ix8 ix8;
        c6c c6c;
        xlc xlc;
        String str;
        int i;
        boolean z3;
        int i2;
        boolean z4;
        int i3;
        String str2;
        int i4;
        String str3;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        Long l;
        int i8;
        Boolean bool;
        t19 t19;
        long j = 0;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(!((xz7) this.b).c.contains(Integer.valueOf(((MenuItem) obj).getItemId())));
            case 1:
                a3a a3a = (a3a) obj;
                bc7[] bc7Arr = MediaKeyboardWidget.C0;
                ((cc8) ((MediaKeyboardWidget) this.b).c.getValue()).Y.m((Object) null, new tm9());
                return e5f.a;
            case 2:
                View view = (View) obj;
                bc7[] bc7Arr2 = MediaPickerScreen.B0;
                ((MediaPickerScreen) this.b).getRouter().C();
                return e5f.a;
            case 3:
                return Boolean.valueOf(((wn8) ((yn8) this.b)).a.contains(Long.valueOf(((kn8) obj).a)));
            case 4:
                return Boolean.valueOf(((Collection) this.b).contains(Long.valueOf(((kn8) obj).a)));
            case 5:
                int intValue = ((Integer) obj).intValue();
                MembersListWidget membersListWidget = (MembersListWidget) this.b;
                int j2 = intValue - membersListWidget.u0.j();
                a3g a3g = membersListWidget.t0;
                if (a3g.j() < j2 || j2 < 0) {
                    return null;
                }
                return (kn8) ((ol7) a3g.C(j2));
            case 6:
                uj3 uj3 = (uj3) obj;
                mec mec = (mec) this.b;
                return ((jq8) mec.a).y(new dk2(iz7.t(uj3), iz7.m(((u7b) ((jq8) mec.a).y0.getValue()).b(uj3.n())), 0));
            case 7:
                return ((jq8) this.b).y((dk2) obj);
            case 8:
                n59 n59 = (n59) this.b;
                long longValue = ((Long) obj).longValue();
                String str4 = n59.A0;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, str4, ey8.h(longValue, "Load around from scroll logic, time: "), (Throwable) null);
                }
                ((bx) n59.o).r(longValue);
                return e5f.a;
            case 9:
                View view2 = (View) obj;
                bc7[] bc7Arr3 = MessagesSettingsScreen.Y;
                ((MessagesSettingsScreen) this.b).getRouter().C();
                return e5f.a;
            case 10:
                m07 m07 = (m07) obj;
                nob nob = (nob) ((na9) this.b).g.getValue();
                nob.getClass();
                return nob.a(m07.d, m07.q);
            case 11:
                int intValue2 = ((Integer) obj).intValue();
                m7a m7a = ((o7a) this.b).a;
                if (m7a != null) {
                    m7a.c(intValue2);
                }
                return e5f.a;
            case Protos.Attaches.Attach.PRESENT:
                qj3 qj3 = (qj3) this.b;
                Float f = (Float) obj;
                float floatValue = f.floatValue();
                try {
                    qj3.accept(f);
                } catch (Throwable th) {
                    hm9.p("ada", "Progress consumer has failed to accept the progress (" + floatValue + ") of media transform", th);
                }
                return e5f.a;
            case 13:
                ((lea) this.b).w0.setText(String.valueOf((CharSequence) obj));
                return Boolean.TRUE;
            case Protos.Attaches.Attach.LOCATION:
                return Boolean.valueOf(((View) obj).getId() != ((ela) this.b).getId());
            case Protos.Attaches.Attach.DAILY_MEDIA:
                View view3 = (View) obj;
                bc7[] bc7Arr4 = PickChatMembers.x0;
                i3a onBackPressedDispatcher = ((PickChatMembers) this.b).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return e5f.a;
            case 16:
                syd syd = (syd) obj;
                syd.a2();
                syd.R1(syd.Z1(((swa) ((twa) this.b)).a));
                return e5f.a;
            case LangUtils.HASH_SEED:
                int intValue3 = ((Integer) obj).intValue();
                PickerChatsListWidget pickerChatsListWidget = (PickerChatsListWidget) this.b;
                hdc hdc = (hdc) x53.g0(pickerChatsListWidget.w0.C());
                nxa nxa = pickerChatsListWidget.x0;
                if (hdc != nxa) {
                    nxa = pickerChatsListWidget.y0;
                }
                return Boolean.valueOf((nxa.j() <= intValue3 || intValue3 < 0) ? false : ((Set) pickerChatsListWidget.o0().Z.a.getValue()).contains(Long.valueOf(((pxa) ((ol7) nxa.C(intValue3))).s0.a)));
            case 18:
                int intValue4 = ((Integer) obj).intValue();
                bc7[] bc7Arr5 = PickerMembersListWidget.x0;
                PickerMembersListWidget pickerMembersListWidget = (PickerMembersListWidget) this.b;
                CharSequence charSequence = (CharSequence) pickerMembersListWidget.o0().u0.a.getValue();
                if (charSequence == null || charSequence.length() == 0) {
                    z2 = true;
                    z = true;
                } else {
                    z = false;
                    z2 = true;
                }
                if (!(z2 ^ z)) {
                    nxa nxa2 = pickerMembersListWidget.Y;
                    if (intValue4 < nxa2.j()) {
                        return ((pxa) ((ol7) nxa2.C(intValue4))).c;
                    }
                }
                return null;
            case 19:
                db9 db9 = (db9) obj;
                int i9 = PinBarsWidget.t0;
                PinBarsWidget pinBarsWidget = (PinBarsWidget) this.b;
                View view4 = pinBarsWidget.getView();
                if (view4 != null) {
                    pag.F(view4, mi6.CONFIRM);
                }
                xza m0 = pinBarsWidget.m0();
                int ordinal = db9.ordinal();
                if (ordinal == 0) {
                    d3b = d3b.c;
                } else if (ordinal == 1) {
                    d3b = d3b.o;
                } else if (ordinal == 2) {
                    d3b = d3b.X;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                m0.w0.c(d3b);
                return e5f.a;
            case 20:
                View view5 = (View) obj;
                ((m0b) this.b).M0.invoke();
                return e5f.a;
            case 21:
                int intValue5 = ((Integer) obj).intValue();
                StringBuilder sb = new StringBuilder();
                d5b d5b = (d5b) this.b;
                sb.append(d5b.e[intValue5]);
                sb.append(": ");
                sb.append(d5b.i(intValue5).a());
                return sb.toString();
            case 22:
                View view6 = (View) obj;
                bc7[] bc7Arr6 = ProfileAvatarsScreen.z0;
                ((ProfileAvatarsScreen) this.b).getRouter().C();
                return e5f.a;
            case 23:
                View view7 = (View) obj;
                bc7[] bc7Arr7 = ProfileChangeLinkScreen.v0;
                i3a onBackPressedDispatcher2 = ((ProfileChangeLinkScreen) this.b).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher2 != null) {
                    onBackPressedDispatcher2.d();
                }
                return e5f.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                gfb gfb = (gfb) obj;
                gfb.P1().b(":chat-list", (Bundle) null);
                gfb.P1().b(ey8.h(((qcb) ((vcb) this.b)).b, ":start-conversation/add-subscribers?id="), (Bundle) null);
                return e5f.a;
            case 25:
                LinearLayout linearLayout = (LinearLayout) obj;
                bc7[] bc7Arr8 = ProfileInviteScreen.Y;
                cla cla = new cla(linearLayout.getContext(), 6);
                cla.setLayoutParams(new ti3(-1, -2));
                cla.setTitle(yea.o);
                cla.setForm(uka.a);
                cla.setTextShimmerEnabled(false);
                cla.setLeftActions(new kka(new ww9(20)));
                linearLayout.addView(cla);
                RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
                recyclerView.setLayoutParams(new ti3(-1, -1));
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setClipToPadding(false);
                recyclerView.setClipChildren(false);
                recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
                ProfileInviteScreen profileInviteScreen = (ProfileInviteScreen) this.b;
                recyclerView.setAdapter(profileInviteScreen.o);
                recyclerView.setItemAnimator((mdc) null);
                bi9 bi9 = k37.a;
                bi9 bi92 = new bi9(1);
                bi92.g(4);
                recyclerView.j(new q1d(qp4.u0.j(recyclerView), new y98((Object) profileInviteScreen, 23, (Object) bi92), (l) null, 12));
                float f2 = (float) 12;
                recyclerView.j(new nz7(e37.a(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density)), e37.a(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2), 0), e37.a(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2), 0), 1));
                linearLayout.addView(recyclerView);
                return e5f.a;
            case 26:
                fka fka = (fka) obj;
                return Integer.valueOf(((s07) this.b).a);
            case 27:
                j6c j6c = (j6c) obj;
                t6c t6c = ((u6c) this.b).b;
                if (t6c != null) {
                    MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) t6c;
                    MessageModel C0 = messageContextMenuBottomSheet.C0();
                    long j3 = C0 != null ? C0.a : 0;
                    if (C0 != null) {
                        j = C0.b;
                    }
                    ((n7c) messageContextMenuBottomSheet.Q0.getValue()).q().l(new g7c(j6c.b, j3, j, C0 != null ? C0.B0 : null));
                    messageContextMenuBottomSheet.s0(true);
                    if (!tpa.f((C0 == null || (ix8 = C0.B0) == null || (c6c = ix8.c) == null) ? null : c6c.b, j6c.b) && (xx6 = (xx6) o19.a.getAccessor().e()) != null) {
                        xx6.f(Collections.singleton(new wx6(ux6.ADD_2_REACTIONS, 1)), wuc.CHAT);
                    }
                }
                return e5f.a;
            case 28:
                alc alc = (alc) this.b;
                alc.getClass();
                return alc.c(alc, (Continuation) obj);
            default:
                List<Long> list = (List) obj;
                t19 d = ((vlc) this.b).d();
                d.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SELECT * FROM messages WHERE id in (");
                int size = list.size();
                a14.c(sb2, size);
                sb2.append(") AND inserted_from_msg_link = 0 AND status <> ");
                sb2.append("?");
                int i10 = size + 1;
                xlc a2 = xlc.a(i10, sb2.toString());
                int i11 = 1;
                for (Long l2 : list) {
                    if (l2 == null) {
                        a2.W(i11);
                    } else {
                        a2.j(i11, l2.longValue());
                    }
                    i11++;
                }
                d.a().getClass();
                a2.j(i10, (long) 10);
                ilc ilc = d.a;
                ilc.b();
                Cursor o = ilc.o(a2, (CancellationSignal) null);
                try {
                    int n = tfg.n(o, "id");
                    int n2 = tfg.n(o, "server_id");
                    int n3 = tfg.n(o, "time");
                    int n4 = tfg.n(o, "update_time");
                    int n5 = tfg.n(o, "sender");
                    int n6 = tfg.n(o, "cid");
                    int n7 = tfg.n(o, "text");
                    int n8 = tfg.n(o, "delivery_status");
                    int n9 = tfg.n(o, "status");
                    int n10 = tfg.n(o, "time_local");
                    int n11 = tfg.n(o, "error");
                    int n12 = tfg.n(o, "localized_error");
                    int n13 = tfg.n(o, "attaches");
                    xlc = a2;
                    try {
                        int n14 = tfg.n(o, "media_type");
                        int n15 = tfg.n(o, "detect_share");
                        int n16 = tfg.n(o, "msg_link_type");
                        int n17 = tfg.n(o, "msg_link_id");
                        int n18 = tfg.n(o, "inserted_from_msg_link");
                        int n19 = tfg.n(o, "msg_link_chat_id");
                        int n20 = tfg.n(o, "msg_link_chat_name");
                        int n21 = tfg.n(o, "msg_link_chat_link");
                        int n22 = tfg.n(o, "msg_link_out_chat_id");
                        int n23 = tfg.n(o, "msg_link_out_msg_id");
                        int n24 = tfg.n(o, "type");
                        int n25 = tfg.n(o, "chat_id");
                        int n26 = tfg.n(o, "ttl");
                        int n27 = tfg.n(o, "channel_views");
                        int n28 = tfg.n(o, "channel_forwards");
                        int n29 = tfg.n(o, "view_time");
                        int n30 = tfg.n(o, "zoom");
                        int n31 = tfg.n(o, "options");
                        int n32 = tfg.n(o, "live_until");
                        int n33 = tfg.n(o, "elements");
                        int n34 = tfg.n(o, "reactions");
                        int n35 = tfg.n(o, "delayed_attrs_time_to_fire");
                        int n36 = tfg.n(o, "delayed_attrs_notify_sender");
                        int i12 = n13;
                        ArrayList arrayList = new ArrayList(o.getCount());
                        while (o.moveToNext()) {
                            long j4 = o.getLong(n);
                            long j5 = o.getLong(n2);
                            long j6 = o.getLong(n3);
                            long j7 = o.getLong(n4);
                            long j8 = o.getLong(n5);
                            long j9 = o.getLong(n6);
                            String string = o.isNull(n7) ? null : o.getString(n7);
                            int i13 = o.getInt(n8);
                            d.a().getClass();
                            iu8.b.getClass();
                            iu8 n37 = oz7.n(i13);
                            int i14 = o.getInt(n9);
                            d.a().getClass();
                            vx8 b2 = v89.b(i14);
                            long j10 = o.getLong(n10);
                            String string2 = o.isNull(n11) ? null : o.getString(n11);
                            if (o.isNull(n12)) {
                                i = i12;
                                str = null;
                            } else {
                                str = o.getString(n12);
                                i = i12;
                            }
                            byte[] blob = o.isNull(i) ? null : o.getBlob(i);
                            d.a().getClass();
                            k8g b3 = iz7.b(blob);
                            int i15 = n12;
                            int i16 = n14;
                            int i17 = o.getInt(i16);
                            n14 = i16;
                            int i18 = n15;
                            if (o.getInt(i18) != 0) {
                                n15 = i18;
                                i2 = n16;
                                z3 = true;
                            } else {
                                n15 = i18;
                                i2 = n16;
                                z3 = false;
                            }
                            int i19 = o.getInt(i2);
                            n16 = i2;
                            int i20 = n17;
                            long j11 = o.getLong(i20);
                            n17 = i20;
                            int i21 = n18;
                            if (o.getInt(i21) != 0) {
                                n18 = i21;
                                i3 = n19;
                                z4 = true;
                            } else {
                                n18 = i21;
                                i3 = n19;
                                z4 = false;
                            }
                            long j12 = o.getLong(i3);
                            n19 = i3;
                            int i22 = n20;
                            if (o.isNull(i22)) {
                                n20 = i22;
                                i4 = n21;
                                str2 = null;
                            } else {
                                str2 = o.getString(i22);
                                n20 = i22;
                                i4 = n21;
                            }
                            if (o.isNull(i4)) {
                                n21 = i4;
                                i5 = n22;
                                str3 = null;
                            } else {
                                str3 = o.getString(i4);
                                n21 = i4;
                                i5 = n22;
                            }
                            long j13 = o.getLong(i5);
                            n22 = i5;
                            int i23 = n23;
                            long j14 = o.getLong(i23);
                            n23 = i23;
                            int i24 = n24;
                            int i25 = o.getInt(i24);
                            d.a().getClass();
                            int a3 = ey8.a(i25);
                            n24 = i24;
                            int i26 = n25;
                            long j15 = o.getLong(i26);
                            n25 = i26;
                            int i27 = n26;
                            int i28 = o.getInt(i27);
                            n26 = i27;
                            int i29 = n27;
                            int i30 = o.getInt(i29);
                            n27 = i29;
                            int i31 = n28;
                            int i32 = o.getInt(i31);
                            n28 = i31;
                            int i33 = n29;
                            long j16 = o.getLong(i33);
                            n29 = i33;
                            int i34 = n30;
                            int i35 = o.getInt(i34);
                            n30 = i34;
                            int i36 = n31;
                            int i37 = o.getInt(i36);
                            n31 = i36;
                            int i38 = n32;
                            long j17 = o.getLong(i38);
                            n32 = i38;
                            int i39 = n33;
                            byte[] blob2 = o.isNull(i39) ? null : o.getBlob(i39);
                            d.a().getClass();
                            List a4 = v89.a(blob2);
                            n33 = i39;
                            int i40 = n34;
                            if (o.isNull(i40)) {
                                i6 = i40;
                                i7 = n11;
                                bArr = null;
                            } else {
                                i6 = i40;
                                bArr = o.getBlob(i40);
                                i7 = n11;
                            }
                            ix8 c = d.a().c(bArr);
                            int i41 = n35;
                            if (o.isNull(i41)) {
                                i8 = n36;
                                l = null;
                            } else {
                                l = Long.valueOf(o.getLong(i41));
                                i8 = n36;
                            }
                            Integer valueOf = o.isNull(i8) ? null : Integer.valueOf(o.getInt(i8));
                            if (valueOf == null) {
                                t19 = d;
                                bool = null;
                            } else {
                                bool = Boolean.valueOf(valueOf.intValue() != 0);
                                t19 = d;
                            }
                            arrayList.add(new ru8(j4, j5, j6, j7, j8, j9, string, n37, b2, j10, string2, str, b3, i17, z3, i19, j11, z4, j12, str2, str3, j13, j14, a3, j15, i28, i30, i32, j16, i35, i37, j17, a4, c, l, bool));
                            n36 = i8;
                            n11 = i7;
                            d = t19;
                            n34 = i6;
                            n35 = i41;
                            n12 = i15;
                            i12 = i;
                        }
                        o.close();
                        xlc.n();
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        o.close();
                        xlc.n();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    xlc = a2;
                    o.close();
                    xlc.n();
                    throw th;
                }
        }
    }

    public /* synthetic */ wz7(Widget widget, Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
